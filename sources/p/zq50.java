package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zq50 implements p090 {
    static {
        new m4c((byte) 12);
    }

    public final ry21 a(uf01 uf01Var) {
        ln21 ln21Var = uf01Var.e;
        tn21 tn21Var = ln21Var.d;
        v360 v360Var = ln21Var.c;
        if (tn21Var != null && v360Var.c("Content-Encoding") == null && v360Var.c("X-Transfer-Encoding") == null) {
            tn21Var.getClass();
            if (tn21Var.a() >= 500) {
                ne neVarB = ln21Var.b();
                ((t360) neVarB.c).g("Content-Encoding", "gzip");
                neVarB.L(ln21Var.b, m4c.j(m4c.m(tn21Var)));
                return uf01Var.b(new ln21(neVarB));
            }
        }
        return uf01Var.b(ln21Var);
    }
}
