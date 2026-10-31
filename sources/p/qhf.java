package p;

import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class qhf {
    public static final long a = z4p1.g(4284375394L);
    public static final float b = 220.0f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:136:0x0302  */
    /* JADX WARN: Code duplicated, block: B:138:0x030f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0319  */
    /* JADX WARN: Code duplicated, block: B:142:0x034c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x034e  */
    /* JADX WARN: Code duplicated, block: B:144:0x036c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0373  */
    /* JADX WARN: Code duplicated, block: B:148:0x0382  */
    public static final void a(jto1 jto1Var, float f, guo1 guo1Var, gm31 gm31Var, int i, boolean z, q8n q8nVar, q8n q8nVar2, boolean z2, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        float f2;
        float f3;
        float f4;
        boolean z3;
        qim0 qim0VarR;
        Object obj;
        qim0 qim0Var3;
        boolean z4;
        ksl kslVar;
        boolean z5;
        String str;
        long jE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1884022422);
        int i3 = i2 | (x340Var.g(jto1Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.i(guo1Var) ? 256 : 128) | (x340Var.i(gm31Var) ? 2048 : 1024) | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 16384 : 8192) | (x340Var.h(z) ? 131072 : 65536) | (x340Var.i(q8nVar) ? 1048576 : 524288) | (x340Var.i(q8nVar2) ? 8388608 : 4194304) | (x340Var.h(z2) ? 67108864 : 33554432) | 805306368;
        if (x340Var.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cvx cvxVar = cbx.b(x340Var).b;
            cr31 cr31VarB = er31.b(16.0f);
            long jC = cbx.a(x340Var).a.a.c();
            mz61 mz61Var = mz61.b;
            if (i != 2 && (i == 0 || !z)) {
                f2 = 1.0f;
            } else if (guo1Var instanceof lz61) {
                f2 = 0.7f;
            } else if (guo1Var instanceof nz61) {
                f2 = 0.5f;
            } else {
                if (!guo1Var.equals(mz61Var)) {
                    eg.o();
                    return;
                }
                f2 = 1.0f;
            }
            boolean z6 = guo1Var instanceof lz61;
            float f5 = 192.0f;
            if (z6) {
                f4 = 192.0f;
                f3 = 1.0f;
            } else {
                f3 = 1.0f;
                if (((jto1Var instanceof jhf) || (jto1Var instanceof khf) || (jto1Var instanceof nhf)) && f >= 1.0f) {
                    f5 = 220.0f;
                }
                f4 = f5;
            }
            boolean z7 = jto1Var instanceof jhf;
            Float fValueOf = (z7 || (jto1Var instanceof lhf)) ? null : Float.valueOf(f);
            qim0 qim0Var4 = nim0.a;
            Float f6 = fValueOf;
            qim0 qim0VarJ = u291.j(0.0f, 330.0f, 1, u291.v(d9y0.k(qim0Var4, f2), f4));
            if (f6 != null) {
                z3 = false;
                qim0VarR = d7e.r(f6.floatValue(), qim0Var4, false);
            } else {
                z3 = false;
                qim0VarR = qim0Var4;
            }
            qim0 qim0VarThen = qim0VarJ.then(qim0VarR);
            qqb qqbVarD = k1u.d(f3, jC);
            qim0 qim0VarQ = i1p1.q(d1u.F(qim0VarThen, qqbVarD.a, qqbVarD.b, cr31VarB), cr31VarB);
            gfh0 gfh0VarC = t1c.c(een.h, z3);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
            ksl kslVar2 = isl.a;
            if (z7) {
                x340Var.i0(340325476);
                jhf jhfVar = (jhf) jto1Var;
                String str2 = jhfVar.b;
                long jE2 = u7h.c;
                try {
                    jE2 = z4p1.e(Color.parseColor(str2));
                } catch (Exception unused) {
                }
                String str3 = jhfVar.c;
                if (str3 != null) {
                    try {
                        jE = z4p1.e(Color.parseColor(str3));
                    } catch (Exception unused2) {
                        jE = jE2;
                    }
                } else {
                    jE = jE2;
                }
                long j = jE;
                obj = mz61Var;
                qim0Var3 = qim0Var4;
                z4 = z6;
                b(jE2, j, x340Var, 6);
                z5 = false;
                x340Var.r(false);
            } else {
                obj = mz61Var;
                qim0Var3 = qim0Var4;
                z4 = z6;
                if (jto1Var instanceof khf) {
                    x340Var.i0(980820349);
                    kslVar = kslVar2;
                    eso1.e(Uri.parse(((khf) jto1Var).b), kslVar, u291.d(qim0Var3, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 1797552, 0, 3968);
                    x340Var = x340Var;
                    z5 = false;
                    x340Var.r(false);
                } else if (jto1Var instanceof nhf) {
                    x340Var.i0(341037856);
                    int i4 = i3 >> 15;
                    no71.a(new ta71(Uri.parse(((nhf) jto1Var).b), "chat-preview-share-card-provider".concat(z2 ? "-composer" : "-message"), h3i0.a, null, 0L, 0L, idj1.a, true, true), q8nVar, q8nVar2, u291.d(qim0Var3, 1.0f), null, null, x340Var, (i4 & 112) | 3072 | (i4 & 896), 240);
                    x340Var = x340Var;
                    z5 = false;
                    x340Var.r(false);
                } else if (jto1Var instanceof mhf) {
                    x340Var.i0(341830309);
                    em31 em31Var = (em31) x340Var.k(fm31.a);
                    if (em31Var != null) {
                        x340Var.i0(341953720);
                        boolean zI = x340Var.i(em31Var) | ((i3 & 14) == 4);
                        Object objT = x340Var.T();
                        if (zI || objT == fkj0.X) {
                            objT = new i24(em31Var, jto1Var, (lnm) null, (byte) 16);
                            x340Var.s0(objT);
                        }
                        kslVar = kslVar2;
                        xto.d((iu30) objT, kslVar, (iu30) null, (Function0) null, (Function0) null, gm31Var, x340Var, ((i3 << 9) & 3670016) | 432, 56);
                        x340Var = x340Var;
                        z5 = false;
                        x340Var.r(false);
                    } else {
                        kslVar = kslVar2;
                        z5 = false;
                        x340Var.i0(342173138);
                        x340Var.r(false);
                    }
                    x340Var.r(z5);
                } else {
                    kslVar = kslVar2;
                    z5 = false;
                    if (!(jto1Var instanceof lhf)) {
                        throw p3d1.k(x340Var, 980808893, false);
                    }
                    x340Var.i0(342241803);
                    e(null, x340Var, 0);
                    x340Var.r(false);
                }
                if (guo1Var instanceof nz61) {
                    x340Var.i0(342397702);
                    str = ((nz61) guo1Var).b;
                    if (str == null) {
                        x340Var.i0(342397701);
                        x340Var.r(z5);
                    } else {
                        x340Var.i0(342397702);
                        x340 x340Var2 = x340Var;
                        eso1.e(Uri.parse(str), kslVar, uyn1.x(qim0Var3, 8.0f), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 1797168, 0, 3968);
                        x340Var = x340Var2;
                        z5 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z5);
                } else if (z4) {
                    x340Var.i0(980889838);
                    d((lz61) guo1Var, i, d9y0.k(qim0Var3, f2), x340Var, ((i3 >> 6) & 14) | ((i3 >> 9) & 112));
                    x340Var.r(false);
                } else {
                    if (guo1Var.equals(obj)) {
                        throw p3d1.k(x340Var, 980873711, false);
                    }
                    x340Var.i0(343012432);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            }
            kslVar = kslVar2;
            if (guo1Var instanceof nz61) {
                x340Var.i0(342397702);
                str = ((nz61) guo1Var).b;
                if (str == null) {
                    x340Var.i0(342397701);
                    x340Var.r(z5);
                } else {
                    x340Var.i0(342397702);
                    x340 x340Var3 = x340Var;
                    eso1.e(Uri.parse(str), kslVar, uyn1.x(qim0Var3, 8.0f), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var3, 1797168, 0, 3968);
                    x340Var = x340Var3;
                    z5 = false;
                    x340Var.r(false);
                }
                x340Var.r(z5);
            } else if (z4) {
                x340Var.i0(980889838);
                d((lz61) guo1Var, i, d9y0.k(qim0Var3, f2), x340Var, ((i3 >> 6) & 14) | ((i3 >> 9) & 112));
                x340Var.r(false);
            } else {
                if (guo1Var.equals(obj)) {
                    throw p3d1.k(x340Var, 980873711, false);
                }
                x340Var.i0(343012432);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sk6(jto1Var, f, guo1Var, gm31Var, i, z, q8nVar, q8nVar2, z2, qim0Var2, i2);
        }
    }

    public static final void b(long j, long j2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(79382322);
        int i2 = (x340Var.f(j) ? 32 : 16) | i | (x340Var.f(j2) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            t1c.a(dug.e(h2c.a.b(nim0.a), v9c.s(p7h.M(new u7h[]{new u7h(j), new u7h(j2)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kz0(j, j2, i, (byte) 1);
        }
    }

    public static final void c(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1310883525);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            cvx cvxVar = cbx.b(x340Var2).b;
            era eraVar = een.Q0;
            qim0 qim0VarY = uyn1.y(dug.f(qim0Var, ((vex) zex.a.e).f, er31.b(8.0f)), 12.0f, 4.0f);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(str2, (qim0) null, cbx.d(x340Var2).n, cbx.a(x340Var2).b.a, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var2, (i2 >> 3) & 14, 0, 1762);
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var2, i2 & 14, 0, 1762);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 9);
        }
    }

    public static final void d(lz61 lz61Var, int i, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        cr31 cr31VarB;
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1789417001);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(lz61Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarQ = i1p1.q(u291.b(0.0f, 220.0f, 1, u291.f(uyn1.x(qim0Var, 8.0f), 1.0f)), er31.b(8.0f));
            long j = u7h.b;
            qim0 qim0VarX = uyn1.x(dug.f(qim0VarQ, u7h.b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), 8.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            Uri uri = Uri.parse(lz61Var.b);
            qim0 qim0VarR = u291.r(nim0Var, 160.0f);
            int iC = l1d.C(lz61Var.e);
            if (iC == 0) {
                cr31VarB = er31.b(4.0f);
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                cr31VarB = er31.a;
            }
            qim0 qim0VarQ2 = i1p1.q(qim0VarR, cr31VarB);
            fwx fwxVarG = hso1.G(wsx.c, 0L, u7h.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), x340Var, wsx.d | 3072, 22);
            eso1.e(uri, isl.a, qim0VarQ2, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073741872, 0, 3576);
            kz61 kz61Var = lz61Var.f;
            if (kz61Var == null) {
                x340Var.i0(-978417668);
                x340Var.r(false);
            } else {
                x340Var.i0(-978417667);
                c(0, kz61Var.a, kz61Var.b, x340Var, h2c.a.a(nim0Var, een.Y));
                x340Var.r(false);
            }
            x340Var.r(true);
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            uwo1.e(lz61Var.c, (qim0) null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 1572864, 0, 1714);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            if (i != 0) {
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    i5 = 2;
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return;
                    }
                    i5 = 1;
                }
                i4 = i5;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                x340Var.i0(1786522391);
                x340Var.r(false);
            } else {
                x340Var.i0(1786522392);
                kqn1.d(i4, 0, 0, x340Var, anm1.N("ContentRestrictionBadge", uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11)));
                x340Var.r(false);
            }
            uwo1.e(lz61Var.d, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 1572864, 0, 1714);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(lz61Var, i, qim0Var, i2, (byte) 4);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1103960375);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cvx cvxVar = cbx.b(x340Var).b;
            cr31 cr31VarB = er31.b(16.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(qim0Var3, cr31VarB);
            long j = a;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarX = uyn1.x(dug.f(qim0VarQ, j, u5j1Var), 8.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarX2 = uyn1.x(dug.f(i1p1.q(u291.a(qim0Var3, 176.0f, b), er31.b(8.0f)), u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14), u5j1Var), 8.0f);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0Var2 = qim0Var3;
            xto1.e(anm1.N("ShareableLoading", h2c.a.a(u291.B(qim0Var2, (gra) null, 3), een.h)), 4, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var2, i, (byte) 19);
        }
    }
}
