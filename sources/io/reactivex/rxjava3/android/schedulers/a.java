package io.reactivex.rxjava3.android.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class a implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Scheduler scheduler = AndroidSchedulers.a;
        return AndroidSchedulers.MainHolder.a;
    }
}
