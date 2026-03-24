package com.thetestingacademy.ex02_RestAssured_Concepts;

public class APITestingLab02BuilderPattern {
    public APITestingLab02BuilderPattern step1() {
        System.out.println("Step 1");
        return this;
    }
    public APITestingLab02BuilderPattern step2() {
        System.out.println("Step 2");
        return this;
    }
    public APITestingLab02BuilderPattern step3(String param1) {
        System.out.println("Step 3 with parameter: " + param1);
        return this;
    }
    public APITestingLab02BuilderPattern step4() {
        System.out.println("Step 4");
        return this;
    }
    public APITestingLab02BuilderPattern step5() {
        System.out.println("Step 5");
        return this;
    }

    public static void main(String[] args) {
        new APITestingLab02BuilderPattern()
                .step1()
                .step2()
                .step3("Parameter")
                .step4()
                .step5();
    }
}
