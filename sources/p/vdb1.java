package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vdb1 implements ik90 {
    public final uq8 a;
    public final vrq b;
    public final boolean c;
    public final ay8 d;
    public final boolean e;
    public final boolean f = true;
    public final yd91 g;
    public final n381 h;

    public vdb1(uq8 uq8Var, d0r d0rVar, String str, kmj1 kmj1Var, vbs vbsVar, vrq vrqVar, jq4 jq4Var, eu4 eu4Var) {
        this.a = uq8Var;
        this.b = vrqVar;
        this.c = vbsVar.g;
        this.d = d3p1.F(d0rVar, kmj1Var.a(str), rih1.a);
        this.e = eu4Var.k();
        this.g = jq4Var.t() ? new yd91(3, new udb1(this, (byte) 0)) : new yd91(3, new udb1(this, (byte) 1));
        this.h = p381.a;
    }

    @Override // p.pk90
    public final boolean a() {
        return this.f;
    }

    @Override // p.pk90
    public final m381 c() {
        return this.h;
    }

    @Override // p.pk90
    public final yd91 d() {
        return this.g;
    }

    public final void e(tdb1 tdb1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2020100360);
        int i2 = (x340Var.g(tdb1Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            this.a.D(tdb1Var.a, tdb1Var.b, tdb1Var.c, tdb1Var.d, (vu30) null, x340Var, 24576);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(this, tdb1Var, i, (byte) 0);
        }
    }
}
