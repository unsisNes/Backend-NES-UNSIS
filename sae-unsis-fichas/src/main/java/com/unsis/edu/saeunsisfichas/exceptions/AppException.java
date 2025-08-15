package com.unsis.edu.saeunsisfichas.exceptions;

import lombok.Getter;
import org.apache.hc.core5.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Optional;
// Custom exception class for application-specific errors
@Getter
public class AppException extends RuntimeException{

    private final HttpStatus httpStatus;
    private final String errorCode;
    private final Exception rootCause;
    private final LocalDateTime timestamp;

    public AppException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCode = null;
        this.rootCause = null;
        this.timestamp = LocalDateTime.now();
    }

    public AppException(String message, HttpStatus httpStatus, String errorCode) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.rootCause = null;
        this.timestamp = LocalDateTime.now();
    }

    public AppException(String message, HttpStatus httpStatus, Exception rootCause) {
        super(message, rootCause);
        this.httpStatus = httpStatus;
        this.errorCode = "Server Error";
        this.rootCause = rootCause;
        this.timestamp = LocalDateTime.now();
    }

    public AppException(String message, HttpStatus httpStatus, String errorCode, Exception rootCause) {
        super(message, rootCause);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.rootCause = rootCause;
        this.timestamp = LocalDateTime.now();
    }

    public Optional<String> getErrorCode() {
        return Optional.ofNullable(errorCode);
    }

    public Optional<Exception> getRootCause() {
        return Optional.ofNullable(rootCause);
    }

    public String getFullMessage() {
        StringBuilder fullMessage = new StringBuilder(getMessage());
        if (rootCause != null) {
            fullMessage.append("; Caused by: ").append(rootCause.getMessage());
        }
        return fullMessage.toString();
    }
}
