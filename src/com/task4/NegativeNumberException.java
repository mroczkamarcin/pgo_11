package com.task4;

import java.util.Scanner;

public class NegativeNumberException extends IllegalArgumentException {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}
