package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s6p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ s6p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ogh a(jgh jghVar, cce cceVar, String str) {
        byte b = this.a;
        b2p b2pVar = this.b;
        switch (b) {
            case 0:
                em0 em0Var = (em0) b2pVar.c;
                dkh dkhVar = (dkh) ((bnh) em0Var.b).f.get();
                c8o.l(dkhVar);
                bnh bnhVar = (bnh) em0Var.b;
                tjh tjhVarA = bnhVar.a();
                c8o.l(tjhVarA);
                hwe1 hwe1Var = (hwe1) bnhVar.E.get();
                c8o.l(hwe1Var);
                af10 af10Var = (af10) bnhVar.p.get();
                c8o.l(af10Var);
                return new ogh(dkhVar, tjhVarA, hwe1Var, af10Var, em0Var.z(), str, jghVar, cceVar);
            default:
                em0 em0Var2 = (em0) b2pVar.c;
                dkh dkhVar2 = (dkh) ((wph) em0Var2.b).o.get();
                c8o.l(dkhVar2);
                wph wphVar = (wph) em0Var2.b;
                tjh tjhVarA2 = wphVar.a();
                c8o.l(tjhVarA2);
                hwe1 hwe1Var2 = (hwe1) wphVar.n.get();
                c8o.l(hwe1Var2);
                af10 af10Var2 = (af10) wphVar.t.get();
                c8o.l(af10Var2);
                luk lukVar = (luk) wphVar.v.get();
                c8o.l(lukVar);
                return new ogh(dkhVar2, tjhVarA2, hwe1Var2, af10Var2, new wjh(lukVar), str, jghVar, cceVar);
        }
    }
}
