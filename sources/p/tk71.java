package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tk71 implements rk71 {
    public final flw0 a;
    public final bk71 b;
    public final hyl0 c;
    public final y441 d;
    public final cl71 e;
    public final cfd f;
    public final ia00 g = n3o1.q(this).a(new sk71(this, (byte) 0), new sk71(this, (byte) 1));
    public final psw h;

    public tk71(flw0 flw0Var, bk71 bk71Var, hyl0 hyl0Var, y441 y441Var, cl71 cl71Var, cfd cfdVar) {
        this.a = flw0Var;
        this.b = bk71Var;
        this.c = hyl0Var;
        this.d = y441Var;
        this.e = cl71Var;
        this.f = cfdVar;
        j2i j2iVar = new j2i(1126174196, new c771(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final void e(dl71 dl71Var, c380 c380Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        dl71 dl71Var2;
        c380 c380Var2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-953014443);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dl71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                dl71Var2 = dl71Var;
                c380Var2 = c380Var;
                iu30Var2 = iu30Var;
                n641 n641Var = new n641(dl71Var2, c380Var2, iu30Var2, null, (byte) 29);
                x340Var.s0(n641Var);
                objT = n641Var;
            } else {
                dl71Var2 = dl71Var;
                c380Var2 = c380Var;
                iu30Var2 = iu30Var;
            }
            qxd0.t(dl71Var2, x340Var, (vu30) objT);
        } else {
            dl71Var2 = dl71Var;
            c380Var2 = c380Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, (Object) this, (Object) dl71Var2, (Object) c380Var2, (Object) iu30Var2, (byte) 9);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
