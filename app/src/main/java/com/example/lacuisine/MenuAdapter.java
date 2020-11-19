package com.example.lacuisine;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MViewHolder> {

    private Context mContext;
    private List<Menu> mMenu;
    private Dialog mDialog;

    public MenuAdapter(Context mContext, List<Menu> mMenu) {
        this.mContext = mContext;
        this.mMenu = mMenu;
    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_menu, parent, false);
        final MViewHolder mHolder = new MViewHolder(v);

        mDialog = new Dialog(mContext);
        mDialog.setContentView(R.layout.dialog_count);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        mHolder.item_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialogName_tv = (TextView) mDialog.findViewById(R.id.dialog_name);
                TextView dialogPrice_tv = (TextView) mDialog.findViewById(R.id.dialog_price);
                TextView dialogDesc_tv = (TextView) mDialog.findViewById(R.id.dialog_desc);
                ImageView dialogImage_iv = (ImageView) mDialog.findViewById(R.id.dialog_image);

                dialogName_tv.setText(mMenu.get(mHolder.getAdapterPosition()).getName());
                dialogPrice_tv.setText(mMenu.get(mHolder.getAdapterPosition()).getPrice());
                dialogDesc_tv.setText(mMenu.get(mHolder.getAdapterPosition()).getDesc());
                dialogImage_iv.setImageResource(mMenu.get(mHolder.getAdapterPosition()).getImage());

                mDialog.show();
            }
        });

        return mHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MViewHolder holder, int position) {

        holder.tv_name.setText(mMenu.get(position).getName());
        holder.tv_price.setText(mMenu.get(position).getPrice());
        holder.iv_image.setImageResource(mMenu.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return mMenu.size();
    }

    public static class MViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name;
        private TextView tv_price;
        private ImageView iv_image;
        private LinearLayout item_menu;


        public MViewHolder(View menuView) {
            super(menuView);

            item_menu = (LinearLayout) menuView.findViewById(R.id.item_id);
            tv_name = (TextView) menuView.findViewById(R.id.name_id);
            tv_price = (TextView) menuView.findViewById(R.id.price_id);
            iv_image = (ImageView) menuView.findViewById(R.id.img_menu);
        }
    }
}
