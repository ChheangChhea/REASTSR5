package com.example.sb5restapi.base;

import java.time.LocalDateTime;

public record ApiRest<T>(Boolean isSuccess,
                           String message,
                           Integer code,
                           LocalDateTime timestamp,
                           T e) {
}
