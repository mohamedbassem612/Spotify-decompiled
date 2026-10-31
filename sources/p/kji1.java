package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kji1 {
    public final vi11 a;
    public final v75 b;
    public final yqg c;
    public boolean d;

    public kji1(vi11 vi11Var, v75 v75Var, yqg yqgVar) {
        this.a = vi11Var;
        this.b = v75Var;
        this.c = yqgVar;
    }

    public final Observable a() {
        vi11 vi11Var = this.a;
        ima1 ima1Var = (dma1) vi11Var.b;
        ima1 ima1Var2 = ima1Var;
        return yoi1.i(c4p1.F(ima1Var2.o(), ima1Var2, (bma1) vi11Var.f, z691.e), o6x.a).filter(djx0.X).map(njx0.X).startWith(Observable.fromCallable(new st71(vi11Var, (byte) 0))).distinctUntilChanged().map(new ezb1(this, (byte) 18));
    }
}
