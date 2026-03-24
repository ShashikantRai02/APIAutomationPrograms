package com.thetestingacademy.ex02_RestAssured_Concepts;

public class APITestingLab01 {
    public void step1() {
        System.out.println("Step 1");
    }
        public void step2() {
            System.out.println("Step 2");
        }
        public void step3(String param1) {
            System.out.println("Step 3");
        }
        public void step4() {
            System.out.println("Step 4");
        }
        public void step5() {
            System.out.println("Step 5");
        }

    public static void main(String[] args) {
        APITestingLab01 obj = new APITestingLab01();
        obj.step1();
        obj.step2();
        obj.step3("Parameter");
        obj.step4();
        obj.step5();
    }

}
