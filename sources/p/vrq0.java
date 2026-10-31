package p;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class vrq0 {
    public static final long a = jhc1.c(132.0f, 90.0f);
    public static final long b = jhc1.c(106.0f, 72.0f);
    public static final float c = 8.0f;
    public static final float d = 8.0f;

    public static final void a(boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1512994985);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g((Object) null) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ncf0 ncf0VarG = h5p1.G(new ocf0(2131886087), (String) null, (xu30) null, x340Var, 0, 62);
            x340Var.i0(2048495291);
            float fFloatValue = ((Number) zpn1.n(ncf0VarG.c(), z2, false, (bcf0) null, z ? -1.0f : 1.0f, Integer.MAX_VALUE, x340Var, 924).getValue()).floatValue();
            x340Var.r(false);
            jw31 jw31VarA = ew31.a(h36.a, een.O0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            float f = c;
            float f2 = d;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, f, f2, 3);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            ikx ikxVar = ikx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            qim0 qim0VarK = d9y0.k(nim0Var, z ? 1.0f : 0.0f);
            int i3 = ikx.d | 48;
            isl islVar = isl.a;
            b2 = 1;
            w0h1.a(ikxVar, islVar, qim0VarK, j, 0L, false, x340Var, i3, 48);
            x340Var.r(true);
            fcf0 fcf0VarC = ncf0VarG.c();
            boolean zD = x340Var.d(fFloatValue);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                objT = new xnn((byte) 3, fFloatValue);
                x340Var.s0(objT);
            }
            d620 d620Var = u291.a;
            long j2 = b;
            mp10.e(fcf0VarC, (Function0) objT, u291.s(nim0Var, s3v.b(j2), s3v.a(j2)), false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, mif1.Q0, false, false, (Map) null, (jj7) null, false, x340Var, 0, 0, 64504);
            qim0 qim0VarB2 = uyn1.B(nim0Var, f, 0.0f, 0.0f, f2, 6);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            w0h1.a(jkx.c, islVar, d9y0.k(nim0Var, z ? 0.0f : 1.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, jkx.d | 48, 48);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xid0(z, z2, i, b2);
        }
    }

    public static final void b(boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2131636109);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g((Object) null) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ncf0 ncf0VarG = h5p1.G(new ocf0(2131886088), (String) null, (xu30) null, x340Var, 0, 62);
            x340Var.i0(-1814801870);
            float fFloatValue = ((Number) zpn1.n(ncf0VarG.c(), z, false, (bcf0) null, 0.0f, Integer.MAX_VALUE, x340Var, 956).getValue()).floatValue();
            x340Var.r(false);
            fcf0 fcf0VarC = ncf0VarG.c();
            boolean zD = x340Var.d(fFloatValue);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                x340Var = x340Var;
                x340Var = x340Var;
                objT = new xnn((byte) 4, fFloatValue);
                x340Var.s0(objT);
            }
            x340Var = x340Var;
            d620 d620Var = u291.a;
            long j = a;
            mp10.e(fcf0VarC, (Function0) objT, u291.s(nim0.a, s3v.b(j), s3v.a(j)), false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, mif1.Q0, false, false, (Map) null, (jj7) null, false, x340Var, 0, 0, 64504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zdx((byte) 1, i, z);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(zuq0 zuq0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        gra graVar = een.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-482350257);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(zuq0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 3456;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zEquals = zuq0Var.equals(yuq0.a);
            n4k n4kVar = hmb0.t1;
            qim0 qim0Var3 = nim0.a;
            if (zEquals) {
                x340Var.i0(317878159);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                b(z, x340Var, ((i2 >> 3) & 14) | 48);
                x340Var.r(true);
                x340Var.r(false);
            } else if (zuq0Var.equals(wuq0.a)) {
                x340Var.i0(317883834);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                a(false, z, x340Var, (i2 & 112) | 390);
                x340Var.r(true);
                x340Var.r(false);
            } else if (zuq0Var.equals(vuq0.a)) {
                x340Var.i0(317890745);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                a(true, z, x340Var, (i2 & 112) | 390);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                if (!zuq0Var.equals(xuq0.a)) {
                    throw p3d1.k(x340Var, 317876745, false);
                }
                x340Var.i0(1264878641);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(zuq0Var, z, qim0Var2, i, (byte) 11);
        }
    }
}
