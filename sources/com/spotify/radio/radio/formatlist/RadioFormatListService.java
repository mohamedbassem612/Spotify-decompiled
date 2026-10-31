package com.spotify.radio.radio.formatlist;

import android.content.Intent;
import android.os.IBinder;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import p.fv5;
import p.hpq;
import p.po5;
import p.s241;
import p.xye1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class RadioFormatListService extends hpq {
    public static final /* synthetic */ int e = 0;
    public Disposable a = EmptyDisposable.a;
    public s241 b;
    public Scheduler c;
    public xye1 d;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        this.a.dispose();
        super/*android.app.Service*/.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !intent.hasExtra(".seed_uri")) {
            stopSelf();
            return 2;
        }
        this.a = this.b.a(intent.getExtras().getString(".seed_uri")).observeOn(this.c).subscribe(new po5(this, getApplicationContext(), (byte) 4), new fv5(this, (byte) 15));
        return 2;
    }
}
