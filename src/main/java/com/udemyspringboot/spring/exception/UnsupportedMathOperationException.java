package com.udemyspringboot.spring.exception;

public class UnsupportedMathOperationException extends RuntimeException {
  public UnsupportedMathOperationException(String message) {
    super(message);
  }
}
