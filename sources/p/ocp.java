package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ocp {
    public final /* synthetic */ lbp a;

    public ocp(lbp lbpVar) {
        this.a = lbpVar;
    }

    public final ru31 a(r091 r091Var, iu30 iu30Var, b8k0 b8k0Var, pe21 pe21Var) {
        ks6 ks6Var = (ks6) this.a.c;
        d0r d0rVar = (d0r) ((jly0) ks6Var.h).get();
        String strI = ks6Var.i();
        ntv ntvVar = (ntv) ks6Var.a;
        z6k0 z6k0Var = (z6k0) ntvVar.j.get();
        c8o.l(z6k0Var);
        pcp pcpVar = (pcp) ((jly0) ks6Var.i).get();
        nfq nfqVar = (nfq) ntvVar.C.get();
        c8o.l(nfqVar);
        String strI2 = ks6Var.i();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        yon1.G1("PLAYLIST_EDIT_ITEMS", "playlist/edit-items", 1458, "playlist");
        txk0 txk0Var = new txk0(strI2, (byte) 10);
        v6q v6qVar = (v6q) ntvVar.F.get();
        c8o.l(v6qVar);
        return new ru31(d0rVar, strI, z6k0Var, pcpVar, nfqVar, txk0Var, v6qVar, r091Var, iu30Var, b8k0Var, pe21Var);
    }
}
