package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vnu implements z9a0 {
    public final /* synthetic */ Flowable a;

    public vnu(Flowable flowable) {
        this.a = flowable;
    }

    public final mr20 a() {
        Flowable flowableJ = this.a.j(mo9.i);
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowableJ);
        x9a0 x9a0Var = x9a0.d;
        return new xy0(kgeVar);
    }
}
