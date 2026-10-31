package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sfp implements fox0 {
    public final /* synthetic */ lbp a;

    public sfp(lbp lbpVar) {
        this.a = lbpVar;
    }

    public final iox0 a(d0r d0rVar, o3r o3rVar) {
        lbp lbpVar = this.a;
        lo60 lo60VarU = lbp.a(lbpVar).u();
        gw70 gw70VarK = lbp.a(lbpVar).a.k();
        c8o.l(gw70VarK);
        ycm ycmVar = (ycm) lbp.a(lbpVar).f0.get();
        myq0 myq0VarV = lbp.a(lbpVar).v();
        Flowable flowable = (Flowable) lbp.a(lbpVar).a.j.get();
        c8o.l(flowable);
        return new iox0(lo60VarU, gw70VarK, ycmVar, myq0VarV, flowable, lbp.a(lbpVar).B(), d0rVar, o3rVar);
    }
}
