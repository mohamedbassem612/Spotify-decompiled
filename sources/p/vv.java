package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class vv {
    public final t2j0 a;
    public final g0l b;
    public final Context c;
    public qtt d;
    public final Single e;

    public vv(t2j0 t2j0Var, g0l g0lVar, Context context) {
        Single singleJust;
        this.a = t2j0Var;
        this.b = g0lVar;
        this.c = context;
        qtt qttVar = this.d;
        this.e = (qttVar == null || (singleJust = Single.just(qttVar)) == null) ? ((inr) g0lVar).m().filter(tv.a).flatMap(new rv(this, (byte) 1)).map(qr.i).firstOrError().map(new rv(this, (byte) 0)).doOnSuccess(new sv(this)) : singleJust;
    }

    public final Completable a(o71 o71Var) {
        return this.e.flatMapCompletable(new mr(this, o71Var, (byte) 4));
    }

    public final Completable b(t521 t521Var) {
        return this.e.flatMapCompletable(new mr(this, t521Var, (byte) 5));
    }
}
