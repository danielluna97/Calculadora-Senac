package br.senac.es.calculadoraandroid;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String visor="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textVisor = (TextView) findViewById(R.id.txtVisor) ;
        final Button button = (Button) findViewById(R.id.button22);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button10 = (Button) findViewById(R.id.button10);
        final Button button11 = (Button) findViewById(R.id.button11);
        final Button button12 = (Button) findViewById(R.id.button12);
        final Button button13 = (Button) findViewById(R.id.button13);
        final Button button14 = (Button) findViewById(R.id.button14);
        final Button button15 = (Button) findViewById(R.id.button15);
        final Button button16 = (Button) findViewById(R.id.button16);
        final Button button18 = (Button) findViewById(R.id.button18);
        final Button button19 = (Button) findViewById(R.id.button19);

        textVisor.setText(visor);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = "";
                textVisor.setText(visor);
            }

        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 7;
                textVisor.setText(visor);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 8;
                textVisor.setText(visor);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 9;
                textVisor.setText(visor);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 4;
                textVisor.setText(visor);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 5;
                textVisor.setText(visor);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 6;
                textVisor.setText(visor);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 1;
                textVisor.setText(visor);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 2;
                textVisor.setText(visor);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 3;
                textVisor.setText(visor);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + 0;
                textVisor.setText(visor);
            }

        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + ",";
                textVisor.setText(visor);
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + "/";
                textVisor.setText(visor);
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + "X";
                textVisor.setText(visor);
            }

        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + "-";
                textVisor.setText(visor);
            }

        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + "+";
                textVisor.setText(visor);
            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dele = visor.substring(0, visor.length() -1);
                visor =dele;
                textVisor.setText(visor);

                if (visor.length() ==0 ) {
                    visor = "";
                    textVisor.setText(visor);
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}

