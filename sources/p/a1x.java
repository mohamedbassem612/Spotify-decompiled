package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a1x {
    public final kcq a;
    public final adp b;
    public final bdp c;
    public final cdp d;
    public final kly0 e;
    public final kly0 f;

    public a1x(kcq kcqVar, adp adpVar, bdp bdpVar, cdp cdpVar, gbp gbpVar, gbp gbpVar2) {
        this.a = kcqVar;
        this.b = adpVar;
        this.c = bdpVar;
        this.d = cdpVar;
        this.e = gbpVar;
        this.f = gbpVar2;
    }

    public static mx2 a(a1x a1xVar, int i, iac0 iac0Var, String str) {
        ay0 ay0Var;
        int iC = l1d.C(i);
        if (iC == 0) {
            ay0Var = (ay0) a1xVar.e.get();
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            ay0Var = (ay0) a1xVar.f.get();
        }
        ay0Var.getClass();
        j0x j0xVarA = a1xVar.a.a(new zeu(a1xVar, l1d.m("embeddedad-", ay0Var.a.a), iac0Var), ay0Var);
        return new mx2(j0xVarA, new qrd1(new mmr0(new prd1(), str)), ((vgr) j0xVarA).b(1));
    }
}
