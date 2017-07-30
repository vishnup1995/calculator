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
        display(value);
    }
    public void two(View view)
    {
        value+="2";
        display(value);
    }
    public void three(View view)
    {
        value+="3";
        display(value);
    }
    public void four(View view)
    {
        value+="4";
        display(value);
    }
    public void five(View view)
    {
        value+="5";
        display(value);
    }
    public void six(View view)
    {
        value+="6";
        display(value);
    }
    public void seven(View view)
    {
        value+="7";
        display(value);
    }
    public void eight(View view)
    {
        value+="8";
        display(value);
    }
    public void nine(View view)
    {
        value+="9";
        display(value);
    }
    public void zero(View view)
    {
        value+="0";
        display(value);
    }
    public void div(View view)
    {
        symbol="/";
        temp=Float.parseFloat(value);
        value="";

    }
    public void mul(View view)
    {
        symbol="*";
        temp=Float.parseFloat(value);
        value="";
    }
    public void minus(View view)
    {
        symbol="-";
        temp=Float.parseFloat(value);
        value="";
    }
    public void plus(View view)
    {
        symbol="+";
        temp=Float.parseFloat(value);
        value="";
    }
    public void dot(View view)
    {
        value+=".";
        display(value);
    }
    public void del(View view)
    {
        value=value.replace(value.substring(value.length()-1), "");
        display(value);
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
                break;

            case "*":
                temp2= Float.parseFloat(value);
                temp*=temp2;
                displayans(temp);
                symbol="";
                value="";
                break;

            case "-":
                temp2= Float.parseFloat(value);
                temp-=temp2;
                displayans(temp);
                symbol="";
                value="";
                break;

            case "+":
                temp2= Float.parseFloat(value);
                temp+=temp2;
                displayans(temp);
                symbol="";
                value="";
                break;
        }

    }
}
