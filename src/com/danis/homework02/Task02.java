package com.danis.homework02;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(countHappyTickets());
    }

    public static long countHappyTickets() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int o = 0; o < 10; o++) {
                                if(i + j + k == l + m + o) count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
//        int sum = 0;
//        List<List> arr = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            sum = 0;
//            List<Long> sums = new ArrayList();
//            if(i == 1) {
//                for (int j = 0; j < 10; j++) {
//                    sums.add(1l);
//                }
//                sum = 10;
//                arr.add(sums);
//            } else {
//                List<Long> prev = arr.get(i - 2);
//                for (int j = 0; j <= 9 * i; j++) {
//                    long slug = 0;
//                    int kMax = prev.size() > j  ? j + 1 : prev.size();
//                    System.out.println("kMax" + kMax);
//                    for (int k = Math.max(0, j - 10); k < kMax; k++) {
//                        slug = Long.sum(slug, prev.get(k));
//
//                    }
//                    System.out.println(slug);
//                    sum += slug * slug;
//                    sums.add((long)sum);
//                }
//                arr.add(sums);
//            }
//        }
//        return sum;
    }
}
