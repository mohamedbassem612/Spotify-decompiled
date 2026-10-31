package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u7c implements rhh0 {
    public final Context a;
    public final Observable b;
    public final yqg c;
    public final ifl1 d;
    public final n3q0 e;
    public final o3e0 f;
    public final o241 g;
    public final xvo h;
    public final zr00 i;

    public u7c(Context context, Observable observable, yqg yqgVar, ifl1 ifl1Var, n3q0 n3q0Var, o3e0 o3e0Var, o241 o241Var, rh11 rh11Var, xvo xvoVar, zr00 zr00Var) {
        this.a = context;
        this.b = observable;
        this.c = yqgVar;
        this.d = ifl1Var;
        this.e = n3q0Var;
        this.f = o3e0Var;
        this.g = o241Var;
        this.h = xvoVar;
        this.i = zr00Var;
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        m210 m210VarB = r9cVar.b();
        return m210VarB == null ? Single.error(new Throwable("externalAccessoryDescription is null")) : this.b.filter(qz70.Z).map(b6j0.Y).switchMapSingle(new cab(this, r9cVar, m210VarB, (byte) 5)).firstOrError();
    }
}
