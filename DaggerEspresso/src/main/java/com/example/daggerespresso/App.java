package com.example.daggerespresso;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;

/**
 * Created by mwolfe on 10/28/13.
 */
public class App extends Application {

    public ObjectGraph graph;
    @Override
    public void onCreate() {
        super.onCreate();
        graph = ObjectGraph.create(new AppModule(this));
        graph.inject(this);
    }


    @Module(
            injects = {App.class, MainActivity.class},
            library = true
    )
    public static class AppModule {
        private App mApp;
        public AppModule(App app) {
            mApp = app;
        }
        @Provides
        Context provideApplicationContext() {
            return mApp.getApplicationContext();
        }
    }
}
