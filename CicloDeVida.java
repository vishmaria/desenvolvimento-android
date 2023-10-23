
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.avemaria.maria.R;


public class CicloDeVida extends AppCompatActivity {

    protected static final String CATEGORIA ="TESTE";

    private String getClassName(){
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(CATEGORIA, getClassName() + ".onCreate() chamado: " + savedInstanceState);
        //TextView t = new TextView(this);
        //t.setText("Exemplo do ciclo de vida.\n Consulte os logs no LogCat");
        setContentView(R.layout.create);
    }

    protected void onStart(){
        super.onStart();
        Log.i(CATEGORIA, getClassName() + ".onStart() chamado");
        setContentView(R.layout.start);

    }

    protected void onRestart (){
        super.onRestart();
        Log.i(CATEGORIA, getClassName() + ".onRestart chamado");
        setContentView(R.layout.restart);
    }

    protected void onResume (){
        super.onResume();
        Log.i(CATEGORIA, getClassName() + ".onResume chamado");
        setContentView(R.layout.resume);
    }

    protected void onPause (){
        super.onPause();
        Log.i(CATEGORIA, getClassName() + ".onPause chamado");
        setContentView(R.layout.pause);
    }

    protected void onStop (){
        super.onStop();
        Log.i(CATEGORIA, getClassName() + ".onStop chamado");
        setContentView(R.layout.stop);
    }

    protected void onDestroy (){
        super.onDestroy();
        Log.i(CATEGORIA, getClassName() + ".onDestroy chamado");
    }
}
