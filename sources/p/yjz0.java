package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yjz0 implements xpw {
    public final los a;
    public final hmq b;
    public final wsl0 c;
    public final rey0 d = new rey0(mgn0.d1);
    public final ia00 e = n3o1.q(this).a(new ixt0(this, (byte) 28), g2z0.V0);
    public final psw f;

    public yjz0(los losVar, hmq hmqVar, wsl0 wsl0Var) {
        this.a = losVar;
        this.b = hmqVar;
        this.c = wsl0Var;
        j2i j2iVar = new j2i(-1956606736, new zyy0(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(32546460);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new j3y0(this, iu30Var, (byte) 10);
                x340Var.s0(objT);
            }
            qxd0.i(rih1.a, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, iu30Var, i, (byte) 0);
        }
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
