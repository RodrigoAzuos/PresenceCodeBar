package com.example.rodrigosouza.presencebarcode.api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class InterceptorAPI implements Interceptor {

    public static final String AUTHORIZATION = "Authorization";
    public final String TOKEN;

    public InterceptorAPI(String token) {
        TOKEN = token;
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request().newBuilder()
                .build();

        return chain.proceed(request);
    }
}
