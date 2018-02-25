package com.example.edopore.formilariosencillo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button Br1, Br2, Br3, Br4, Bl1, Bl2, Bl3, Bl4, Re1, Re2, Re3, Re4, Gr1, Gr2, Gr3, Gr4, V1, V2, V3, V4, Gra1, Gra2, Gra3, Gra4;
    Button Or1, Or2, Or3, Ye1, Ye2, Ye3, Wh1, Wh2, Wh3;
    Button Bla2, Bla3, Go3, Go4, Si3, Si4;
    Button Calc;
    EditText B1, B2, B3, B4;
    TextView Tole, Valor;
    int n1, n2;
    double mult;
    DecimalFormat format = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declaración de botonera
        Br1 = findViewById(R.id.bBr1);
        Br2 = findViewById(R.id.bBr2);
        Br3 = findViewById(R.id.bBr3);
        Br4 = findViewById(R.id.bBr4);

        Re1 = findViewById(R.id.bRe1);
        Re2 = findViewById(R.id.bRe2);
        Re3 = findViewById(R.id.bRe3);
        Re4 = findViewById(R.id.bRe4);

        Gr1 = findViewById(R.id.bGr1);
        Gr2 = findViewById(R.id.bGr2);
        Gr3 = findViewById(R.id.bGr3);
        Gr4 = findViewById(R.id.bGr4);

        Bl1 = findViewById(R.id.bBl1);
        Bl2 = findViewById(R.id.bBl2);
        Bl3 = findViewById(R.id.bBl3);
        Bl4 = findViewById(R.id.bBl4);

        V1 = findViewById(R.id.bVi1);
        V2 = findViewById(R.id.bVi2);
        V3 = findViewById(R.id.bVi3);
        V4 = findViewById(R.id.bVi4);

        Gra1 = findViewById(R.id.bGra1);
        Gra2 = findViewById(R.id.bGra2);
        Gra3 = findViewById(R.id.bGra3);
        Gra4 = findViewById(R.id.bGra4);

        Or1 = findViewById(R.id.bOr1);
        Or2 = findViewById(R.id.bOr2);
        Or3 = findViewById(R.id.bOr3);

        Ye1 = findViewById(R.id.bYe1);
        Ye2 = findViewById(R.id.bYe3);
        Ye3 = findViewById(R.id.bYe2);

        Wh1 = findViewById(R.id.bWh1);
        Wh2 = findViewById(R.id.bWh3);
        Wh3 = findViewById(R.id.bWh2);

        Bla2 = findViewById(R.id.bBla2);
        Bla3 = findViewById(R.id.bBla3);

        Go3 = findViewById(R.id.bGo3);
        Go4 = findViewById(R.id.bGo4);

        Si3 = findViewById(R.id.bSi3);
        Si4 = findViewById(R.id.bSi4);

        Calc = findViewById(R.id.bCalc);
        Tole = findViewById(R.id.eTol);
        Valor = findViewById(R.id.eValor);
        //Instancia de las edittext para las bandas de colores
        B1 = findViewById(R.id.eB_1);
        B2 = findViewById(R.id.eB_2);
        B3 = findViewById(R.id.eB_3);
        B4 = findViewById(R.id.eB_4);

        B1.setBackgroundColor(getResources().getColor(R.color.brown));
        n1 = 10;
        B2.setBackgroundColor(getResources().getColor(R.color.black));
        n2 = 0;
        B3.setBackgroundColor(getResources().getColor(R.color.red));
        mult = Math.pow(10, 2);
        B4.setBackgroundColor(getResources().getColor(R.color.gold));
        Tole.setText("±5%");
    }

    public void onCalcularClick(View view) {
        double div, num1, num2, num3, Resultado;
        num1 = n1;
        num2 = n2;
        num3 = mult;
        if (num1 == 0 && num2 == 0 && num3 == 0) {
            Toast.makeText(this, R.string.error, Toast.LENGTH_SHORT).show();
        } else {
            Resultado = (num1 + num2) * num3;
            if (Resultado < 1000) {
                if (Resultado - Math.floor(Resultado) == 0) {
                    Valor.setText(String.valueOf((int) Resultado) + "Ω");
                } else {
                    Valor.setText(String.valueOf(format.format(Resultado) + "Ω"));
                }
            }
            if (Resultado >= 1000 && Resultado < 10000) {
                div = Resultado / 1000;
                if (div - Math.floor(div) == 0) {
                    Valor.setText(String.valueOf((int) div) + "KΩ");
                } else {
                    Valor.setText(String.valueOf(format.format(div)) + "KΩ");
                }
            }
            if (Resultado >= 10000 && Resultado < 100000) {
                div = Resultado / 1000;
                if (div - Math.floor(div) == 0) {
                    Valor.setText(String.valueOf((int) div) + "KΩ");
                } else {
                    Valor.setText(String.valueOf(format.format(div)) + "KΩ");
                }
            }
            if (Resultado >= 100000 && Resultado < 1000000) {
                div = Resultado / 1000;
                if (div - Math.floor(div) == 0) {
                    Valor.setText(String.valueOf((int) div) + "KΩ");
                } else {
                    Valor.setText(String.valueOf(format.format(div)) + "KΩ");
                }
            }
            if (Resultado >= 1000000 && Resultado < 10000000) {
                div = Resultado / 1000000;
                if (div - Math.floor(div) == 0) {
                    Valor.setText(String.valueOf((int) div) + "MΩ");
                } else {
                    Valor.setText(String.valueOf(format.format(div)) + "MΩ");
                }
            }
            if (Resultado >= 10000000 && Resultado < 100000000) {
                div = Resultado / 1000000;
                if (div - Math.floor(div) == 0) {
                    Valor.setText(String.valueOf((int) div) + "MΩ");
                } else {
                    Valor.setText(String.valueOf(format.format(div)) + "MΩ");
                }
            }
            if (Resultado >= 100000000 && Resultado < 1000000000) {
                div = Resultado / 1000000;
                if (div - Math.floor(div) == 0) {
                    Valor.setText(String.valueOf((int) div) + "MΩ");
                } else {
                    Valor.setText(String.valueOf(format.format(div)) + "MΩ");
                }
            }
            if (Resultado >= 1000000000 && Resultado < 1000000000) {
                div = Resultado / 1000000000;
                if (div - Math.floor(div) == 0) {
                    Valor.setText(String.valueOf((int) div) + "GΩ");
                } else {
                    Valor.setText(String.valueOf(format.format(div)) + "GΩ");
                }
            }
            if (Resultado >= 1000000000) {
                div = Resultado / 1000000000;
                if (div - Math.floor(div) == 0) {
                    Valor.setText(String.valueOf((int) div) + "GΩ");
                } else {
                    Valor.setText(String.valueOf(format.format(div)) + "GΩ");
                }
            }
        }
    }

    public void onColorClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.bBr1:
                n1 = 10;
                B1.setBackgroundColor(getResources().getColor(R.color.brown));
                break;
            case R.id.bRe1:
                n1 = 20;
                B1.setBackgroundColor(getResources().getColor(R.color.red));
                break;
            case R.id.bOr1:
                n1 = 30;
                B1.setBackgroundColor(getResources().getColor(R.color.orange));
                break;
            case R.id.bYe1:
                n1 = 40;
                B1.setBackgroundColor(getResources().getColor(R.color.yellow));
                break;
            case R.id.bGr1:
                n1 = 50;
                B1.setBackgroundColor(getResources().getColor(R.color.green));
                break;
            case R.id.bBl1:
                n1 = 60;
                B1.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case R.id.bVi1:
                n1 = 70;
                B1.setBackgroundColor(getResources().getColor(R.color.violet));
                break;
            case R.id.bGra1:
                n1 = 80;
                B1.setBackgroundColor(getResources().getColor(R.color.gray));
                break;
            case R.id.bWh1:
                n1 = 90;
                B1.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case R.id.bBla2:
                n2 = 0;
                B2.setBackgroundColor(getResources().getColor(R.color.black));
                break;
            case R.id.bBr2:
                n2 = 1;
                B2.setBackgroundColor(getResources().getColor(R.color.brown));
                break;
            case R.id.bRe2:
                n2 = 2;
                B2.setBackgroundColor(getResources().getColor(R.color.red));
                break;
            case R.id.bOr2:
                n2 = 3;
                B2.setBackgroundColor(getResources().getColor(R.color.orange));
                break;
            case R.id.bYe2:
                n2 = 4;
                B2.setBackgroundColor(getResources().getColor(R.color.yellow));
                break;
            case R.id.bGr2:
                n2 = 5;
                B2.setBackgroundColor(getResources().getColor(R.color.green));
                break;
            case R.id.bBl2:
                n2 = 6;
                B2.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case R.id.bVi2:
                n2 = 7;
                B2.setBackgroundColor(getResources().getColor(R.color.violet));
                break;
            case R.id.bGra2:
                n2 = 8;
                B2.setBackgroundColor(getResources().getColor(R.color.gray));
                break;
            case R.id.bWh2:
                n2 = 9;
                B2.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case R.id.bBla3:
                mult = Math.pow(10, 0);
                B3.setBackgroundColor(getResources().getColor(R.color.black));
                break;
            case R.id.bBr3:
                mult = Math.pow(10, 1);
                B3.setBackgroundColor(getResources().getColor(R.color.brown));
                break;
            case R.id.bRe3:
                mult = Math.pow(10, 2);
                B3.setBackgroundColor(getResources().getColor(R.color.red));
                break;
            case R.id.bOr3:
                mult = Math.pow(10, 3);
                B3.setBackgroundColor(getResources().getColor(R.color.orange));
                break;
            case R.id.bYe3:
                mult = Math.pow(10, 4);
                B3.setBackgroundColor(getResources().getColor(R.color.yellow));
                break;
            case R.id.bGr3:
                mult = Math.pow(10, 5);
                B3.setBackgroundColor(getResources().getColor(R.color.green));
                break;
            case R.id.bBl3:
                mult = Math.pow(10, 6);
                B3.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case R.id.bVi3:
                mult = Math.pow(10, 7);
                B3.setBackgroundColor(getResources().getColor(R.color.violet));
                break;
            case R.id.bGra3:
                mult = Math.pow(10, 8);
                B3.setBackgroundColor(getResources().getColor(R.color.gray));
                break;
            case R.id.bWh3:
                mult = Math.pow(10, 9);
                B3.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case R.id.bGo3:
                mult = Math.pow(10, -1);
                B3.setBackgroundColor(getResources().getColor(R.color.gold));
                break;
            case R.id.bSi3:
                mult = Math.pow(10, -2);
                B3.setBackgroundColor(getResources().getColor(R.color.silver));
                break;
            case R.id.bBr4:
                B4.setBackgroundColor(getResources().getColor(R.color.brown));
                Tole.setText("±1%");
                break;
            case R.id.bRe4:
                B4.setBackgroundColor(getResources().getColor(R.color.red));
                Tole.setText("±2%");
                break;
            case R.id.bGr4:
                B4.setBackgroundColor(getResources().getColor(R.color.green));
                Tole.setText("±0.5%");
                break;
            case R.id.bBl4:
                B4.setBackgroundColor(getResources().getColor(R.color.blue));
                Tole.setText("±0.25%");
                break;
            case R.id.bVi4:
                B4.setBackgroundColor(getResources().getColor(R.color.violet));
                Tole.setText("±0.1%");
                break;
            case R.id.bGra4:
                B4.setBackgroundColor(getResources().getColor(R.color.gray));
                Tole.setText("±0.05%");
                break;
            case R.id.bGo4:
                B4.setBackgroundColor(getResources().getColor(R.color.gold));
                Tole.setText("±5%");
                break;
            case R.id.bSi4:
                B4.setBackgroundColor(getResources().getColor(R.color.silver));
                Tole.setText("±10%");
                break;
        }
    }
}
