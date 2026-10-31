package p;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class h4g {
    public static final ceo a = new ceo(0.3f, 1.3f, 0.5f, 1.0f);
    public static final ceo b = new ceo(0.3f, 1.8f, 0.5f, 1.0f);
    public static final ceo c = new ceo(0.0f, 0.0f, 0.2f, 1.0f);
    public static final float d = 8.0f;
    public static final float e = 32.0f;

    /* JADX WARN: Code duplicated, block: B:295:0x05b3  */
    public static final void a(boolean z, sju sjuVar, mt71 mt71Var, String str, boolean z2, Function0 function0, qim0 qim0Var, qim0 qim0Var2, xz7 xz7Var, f08 f08Var, g08 g08Var, pk1 pk1Var, float f, float f2, boolean z3, boolean z4, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        pk1 pk1Var2;
        g08 g08Var2;
        x340 x340Var;
        boolean z5;
        String str2;
        ven0 ven0Var;
        int i5;
        boolean z6;
        String str3;
        u7h u7hVarC;
        String str4;
        u7h u7hVarC2;
        String str5;
        u7h u7hVarC3;
        String str6;
        u7h u7hVarC4;
        String str7;
        u7h u7hVarC5;
        String str8;
        u7h u7hVarC6;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1081135909);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var2.g(sjuVar) : x340Var2.i(sjuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(mt71Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.h(z2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= x340Var2.i(function0) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= x340Var2.g(qim0Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= x340Var2.g(qim0Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= (i & 134217728) == 0 ? x340Var2.g(xz7Var) : x340Var2.i(xz7Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= (i & 1073741824) == 0 ? x340Var2.g(f08Var) : x340Var2.i(f08Var) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var2.g(g08Var) : x340Var2.i(g08Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? x340Var2.g(pk1Var) : x340Var2.i(pk1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var2.d(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var2.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var2.h(z3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= x340Var2.h(z4) ? 131072 : 65536;
        }
        if (x340Var2.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (74899 & i4) == 74898) ? false : true)) {
            x340Var2.d0();
            if ((i & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            float f3 = z ? 8.0f : e;
            ceo ceoVar = a;
            tob1 tob1VarA = z95.a(f3, z3 ? irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, ceoVar, 2) : irn1.j0(), "chipToCardCornerRadius", x340Var2, 384, 8);
            long j = (xz7Var == null || (str8 = xz7Var.a) == null || (u7hVarC6 = wz7.c(str8)) == null) ? wz7.d : u7hVarC6.a;
            long j2 = (xz7Var == null || (str7 = xz7Var.b) == null || (u7hVarC5 = wz7.c(str7)) == null) ? wz7.e : u7hVarC5.a;
            long j3 = (xz7Var == null || (str6 = xz7Var.c) == null || (u7hVarC4 = wz7.c(str6)) == null) ? wz7.a : u7hVarC4.a;
            long j4 = (f08Var == null || (str5 = f08Var.a) == null || (u7hVarC3 = wz7.c(str5)) == null) ? wz7.b : u7hVarC3.a;
            long j5 = (f08Var == null || (str4 = f08Var.b) == null || (u7hVarC2 = wz7.c(str4)) == null) ? wz7.c : u7hVarC2.a;
            long j6 = (f08Var == null || (str3 = f08Var.c) == null || (u7hVarC = wz7.c(str3)) == null) ? wz7.a : u7hVarC.a;
            if (!z) {
                j = j4;
            }
            tob1 tob1VarA2 = w191.a(j, c(z, z3), "chipToCardFillColor", x340Var2, 384, 8);
            tob1 tob1VarA3 = w191.a(z ? j2 : j5, c(z, z3), "chipToCardBorderColor", x340Var2, 384, 8);
            tob1 tob1VarA4 = z95.a(z ? f2 : f, c(z, z3), "chipToCardPadding", x340Var2, 384, 8);
            tob1 tob1VarB = z95.b(z ? 1.0f : 0.0f, z3 ? irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, c, 2) : irn1.j0(), "chipToCardAddIcon", (iu30) null, x340Var2, 3072, 20);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c97.b(1.0f);
                x340Var2.s0(objT);
            }
            o95 o95Var = (o95) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i7 = i6 & 14;
            boolean z7 = i7 == 4;
            int i8 = i4 & 57344;
            boolean zI = z7 | (i8 == 16384) | x340Var2.i(o95Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new gub(z, z3, o95Var, (lnm) null);
                x340Var2.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT2);
            avw0 avw0Var = cbx.b(x340Var2).c;
            cr31 cr31VarB = er31.b(((p3v) tob1VarA.getValue()).a);
            zov0 zov0Var = cbx.b(x340Var2).g;
            cvx cvxVar = cbx.b(x340Var2).b;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = p3d1.n(0L, x340Var2);
            }
            ven0 ven0Var2 = (ven0) objT3;
            wat watVar = (wat) x340Var2.k(t4k.h);
            zov0 zov0Var2 = cbx.b(x340Var2).g;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            int i9 = i4;
            float f4 = yr80.b(((yr80) ven0Var2.getValue()).a, 0L) ? 40.0f : yoi1.t(new p3v(watVar.M0((int) (((yr80) ven0Var2.getValue()).a & 4294967295L)) - 24.0f), new p3v(0.0f), new p3v(40.0f)).a;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            p3v p3vVar = (p3v) tob1VarA4.getValue();
            float f5 = p3vVar.a;
            qim0 qim0VarZ = uyn1.z(zjy.p(0.0f, p3vVar).a, 0.0f, 2, qim0VarF);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z8 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z8) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            gra graVar = een.d;
            float f6 = f4;
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var2);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            fra fraVar = een.Z;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = u291.y(nim0Var, fraVar, true);
            int i10 = i9 & 458752;
            boolean zI2 = (i10 == 131072) | x340Var2.i(o95Var);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new cb8(z4, o95Var, (byte) 3);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarE3 = d1u.E(1.0f, ((u7h) tob1VarA3.getValue()).a, dug.f(i541.C(qim0VarY, (iu30) objT4), ((u7h) tob1VarA2.getValue()).a, cr31VarB), cr31VarB);
            Object objT5 = x340Var2.T();
            if (objT5 == m4cVar) {
                objT5 = new cy7(ven0Var2, (byte) 29);
                x340Var2.s0(objT5);
            }
            qim0 qim0VarU = lrn1.u(qim0VarE3, (iu30) objT5);
            gra graVar2 = een.g;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean z9 = i8 == 16384;
            Object objT6 = x340Var2.T();
            if (z9 || objT6 == m4cVar) {
                objT6 = new gy((byte) 13, z3);
                x340Var2.s0(objT6);
            }
            j2i j2iVarR = apo.r(-1873042132, new e4g(sjuVar, str, z2, function0, xz7Var, g08Var, f6, mt71Var, j6), x340Var2);
            int i11 = i7 | 1600512;
            g08Var2 = g08Var;
            hm5.a(boolValueOf2, qim0VarU, (iu30) objT6, graVar2, "chipToCard", (iu30) null, j2iVarR, x340Var2, i11, 32);
            x340Var = x340Var2;
            x340Var.r(true);
            if (((Number) tob1VarB.getValue()).floatValue() > 0.01f) {
                x340Var.i0(1671105740);
                Object objT7 = x340Var.T();
                if (objT7 == m4cVar) {
                    objT7 = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT7;
                tob1 tob1VarB2 = z95.b(((Boolean) k1u.m(idn0Var, x340Var, 6).getValue()).booleanValue() ? 0.8f : 1.0f, z3 ? irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, ceoVar, 2) : irn1.j0(), "addPress", (iu30) null, x340Var, 3072, 20);
                boolean zD = wkt0.d();
                pk1Var2 = pk1Var;
                boolean z10 = pk1Var2.a == qk1.b;
                int i12 = wz7.f;
                if (z10) {
                    if (g08Var2 != null) {
                        str2 = g08Var2.b;
                    } else {
                        str2 = null;
                    }
                } else if (g08Var2 != null) {
                    str2 = g08Var2.a;
                } else {
                    str2 = null;
                }
                if (str2 == null || ihc1.y0(str2)) {
                    str2 = null;
                }
                float fM0 = watVar.M0((int) (((yr80) ven0Var2.getValue()).a & 4294967295L));
                gra graVar3 = een.e;
                h2c h2cVar = h2c.a;
                qim0 qim0VarA = h2cVar.a(nim0Var, graVar3);
                boolean zD2 = x340Var.d(48.0f);
                Object objT8 = x340Var.T();
                if (zD2 || objT8 == m4cVar) {
                    ven0Var = ven0Var2;
                    i5 = 0;
                    objT8 = new f4g(ven0Var, (byte) 0);
                    x340Var.s0(objT8);
                } else {
                    ven0Var = ven0Var2;
                    i5 = 0;
                }
                qim0 qim0VarB = wz7.b(u291.n(u291.A(eqr0.B(qim0VarA, (iu30) objT8), graVar3, true), 48.0f, fM0), null, str2, 26);
                pm31 pm31Var = new pm31(i5);
                boolean z11 = (i6 & 458752) == 131072;
                Object objT9 = x340Var.T();
                if (z11 || objT9 == m4cVar) {
                    objT9 = new ukf(function0, (byte) 14);
                    x340Var.s0(objT9);
                }
                op71.g(x340Var, bin.v(qim0VarB, idn0Var, null, false, null, pm31Var, (Function0) objT9, 12));
                qim0 qim0VarA2 = h2cVar.a(nim0Var, graVar3);
                boolean zD3 = x340Var.d(12.0f) | x340Var.d(24.0f);
                Object objT10 = x340Var.T();
                if (zD3 || objT10 == m4cVar) {
                    objT10 = new f4g(ven0Var, (byte) 1);
                    x340Var.s0(objT10);
                }
                qim0 qim0VarR = u291.r(eqr0.B(qim0VarA2, (iu30) objT10), 24.0f);
                boolean zG = (i10 == 131072) | x340Var.g(tob1VarB) | x340Var.i(o95Var) | x340Var.g(tob1VarB2);
                Object objT11 = x340Var.T();
                if (zG || objT11 == m4cVar) {
                    gh1 gh1Var = new gh1(z4, o95Var, tob1VarB, tob1VarB2, (byte) 6);
                    x340Var.s0(gh1Var);
                    objT11 = gh1Var;
                }
                qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT11);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarC);
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
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                if (zD) {
                    x340Var.i0(1215283940);
                    fcf0 fcf0VarC = h5p1.G(new ocf0(2131886229), null, null, x340Var, 0, 62).c();
                    fcf0 fcf0VarC2 = h5p1.G(new ocf0(2131886228), null, null, x340Var, 0, 62).c();
                    kbf0 kbf0VarS = m5n1.S(x340Var);
                    ddf0 ddf0VarS = e130.s(new edf0[]{e130.t(ndf0.F, new PorterDuffColorFilter(z4p1.G(j3), PorterDuff.Mode.SRC_ATOP), new String[]{"**"}, x340Var, 6)}, x340Var);
                    Object objT12 = x340Var.T();
                    if (objT12 == m4cVar) {
                        objT12 = v8r.q(Boolean.TRUE);
                        x340Var.s0(objT12);
                    }
                    ven0 ven0Var3 = (ven0) objT12;
                    qk1 qk1Var = pk1Var2.a;
                    fcf0 fcf0Var = qk1Var == qk1.a ? fcf0VarC : fcf0VarC2;
                    boolean zG2 = (i8 == 16384) | x340Var.g(kbf0VarS) | x340Var.i(fcf0Var);
                    Object objT13 = x340Var.T();
                    if (zG2 || objT13 == m4cVar) {
                        objT13 = new kv1(z3, (Object) kbf0VarS, (Object) fcf0Var, ven0Var3, (lnm) null, (byte) 6);
                        x340Var.s0(objT13);
                    }
                    qxd0.t(qk1Var, x340Var, (vu30) objT13);
                    boolean zG3 = x340Var.g(kbf0VarS);
                    Object objT14 = x340Var.T();
                    if (zG3 || objT14 == m4cVar) {
                        objT14 = new uk1(kbf0VarS, (byte) 2);
                        x340Var.s0(objT14);
                    }
                    mp10.e(fcf0Var, (Function0) objT14, (qim0) null, false, false, false, (xc21) null, false, ddf0VarS, (tl3) null, (j6m) null, false, false, (Map) null, (jj7) null, false, x340Var, 134217728, 0, 65276);
                    x340Var = x340Var;
                    z6 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1216752069);
                    w0h1.a(z10 ? klx.c : irx.c, isl.a, (qim0) null, j3, 0L, false, x340Var, 56, 52);
                    x340Var = x340Var;
                    z6 = false;
                    x340Var.r(false);
                }
                z5 = true;
                x340Var.r(true);
                x340Var.r(z6);
            } else {
                pk1Var2 = pk1Var;
                z5 = true;
                x340Var.i0(1674550925);
                x340Var.r(false);
            }
            x340Var.r(z5);
        } else {
            pk1Var2 = pk1Var;
            g08Var2 = g08Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g4g(z, sjuVar, mt71Var, str, z2, function0, qim0Var, qim0Var2, xz7Var, f08Var, g08Var2, pk1Var2, f, f2, z3, z4, i, i2);
        }
    }

    public static final void b(sju sjuVar, mt71 mt71Var, long j, qim0 qim0Var, b0k b0kVar, int i) {
        zkt0 zkt0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(481753576);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(sjuVar) ? 4 : 2) | (x340Var.i(mt71Var) ? 32 : 16) | (x340Var.f(j) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarB = u291.b(0.0f, 48.0f, 1, qim0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarB, 12.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            cvx cvxVar3 = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarR = u291.r(qim0VarB2, 16.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarR);
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
            if (mt71Var instanceof kt71) {
                zkt0Var = zkt0.a;
            } else if (mt71Var instanceof jt71) {
                zkt0Var = zkt0.b;
            } else {
                if (!mt71Var.equals(lt71.a)) {
                    eg.o();
                    return;
                }
                zkt0Var = zkt0.c;
            }
            int i3 = (i2 << 3) & 7168;
            wkt0.a(zkt0Var, (qim0) null, (ksl) null, j, wkt0.d(), x340Var, i3, 6);
            x340Var.r(true);
            uwo1.e(sjuVar.a, null, cbx.d(x340Var).k, j, null, null, 0, false, new cjc0(1), 0, null, x340Var, i3, 0, 1778);
            uwo1.e("•", uyn1.z(4.0f, 0.0f, 2, nim0Var), cbx.d(x340Var).j, j, null, null, 0, false, new cjc0(1), 0, null, x340Var, i3 | 54, 0, 1776);
            uwo1.e(sjuVar.b, null, cbx.d(x340Var).j, j, null, null, 0, false, new cjc0(1), 0, null, x340Var, i3, 0, 1778);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6((Object) sjuVar, (Object) mt71Var, j, (Object) qim0Var, i, (byte) 3);
        }
    }

    public static final zfv c(boolean z, boolean z2) {
        if (z2) {
            return z ? irn1.j0() : irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, a, 2);
        }
        return irn1.j0();
    }
}
