package theater2000.com.hetgezinvanpaemel;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TVDBF57 on 5/01/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textViewFragmentName;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewFragmentName = (TextView)itemView.findViewById(R.id.textViewFragmentName);
        }
    }

    public CustomAdapter(ArrayList<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent, false);
        view.setOnClickListener(MainActivity.myOnClickListener);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        TextView textViewFragmentName = holder.textViewFragmentName;
        textViewFragmentName.setText(dataSet.get(position).getFragmentName());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
