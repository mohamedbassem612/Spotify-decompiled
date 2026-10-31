package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hvb1 implements xpw {
    public final t7y a;
    public final ia00 b = n3o1.q(this).a(vva1.T0, vva1.U0);
    public final rey0 c = k1o1.p();
    public final psw d;

    public hvb1(t7y t7yVar) {
        this.a = t7yVar;
        j2i j2iVar = new j2i(745745086, new vsb1(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(fvb1 fvb1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(918507805);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(fvb1Var) : x340Var.i(fvb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                t7y t7yVar = this.a;
                objT = new ya30((ur00) t7yVar.b, (il00) t7yVar.c);
                x340Var.s0(objT);
            }
            rwo1.d(fvb1Var.g, u291.f(nim0.a, 1.0f), apo.r(-550781462, new nu31(this, fvb1Var, (ya30) objT, (byte) 23), x340Var), x340Var, 432);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(this, fvb1Var, i, (byte) 4);
        }
    }

    public final void f(fvb1 fvb1Var, ya30 ya30Var, xm10 xm10Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1813657962);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(fvb1Var) : b0kVar3.i(fvb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(ya30Var) : b0kVar3.i(ya30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(xm10Var) : b0kVar3.i(xm10Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            w2g0.c(uyn1.w(u291.d(nim0.a, 1.0f), xm10Var.b()), (tl3) null, apo.r(1566142676, new kj21(xm10Var, fvb1Var, this, ya30Var, (byte) 17), b0kVar3), b0kVar2, 3072, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gvb1(this, fvb1Var, ya30Var, xm10Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(mhm0 mhm0Var, c380 c380Var, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1988767759);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mhm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            e9k.k(mhm0Var, h2cVar.b(nim0Var), x340Var, (i2 & 14) | 48);
            if (z) {
                x340Var.i0(-645348610);
                rwo1.c(c380Var, h2cVar.a(u291.h(u291.f(nim0Var, 1.0f), 35.0f), een.e), x340Var, (i2 >> 3) & 14);
                x340Var.r(false);
            } else {
                x340Var.i0(-645205173);
                x340Var.r(false);
            }
            if (z2) {
                x340Var.i0(-645014957);
                qim0 qim0VarA = h2cVar.a(u291.h(u291.f(nim0Var, 1.0f), 35.0f), een.X);
                z3 = true;
                rwo1.c(mqo1.s(new u7h[]{c380Var.get(1), c380Var.get(0)}), qim0VarA, x340Var, 0);
                x340Var.r(false);
            } else {
                z3 = true;
                x340Var.i0(-644830197);
                x340Var.r(false);
            }
            x340Var.r(z3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(this, mhm0Var, c380Var, z, z2, qim0Var, i);
        }
    }

    public final mqw getBehavior() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(fvb1 fvb1Var, ya30 ya30Var, xm10 xm10Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(521713262);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(fvb1Var) : x340Var.i(fvb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(ya30Var) : x340Var.i(ya30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(xm10Var) : x340Var.i(xm10Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            vzq0 vzq0VarB = xm10Var.b();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarW = u291.w(u291.h(uyn1.w(nim0Var, vzq0VarB), xm10Var.c()), 0.0f, dsa0.m(x340Var, 2131166901));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
            mhm0 mhm0Var = fvb1Var.d;
            List list = fvb1Var.e;
            g(mhm0Var, mqo1.s(new u7h[]{list.get(0), list.get(2)}), fvb1Var.f, false, u291.c(u291.f(nim0Var, 1.0f), 0.6f), x340Var, ((i3 << 6) & 458752) | 27648);
            otw.c(ya30Var, new wa30(fvb1Var.a, fvb1Var.b, fvb1Var.c, mqo1.s(new u7h[]{list.get(2), list.get(1)}), true), u291.d(nim0Var, 1.0f), (ipb1) null, x340Var, ((i3 >> 3) & 14) | 384, 8);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gvb1(this, fvb1Var, ya30Var, xm10Var, i, (byte) 1);
        }
    }
}
