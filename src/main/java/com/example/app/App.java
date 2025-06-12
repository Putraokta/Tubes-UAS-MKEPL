/**
 * Package utama dari aplikasi.
 */
package com.example.app;

/**
 * Kelas utama aplikasi.
 * Final karena tidak dirancang untuk diwariskan.
 */
public final class App {

    /**
     * Titik masuk aplikasi.
     *
     * @param args argumen command line
     */
    public static void main(final String[] args) {
        System.out.println("Hello from CI/CD Pipeline!");
    }

    /**
     * Menambahkan dua bilangan bulat.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil penjumlahan
     */
    public int add(final int a, final int b) {
        return a + b;
    }
}
