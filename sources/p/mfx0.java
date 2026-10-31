package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mfx0 implements o1i {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public mfx0(zfx zfxVar) {
        this.b = zfxVar.a((l0i) null);
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((kfx0) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                d((mad1) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public void c(kfx0 kfx0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        n0i n0iVar = o0iVar.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1491480474);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1169) != 1168)) {
            n2u0 n2u0Var = n0iVar.b;
            bpb1 bpb1Var = n2u0Var != null ? n2u0Var.c : null;
            if (bpb1Var == null) {
                hhg1.n("Required value was null.");
                return;
            }
            l2u0 l2u0Var = (l2u0) rwq.h(bpb1Var, x340Var, 0).getValue();
            kxt0 kxt0Var = n0iVar.a;
            boolean z = kxt0Var != null && kxt0Var.d;
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new mwv0(this, (byte) 25);
                x340Var.s0(objT);
            }
            mue1.n(l2u0Var, z, (iu30) objT, uyn1.z(16.0f, 0.0f, 2, qim0Var), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(i, this, kfx0Var, o0iVar, qim0Var, (byte) 10);
        }
    }

    public void d(mad1 mad1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1459301502);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mad1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = v8r.q(new nad1(mad1Var.a, mad1Var.b, mad1Var.c, true, mad1Var.d, false));
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new qwc1(this, (byte) 3);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI2 = x340Var.i(this) | x340Var.g(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new ccb1(this, ven0Var, (byte) 22);
                x340Var.s0(objT3);
            }
            dm5.a(iu30Var, qim0Var2, (iu30) objT3, x340Var, (i3 >> 3) & 112, 0);
            boolean zG = x340Var.g(ven0Var);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new ry71(ven0Var, (byte) 14);
                x340Var.s0(objT4);
            }
            oto1.c(mad1Var, o0iVar, (iu30) objT4, x340Var, i4 | 64 | (i3 & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, this, mad1Var, o0iVar, qim0Var, (byte) 6);
        }
    }

    public mfx0(m0t m0tVar) {
        this.b = m0tVar;
    }
}
