package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yvy implements o1i {
    public final /* synthetic */ byte a;
    public final bcl1 b;
    public final idd1 c;
    public final Object d;
    public final Object e;
    public final Object f;

    public yvy(bcl1 bcl1Var, xh71 xh71Var, yp10 yp10Var) {
        this.a = (byte) 0;
        this.b = bcl1Var;
        this.d = xh71Var;
        this.e = yp10Var;
        this.c = new idd1(oxx.N0);
        this.f = f46.i0(new o571[]{m471.d, l571.d, w471.d, e571.d, f571.d, null, u471.d, r471.d, h571.d, null, n571.d, q471.d, s471.d, c571.d, x471.d, z471.d});
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((wvy) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                d((y2z) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public void c(wvy wvyVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(335883500);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(wvyVar) ? 4 : 2) | i;
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
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarB = u291.b(0.0f, 40.0f, 1, qim0Var);
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this);
            int i3 = i2 & 14;
            boolean z = zI | (i3 == 4);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new xvy(this, o0iVar, wvyVar, (byte) 0);
                x340Var.s0(objT);
            }
            qim0 qim0VarK = eqn1.k(qim0VarB, (Function0) objT);
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new nty(wvyVar, (byte) 4);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(qim0VarK, true, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w0h1.a(fsx.c, isl.a, u291.r(nim0.a, 24.0f), u7h.f, 0L, false, x340Var, fsx.d | 3504, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, wvyVar, o0iVar, qim0Var, (byte) 15);
        }
    }

    public void d(y2z y2zVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(370897012);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(y2zVar) ? 4 : 2) | i;
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
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            zbm zbmVar = new zbm(6, y2zVar.b);
            String str = y2zVar.e;
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xvy(this, o0iVar, y2zVar, (byte) 1);
                x340Var.s0(objT);
            }
            mp10.d(zbmVar, str, (Function0) objT, qim0Var, x340Var, (i2 << 3) & 7168);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, y2zVar, o0iVar, qim0Var, (byte) 20);
        }
    }

    public yvy(lik1 lik1Var, a6z a6zVar, bcl1 bcl1Var, i4q i4qVar) {
        this.a = (byte) 1;
        this.d = lik1Var;
        this.e = a6zVar;
        this.b = bcl1Var;
        this.f = i4qVar;
        this.c = new idd1(new pdy(this, (byte) 9));
    }
}
