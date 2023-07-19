package com.balartinc.exceptions;

public class BrowserNotSupportedException extends IllegalStateException {
    public BrowserNotSupportedException(String browser) {
        super(String.format("Browser Not supported: %s", browser));
    }
}
