package com.example.educacionit.clase1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;


public class MainActivity extends ActionBarActivity {

    private EditText editText;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.txtMensaje);
        textView =(TextView) findViewById(R.id.txt1);
        textView.setText("Ingresar el nombre:");
        textView.setBackgroundColor(getResources().getColor(R.color.rojo));
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

    public void Aceptar_OnClick(View view){
        /*Intent para redirigir a otra activity*/
        Intent intent = new Intent(this, SegundaActividad.class);
        /*Para pasar valores al nuevo activity (name, value)*/
        Bundle bundle = new Bundle();
        bundle.putString("nombre",editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
