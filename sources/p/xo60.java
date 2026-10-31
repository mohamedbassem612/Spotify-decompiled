package p;

import android.content.Context;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xo60 {
    public final Context a;
    public final ynb0 b;
    public final upp0 c;
    public final idd1 d = new idd1(h050.P0);
    public final idd1 e = new idd1(new g050(this, (byte) 19));

    public xo60(Context context, ynb0 ynb0Var, upp0 upp0Var) {
        this.a = context;
        this.b = ynb0Var;
        this.c = upp0Var;
    }

    public final ObservableRefCount a() {
        tut0 tut0Var = (tut0) this.b.get();
        return yoi1.i(((lut0) tut0Var.b.get()).b, o6x.a).observeOn(tut0Var.c).onErrorReturnItem(Boolean.FALSE).switchMap(new zhq0(tut0Var, new auc(1000), (byte) 25)).map(new h0y(this, (byte) 21)).startWithItem((uut0) this.d.getValue()).distinctUntilChanged().replay(1).f();
    }
}
