package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ha61 implements ObservableTransformer {
    public final Context a;
    public final Scheduler b;
    public final Scheduler c;
    public final ki4 d;
    public final zsc e;

    public ha61(Context context, Scheduler scheduler, Scheduler scheduler2, ki4 ki4Var, zsc zscVar) {
        this.a = context;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = ki4Var;
        this.e = zscVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new yrg0(this, (byte) 15));
    }
}
