package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qfp implements fnx0 {
    public final /* synthetic */ lbp a;

    public qfp(lbp lbpVar) {
        this.a = lbpVar;
    }

    public final h6w a(d0r d0rVar, o3r o3rVar, hbt hbtVar) {
        lbp lbpVar = this.a;
        lo60 lo60VarU = lbp.a(lbpVar).u();
        gw70 gw70VarK = lbp.a(lbpVar).a.k();
        c8o.l(gw70VarK);
        l0x0 l0x0VarB = lbp.a(lbpVar).B();
        Flowable flowable = (Flowable) lbp.a(lbpVar).a.j.get();
        c8o.l(flowable);
        vgm vgmVarD = lbp.a(lbpVar).a.d();
        c8o.l(vgmVarD);
        return new h6w(lo60VarU, gw70VarK, l0x0VarB, flowable, vgmVarD, d0rVar, o3rVar, hbtVar);
    }
}
