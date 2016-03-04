package com.lifeistech.android.choki;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by kotonehamataka on 16/02/27.
 */
public class Bill implements Parcelable {
    public String name;
    public int price;

    public static int futoppara; // 0: 太っ腹じゃない, 1: 太っ腹
    public static int percentage;

    Bill() {

    }

    @Override
    public String toString() {
        return name + "(price:" + price + ")";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(price);
        dest.writeInt(futoppara);
    }

    public static final Parcelable.Creator<Bill> CREATOR
            = new Parcelable.Creator<Bill>() {
        public Bill createFromParcel(Parcel in) {
            return new Bill(in);
        }

        public Bill[] newArray(int size) {
            return new Bill[size];
        }
    };

    private Bill(Parcel in) {
        name = in.readString();
        price = in.readInt();
        futoppara = in.readInt();
    }

}
