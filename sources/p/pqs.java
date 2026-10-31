package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pqs {
    public final kly0 a;
    public final boolean b;
    public final boolean c;
    public final Observable d;

    public pqs(i05 i05Var, ke71 ke71Var, caq caqVar) {
        this.a = caqVar;
        this.b = i05Var.b();
        this.c = i05Var.a();
        this.d = ke71Var.o().map(mpi1.X0).onErrorReturnItem(Boolean.FALSE).distinctUntilChanged();
    }

    public static Single a(pqs pqsVar) {
        return (pqsVar.c ? pqsVar.d.firstOrError() : ((fis) pqsVar.a.get()).a.firstOrError().map(new fjb((byte) 7))).onErrorReturnItem(Boolean.FALSE);
    }
}
