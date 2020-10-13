package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView screen;
    double number1, number2, number3;
    char operator;
    boolean isCalculate  = false;

    DecimalFormat df = new DecimalFormat("#.######");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
        screen.setText("0");
    }

    private void zeroCheck()
    {
        if(screen.getText().equals("0")){
            screen.setText("");
        }
    }

    private void showToast(String message)
    {
        Toast myToast = Toast.makeText(this.getApplicationContext(),message, Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void ButtonClick(View view) {
        try {
            switch (view.getId()) {
                case R.id.button1:
                    zeroCheck();
                    screen.setText(screen.getText() + "1");
                    break;
                case R.id.button2:
                    zeroCheck();
                    screen.setText(screen.getText() + "2");
                    break;
                case R.id.button3:
                    zeroCheck();
                    screen.setText(screen.getText() + "3");
                    break;
                case R.id.button4:
                    zeroCheck();
                    screen.setText(screen.getText() + "4");
                    break;
                case R.id.button5:
                    zeroCheck();
                    screen.setText(screen.getText() + "5");
                    break;
                case R.id.button6:
                    zeroCheck();
                    screen.setText(screen.getText() + "6");
                    break;
                case R.id.button7:
                    zeroCheck();
                    screen.setText(screen.getText() + "7");
                    break;
                case R.id.button8:
                    zeroCheck();
                    screen.setText(screen.getText() + "8");
                    break;
                case R.id.button9:
                    zeroCheck();
                    screen.setText(screen.getText() + "9");
                    break;
                case R.id.button10:
                    if (!isCalculate) {
                        number1 = Double.parseDouble(screen.getText().toString());
                        operator = '+';
                        isCalculate = true;
                        screen.setText("0");
                    }
                    else{
                        showToast("계산 종료 후 누르세요!");
                    }
//                screen.setText(screen.getText() + "+");
                    break;
                case R.id.button11:
                    if (!isCalculate) {
                        number1 = Double.parseDouble(screen.getText().toString());
                        operator = '-';
                        isCalculate = true;
                        screen.setText("0");
                    }
                    else{
                        showToast("계산 종료 후 누르세요!");
                    }
//                screen.setText(screen.getText() + "-");
                    break;
                case R.id.button12:
                    zeroCheck();
                    screen.setText(screen.getText() + "0");
                    break;
                case R.id.button13:
                    if (!isCalculate) {
                        number1 = Double.parseDouble(screen.getText().toString());
                        operator = '*';
                        isCalculate = true;
                        screen.setText("0");
                    }
                    else{
                        showToast("계산 종료 후 누르세요!");
                    }
//                screen.setText(screen.getText() + "*");
                    break;
                case R.id.button14:
                    if (!isCalculate) {
                        number1 = Double.parseDouble(screen.getText().toString());
                        operator = '/';
                        isCalculate = true;
                        screen.setText("0");
                    }
                    else{
                        showToast("계산 종료 후 누르세요!");
                    }
//                screen.setText(screen.getText() + "/");
                    break;
                case R.id.button15:
                    if (screen.getText().length() != 0) {
                        screen.setText(screen.getText().subSequence(0, screen.getText().length() - 1));
                        if(screen.length() == 0)screen.setText("0");
                    }
                    break;
                case R.id.button16:
                    number2 = Integer.parseInt(screen.getText().toString());
                    if (isCalculate) {
                        switch (operator) {
                            case '+':
                                number3 = number1 + number2;
                                screen.setText(df.format(number3));
                                break;
                            case '-':
                                number3 = number1 - number2;
                                screen.setText(df.format(number3));
                                break;
                            case '*':
                                number3 = number1 * number2;
                                screen.setText(df.format(number3));
                                break;
                            case '/':
                                if(number2 == 0){
                                    showToast("0으로 나눌 수 없습니다.");
                                    return;
                                }
                                else {
                                    number3 = number1 / number2;
                                    screen.setText(df.format(number3));
                                }
                                break;
                        }
                        isCalculate = false;
                    }
                    else{
                        showToast("식을 입력 후 누르세요!");
                    }
                    //screen.setText(screen.getText() + "=");
                    break;
            }
        }
        catch (Exception e)
        {
            Log.e("ButtonClick", e.toString());
        }
    }
}
