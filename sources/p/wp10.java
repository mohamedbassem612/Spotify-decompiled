package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wp10 implements o1i {
    public final /* synthetic */ byte a;
    public final cce b;
    public final q9l1 c;

    public /* synthetic */ wp10(cce cceVar, q9l1 q9l1Var, byte b) {
        this.a = b;
        this.b = cceVar;
        this.c = q9l1Var;
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((vp10) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                d((w3t0) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public void c(vp10 vp10Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        tob1 tob1Var;
        Object zn0Var;
        tob1 tob1Var2;
        tob1 tob1Var3;
        tob1 tob1Var4;
        wp10 wp10Var = this;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-813818842);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(vp10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(o0iVar) : b0kVar3.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(wp10Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            tob1 tob1Var5 = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            tob1 tob1Var6 = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            tob1 tob1Var7 = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q((Object) null);
                b0kVar3.s0(objT4);
            }
            tob1 tob1Var8 = (ven0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q((Object) null);
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var = (ven0) objT5;
            boolean zI = b0kVar3.i(wp10Var) | ((i3 & 14) == 4);
            Object objT6 = b0kVar3.T();
            if (zI || objT6 == m4cVar) {
                tob1Var = tob1Var5;
                tob1Var2 = tob1Var6;
                tob1Var3 = tob1Var7;
                tob1Var4 = tob1Var8;
                zn0Var = new zn0((Object) wp10Var, (Object) vp10Var, (Object) tob1Var, (Object) tob1Var2, (Object) tob1Var3, (Object) tob1Var4, (Object) ven0Var, (lnm) null, (byte) 11);
                b0kVar3.s0(zn0Var);
            } else {
                tob1Var = tob1Var5;
                zn0Var = objT6;
                tob1Var2 = tob1Var6;
                tob1Var3 = tob1Var7;
                tob1Var4 = tob1Var8;
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) zn0Var);
            b0kVar2 = b0kVar3;
            yxo1.e(wp10Var.b, o0iVar, wp10Var.c, (z0i) tob1Var.getValue(), ((Boolean) tob1Var2.getValue()).booleanValue(), ((Boolean) tob1Var3.getValue()).booleanValue(), vp10Var.b, (u7h) tob1Var4.getValue(), (ew50) ven0Var.getValue(), qim0Var, b0kVar2, (i3 & 112) | 64 | ((i3 << 21) & 1879048192));
        } else {
            wp10Var = wp10Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, wp10Var, vp10Var, o0iVar, qim0Var, (byte) 27);
        }
    }

    public void d(w3t0 w3t0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        tob1 tob1Var;
        tob1 tob1Var2;
        wp10 wp10Var = this;
        w3t0 w3t0Var2 = w3t0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-41392382);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(w3t0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(wp10Var) ? 2048 : 1024;
        }
        int i3 = i2;
        boolean z = false;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            tob1 tob1Var3 = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            tob1 tob1Var4 = (ven0) objT2;
            boolean zI = ((i3 & 14) == 4) | x340Var.i(wp10Var);
            int i4 = i3 & 112;
            if (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar))) {
                z = true;
            }
            boolean z2 = zI | z;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                tob1Var = tob1Var3;
                tob1Var2 = tob1Var4;
                ur1 ur1Var = new ur1(wp10Var, o0iVar, w3t0Var2, (ven0) tob1Var, (ven0) tob1Var2, (lnm) null);
                x340Var.s0(ur1Var);
                objT3 = ur1Var;
            } else {
                tob1Var = tob1Var3;
                tob1Var2 = tob1Var4;
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT3);
            ywo1.d(wp10Var.b, o0iVar, wp10Var.c, w3t0Var2.a.size(), (z0i) tob1Var.getValue(), (Integer) tob1Var2.getValue(), qim0Var, x340Var, 64 | i4 | ((i3 << 12) & 3670016));
        } else {
            wp10Var = wp10Var;
            w3t0Var2 = w3t0Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(i, wp10Var, w3t0Var2, o0iVar, qim0Var, (byte) 1);
        }
    }
}
