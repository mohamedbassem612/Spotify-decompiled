package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gft0 implements xpw {
    public final js20 a;
    public final ia00 b = n3o1.q(this).a(e9t0.h, e9t0.X);
    public final psw c;

    public gft0(q8u0 q8u0Var, xu30 xu30Var) {
        this.a = x3p1.n(new fgs0(q8u0Var, (byte) 8), iet0.P0, cps0.c1, (o8n) null, new aft0(q8u0Var, xu30Var, (byte) 1), 8);
        j2i j2iVar = new j2i(1327456056, new t9r0(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    public final void e(vet0 vet0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        met0 met0Var;
        qet0 qet0Var = vet0Var.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1605368657);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(vet0Var) : x340Var.i(vet0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && x340Var.g(vet0Var));
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                if (vet0Var.c) {
                    met0Var = met0.a;
                } else if (vet0Var.b) {
                    met0Var = met0.b;
                } else {
                    met0Var = vet0Var.d ? met0.d : met0.c;
                }
                objT = met0Var;
                x340Var.s0(objT);
            }
            met0 met0Var2 = (met0) objT;
            qim0 qim0VarX = uyn1.x(anm1.N("music_play_button", pqo.h(nim0.a, !qet0Var.b)), qet0Var.d.a());
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = iet0.N0;
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean zI = (i3 == 4 || ((i2 & 8) != 0 && x340Var.i(vet0Var))) | x340Var.i(this) | ((i2 & 112) == 32) | x340Var.e(met0Var2.ordinal());
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new mvn0(this, vet0Var, iu30Var, met0Var2);
                x340Var.s0(objT3);
            }
            dm5.a(iu30Var2, qim0VarX, (iu30) objT3, x340Var, 6, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(this, vet0Var, iu30Var, i, (byte) 22);
        }
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
