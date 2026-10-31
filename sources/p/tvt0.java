package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tvt0 implements ObservableTransformer {
    public final vqd1 a;
    public final Scheduler b;
    public final rzo0 c;
    public final t8r0 d;
    public final yfu e;

    public tvt0(vqd1 vqd1Var, Scheduler scheduler, rzo0 rzo0Var, t8r0 t8r0Var, mhc mhcVar, yfu yfuVar) {
        this.a = vqd1Var;
        this.b = scheduler;
        this.c = rzo0Var;
        this.d = t8r0Var;
        this.e = yfuVar;
    }

    public static final CompletableOnErrorComplete d(tvt0 tvt0Var, hkt0 hkt0Var) {
        Logger.g("Go: Received playback command: %s", new Object[]{1});
        Completable completableIgnoreElement = tvt0Var.a.b((nhc1.S(hkt0Var.c, "Ray-Ban", true) && nhc1.S(hkt0Var.b, "Ray-Ban Stories 2 Voice", true)) ? Boolean.FALSE : null).observeOn(tvt0Var.b).doOnSuccess(new cj9(tvt0Var, hkt0Var, (byte) 6)).doOnError(new w090(hkt0Var, tvt0Var, (byte) 29)).ignoreElement();
        rzo0 rzo0Var = tvt0Var.c;
        completableIgnoreElement.getClass();
        return Completable.y(completableIgnoreElement.p(new tym0(rzo0Var, (byte) 15))).o(zz10.X0);
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new yrg0(this, (byte) 6)).doFinally(new c72(this, (byte) 5));
    }
}
