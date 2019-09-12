package br.senac.es.calculadoraandroid;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    String visor = "";

    private Calculadora calc;
    private boolean usuarioEstaDigitandoUmNumero;
    private boolean separadorDecimalFoiDigitadop;
    private TextView textVisor;
    private String separador;
    private char separadorChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = new Calculadora();
        usuarioEstaDigitandoUmNumero = false;
        separadorDecimalFoiDigitadop = false;
        textVisor.setText(visor);
        textVisor = (TextView) findViewById(R.id.txtVisor);
        textVisor.setText("0");

        final TextView textVisor = (TextView) findViewById(R.id.txtVisor);
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
        final Button button20 = (Button) findViewById(R.id.button20);
        final Button button22 = (Button) findViewById(R.id.button22);

       /* button1.setOnClickListener(new View.OnClickListener() {
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

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (visor.endsWith("+")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "+";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("-")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "+";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("/")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "+";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("X")) {
                    String modificado = visor.substring(0, visor.length() - 1);

                    visor = modificado + "+";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("+")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "+";


                    textVisor.setText(visor);
                } else {
                    visor = visor + "+";
                    textVisor.setText(visor);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (visor.endsWith("+")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "X";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("-")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "X";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("/")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "X";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("+")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "X";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("X")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "X";


                    textVisor.setText(visor);
                } else {
                    visor = visor + "X";
                    textVisor.setText(visor);

                }

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (visor.endsWith("+")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "-";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("X")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "-";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("/")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "-";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("+")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "-";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("-")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "-";


                    textVisor.setText(visor);
                } else {
                    visor = visor + "/";
                    textVisor.setText(visor);
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (visor.endsWith("+")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "/";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("-")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "/";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("X")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "/";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("+")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "/";


                    textVisor.setText(visor);
                }

                if (visor.endsWith("/")) {
                    String modificado = visor.substring(0, visor.length() - 1);


                    visor = modificado + "/";
                    textVisor.setText(visor);
                } else {
                    visor = visor + "/";
                    textVisor.setText(visor);
                }
            }
        });
        button22.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String modificado = visor.substring(0, visor.length() - 1);


                visor = modificado;
                textVisor.setText(visor);

                if (visor.length() == 0) {
                    visor = "";
                    textVisor.setText(visor);
                }
            }
        });
    }*/

    Locale localizacao = getResources().getConfiguration().locale;
    NumberFormat formatador = NumberFormat.getInstance(localizacao);
    separadorChar = ',';
        if (formatador instanceof DecimalFormat) {
        DecimalFormatSymbols simbolo =
                ((DecimalFormat) formatador).getDecimalFormatSymbols();
        separadorChar = simbolo.getDecimalSeparator();
    }
    separador = String.valueOf(separadorChar);

    Button bntSeparador = (Button) findViewById(R.id.button19);
        bntSeparador.setText(separador);
}


    public void onClickNumeros(View v) {
        Button botaoTocado = (Button) v;
        String digito = botaoTocado.getText().toString();

        String textoNoVisor = textVisor.getText().toString();

        if (!usuarioEstaDigitandoUmNumero || textoNoVisor.equals("0")) {
            textVisor.setText(digito);
            if (!digito.equals("0")) {
                usuarioEstaDigitandoUmNumero = true;
            }
        } else {
            textVisor.setText(textoNoVisor + digito);
        }

    }

    public void onClickOperacoes(View v) {
        Button botaoTocado = (Button) v;
        String operacao = botaoTocado.getText().toString();


        if (operacao.equals(",") && !separadorDecimalFoiDigitadop) {
            separadorDecimalFoiDigitadop = true;
            if (!usuarioEstaDigitandoUmNumero)
                textVisor.setText("0 + ");
            else
                textVisor.setText(textVisor.getText().toString() + ",");
            usuarioEstaDigitandoUmNumero = true;
        } else if (!operacao.equals(",")) {
            String valorSemVirgula = textVisor.getText().toString().replace(',', '.');
            calc.realizarOperacao(operacao);

            String textResultado = String.valueOf(calc.getOperando());

            if (textResultado.endsWith(".0")) {
                textResultado = textResultado.substring(0, textResultado.length() - 2);
            }
            textVisor.setText(textResultado.replace('.', ','));
            usuarioEstaDigitandoUmNumero = false;
            separadorDecimalFoiDigitadop = false;

        }
    }


        public void onClickMemoria(View v){
            Button botaoTocado = (Button)v;
            String operacaoMemoria = botaoTocado.getText().toString();

            String valorSemVirgula = textVisor.getText().toString().replace(',', '.');

            calc.setOperando(Double.parseDouble(valorSemVirgula));
            calc.realizarOperacaoDeMemoria(operacaoMemoria);
            usuarioEstaDigitandoUmNumero = false;

        }
    }


