package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView) findViewById(R.id.screen);

    }

    public void ButtonClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                screen.setText(screen.getText() + "1");
                break;
            case R.id.button2:
                screen.setText(screen.getText() + "2");
                break;
            case R.id.button3:
                screen.setText(screen.getText() + "3");
                break;
            case R.id.button4:
                screen.setText(screen.getText() + "4");
                break;
            case R.id.button5:
                screen.setText(screen.getText() + "5");
                break;
            case R.id.button6:
                screen.setText(screen.getText() + "6");
                break;
            case R.id.button7:
                screen.setText(screen.getText() + "7");
                break;
            case R.id.button8:
                screen.setText(screen.getText() + "8");
                break;
            case R.id.button9:
                screen.setText(screen.getText() + "9");
                break;
            case R.id.button10:
                screen.setText(screen.getText() + "+");
                break;
            case R.id.button11:
                screen.setText(screen.getText() + "-");
                break;
            case R.id.button12:
                screen.setText(screen.getText() + "0");
                break;
            case R.id.button13:
                screen.setText(screen.getText() + "*");
                break;
            case R.id.button14:
                screen.setText(screen.getText() + "/");
                break;
            case R.id.button15:
                if (screen.getText().length() != 0) {
                    screen.setText(screen.getText().subSequence(0, screen.getText().length() - 1));
                }
                break;
            case R.id.button16:
                screen.setText(screen.getText() + "=");
                break;
        }
    }
}
