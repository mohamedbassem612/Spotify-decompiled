package p;

import android.content.Context;
import android.content.res.Resources;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h1i0 {
    public final ys4 a;
    public final Scheduler b;
    public final d520 c;
    public final e6u0 d;
    public final Resources e;
    public final CompositeDisposable f = new CompositeDisposable();
    public volatile r0i0 g;
    public y490 h;

    public h1i0(Context context, ys4 ys4Var, Scheduler scheduler, d520 d520Var, e6u0 e6u0Var) {
        this.a = ys4Var;
        this.b = scheduler;
        this.c = d520Var;
        this.d = e6u0Var;
        this.e = context.getResources();
    }
}
