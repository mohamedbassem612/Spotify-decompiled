package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iov0 {
    public final dma1 a;

    public Observable a() {
        bma1 bma1Var = jov0.a;
        ima1 ima1Var = this.a;
        String strE = ima1Var.e(bma1Var, (String) null);
        return yoi1.i(ima1Var.r(bma1Var), o6x.a).filter(yz10.b1).map(zz10.c1).startWithItem(strE == null ? j5.a : new i5w0(new l560(strE))).distinctUntilChanged();
    }
}
