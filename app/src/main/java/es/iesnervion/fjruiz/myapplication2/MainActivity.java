package es.iesnervion.fjruiz.myapplication2;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;
    TextView tvw;
    ImageView imv;
    int contador=0;
    //Toast toast1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        imv=(ImageView) findViewById(R.id.imageView);
        tvw=(TextView) findViewById(R.id.texto);
    }

    @Override
    public void onClick(View v){
        contador++;
        /*toast1=Toast.makeText(getApplicationContext(),
                "Te quedan "+(11-contador)+" clicks", Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0,0);
        //linea de comentario de prueba para git
        toast1.show();*/
        tvw.setText("Te quedan "+(10-contador)+" clicks");
        tvw.setVisibility(View.VISIBLE);

        if (contador==10){
            imv.setVisibility(View.VISIBLE);
            tvw.setVisibility(View.INVISIBLE);
            contador=0;
        }else{
            if (imv.getVisibility()==View.VISIBLE) {
                imv.setVisibility(View.INVISIBLE);
            }
        }
    }
}
