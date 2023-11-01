package ru.maro.mavenSpringBootWeb.service.impl;

import ru.maro.mavenSpringBootWeb.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(int num1, int num2) {
        return  num1 + " + " + num2 + " = " + (num1+num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    @Override
    public String divide(int num1, int num2) {
        return num1 + " / " + num2 + " = " + (num1/num2);
    }
}
