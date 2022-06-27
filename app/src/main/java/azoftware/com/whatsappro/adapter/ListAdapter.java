package azoftware.com.whatsappro.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import azoftware.com.whatsappro.ListElement;
import azoftware.com.whatsappro.R;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }
    @Override
    public int getItemCount(){
        return mData.size();
    }
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.item_tabla, parent, false);
        return new ListAdapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListElement> items){
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView fecha, fechaInicio, fechaFinal, estado, intensidad, presion,humedad, temperatura;

        ViewHolder(View itemView){
            super(itemView);
            fecha = itemView.findViewById(R.id.dateResult);
            fechaInicio = itemView.findViewById(R.id.dateStart);
            fechaFinal = itemView.findViewById(R.id.dateEnd);
            estado = itemView.findViewById(R.id.statusResult);
            intensidad = itemView.findViewById(R.id.IntensidadUVResult);
            presion = itemView.findViewById(R.id.presionResult);
            humedad = itemView.findViewById(R.id.humedadResult);
            temperatura = itemView.findViewById(R.id.temperaturaResult);
        }

        void bindData(final ListElement item){
            fecha.setText(item.getFecha());
            fechaInicio.setText(item.getFechaInicial());
            fechaFinal.setText(item.getFechaFinal());
            estado.setText(item.getEstado());
            intensidad.setText(item.getIntensidadUV().toString());
            presion.setText(item.getPresion().toString());
            humedad.setText(item.getHumedad().toString());
            temperatura.setText(item.getTemperatura().toString());
        }
    }
}
