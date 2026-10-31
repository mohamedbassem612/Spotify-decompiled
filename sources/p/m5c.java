package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m5c extends pim0 implements f5c, zkb0 {
    public xtl O0;
    public boolean P0;

    public static final n511 H1(m5c m5cVar, ndo0 ndo0Var, og ogVar) {
        n511 n511Var;
        if (m5cVar.N0 && m5cVar.P0) {
            ndo0 ndo0VarZ = oap1.z(m5cVar);
            if (!ndo0Var.f1().N0) {
                ndo0Var = null;
            }
            if (ndo0Var != null && (n511Var = (n511) ogVar.invoke()) != null) {
                return sjo0.i(ndo0VarZ, ndo0Var, n511Var);
            }
        }
        return null;
    }

    @Override // p.f5c
    public final Object C(ndo0 ndo0Var, og ogVar, onm onmVar) {
        Object objS = smo1.s(new ur1(this, ndo0Var, ogVar, new uc9(this, ndo0Var, ogVar, (byte) 2), (lnm) null, (byte) 6), onmVar);
        return objS == d9n.a ? objS : rih1.a;
    }

    @Override // p.zkb0
    public final void d1(elb0 elb0Var) {
        this.P0 = true;
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }
}
