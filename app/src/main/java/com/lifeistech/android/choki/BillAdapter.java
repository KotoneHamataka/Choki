package com.lifeistech.android.choki;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kotonehamataka on 16/02/27.
 */
public class BillAdapter extends ArrayAdapter<Bill> {
    int totalPrice;
    int averagePrice;


    public BillAdapter(Context context, List<Bill> billList) {
        super(context, R.layout.item_bill, billList);
        totalPrice = 0;
        for (Bill bill : billList) {
            totalPrice += bill.price;
        }
        if (billList.size() != 0) {
            averagePrice = totalPrice / billList.size();
        }






    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_bill, parent, false);
        }
        TextView nameTextView = (TextView) convertView.findViewById(R.id.textName);
        TextView nameLabelTextView = (TextView) convertView.findViewById(R.id.textNameLabel);
        TextView priceTextView = (TextView) convertView.findViewById(R.id.textPrice);
        TextView priceLabelTextView = (TextView) convertView.findViewById(R.id.textPriceLabel);

        Bill bill = getItem(position);

        nameTextView.setText(bill.name);

        priceTextView.setText(String.valueOf(Math.abs(bill.price - averagePrice)));

        if(bill.price <= averagePrice) {
            priceLabelTextView.setText("円お支払い");


        }else{
            priceLabelTextView.setText("円集金");
            priceLabelTextView.setTextColor(Color.parseColor("#FF0000"));
        }

        return convertView;
    }
}



