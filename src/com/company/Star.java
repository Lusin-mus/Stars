package com.company;

public class Star {
    public void triangleA() {
        int m = 7;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public void emptyTriangleA() {
        System.out.println();
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0 || i + j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void triangleB() {
        System.out.println();
        int row = 7;
        int p = 0;
        for (int i = 1; i <= row; ++i, p = 0) {
            for (int space = 1; space <= row - i; ++space) {
                System.out.print("  ");
            }
            while (p != 2 * i - 1) {
                System.out.print("* ");
                ++p;
            }
            System.out.println();
        }
    }

    public void emptyTriangleB() {
        System.out.println();
        int v = 7;
        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= 2 * v - 1; j++) {
                if (i == v || j == v - i + 1 || j == v + i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void triangleC() {
        System.out.println();
        int b = 7;
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= b; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void emptyTrangleC() {
        System.out.println();
        int w = 7;
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == 1 || j == w || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void tiangleD(){
        System.out.println();
        int t = 7;
        for (int i = 0; i <= t - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public void emptyTriangleD(){
        System.out.println();
        int k = 7;
        for (int i = 0; i <= k - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i == k - 1 || j == 0 || j == i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void triangleE(){
        System.out.println();
        int y = 7;
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= 2 * y - 1; j++) {
                if (j < i||j>=2*y-i+1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void emptyTriangleE(){
        System.out.println();
        int x = 7;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= 2 * x - 1; j++) {
                if (i==1 || j==2*x-i|| j==i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void triangleF (){
        System.out.println();
        int z = 7;
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= z; j++) {
                if (i > z - j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void emptyTriangleF() {
        System.out.println();
        int h = 7;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j == h || i == h || j == h - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
