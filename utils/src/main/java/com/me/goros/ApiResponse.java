package com.me.goros;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse<T> {
    public String message;
    public T payload;
}
