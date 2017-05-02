package com.cunoraz.eksiseyler.di.app;

import android.content.Context;
import android.content.SharedPreferences;

import com.cunoraz.eksiseyler.app.EksiSeylerApp;
import com.cunoraz.eksiseyler.rest.ApiSource;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by cuneytcarikci on 02/05/2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {

    void inject(EksiSeylerApp app);

    SharedPreferences sharedPreferences();

    Context context();

    ApiSource apiSource();

}