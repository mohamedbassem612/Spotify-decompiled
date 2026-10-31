package p;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.spotify.android.base.SpotifyAppComponentFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ll5 extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        SpotifyAppComponentFactory spotifyAppComponentFactory = (SpotifyAppComponentFactory) this;
        AtomicReference atomicReference = kk20.a;
        kk20.a(str, intent != null ? don1.k(intent) : null);
        try {
            Activity activity = (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null);
            i94 i94Var = spotifyAppComponentFactory.a;
            if (i94Var.f.equals(pzh.c)) {
                i94Var.f = new dzh(activity.getClass().getName(), intent, (byte) 0);
            }
            return activity;
        } catch (NoSuchMethodException | InvocationTargetException e) {
            bhn0.o("Couldn't call constructor", e);
            return null;
        }
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            bhn0.o("Couldn't call constructor", e);
            return null;
        }
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        SpotifyAppComponentFactory spotifyAppComponentFactory = (SpotifyAppComponentFactory) this;
        try {
            ContentProvider contentProvider = (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null);
            spotifyAppComponentFactory.a.getClass();
            return contentProvider;
        } catch (NoSuchMethodException | InvocationTargetException e) {
            bhn0.o("Couldn't call constructor", e);
            return null;
        }
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        SpotifyAppComponentFactory spotifyAppComponentFactory = (SpotifyAppComponentFactory) this;
        AtomicReference atomicReference = kk20.a;
        kk20.b(str, intent != null ? don1.k(intent) : null);
        try {
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null);
            i94 i94Var = spotifyAppComponentFactory.a;
            if (i94Var.f.equals(pzh.c)) {
                if (!u890.j(intent != null ? intent.getAction() : null, "android.intent.action.BOOT_COMPLETED")) {
                    i94Var.f = new dzh(broadcastReceiver.getClass().getName(), intent, (byte) 1);
                }
            }
            return broadcastReceiver;
        } catch (NoSuchMethodException | InvocationTargetException e) {
            bhn0.o("Couldn't call constructor", e);
            return null;
        }
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        SpotifyAppComponentFactory spotifyAppComponentFactory = (SpotifyAppComponentFactory) this;
        AtomicReference atomicReference = kk20.a;
        kk20.c(str, intent != null ? don1.k(intent) : null);
        try {
            Service service = (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null);
            i94 i94Var = spotifyAppComponentFactory.a;
            if (i94Var.f.equals(pzh.c)) {
                i94Var.f = new dzh(service.getClass().getName(), intent, (byte) 2);
            }
            return service;
        } catch (NoSuchMethodException | InvocationTargetException e) {
            bhn0.o("Couldn't call constructor", e);
            return null;
        }
    }
}
