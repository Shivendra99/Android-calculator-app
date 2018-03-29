package com.example.hp.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    TextView t1,t2;
    double result=0,n1=0,n2=1,n3=0,temp=0;
    double a[]=new double[20];
    char s[]=new char[20];
    int check=0,i,checks=0,pos=0,poss=0,checkeq=0;
    String s1=" ",s2=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2=(TextView)findViewById(R.id.result);
        t1=(TextView)findViewById(R.id.no);

        Button b18=(Button)findViewById(R.id.button18);
        RelativeLayout.LayoutParams b18Details=(RelativeLayout.LayoutParams)b18.getLayoutParams();
        //b18Details.width = getResources().getDisplayMetrics().widthPixels/2;
        b18Details.width=getResources().getDisplayMetrics().widthPixels-(((RelativeLayout.LayoutParams)((Button)findViewById(R.id.seven)).getLayoutParams()).width+((RelativeLayout.LayoutParams)((Button)findViewById(R.id.eight)).getLayoutParams()).width+((RelativeLayout.LayoutParams)((Button)findViewById(R.id.nine)).getLayoutParams()).width+((RelativeLayout.LayoutParams)((Button)findViewById(R.id.del)).getLayoutParams()).width);
        b18Details.height=getResources().getDisplayMetrics().heightPixels;
        b18.setLayoutParams(b18Details);

        Button seven=(Button)findViewById(R.id.seven);
        RelativeLayout.LayoutParams sevenDetails=(RelativeLayout.LayoutParams)seven.getLayoutParams();
        sevenDetails.width=(getResources().getDisplayMetrics().widthPixels-b18.getLayoutParams().width)/4;
        sevenDetails.height=getResources().getDisplayMetrics().heightPixels/4;
        seven.setLayoutParams(sevenDetails);
    }

    public void onClick(View v){
        if(v.getId()==R.id.one) {
            if(check==0)
                a[pos]=a[pos]*10+1;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*1;
            }
            s1=s1+1;
            checks=0;
        }
        if(v.getId()==R.id.two) {
            if(check==0)
                a[pos]=a[pos]*10+2;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*2;
            }
            s1=s1+2;
            checks=0;
        }
        if(v.getId()==R.id.three) {
            if(check==0)
                a[pos]=a[pos]*10+3;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*3;
            }
            s1=s1+3;
            checks=0;
        }
        if(v.getId()==R.id.four) {
            if(check==0)
                a[pos]=a[pos]*10+4;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*4;
            }
            s1=s1+4;
            checks=0;
        }
        if(v.getId()==R.id.five) {
            if(check==0)
                a[pos]=a[pos]*10+5;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*5;
            }
            s1=s1+5;
            checks=0;
        }
        if(v.getId()==R.id.six) {
            if(check==0)
                a[pos]=a[pos]*10+6;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*6;
            }
            s1=s1+6;
            checks=0;
        }
        if(v.getId()==R.id.seven) {
            if(check==0)
                a[pos]=a[pos]*10+7;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*7;
            }
            s1=s1+7;
            checks=0;
        }
        if(v.getId()==R.id.eight) {
            if(check==0)
                a[pos]=a[pos]*10+8;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*8;
            }
            s1=s1+8;
            checks=0;
        }
        if(v.getId()==R.id.nine) {
            if(check==0)
                a[pos]=a[pos]*10+9;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*9;
            }
            s1=s1+9;
            checks=0;
        }
        if(v.getId()==R.id.zero) {
            if(check==0)
                a[pos]=a[pos]*10+0;
            else{
                n2=n2*0.1;
                a[pos]=a[pos]+n2*0;
            }
            s1=s1+0;
            checks=0;
        }
        if(v.getId()==R.id.dec) {
            if(check==0) {
                 s1=s1+".";
                 check=1;
            }
        }
        if(v.getId()==R.id.sum){
            if(checks==0) {
                s1 = s1 + "+";
                checks=1;
                check=0;
                pos++;
                s[poss]='+';
                poss++;
            }
        }
        if(v.getId()==R.id.diff){
            if(checks==0) {
                s1 = s1 + "-";
                checks=1;
                check=0;
                pos++;
                s[poss]='-';
                poss++;
            }
        }
        if(v.getId()==R.id.div){
            if(checks==0) {
                s1 = s1 + "/";
                checks=1;
                check=0;
                pos++;
                s[poss]='/';
                poss++;
            }
        }
        if(v.getId()==R.id.prod){
            if(checks==0) {
                s1 = s1 + "*";
                checks=1;
                check=0;
                pos++;
                s[poss]='*';
                poss++;
            }
        }
        if(v.getId()==R.id.del){
            if(checks==1){
                s[poss]=' ';
                if(poss>0) {
                   s[poss]=' ';
                    poss--;
                }
                if(pos>0) {
                    a[pos]=0;
                    pos--;
                }
                if(pos!=0&&poss!=0)
                    checks=0;
            }
            else{
                //a[pos]=Math.floor(a[pos]/10);
                    a[pos] = (int) (a[pos] / 10);
                    checks = 0;
                if(Math.floor(a[pos])==0)
                    checks=1;
            }
            if(s1.length()>0) {
                s1 = s1.substring(0, s1.length() - 1);
            }
        }
        if(v.getId()==R.id.eq){
            if(checks!=1) {
                result = calc(a, s, result);
                if(result==Math.floor(result))
                    s1 = "" + (int)result;
                else
                    s1=""+result;
                checkeq=1;
                temp=result;
            }
        }

        t1.setText(s1);
        if(checkeq==1) {
            reset();
            a[pos]=temp;
            s1=""+(int)temp;
            temp=0;
            checkeq=0;
        }

    }

    double calc(double a[],char s[],double result){
       int ai=0,si=0,j=0,i=0;
       while(s[si]=='+'||s[si]=='-'||s[si]=='*'||s[si]=='/') {
           System.out.println(a[i]+"  "+s[j]);
           if (s[si] == '*') {
               a[ai]=a[ai]*a[ai+1];
               j=ai+1;
               i=si;
               while(j<a.length-1){
                   a[j]=a[j+1];
                   j++;
               }
               while(i<s.length-1){
                   s[i]=s[i+1];
                   i++;
               }
           }
           else if (s[si] == '/') {
               a[ai]=a[ai]/a[ai+1];
               j=ai+1;
               i=si;
               while(j<a.length-1){
                   a[j]=a[j+1];
                   j++;
               }
               while(i<s.length-1){
                   s[i]=s[i+1];
                   i++;
               }
           }
           else {
               si++;
               ai++;
           }
       }
        ai=si=0;
        i=0;
        j=0;
        while(i<a.length||j<s.length)
        {
            i++;
            j++;
        }
        result=a[ai];
        while(s[si]=='+'||s[si]=='-') {
            if (s[si] == '+') {
                result = result + a[ai + 1];
                ai++;
                si++;
            }
            if (s[si] == '-') {
                result = result - a[ai + 1];
                ai++;
                si++;
            }
        }
        return result;
    }

    void reset(){
        check=0;
        checks=0;
        pos=0;
        poss=0;
        s1=" ";
        s2=" ";
        result=0;
        n1=0;
        n2=1;
        n3=0;
        for(int i=0;i<20;i++) {
            a[i]=0;
            s[i]=' ';
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
