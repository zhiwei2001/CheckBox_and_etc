package com.example.checkbox_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean box_cy = false;
    boolean box_sp = false;
    boolean box_cn = false;
    boolean box_c = false;
    boolean box_Occ = false;
    public static String toppings ="Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.box_cho_syrup:
                if (checked)
                   box_cy=true;
                else
                    box_cy=false;
                break;
            case R.id.box_sprinkles:
                if (checked)
                    if (checked)
                        box_sp=true;
                    else
                        box_sp=false;
                break;
            case R.id.box_crus_nut:
                if (checked)
                    if (checked)
                        box_cn=true;
                    else
                        box_cn=false;
                break;
            case R.id.box_cherries:
                if (checked)
                    if (checked)
                        box_c=true;
                    else
                        box_c=false;
                break;
            case R.id.box_occ:
                if (checked)
                    if (checked)
                        box_Occ=true;
                    else
                        box_Occ=false;
                break;
            default:
                break;
        }
    }

    public void displayToast(String messageTag) {
        String none=" ";
        if(box_cy){
            toppings=toppings+ "Chocolate Syrup";
        }
        if(box_sp){
            toppings=toppings+ "Sprinkles";
        }
        if(box_cn){
            toppings=toppings+ "Crushed Nut";
        }
        if(box_c){
            toppings=toppings+ "Cherries";
        }
        if(box_Occ){
            toppings=toppings+ "Orio Cookies Crumbles";
        }
        Toast toast= Toast.makeText(getApplicationContext(),messageTag+ " " + none, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMsg(View view)
    {
        displayToast(toppings);
    }

}