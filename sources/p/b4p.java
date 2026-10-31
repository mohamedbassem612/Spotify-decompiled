package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b4p implements fnx0 {
    public final /* synthetic */ b2p a;

    public b4p(b2p b2pVar) {
        this.a = b2pVar;
    }

    @Override // p.fnx0
    public final h6w a(d0r d0rVar, o3r o3rVar, hbt hbtVar) {
        d4p d4pVar = (d4p) this.a.c;
        lzn0 lzn0VarI = d4pVar.a.i();
        c8o.l(lzn0VarI);
        gw70 gw70VarB = d4pVar.a.b();
        c8o.l(gw70VarB);
        l0x0 l0x0VarH = d4pVar.h();
        Flowable flowable = (Flowable) d4pVar.a.y.get();
        c8o.l(flowable);
        vgm vgmVarE = d4pVar.a.e();
        c8o.l(vgmVarE);
        return new h6w(lzn0VarI, gw70VarB, l0x0VarH, flowable, vgmVarE, d0rVar, o3rVar, hbtVar);
    }
}
