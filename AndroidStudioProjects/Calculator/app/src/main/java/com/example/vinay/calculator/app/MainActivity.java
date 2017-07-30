package com.example.vinay.calculator.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String value="";
    String disp="";
    float temp,temp2;
    String symbol;
    private void displayans(float answer)
    {
        TextView ansTextView = (TextView)
                findViewById(R.id.answer_text_view);
            ansTextView.setText(Float.toString(answer));
    }
    private void display(String quantity)
    {
        TextView answerTextView = (TextView)
                findViewById(R.id.calc_text_view);
        answerTextView.setText(quantity);
    }
    public void one(View view)
    {
        value+="1";
        disp+="1";
        display(disp);
    }
    public void two(View view)
    {
        value+="2";
        disp+="2";
        display(disp);
    }
    public void three(View view)
    {
        value+="3";
        disp+="3";
        display(disp);
    }
    public void four(View view)
    {
        value+="4";
        disp+="4";
        display(disp);
    }
    public void five(View view)
    {
        value+="5";
        disp+="5";
        display(disp);
    }
    public void six(View view)
    {
        value+="6";
        disp+="6";
        display(disp);
    }
    public void seven(View view)
    {
        value+="7";
        disp+="7";
        display(disp);
    }
    public void eight(View view)
    {
        value+="8";
        disp+="8";
        display(disp);
    }
    public void nine(View view)
    {
        value+="9";
        disp+="9";
        display(disp);
    }
    public void zero(View view)
    {
        value+="0";
        disp+="0";
        display(disp);
    }
    public void div(View view)
    {
        symbol="/";
        temp=Float.parseFloat(value);
        disp+="/";
        display(disp);
        value="";
    }
    public void mul(View view)
    {
        symbol="*";
        temp=Float.parseFloat(value);
        disp+="*";
        display(disp);
        value="";
    }
    public void minus(View view)
    {
        symbol="-";
        temp=Float.parseFloat(value);
        disp+="-";
        display(disp);
        value="";
    }
    public void plus(View view)
    {
        symbol="+";
        temp=Float.parseFloat(value);
        disp+="+";
        display(disp);
        value="";
    }
    public void dot(View view)
    {
        value+=".";
        disp+=".";
        display(disp);
    }
    public void del(View view)
    {
        disp=disp.replace(disp.substring(disp.length()-1), "");
        display(disp);
    }
    public void equal(View view)
    {
        switch(symbol)
        {
            case "/":
                temp2= Float.parseFloat(value);
                temp/=temp2;
                displayans(temp);
                symbol="";
                value="";
                disp="";
                break;

            case "*":
                temp2= Float.parseFloat(value);
                temp*=temp2;
                displayans(temp);
                symbol="";
                value="";
                disp="";
                break;

            case "-":
                temp2= Float.parseFloat(value);
                temp-=temp2;
                displayans(temp);
                symbol="";
                value="";
                disp="";
                break;

            case "+":
                temp2= Float.parseFloat(value);
                temp+=temp2;
                displayans(temp);
                symbol="";
                value="";
                disp="";
                break;
        }

    }
}
