package com.bridgelabz;

public class CouponNumbers {
    public static void main(String[] args) {
        System.out.println("How many coupons to generate ?");
        int howManyCoupon = Utility.scannerInt();
        generateCoupon(howManyCoupon);
    }

    public static void generateCoupon(int howManyCoupon) {
        int min = 100;
        int max = 999;
        System.out.println("Coupon Number : ");
        for (int i = 0; i < howManyCoupon; i++) {
            int couponNumber = (int) (Math.random() * (max - min) + min);
            System.out.println(couponNumber);
        }
    }
}
