package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v7c implements rhh0 {
    public final Observable a;
    public final ifl1 b;
    public final o3e0 c;
    public final yqg d;
    public final xvo e;

    public v7c(Observable observable, ifl1 ifl1Var, o3e0 o3e0Var, yqg yqgVar, xvo xvoVar) {
        this.a = observable;
        this.b = ifl1Var;
        this.c = o3e0Var;
        this.d = yqgVar;
        this.e = xvoVar;
    }

    public final Single b(r9c r9cVar) {
        m210 m210Var = r9cVar.e;
        return m210Var == null ? Single.error(new Throwable("externalAccessoryDescription is null")) : this.a.filter(cq41.Z).map(uml1.Z).switchMapSingle(new cab(this, m210Var, r9cVar, (byte) 6)).firstOrError();
    }
}
