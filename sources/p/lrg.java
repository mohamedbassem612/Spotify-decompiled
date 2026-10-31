package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lrg implements ObservableTransformer {
    public final v75 X;
    public final boolean Y;
    public final Context Z;
    public final u680 a;
    public final xjl b;
    public final q8n c;
    public final q8n d;
    public final lzn0 e;
    public final e7p0 f;
    public final zrj1 g;
    public final i4t0 h;
    public final abu i;
    public final gg11 t;

    public lrg(u680 u680Var, xjl xjlVar, q8n q8nVar, q8n q8nVar2, lzn0 lzn0Var, e7p0 e7p0Var, zrj1 zrj1Var, i4t0 i4t0Var, abu abuVar, gg11 gg11Var, v75 v75Var, boolean z, Context context) {
        this.a = u680Var;
        this.b = xjlVar;
        this.c = q8nVar;
        this.d = q8nVar2;
        this.e = lzn0Var;
        this.f = e7p0Var;
        this.g = zrj1Var;
        this.h = i4t0Var;
        this.i = abuVar;
        this.t = gg11Var;
        this.X = v75Var;
        this.Y = z;
        this.Z = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.switchMapCompletable(new i6b(this, (byte) 12)).w();
    }
}
