package com.example.tmdb.feature.common;

/**
 * Created by ezequiel.messore on 03/06/2018.
 * ezequielmessore.developer@gmail.com
 */
public interface BaseView<Presenter extends BasePresenter> {

    Presenter getPresenter();

}
