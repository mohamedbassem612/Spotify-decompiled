package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g74 implements w310 {
    public final dn3 a;
    public final Context b;
    public final o241 c;
    public final uw0 d;

    public g74(dn3 dn3Var, Context context, o241 o241Var, uw0 uw0Var) {
        this.a = dn3Var;
        this.b = context;
        this.c = o241Var;
        this.d = uw0Var;
    }

    public final Observable a(r9c r9cVar) {
        return Observable.combineLatest(this.c.a, this.d.n(10).a(r9cVar), new km3(r9cVar, this, (byte) 4));
    }
}
