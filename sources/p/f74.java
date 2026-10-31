package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f74 implements w310 {
    public final dn3 a;
    public final Context b;
    public final o241 c;
    public final uw0 d;
    public final xo60 e;
    public final o3e0 f;
    public final upp0 g;

    public f74(dn3 dn3Var, Context context, o241 o241Var, uw0 uw0Var, xo60 xo60Var, o3e0 o3e0Var, upp0 upp0Var) {
        this.a = dn3Var;
        this.b = context;
        this.c = o241Var;
        this.d = uw0Var;
        this.e = xo60Var;
        this.f = o3e0Var;
        this.g = upp0Var;
    }

    public final Observable a(r9c r9cVar) {
        return Observable.combineLatest(this.c.a, this.d.n(9).a(r9cVar), this.e.a(), new cp5(this, (byte) 13));
    }
}
