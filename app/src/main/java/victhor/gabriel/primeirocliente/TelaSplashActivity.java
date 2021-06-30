package victhor.gabriel.primeirocliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class TelaSplashActivity extends AppCompatActivity {
    int minutos = 1000 * 15;
    String TAG = "APP Primeiro Cliente";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        Log.d(TAG, "onCreate: Carregando Tela Splash...");
        trocaTela();
    }

    private void trocaTela() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent troca = new Intent(TelaSplashActivity.this, MainActivity.class);
                startActivity(troca);
                finish();
            }
        }, minutos);
    }
}