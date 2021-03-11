package com.ribal.univjogja;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class UniversitasAdapter extends RecyclerView.Adapter<UniversitasAdapter.ViewHolder> {

    private List<Universitas> list;

    public UniversitasAdapter(List<Universitas> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.list_item, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView picture;
        ImageView screenshot;
        TextView nama, alamat;

        public ViewHolder(View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.iv_picture);
            screenshot = itemView.findViewById(R.id.iv_screenshot);
            nama = itemView.findViewById(R.id.name);
            alamat = itemView.findViewById(R.id.alamat);

        }

        public void bind(final Universitas item) {
            picture.setImageResource(item.getPicture());
            nama.setText(item.getNama());
            alamat.setText(item.getAlamat());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), DescriptionActivity.class);
                    intent.putExtra(DescriptionActivity.SCREENSHOT, item.getScreenshot());
                    intent.putExtra(DescriptionActivity.DESCRIPTION, item.getDesc());
                    intent.putExtra(DescriptionActivity.NAMA, item.getNama());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
