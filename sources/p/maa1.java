package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class maa1 implements qk90 {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final m381 c;

    public maa1(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new yd91(3, new gga1(this, (byte) 17));
                this.c = new n4n0((byte) 1);
                break;
            default:
                this.b = new yd91(3, gr81.T0);
                p9a1 p9a1Var = p9a1.W0;
                n381 n381Var = p381.a;
                this.c = new n381(p9a1Var);
                break;
        }
    }

    @Override // p.pk90
    public final m381 c() {
        byte b = this.a;
        n381 n381Var = this.c;
        switch (b) {
            case 0:
                return n381Var;
            default:
                return (n4n0) n381Var;
        }
    }

    @Override // p.pk90
    public final yd91 d() {
        byte b = this.a;
        return this.b;
    }

    public void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-923426913);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, 2131962907), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.e, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1714);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wh91(this, i, (byte) 20);
        }
    }
}
