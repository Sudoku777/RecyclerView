package agent.shop.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Contact> mData;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;

        v = LayoutInflater.from(mContext).inflate(R.layout.item_contact,parent,false);
        MyViewHolder vHolder=new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int possition) {

         holder.text_name.setText(mData.get(possition).getName());
         holder.text_phone.setText(mData.get(possition).getPhone());
         holder.imageView.setImageResource(mData.get(possition).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView text_name;
        private TextView text_phone;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            text_name = (TextView) itemView.findViewById(R.id.name_contact);
            text_phone = (TextView) itemView.findViewById(R.id.phone_contact);
            imageView = (ImageView) itemView.findViewById(R.id.image_contact);
        }
    }
}
