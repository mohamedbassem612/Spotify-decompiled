package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lbm1 implements o1i {
    public final q9l1 a;
    public final g9l1 b;
    public final xgm1 c;
    public final kly0 d;
    public final hce1 e;
    public final d08 f;
    public final m0t g;
    public final hcl1 h;

    public lbm1(q9l1 q9l1Var, g9l1 g9l1Var, xgm1 xgm1Var, kly0 kly0Var, hce1 hce1Var, d08 d08Var, m0t m0tVar, hcl1 hcl1Var) {
        this.a = q9l1Var;
        this.b = g9l1Var;
        this.c = xgm1Var;
        this.d = kly0Var;
        this.e = hce1Var;
        this.f = d08Var;
        this.g = m0tVar;
        this.h = hcl1Var;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(ibm1 ibm1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1903162007);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ibm1Var) : x340Var.i(ibm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            nyx.a(0, (wux) null, apo.r(1035951990, new pej1(ibm1Var, o0iVar, this, (byte) 21), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, this, ibm1Var, o0iVar, qim0Var, (byte) 12);
        }
    }
}
