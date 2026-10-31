package io.reactivex.rxjava3.android;

import android.os.Looper;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import p.gv40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class MainThreadDisposable implements Disposable {
    public final AtomicBoolean a = new AtomicBoolean();

    public abstract void a();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
                return;
            }
            Scheduler scheduler = AndroidSchedulers.a;
            RxAndroidPlugins.b(scheduler);
            scheduler.c(new gv40(this, (byte) 15));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.a.get();
    }
}
