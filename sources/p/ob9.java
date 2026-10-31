package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ob9 implements xpw {
    public final af10 a;
    public final rey0 b = k1o1.p();
    public final eih1 c = new eih1();
    public final psw d;

    public ob9(af10 af10Var) {
        this.a = af10Var;
        j2i j2iVar = new j2i(1297473811, new i43(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(td10 td10Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-835684871);
        int i2 = (x340Var.i(td10Var) ? 4 : 2) | i | (x340Var.g(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(td10Var) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new kd8(this, td10Var, (byte) 4);
                x340Var.s0(objT);
            }
            dm5.a((iu30) objT, qim0Var, (iu30) null, x340Var, 48, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(this, td10Var, qim0Var, i, (byte) 12);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
