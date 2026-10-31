package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class ft51 {
    public static final cr31 a = er31.b(1.5f);
    public static final cr31 b = er31.d(1.5f, 0.0f, 0.0f, 1.5f, 6);
    public static final cr31 c = er31.d(0.0f, 1.5f, 1.5f, 0.0f, 9);
    public static final cr31 d = er31.b(0.0f);

    public static final void a(long j, long j2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(160733224);
        int i2 = (x340Var.f(j) ? 4 : 2) | i | (x340Var.f(j2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            float f = 1.0f;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (j <= 0) {
                f = 0.0f;
            } else if (j < j2) {
                f = j / j2;
            }
            b(f, 1.0f, true, true, x340Var, 28038);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ts51(j, j2, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(float f, float f2, boolean z, boolean z2, b0k b0kVar, int i) {
        hw61 hw61Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1556917680);
        int i2 = (x340Var.d(f) ? 32 : 16) | i;
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            hw61 hw61Var2 = d;
            hw61 hw61Var3 = c;
            hw61 hw61Var4 = b;
            hw61 hw61Var5 = a;
            if (z && z2) {
                hw61Var = hw61Var5;
            } else if (z) {
                hw61Var = hw61Var4;
            } else {
                hw61Var = z2 ? hw61Var3 : hw61Var2;
            }
            if (z && z2) {
                hw61Var2 = hw61Var5;
            } else if (z) {
                hw61Var2 = hw61Var4;
            } else if (z2 && f >= 1.0f) {
                hw61Var2 = hw61Var3;
            }
            if (f2 <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarH = u291.h(new wnb0(f2 <= Float.MAX_VALUE ? f2 : Float.MAX_VALUE, true), 3.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH2 = u291.h(u291.f(nim0Var, 1.0f), 3.0f);
            uwr uwrVar = cbx.a;
            t1c.a(dug.f(qim0VarH2, ((vex) zex.a.e).j, hw61Var), x340Var, 0);
            if (f > 0.0f) {
                x340Var.i0(-1828452951);
                t1c.a(dug.f(u291.h(u291.f(nim0Var, f), 3.0f), cbx.a(x340Var).c.a, hw61Var2), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1828254024);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new us51(f, f2, z, z2, i);
        }
    }

    public static final void c(c380 c380Var, long j, qim0 qim0Var, long j2, b0k b0kVar, int i) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(565711476);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.f(j2) ? 2048 : 1024);
        boolean z2 = true;
        boolean z3 = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, -2093833407, c380Var);
            int i3 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                blk1 blk1Var = (blk1) next;
                long j3 = blk1Var.b;
                boolean z4 = z2;
                long j4 = blk1Var.a;
                float f = j3 - j4;
                float f2 = f / j;
                if (f2 < 0.001f) {
                    f2 = 0.001f;
                }
                float fO = 0.0f;
                if (j2 > j4) {
                    fO = j2 >= j3 ? 1.0f : yoi1.o((j2 - j4) / f, 0.0f, 1.0f);
                }
                int i5 = i3;
                b(fO, f2, blk1Var.d, blk1Var.e, x340Var, 6);
                if (i5 < c380Var.size() - 1) {
                    x340Var.i0(-1045655347);
                    z = false;
                    ab80.p(nim0.a, 2.0f, x340Var, false);
                } else {
                    z = false;
                    x340Var.i0(-1045600570);
                    x340Var.r(false);
                }
                z2 = z4;
                z3 = z;
                i3 = i4;
            }
            x340Var.r(z3);
            x340Var.r(z2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p87(c380Var, j, qim0Var, j2, i);
        }
    }

    public static final void d(c380 c380Var, long j, long j2, iu30 iu30Var, Function0 function0, Function0 function1, boolean z, boolean z2, long j3, float f, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1008290258);
        int i4 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.f(j2) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536) | (x340Var.h(z) ? 1048576 : 524288) | (x340Var.h(z2) ? 8388608 : 4194304) | (x340Var.f(j3) ? 67108864 : 33554432) | (x340Var.d(f) ? 536870912 : 268435456);
        int i5 = i2 & 1024;
        if (i5 != 0) {
            i3 = 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = x340Var.i(qim0Var2) ? 4 : 2;
        }
        int i6 = i3;
        if (x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            w2g0.c(qim0Var4, (tl3) null, apo.r(-1244525928, new vs51(c380Var, j, j2, iu30Var, function1, z2, j3, f, function0, z), x340Var), x340Var, (i6 & 14) | 3072, 6);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ws51(c380Var, j, j2, iu30Var, function0, function1, z, z2, j3, f, qim0Var3, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ae  */
    public static final void e(long j, long j2, iu30 iu30Var, Function0 function0, boolean z, long j3, float f, Function0 function1, boolean z2, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var;
        Object hl0Var;
        idn0 idn0Var;
        boolean z3;
        m4c m4cVar;
        ven0 ven0Var;
        boolean z4;
        Object objT;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1912462430);
        int i2 = i | (x340Var2.f(j) ? 4 : 2) | (x340Var2.f(j2) ? 32 : 16) | (x340Var2.i(iu30Var) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.h(z) ? 16384 : 8192) | (x340Var2.f(j3) ? 131072 : 65536) | (x340Var2.d(f) ? 1048576 : 524288) | (x340Var2.i(function1) ? 8388608 : 4194304) | (x340Var2.h(z2) ? 67108864 : 33554432);
        if (x340Var2.Y(i2 & 1, (i2 & 38347923) != 38347922)) {
            Object objT2 = x340Var2.T();
            m4c m4cVar2 = fkj0.X;
            if (objT2 == m4cVar2) {
                objT2 = ktd.n(x340Var2);
            }
            idn0 idn0Var2 = (idn0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar2) {
                objT3 = ktd.n(x340Var2);
            }
            idn0 idn0Var3 = (idn0) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar2) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i3 = i2 & 234881024;
            int i4 = i2 & 29360128;
            boolean zI = (i3 == 67108864) | x340Var2.i(idn0Var2) | (i4 == 8388608);
            Object objT5 = x340Var2.T();
            if (zI || objT5 == m4cVar2) {
                hl0Var = new hl0(z2, idn0Var2, function1, (lnm) null, (byte) 23);
                idn0Var = idn0Var2;
                x340Var2.s0(hl0Var);
            } else {
                hl0Var = objT5;
                idn0Var = idn0Var2;
            }
            qxd0.s(idn0Var, boolValueOf, (vu30) hl0Var, x340Var2);
            lb91 lb91Var = lb91.a;
            uwr uwrVar = cbx.a;
            long j4 = cbx.a(x340Var2).c.a;
            idn0 idn0Var4 = idn0Var;
            long j5 = cbx.a(x340Var2).c.a;
            long j6 = u7h.j;
            fb91 fb91VarE = lb91.e(j4, j6, 0L, j6, 0L, j5, j6, 0L, j6, 0L, x340Var2, 660);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(u291.h(nim0Var, 16.0f), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw 0;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            if (j3 <= 0 || f <= 0.0f) {
                z3 = false;
                x340Var2.i0(1258930142);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1258519795);
                z3 = false;
                t1c.a(dug.f(h2c.a.a(u291.h(u291.f(nim0Var, yoi1.o(j3 / j2, 0.0f, 1.0f)), 3.0f), een.g), u7h.b(cbx.a(x340Var2).c.a, f * 0.5f, 0.0f, 0.0f, 0.0f, 14), a), x340Var2, 0);
                x340Var2.r(false);
            }
            qim0 qim0VarF2 = u291.f(u291.h(anm1.N("seekSlider", nim0Var), 16.0f), 1.0f);
            boolean z5 = z3;
            float f2 = j;
            jsg jsgVar = new jsg(0.0f, j2);
            boolean zI2 = (i3 == 67108864 ? true : z5) | x340Var2.i(ven0Var2) | (i4 == 8388608 ? true : z5) | ((i2 & 896) == 256 ? true : z5);
            Object objT6 = x340Var2.T();
            if (zI2) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT6 != m4cVar) {
                    ven0Var = ven0Var2;
                    x340Var = x340Var2;
                }
                iu30 iu30Var2 = (iu30) objT6;
                boolean zI3 = x340Var.i(ven0Var);
                if ((
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v24 int
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 801
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.ft51.e(long, long, p.iu30, kotlin.jvm.functions.Function0, boolean, long, float, kotlin.jvm.functions.Function0, boolean, p.b0k, int):void");
            }

            public static final void f(c380 c380Var, long j, long j2, iu30 iu30Var, Function0 function0, Function0 function1, boolean z, boolean z2, long j3, float f, ps51 ps51Var, long j4, long j5, agv agvVar, Function0 function2, b0k b0kVar, int i, int i2) {
                int i3;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1571457753);
                if ((i & 6) == 0) {
                    i3 = (x340Var.g(c380Var) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                int i4 = i3 | (x340Var.f(j) ? 32 : 16);
                if ((i & 384) == 0) {
                    i4 |= x340Var.f(j2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i4 |= x340Var.i(iu30Var) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i4 |= x340Var.i(function0) ? 16384 : 8192;
                }
                if ((i & 196608) == 0) {
                    i4 |= x340Var.i(function1) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i4 |= x340Var.h(z) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    i4 |= x340Var.h(z2) ? 8388608 : 4194304;
                }
                int i5 = i4 | (x340Var.f(j3) ? 67108864 : 33554432) | (x340Var.d(f) ? 536870912 : 268435456);
                int i6 = i2 | (x340Var.g(ps51Var) ? 4 : 2);
                if ((i2 & 48) == 0) {
                    i6 |= x340Var.f(j4) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i6 |= x340Var.f(j5) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    i6 |= x340Var.e(agvVar.ordinal()) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    i6 |= x340Var.i(function2) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    i6 |= x340Var.i(nim0.a) ? 131072 : 65536;
                }
                if (x340Var.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 74899) == 74898) ? false : true)) {
                    mod.b(t4k.n.a(flb0.a), apo.r(1188003737, new ys51(c380Var, j, j2, iu30Var, function0, function1, z, z2, j3, f, j4, j5, ps51Var, agvVar, function2), x340Var), x340Var, 56);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zs51(c380Var, j, j2, iu30Var, function0, function1, z, z2, j3, f, ps51Var, j4, j5, agvVar, function2, i, i2);
                }
            }

            public static final void g(fb91 fb91Var, boolean z, idn0 idn0Var, b0k b0kVar, int i) {
                fb91 fb91Var2;
                boolean z2;
                idn0 idn0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1423186300);
                int i2 = (x340Var.i(fb91Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.i(idn0Var) ? 256 : 128);
                if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    fb91Var2 = fb91Var;
                    z2 = z;
                    idn0Var2 = idn0Var;
                    x340Var.b0();
                } else {
                    if (!z) {
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new at51(fb91Var, z, idn0Var, i, (byte) 0);
                            return;
                        }
                        return;
                    }
                    int i3 = (i2 >> 6) & 14;
                    int i4 = i2 << 6;
                    lb91.a.a(idn0Var, eqr0.C(nim0.a, 0.0f, 4.0f), fb91Var, z, jhc1.c(8.0f, 8.0f), x340Var, i3 | (i4 & 896) | (i4 & 7168), 0);
                    idn0Var2 = idn0Var;
                    fb91Var2 = fb91Var;
                    z2 = z;
                }
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new at51(fb91Var2, z2, idn0Var2, i, (byte) 1);
                }
            }

            public static final void h(long j, long j2, long j3, long j4, ps51 ps51Var, agv agvVar, Function0 function0, b0k b0kVar, int i) {
                x340 x340Var;
                String strL;
                qim0 qim0Var;
                int i2;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-755750295);
                int i3 = i | (x340Var2.f(j) ? 4 : 2) | (x340Var2.f(j2) ? 32 : 16) | (x340Var2.f(j3) ? 256 : 128) | (x340Var2.f(j4) ? 2048 : 1024) | (x340Var2.g(ps51Var) ? 16384 : 8192) | (x340Var2.e(agvVar.ordinal()) ? 131072 : 65536) | (x340Var2.i(function0) ? 1048576 : 524288);
                if (x340Var2.Y(i3 & 1, (599187 & i3) != 599186)) {
                    uwr uwrVar = cbx.a;
                    lee1 lee1VarA = lee1.a(cbx.d(x340Var2).j, 0L, fc11.G(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777149);
                    String strL2 = l(j);
                    int iOrdinal = agvVar.ordinal();
                    if (iOrdinal == 0) {
                        strL = l(j2);
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return;
                        }
                        long j5 = j2 - j;
                        if (j5 < 0) {
                            j5 = 0;
                        }
                        strL = "-".concat(l(j5));
                    }
                    String str = strL;
                    boolean z = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
                    Object objT = x340Var2.T();
                    if (z || objT == fkj0.X) {
                        objT = c13.l((j3 == -1 || j4 == -1) ? false : true, x340Var2);
                    }
                    ven0 ven0Var = (ven0) objT;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0Var2 = nim0.a;
                    qim0 qim0VarB = uyn1.B(u291.f(qim0Var2, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    uwo1.e(strL2, anm1.N("positionText", qim0Var2), lee1VarA, u7h.b(cbx.a(x340Var2).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                    x340 x340Var3 = x340Var2;
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    pw31 pw31Var = pw31.a;
                    if (zBooleanValue) {
                        x340Var3.i0(-1417695287);
                        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, pw31Var.a(1.0f, anm1.N("audiobookTitle", qim0Var2), true));
                        Context context = (Context) x340Var3.k(AndroidCompositionLocals_androidKt.b);
                        int iCeil = (int) Math.ceil((j3 * 100.0d) / j4);
                        long jL0 = fdg1.l0(j4 - j3, ngv.d);
                        long jU = jfv.u(jL0, ngv.g);
                        int iJ = jfv.j(jL0);
                        jfv.l(jL0);
                        uwo1.e(context.getString(2131952648, jU > 0 ? context.getString(2131952628, context.getResources().getQuantityString(2131820582, (int) jU, Long.valueOf(jU)), context.getResources().getQuantityString(2131820583, iJ, Integer.valueOf(iJ))) : context.getResources().getQuantityString(2131820583, iJ, Integer.valueOf(iJ)), Integer.valueOf(iCeil)), qim0VarZ, lee1.a(cbx.d(x340Var3).j, 0L, fc11.G(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), cbx.a(x340Var3).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var3, 0, 0, 1696);
                        x340Var3 = x340Var3;
                        i2 = 0;
                        x340Var3.r(false);
                        qim0Var = qim0Var2;
                    } else if (ps51Var != null) {
                        x340Var3.i0(-1417225513);
                        qim0Var = qim0Var2;
                        uwo1.e(ps51Var.b, uyn1.z(16.0f, 0.0f, 2, pw31Var.a(1.0f, anm1.N("segmentTitle", qim0Var), true)), lee1.a(cbx.d(x340Var3).j, 0L, fc11.G(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), cbx.a(x340Var3).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var3, 0, 0, 1696);
                        x340Var3 = x340Var3;
                        i2 = 0;
                        x340Var3.r(false);
                    } else {
                        qim0Var = qim0Var2;
                        i2 = 0;
                        x340Var3.i0(-1416844895);
                        op71.g(x340Var3, pw31Var.a(1.0f, qim0Var, true));
                        x340Var3.r(false);
                    }
                    x340 x340Var4 = x340Var3;
                    uwo1.e(str, bin.x(anm1.N("durationText", qim0Var), false, (String) null, new pm31(i2), (idn0) null, function0, 11), lee1VarA, u7h.b(cbx.a(x340Var3).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2032);
                    x340Var = x340Var4;
                    x340Var.r(true);
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new bt51(j, j2, j3, j4, ps51Var, agvVar, function0, i);
                }
            }

            public static final void i(long j, long j2, long j3, long j4, iu30 iu30Var, c380 c380Var, boolean z, boolean z2, boolean z3, agv agvVar, Function0 function0, qim0 qim0Var, boolean z4, Function0 function1, Function0 function2, b0k b0kVar, int i, int i2, int i3) {
                int i4;
                int i5;
                int i6;
                b0k b0kVar2;
                qim0 qim0Var2;
                boolean z5;
                Function0 function3;
                Function0 function4;
                int i7;
                boolean z6;
                int i8;
                int i9;
                boolean z7;
                b0k b0kVar3;
                float fFloatValue;
                int i10;
                int i11;
                Object objPrevious;
                m4c m4cVar = fkj0.X;
                b0k b0kVar4 = (x340) b0kVar;
                b0kVar4.k0(1977730015);
                int i12 = (b0kVar4.f(j) ? 4 : 2) | i | (b0kVar4.f(j2) ? 32 : 16);
                if ((i & 384) == 0) {
                    i12 |= b0kVar4.f(j3) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i12 |= b0kVar4.f(j4) ? 2048 : 1024;
                }
                int i13 = i12 | (b0kVar4.i(iu30Var) ? 16384 : 8192) | (b0kVar4.g(c380Var) ? 131072 : 65536) | (b0kVar4.h(z) ? 1048576 : 524288);
                if ((i & 12582912) == 0) {
                    i13 |= b0kVar4.h(z2) ? 8388608 : 4194304;
                }
                int i14 = i13 | (b0kVar4.h(z3) ? 67108864 : 33554432);
                if ((i & 805306368) == 0) {
                    i14 |= b0kVar4.e(agvVar.ordinal()) ? 536870912 : 268435456;
                }
                if ((i2 & 6) == 0) {
                    i4 = i2 | (b0kVar4.i(function0) ? 4 : 2);
                } else {
                    i4 = i2;
                }
                int i15 = i4 | 48;
                int i16 = i3 & 4096;
                if (i16 != 0) {
                    i5 = i4 | 432;
                } else {
                    i5 = i15 | (b0kVar4.h(z4) ? 256 : 128);
                }
                int i17 = i3 & 8192;
                if (i17 != 0) {
                    i6 = i5 | 3072;
                } else {
                    i6 = i5 | (b0kVar4.i(function1) ? 2048 : 1024);
                }
                int i18 = i6 | (b0kVar4.i(function2) ? 16384 : 8192);
                if (b0kVar4.Y(i14 & 1, ((i14 & 306783379) == 306783378 && (i18 & 9363) == 9362) ? false : true)) {
                    boolean z8 = i16 != 0 ? false : z4;
                    if (i17 != 0) {
                        Object objT = b0kVar4.T();
                        if (objT == m4cVar) {
                            objT = oa41.a1;
                            b0kVar4.s0(objT);
                        }
                        function4 = (Function0) objT;
                    } else {
                        function4 = function1;
                    }
                    View view = (View) b0kVar4.k(AndroidCompositionLocals_androidKt.f);
                    boolean zI = b0kVar4.i(view);
                    Object objT2 = b0kVar4.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new r7p0(view, null, (byte) 1);
                        b0kVar4.s0(objT2);
                    }
                    qxd0.t(view, b0kVar4, (vu30) objT2);
                    if (z3) {
                        b0kVar4.i0(194563378);
                        z7 = true;
                        b0kVar3 = b0kVar4;
                        i9 = 4;
                        z6 = false;
                        i7 = i14;
                        i8 = 32;
                        fFloatValue = ((Number) t5p1.g(t5p1.r("buffering", b0kVar4, 0), 0.0f, 1.0f, irn1.Y(irn1.o0(1000, 0, mlv.d, 2), 1, 0L, 4), "bufferingFraction", b0kVar3, 29112, 0).d.getValue()).floatValue();
                        b0kVar3.r(false);
                    } else {
                        i7 = i14;
                        z6 = false;
                        i8 = 32;
                        i9 = 4;
                        z7 = true;
                        b0kVar3 = b0kVar4;
                        b0kVar3.i0(195047443);
                        b0kVar3.r(false);
                        fFloatValue = 0.0f;
                    }
                    long j5 = z3 ? j + ((long) ((j2 - j) * fFloatValue)) : 0L;
                    float f = z3 ? 1.0f - (fFloatValue * 1.0f) : 0.0f;
                    int i19 = i7 & 112;
                    boolean z9 = (i19 == i8 ? z7 : z6) | ((i7 & 14) == i9 ? z7 : z6);
                    int i20 = 458752;
                    if ((i7 & 458752) != 131072) {
                        z7 = false;
                    }
                    boolean z10 = z9 | z7;
                    Object objT3 = b0kVar3.T();
                    if (z10 || objT3 == m4cVar) {
                        ListIterator listIterator = c380Var.listIterator(c380Var.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i10 = i20;
                                i11 = i7;
                                objPrevious = null;
                                break;
                            } else {
                                objPrevious = listIterator.previous();
                                i10 = i20;
                                i11 = i7;
                                if (((ps51) objPrevious).c <= j) {
                                    break;
                                }
                                i20 = i10;
                                i7 = i11;
                            }
                        }
                        objT3 = v8r.q(objPrevious);
                        b0kVar3.s0(objT3);
                    } else {
                        i10 = 458752;
                        i11 = i7;
                    }
                    ven0 ven0Var = (ven0) objT3;
                    if (z2) {
                        b0kVar3.i0(195672620);
                        int i21 = ((i11 >> 15) & 14) | i19 | ((i11 << 6) & 896) | ((i11 >> 3) & 7168);
                        int i22 = i18 << 3;
                        b0k b0kVar5 = b0kVar3;
                        j(c380Var, j2, j, iu30Var, function4, function2, z8, z, j5, f, (ps51) ven0Var.getValue(), b0kVar5, (29360128 & (i11 << 3)) | (3670016 & (i18 << 12)) | (57344 & i22) | i21 | (i22 & i10), 48);
                        b0kVar2 = b0kVar5;
                        b0kVar2.r(false);
                    } else {
                        b0kVar3.i0(196151818);
                        int i23 = i18 << 3;
                        int i24 = ((i11 >> 15) & 14) | i19 | ((i11 << 6) & 896) | ((i11 >> 3) & 7168) | (i23 & 57344) | (i23 & i10);
                        int i25 = i18 << 12;
                        int i26 = (3670016 & i25) | i24 | (29360128 & (i11 << 3));
                        int i27 = i11;
                        int i28 = ((i11 >> 6) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i25 & 57344) | 196608;
                        b0k b0kVar6 = b0kVar3;
                        f(c380Var, j2, j, iu30Var, function4, function2, z8, z, j5, f, (ps51) ven0Var.getValue(), j4, j3, agvVar, function0, b0kVar6, i26, i28);
                        b0kVar2 = b0kVar6;
                        b0kVar2.r(false);
                    }
                    qim0Var2 = nim0.a;
                    function3 = function4;
                    z5 = z8;
                } else {
                    b0kVar2 = b0kVar4;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    z5 = z4;
                    function3 = function1;
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ct51(j, j2, j3, j4, iu30Var, c380Var, z, z2, z3, agvVar, function0, qim0Var2, z5, function3, function2, i, i2, i3);
                }
            }

            public static final void j(c380 c380Var, long j, long j2, iu30 iu30Var, Function0 function0, Function0 function1, boolean z, boolean z2, long j3, float f, ps51 ps51Var, b0k b0kVar, int i, int i2) {
                int i3;
                Function0 function2;
                Function0 function3;
                boolean z3;
                int i4;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1375358736);
                if ((i & 6) == 0) {
                    i3 = (x340Var.g(c380Var) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                int i5 = i3 | (x340Var.f(j) ? 32 : 16);
                if ((i & 384) == 0) {
                    i5 |= x340Var.f(j2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i5 |= x340Var.i(iu30Var) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    function2 = function0;
                    i5 |= x340Var.i(function2) ? 16384 : 8192;
                } else {
                    function2 = function0;
                }
                if ((196608 & i) == 0) {
                    function3 = function1;
                    i5 |= x340Var.i(function3) ? 131072 : 65536;
                } else {
                    function3 = function1;
                }
                if ((1572864 & i) == 0) {
                    z3 = z;
                    i5 |= x340Var.h(z3) ? 1048576 : 524288;
                } else {
                    z3 = z;
                }
                if ((i & 12582912) == 0) {
                    i5 |= x340Var.h(z2) ? 8388608 : 4194304;
                }
                int i6 = i5 | (x340Var.f(j3) ? 67108864 : 33554432) | (x340Var.d(f) ? 536870912 : 268435456);
                if ((i2 & 6) == 0) {
                    i4 = i2 | (x340Var.g(ps51Var) ? 4 : 2);
                } else {
                    i4 = i2;
                }
                int i7 = i2 & 48;
                nim0 nim0Var = nim0.a;
                if (i7 == 0) {
                    i4 |= x340Var.i(nim0Var) ? 32 : 16;
                }
                if (x340Var.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    x340Var.j0(475845883);
                    wat watVar = (wat) x340Var.k(t4k.h);
                    x340Var.j0(-492369756);
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = x0d.o(watVar, x340Var);
                    }
                    x340Var.r(false);
                    ufh0 ufh0Var = (ufh0) objT;
                    x340Var.j0(-492369756);
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = x0d.m(x340Var);
                    }
                    x340Var.r(false);
                    xhl xhlVar = (xhl) objT2;
                    x340Var.j0(-492369756);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT3);
                    }
                    x340Var.r(false);
                    ven0 ven0Var = (ven0) objT3;
                    x340Var.j0(-492369756);
                    Object objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = x0d.n(xhlVar, x340Var);
                    }
                    x340Var.r(false);
                    nil nilVar = (nil) objT4;
                    x340Var.j0(-492369756);
                    Object objT5 = x340Var.T();
                    if (objT5 == m4cVar) {
                        objT5 = bb00.i(rih1.a, f331.X0, x340Var);
                    }
                    x340Var.r(false);
                    ven0 ven0Var2 = (ven0) objT5;
                    who1.h(s161.b(qim0VarF, false, new tu(ufh0Var, (byte) 20)), apo.i(x340Var, -1488813576, new dt51(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 16), c380Var, j, j2, iu30Var, function2, function3, z3, z2, j3, f, ps51Var)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 16), x340Var, 48);
                    x340Var.r(false);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new et51(c380Var, j, j2, iu30Var, function0, function1, z, z2, j3, f, ps51Var, i, i2);
                }
            }

            public static final void k(long j, long j2, ps51 ps51Var, qim0 qim0Var, b0k b0kVar, int i) {
                x340 x340Var;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(268456140);
                int i2 = i | (x340Var2.f(j) ? 4 : 2) | (x340Var2.f(j2) ? 32 : 16) | (x340Var2.g(ps51Var) ? 256 : 128) | (x340Var2.i(qim0Var) ? 2048 : 1024);
                if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    uwr uwrVar = cbx.a;
                    lee1 lee1VarA = lee1.a(cbx.d(x340Var2).j, 0L, fc11.G(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777149);
                    String strL = l(j);
                    String strL2 = l(j2);
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(qim0VarF, 8.0f, 4.0f, 8.0f, 0.0f, 8);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    nim0 nim0Var = nim0.a;
                    uwo1.e(strL, anm1.N("positionText", nim0Var), lee1VarA, cbx.a(x340Var2).b.a, new a0e1(1), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    uwo1.e("/", uyn1.z(4.0f, 0.0f, 2, nim0Var), lee1VarA, u7h.b(cbx.a(x340Var2).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 6, 0, 2032);
                    uwo1.e(strL2, anm1.N("durationText", nim0Var), lee1VarA, u7h.b(cbx.a(x340Var2).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), new a0e1(1), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
                    x340Var = x340Var2;
                    if (ps51Var != null) {
                        x340Var.i0(84565549);
                        cvx cvxVar5 = cbx.b(x340Var).b;
                        uwo1.e("•", uyn1.z(4.0f, 0.0f, 2, nim0Var), lee1VarA, u7h.b(cbx.a(x340Var).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 6, 0, 2032);
                        uwo1.e(ps51Var.b, kx40.h(1.0f, anm1.N("videoFirstSegmentTitle", nim0Var), true), lee1.a(cbx.d(x340Var).j, 0L, fc11.G(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), u7h.b(cbx.a(x340Var).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), new a0e1(1), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1696);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(85162330);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new p87(j, j2, ps51Var, qim0Var, i, (byte) 3);
                }
            }

            public static final String l(long j) {
                long jL0 = fdg1.l0(j, ngv.d);
                long jU = jfv.u(jL0, ngv.g);
                int iJ = jfv.j(jL0);
                int iL = jfv.l(jL0);
                return jU > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
            }
        }
