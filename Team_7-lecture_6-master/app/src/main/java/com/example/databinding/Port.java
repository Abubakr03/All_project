package com.example.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Port extends BaseObservable {


    public String name;

    @Bindable

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
        notifyPropertyChanged(BR.name);
    }

    public Port() {
    }
}
