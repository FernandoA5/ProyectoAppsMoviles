package azoftware.com.whatsappro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EstacionMeteorologica extends AppCompatActivity {

    //DECLARACIÓN DE CONSTANTES
    private final String LOGO_ESTACION ="https://i.ibb.co/hfc3kDB/image.png";
    private final String IMAGEN_PERFIL="https://i.ibb.co/98H31Hw/foto-perfil-ejemplo.png";
    //DECALARCIÓN DE VARIABLES GLOBALES
    ImageView iVLogoEstacion;
    ImageView iVFotoPerfil;
    Button iBBotones[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estacion_meteorologica);

        //ASOSIAMOS LOS OBJETOS DEL XML A LAS VARIABLES QUE LOS REPRESENTAN
        iVLogoEstacion = findViewById(R.id.iconoBarraEstación);
        iVFotoPerfil = findViewById(R.id.imagenPerfil);

        //USAMOS GLIDE PARA APLICAR LA IMAGEN DE INTERNET EN EL IMAGE VIEW
        Glide.with(this).load(LOGO_ESTACION).error(R.drawable.ic_launcher_foreground).into(iVLogoEstacion);
        Glide.with(this).load(IMAGEN_PERFIL).error(R.drawable.ic_launcher_foreground).into(iVFotoPerfil);


    }
}