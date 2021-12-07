package com.example.thinkmobiles.SmartWateringApp.base;



public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
