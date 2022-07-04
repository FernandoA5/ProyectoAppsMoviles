package azoftware.com.whatsappro;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    //Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    //Intent intent = new Intent(MainActivity.this, ReporteActivity.class);
                    Intent intent = new Intent(MainActivity.this, EstacionMeteorologica.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }



    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}