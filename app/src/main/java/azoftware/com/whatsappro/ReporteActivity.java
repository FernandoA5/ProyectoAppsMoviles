package azoftware.com.whatsappro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import azoftware.com.whatsappro.adapter.ListAdapter;

public class ReporteActivity extends AppCompatActivity {
    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);

        init();
    }

    public void init() {
        elements = new ArrayList<>();
        //AQUÍ SE PASARÍAN LOS ELEMENTOS DE LA BASE DE DATOS A LA LISTA QUE SERÁ USADA POR EL RECYCLER VIEW.
        elements.add(new ListElement(
            "9:18 - 22/06/22",
            "-",
            "-",
            "Soleado",
            0.25f,
            22.0f,
            968.58f,
            26.19f
        ));
        elements.add(new ListElement(
                "9:18 - 23/06/22",
                "-",
                "-",
                "Soleado",
                0.25f,
                22.0f,
                968.58f,
                26.19f
        ));
        elements.add(new ListElement(
                "9:18 - 24/06/22",
                "-",
                "-",
                "Soleado",
                0.25f,
                22.0f,
                968.58f,
                26.19f
        ));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}