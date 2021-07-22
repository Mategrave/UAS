package com.example.gslc12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();

        int a = 0;
        int b = 0;

        p1.start();
        p2.start();

        if (a > b) {
            System.out.println("Player 1 win");
        } else if (a < b) {
            System.out.println("Player 2 win");
        } else {
            System.out.println("Draw");
        }
    }
}

class Player1 extends Thread {
    public void run() {
        try {
            int a = 100000;
            int temp = (int) (5 * 0.4);
            a =  a + (a * temp);
            a = (int) (a * 0.1);
        }
        catch (Exception e) {
            System.out.println("Exception detected");
        }
    }
}

class Player2 extends Thread {
    public void run() {
        try {
            int b = 100000;
            int temp = (int) (5 * 0.4);
            b =  b + (b * temp);
            b = (int) (b * 0.4);
        }
        catch (Exception e) {
            System.out.println("Exception detected");
        }
    }
}