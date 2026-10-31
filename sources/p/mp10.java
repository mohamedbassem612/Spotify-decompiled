package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class mp10 {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];
    public static b180 d;
    public static b180 e;

    public static final String A(Context context, o5a1 o5a1Var, Long l, long j) {
        return a2k1.a(context, e6p1.j(o5a1Var.a, l, j));
    }

    public static Next B(kak0 kak0Var, o3k0 o3k0Var) {
        t0k0 u0k0Var;
        giq0 giq0Var;
        tv80 tv80Var = o3k0Var.c;
        int i = o3k0Var.a;
        boolean zP = i2p1.p(kak0Var);
        k1k0 k1k0Var = i0k0.a;
        if (!zP) {
            return Next.a(Collections.singleton(k1k0Var));
        }
        int iC = l1d.C(o3k0Var.b);
        if (iC != 0) {
            if (iC == 1) {
                return Next.a(Collections.singleton(k1k0Var));
            }
            eg.o();
            return null;
        }
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            u0k0Var = new u0k0(tv80Var);
        } else {
            if (iC2 != 1) {
                eg.o();
                return null;
            }
            u0k0Var = new t0k0(tv80Var);
        }
        k1k0 k1k0VarM = q3p1.m(kak0Var, u0k0Var);
        int iC3 = l1d.C(i);
        if (iC3 == 0) {
            giq0Var = giq0.c;
        } else {
            if (iC3 != 1) {
                eg.o();
                return null;
            }
            giq0Var = giq0.d;
        }
        return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, giq0Var, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1, 1048574), f46.S0(new k1k0[]{k1k0Var, k1k0VarM}));
    }

    public static final void a(i63 i63Var, qim0 qim0Var, int i, idn0 idn0Var, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        idn0 idn0Var2;
        int i5;
        int i6;
        idn0 idn0Var3;
        qim0 qim0Var3;
        float f;
        char c2;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-570860578);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(i63Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i7 = i3 | 432;
        if ((i2 & 3072) == 0) {
            i7 = i3 | 1456;
        }
        if ((i2 & 24576) == 0) {
            i7 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        }
        if (x340Var.Y(i7 & 1, (i7 & 9363) != 9362)) {
            x340Var.d0();
            int i8 = i2 & 1;
            qim0 qim0Var4 = nim0.a;
            if (i8 == 0 || x340Var.E()) {
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                i5 = 150;
                i6 = i7 & (-7169);
                idn0Var3 = (idn0) objT;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                int i9 = i7 & (-7169);
                i5 = i;
                idn0Var3 = idn0Var;
                i6 = i9;
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            ven0 ven0VarM = k1u.m(idn0Var3, x340Var, 0);
            if (((Boolean) ven0VarM.getValue()).booleanValue()) {
                f = 0.97f;
                c2 = 0;
            } else {
                f = 1.0f;
                c2 = 0;
            }
            int i10 = i5;
            idn0 idn0Var4 = idn0Var3;
            tob1 tob1VarB = z95.b(f, (fe5) null, "scale", (iu30) null, x340Var, 3072, 22);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.8f : 1.0f, (fe5) null, "alpha", (iu30) null, x340Var, 3072, 22);
            float f2 = i10;
            qim0 qim0VarV = u291.v(qim0Var3, f2);
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            qim0 qim0VarK = d9y0.k(fj30.F(qim0VarV, fFloatValue, fFloatValue), ((Number) tob1VarB2.getValue()).floatValue());
            int i11 = i6 & 57344;
            boolean z = i11 == 16384;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new k52(iu30Var2, (byte) 26);
                x340Var.s0(objT2);
            }
            qim0 qim0VarV2 = bin.v(qim0VarK, idn0Var4, (ga80) null, false, (String) null, (pm31) null, (Function0) objT2, 28);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            qim0 qim0Var5 = qim0Var3;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
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
            eso1.e(Uri.parse(i63Var.c), isl.a, u291.r(qim0Var4, f2), null, null, null, null, null, null, null, false, false, x340Var, 24624, 0, 4072);
            qim0 qim0VarN = anm1.N("play_button", h2c.a.a(qim0Var4, een.Y));
            boolean z3 = i63Var.f;
            boolean z4 = i63Var.e;
            boolean z5 = i11 == 16384;
            Object objT3 = x340Var.T();
            if (z5 || objT3 == m4cVar) {
                iu30Var2 = iu30Var;
                objT3 = new k52(iu30Var2, (byte) 27);
                x340Var.s0(objT3);
            } else {
                iu30Var2 = iu30Var;
            }
            czo1.d(z3, z4, (Function0) objT3, qim0VarN, x340Var, 0, 0);
            x340Var.r(true);
            String str = i63Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, uyn1.B(qim0Var4, 0.0f, 8.0f, 0.0f, 4.0f, 5), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1760);
            x340Var = x340Var;
            String str2 = i63Var.b;
            if (str2 == null) {
                x340Var.i0(1869741973);
                x340Var.r(false);
            } else {
                x340Var.i0(1869741974);
                uwo1.e(str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1762);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
            idn0Var2 = idn0Var4;
            qim0Var2 = qim0Var5;
            i4 = i10;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            i4 = i;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b63(i63Var, qim0Var2, i4, idn0Var2, iu30Var2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void b(otn0 otn0Var, qim0 qim0Var, bv30 bv30Var, b0k b0kVar, int i, int i2) {
        int i3;
        bv30 bv30Var2;
        boolean z;
        b0k b0kVar2;
        bv30 bv30Var3;
        h311 h311VarV;
        boolean z2;
        float f;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-567709640);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(otn0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(qim0Var) ? 32 : 16;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                bv30Var2 = bv30Var;
                i3 |= b0kVar3.i(bv30Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    bv30Var3 = u9i.a;
                } else {
                    bv30Var3 = bv30Var2;
                }
                z2 = ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp < 520;
                if (z2) {
                    b0kVar3.i0(-108102209);
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(b0kVar3).d;
                    b0kVar3.r(false);
                    f = 32.0f;
                } else {
                    b0kVar3.i0(-108100484);
                    uwr uwrVar2 = cbx.a;
                    mta mtaVar2 = cbx.b(b0kVar3).d;
                    b0kVar3.r(false);
                    f = 48.0f;
                }
                gbx gbxVar = otn0Var.h;
                hdx hdxVar = new hdx(0, (vu30) null, (vu30) null, (vu30) null, d4o1.a, 15);
                qim0 qim0VarJ = zr7.j(u291.j(f, 0.0f, 2, u291.d(qim0Var, 1.0f)), new ec3(otn0Var, (byte) 6));
                cvx cvxVar = cbx.b(b0kVar3).b;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                foo1.c(gbxVar, hdxVar, qim0VarJ, (max) null, (gdx) null, lnn1.n(uyn1.j(2.0f, 0.0f, 2.0f, 1.0f, 2), otn0Var.a), (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1376010969, new zs(bv30Var3, otn0Var, z2, (byte) 8), b0kVar3), b0kVar2, 0, 48, 1976);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                bv30Var3 = bv30Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1(otn0Var, qim0Var, bv30Var3, i, i2, (byte) 2);
            }
        }
        i3 |= 384;
        bv30Var2 = bv30Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                bv30Var3 = u9i.a;
            } else {
                bv30Var3 = bv30Var2;
            }
            if (((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp < 520) {
            }
            if (z2) {
                b0kVar3.i0(-108102209);
                uwr uwrVar3 = cbx.a;
                mta mtaVar3 = cbx.b(b0kVar3).d;
                b0kVar3.r(false);
                f = 32.0f;
            } else {
                b0kVar3.i0(-108100484);
                uwr uwrVar4 = cbx.a;
                mta mtaVar4 = cbx.b(b0kVar3).d;
                b0kVar3.r(false);
                f = 48.0f;
            }
            gbx gbxVar2 = otn0Var.h;
            hdx hdxVar2 = new hdx(0, (vu30) null, (vu30) null, (vu30) null, d4o1.a, 15);
            qim0 qim0VarJ2 = zr7.j(u291.j(f, 0.0f, 2, u291.d(qim0Var, 1.0f)), new ec3(otn0Var, (byte) 6));
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar2, hdxVar2, qim0VarJ2, (max) null, (gdx) null, lnn1.n(uyn1.j(2.0f, 0.0f, 2.0f, 1.0f, 2), otn0Var.a), (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1376010969, new zs(bv30Var3, otn0Var, z2, (byte) 8), b0kVar3), b0kVar2, 0, 48, 1976);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            bv30Var3 = bv30Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(otn0Var, qim0Var, bv30Var3, i, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x015b  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void c(otn0 otn0Var, boolean z, float f, qim0 qim0Var, qim0 qim0Var2, qim0 qim0Var3, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var4;
        int i4;
        qim0 qim0Var5;
        int i5;
        boolean z2;
        qim0 qim0Var6;
        qim0 qim0Var7;
        qim0 qim0Var8;
        h311 h311VarV;
        qim0 qim0Var9;
        qim0 qim0Var10;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i6;
        int i7;
        qim0 qim0Var11;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1677054827);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(otn0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.d(f) ? 256 : 128;
        }
        int i8 = i3 | 3072;
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                qim0Var4 = qim0Var2;
                i8 |= x340Var.g(qim0Var4) ? 16384 : 8192;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    qim0Var5 = qim0Var3;
                    if (x340Var.g(qim0Var5)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i8 |= i5;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i8 & 1, z2)) {
                    qim0Var9 = nim0.a;
                    if (i9 != 0) {
                        qim0Var4 = qim0Var9;
                    }
                    if (i4 != 0) {
                        qim0Var10 = qim0Var9;
                    } else {
                        qim0Var10 = qim0Var5;
                    }
                    qim0 qim0VarB = uyn1.B(u291.f(qim0Var9, 1.0f), 0.0f, f, 0.0f, 0.0f, 13);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    mbhVarA = jbh.a(new d36(4.0f, false, new g21(een.N0, (byte) 28)), een.Q0, x340Var, 48);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    i6 = i8 >> 12;
                    i7 = (i8 << 6) & 896;
                    otn0Var.a((i6 & 14) | i7, 2, x340Var, qim0Var4);
                    if (z) {
                        qim0Var11 = qim0Var10;
                        x340Var.i0(-18426269);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-18504110);
                        qim0Var11 = qim0Var10;
                        otn0Var.b(cbx.d(x340Var).m, qim0Var11, x340Var, i7 | (i6 & 112), 0);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    qim0Var8 = qim0Var11;
                    qim0Var7 = qim0Var4;
                    qim0Var6 = qim0Var9;
                } else {
                    x340Var.b0();
                    qim0Var6 = qim0Var;
                    qim0Var7 = qim0Var4;
                    qim0Var8 = qim0Var5;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new gvb(otn0Var, z, f, qim0Var6, qim0Var7, qim0Var8, i, i2);
                }
            }
            i8 |= 196608;
            qim0Var5 = qim0Var3;
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i8 & 1, z2)) {
                qim0Var9 = nim0.a;
                if (i9 != 0) {
                    qim0Var4 = qim0Var9;
                }
                if (i4 != 0) {
                    qim0Var10 = qim0Var9;
                } else {
                    qim0Var10 = qim0Var5;
                }
                qim0 qim0VarB2 = uyn1.B(u291.f(qim0Var9, 1.0f), 0.0f, f, 0.0f, 0.0f, 13);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                mbhVarA = jbh.a(new d36(4.0f, false, new g21(een.N0, (byte) 28)), een.Q0, x340Var, 48);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB2);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                i6 = i8 >> 12;
                i7 = (i8 << 6) & 896;
                otn0Var.a((i6 & 14) | i7, 2, x340Var, qim0Var4);
                if (z) {
                    x340Var.i0(-18504110);
                    qim0Var11 = qim0Var10;
                    otn0Var.b(cbx.d(x340Var).m, qim0Var11, x340Var, i7 | (i6 & 112), 0);
                    x340Var.r(false);
                } else {
                    qim0Var11 = qim0Var10;
                    x340Var.i0(-18426269);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var8 = qim0Var11;
                qim0Var7 = qim0Var4;
                qim0Var6 = qim0Var9;
            } else {
                x340Var.b0();
                qim0Var6 = qim0Var;
                qim0Var7 = qim0Var4;
                qim0Var8 = qim0Var5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gvb(otn0Var, z, f, qim0Var6, qim0Var7, qim0Var8, i, i2);
            }
        }
        i8 = i3 | 27648;
        qim0Var4 = qim0Var2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                qim0Var5 = qim0Var3;
                if (x340Var.g(qim0Var5)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i8 |= i5;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i8 & 1, z2)) {
                qim0Var9 = nim0.a;
                if (i9 != 0) {
                    qim0Var4 = qim0Var9;
                }
                if (i4 != 0) {
                    qim0Var10 = qim0Var9;
                } else {
                    qim0Var10 = qim0Var5;
                }
                qim0 qim0VarB3 = uyn1.B(u291.f(qim0Var9, 1.0f), 0.0f, f, 0.0f, 0.0f, 13);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                mbhVarA = jbh.a(new d36(4.0f, false, new g21(een.N0, (byte) 28)), een.Q0, x340Var, 48);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB3);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                i6 = i8 >> 12;
                i7 = (i8 << 6) & 896;
                otn0Var.a((i6 & 14) | i7, 2, x340Var, qim0Var4);
                if (z) {
                    x340Var.i0(-18504110);
                    qim0Var11 = qim0Var10;
                    otn0Var.b(cbx.d(x340Var).m, qim0Var11, x340Var, i7 | (i6 & 112), 0);
                    x340Var.r(false);
                } else {
                    qim0Var11 = qim0Var10;
                    x340Var.i0(-18426269);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var8 = qim0Var11;
                qim0Var7 = qim0Var4;
                qim0Var6 = qim0Var9;
            } else {
                x340Var.b0();
                qim0Var6 = qim0Var;
                qim0Var7 = qim0Var4;
                qim0Var8 = qim0Var5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gvb(otn0Var, z, f, qim0Var6, qim0Var7, qim0Var8, i, i2);
            }
        }
        i8 |= 196608;
        qim0Var5 = qim0Var3;
        if ((74899 & i8) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i8 & 1, z2)) {
            qim0Var9 = nim0.a;
            if (i9 != 0) {
                qim0Var4 = qim0Var9;
            }
            if (i4 != 0) {
                qim0Var10 = qim0Var9;
            } else {
                qim0Var10 = qim0Var5;
            }
            qim0 qim0VarB4 = uyn1.B(u291.f(qim0Var9, 1.0f), 0.0f, f, 0.0f, 0.0f, 13);
            uwr uwrVar4 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbhVarA = jbh.a(new d36(4.0f, false, new g21(een.N0, (byte) 28)), een.Q0, x340Var, 48);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarB4);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            i6 = i8 >> 12;
            i7 = (i8 << 6) & 896;
            otn0Var.a((i6 & 14) | i7, 2, x340Var, qim0Var4);
            if (z) {
                x340Var.i0(-18504110);
                qim0Var11 = qim0Var10;
                otn0Var.b(cbx.d(x340Var).m, qim0Var11, x340Var, i7 | (i6 & 112), 0);
                x340Var.r(false);
            } else {
                qim0Var11 = qim0Var10;
                x340Var.i0(-18426269);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var8 = qim0Var11;
            qim0Var7 = qim0Var4;
            qim0Var6 = qim0Var9;
        } else {
            x340Var.b0();
            qim0Var6 = qim0Var;
            qim0Var7 = qim0Var4;
            qim0Var8 = qim0Var5;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gvb(otn0Var, z, f, qim0Var6, qim0Var7, qim0Var8, i, i2);
        }
    }

    public static final void d(zbm zbmVar, String str, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1344970536);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(zbmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = tqk.R0;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI = ((i2 & 112) == 32) | x340Var.i(zbmVar) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new o0d(str, zbmVar, function0, (byte) 23);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var, qim0Var, (iu30) objT2, x340Var, ((i2 >> 6) & 112) | 6, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, zbmVar, str, function0, qim0Var, (byte) 10);
        }
    }

    public static final void e(fcf0 fcf0Var, Function0 function0, qim0 qim0Var, boolean z, boolean z2, boolean z3, xc21 xc21Var, boolean z4, ddf0 ddf0Var, tl3 tl3Var, j6m j6mVar, boolean z5, boolean z6, Map map, jj7 jj7Var, boolean z7, b0k b0kVar, int i, int i2, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-674272918);
        qim0 qim0Var2 = (i3 & 4) != 0 ? nim0.a : qim0Var;
        boolean z8 = (i3 & 8) != 0 ? false : z;
        boolean z9 = (i3 & 16) != 0 ? false : z2;
        boolean z10 = (i3 & 32) != 0 ? false : z3;
        xc21 xc21Var2 = (i3 & 64) != 0 ? xc21.a : xc21Var;
        boolean z11 = (i3 & 128) != 0 ? false : z4;
        ddf0 ddf0Var2 = (i3 & 256) != 0 ? null : ddf0Var;
        tl3 tl3Var2 = (i3 & 512) != 0 ? een.h : tl3Var;
        j6m j6mVar2 = (i3 & 1024) != 0 ? mif1.Q0 : j6mVar;
        boolean z12 = (i3 & 2048) != 0 ? true : z5;
        boolean z13 = (i3 & 4096) != 0 ? false : z6;
        Map map2 = (i3 & 8192) != 0 ? null : map;
        jj7 jj7Var2 = (i3 & 16384) != 0 ? jj7.a : jj7Var;
        boolean z14 = (i3 & 32768) != 0 ? false : z7;
        x340Var.j0(185152052);
        Object objT = x340Var.T();
        Object obj = fkj0.X;
        if (objT == obj) {
            objT = new cdf0();
            x340Var.s0(objT);
        }
        cdf0 cdf0Var = (cdf0) objT;
        boolean z15 = z8;
        x340Var.r(false);
        x340Var.j0(185152099);
        Object objT2 = x340Var.T();
        if (objT2 == obj) {
            objT2 = new Matrix();
            x340Var.s0(objT2);
        }
        Matrix matrix = (Matrix) objT2;
        x340Var.r(false);
        x340Var.j0(185152179);
        boolean zG = x340Var.g(fcf0Var);
        Object objT3 = x340Var.T();
        if (zG || objT3 == obj) {
            objT3 = v8r.q((Object) null);
            x340Var.s0(objT3);
        }
        ven0 ven0Var = (ven0) objT3;
        x340Var.r(false);
        x340Var.j0(185152231);
        if (fcf0Var == null || fcf0Var.b() == 0.0f) {
            j6m j6mVar3 = j6mVar2;
            boolean z16 = z9;
            Map map3 = map2;
            boolean z17 = z14;
            ddf0 ddf0Var3 = ddf0Var2;
            jj7 jj7Var3 = jj7Var2;
            tl3 tl3Var3 = tl3Var2;
            t1c.a(qim0Var2, x340Var, (i >> 6) & 14);
            x340Var.r(false);
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qbf0(fcf0Var, function0, qim0Var2, z15, z16, z10, xc21Var2, z11, ddf0Var3, tl3Var3, j6mVar3, z12, z13, map3, jj7Var3, z17, i, i2, i3, (byte) 0);
                return;
            }
            return;
        }
        x340Var.r(false);
        j6m j6mVar4 = j6mVar2;
        ddf0 ddf0Var4 = ddf0Var2;
        jj7 jj7Var4 = jj7Var2;
        Rect rect = fcf0Var.k;
        qim0 qim0VarThen = qim0Var2.then(new sbf0(rect.width(), rect.height()));
        qim0 qim0Var3 = qim0Var2;
        tl3 tl3Var4 = tl3Var2;
        Map map4 = map2;
        boolean z18 = z11;
        xc21 xc21Var3 = xc21Var2;
        boolean z19 = z14;
        boolean z20 = z13;
        rbf0 rbf0Var = new rbf0(rect, j6mVar4, tl3Var4, matrix, cdf0Var, z10, z19, xc21Var3, jj7Var4, fcf0Var, map4, ddf0Var4, z15, z9, z18, z12, z20, function0, ven0Var);
        boolean z21 = z9;
        j0o1.b(0, x340Var, rbf0Var, qim0VarThen);
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new qbf0(fcf0Var, function0, qim0Var3, z15, z21, z10, xc21Var3, z18, ddf0Var4, tl3Var4, j6mVar4, z12, z20, map4, jj7Var4, z19, i, i2, i3, (byte) 1);
        }
    }

    public static final void f(fcf0 fcf0Var, qim0 qim0Var, boolean z, boolean z2, bcf0 bcf0Var, int i, ddf0 ddf0Var, tl3 tl3Var, j6m j6mVar, b0k b0kVar, int i2, int i3, int i4) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1151869807);
        qim0 qim0Var2 = (i4 & 2) != 0 ? nim0.a : qim0Var;
        boolean z3 = (i4 & 4) != 0 ? true : z;
        boolean z4 = (i4 & 8) != 0 ? true : z2;
        bcf0 bcf0Var2 = (i4 & 16) != 0 ? null : bcf0Var;
        int i5 = (i4 & 64) != 0 ? 1 : i;
        ddf0 ddf0Var2 = (i4 & 8192) != 0 ? null : ddf0Var;
        tl3 tl3Var2 = (i4 & 16384) != 0 ? een.h : tl3Var;
        j6m j6mVar2 = (32768 & i4) != 0 ? mif1.Q0 : j6mVar;
        bcf0 bcf0Var3 = bcf0Var2;
        kbf0 kbf0VarN = zpn1.n(fcf0Var, z3, z4, bcf0Var3, 1.0f, i5, x340Var, 896);
        x340Var.j0(185157078);
        boolean zG = x340Var.g(kbf0VarN);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new uk1(kbf0VarN, (byte) 12);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        int i6 = i2 >> 12;
        e(fcf0Var, (Function0) objT, qim0Var2, false, false, false, xc21.a, false, ddf0Var2, tl3Var2, j6mVar2, true, false, null, jj7.a, false, x340Var, ((i2 << 3) & 896) | 134217736 | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 4096, 0);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fpv(fcf0Var, qim0Var2, z3, z4, bcf0Var3, i5, ddf0Var2, tl3Var2, j6mVar2, i2, i3, i4);
        }
    }

    public static final void g(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1023674358);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strN0 = cwl1.n0(2131958896, new Object[]{str}, x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            uwo1.e(strN0, uyn1.y(qim0Var3, 16.0f, 8.0f), cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 11);
        }
    }

    public static final void h(String str, djc0 djc0Var, qim0 qim0Var, iu30 iu30Var, lee1 lee1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-633493405);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(djc0Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(lee1Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            ven0 ven0VarS2 = v8r.s(x340Var.k(t4k.s), x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new xs3(ven0VarS, ven0VarS2, (byte) 19);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            FontWeight fontWeight = cbx.d(x340Var).k.a.c;
            FontFamily fontFamily = cbx.d(x340Var).k.a.f;
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | x340Var.f(j) | x340Var.g(fontWeight) | x340Var.g(fontFamily);
            Object objT2 = x340Var.T();
            if (zF || objT2 == m4cVar) {
                zma1 zma1Var = new zma1(j, 0L, fontWeight, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.b, (Shadow) null, (PlatformSpanStyle) null, 61402);
                j = j;
                pae1 pae1Var = new pae1(zma1Var, (zma1) null, 14);
                se11 se11Var = ltg0.a;
                ArrayList arrayList = new ArrayList();
                ye5 ye5Var = new ye5();
                ltg0.a(ye5Var, pae1Var, arrayList, iu30Var2, str);
                objT2 = new itg0(ye5Var.p(), arrayList);
                x340Var.s0(objT2);
            }
            itg0 itg0Var = (itg0) objT2;
            boolean zG = x340Var.g(fontWeight) | (i3 == 4) | x340Var.f(j) | x340Var.g(fontFamily) | x340Var.g(djc0Var) | x340Var.g(lee1Var);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                bvd1 bvd1Var = new bvd1(itg0Var, iu30Var2, lee1Var, djc0Var, (byte) 11);
                x340Var.s0(bvd1Var);
                objT3 = bvd1Var;
            }
            ejo1.l((i2 >> 6) & 14, 0, x340Var, (vu30) objT3, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1(str, djc0Var, qim0Var, iu30Var, lee1Var, i);
        }
    }

    public static final void i(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1337170703);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            long j = ((vex) zex.a.e).m;
            cr31 cr31Var = er31.a;
            ogx ogxVar = ogx.e;
            boolean z = false;
            zzq0 zzq0Var = new zzq0(4.0f, 2.0f, 4.0f, 2.0f);
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new uuc1(function0, (byte) 19);
                x340Var.s0(objT);
            }
            cwl1.b((qim0) null, (tl3) null, cr31Var, ogxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, apo.r(839467846, new la0(j, cvxVar, str), x340Var), x340Var, 0, 48, 1507);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(str, function0, i, (byte) 20);
        }
    }

    public static final int j(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int k(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static Map l() {
        return Collections.synchronizedMap(new WeakHashMap(16));
    }

    public static final void m(ohd ohdVar, int i) {
        vfu vfuVar = ohdVar.d;
        boolean z = i == 4;
        if (z || !(vfuVar instanceof vfu) || u(i) != u(((xfu) ohdVar).c)) {
            z(ohdVar, vfuVar, z);
            return;
        }
        vfu vfuVar2 = vfuVar;
        q8n q8nVar = vfuVar2.d;
        o8n context = vfuVar2.e.getContext();
        if (hr80.y(q8nVar, context)) {
            hr80.x(q8nVar, context, ohdVar);
            return;
        }
        ab00 ab00VarA = jge1.a();
        if (ab00VarA.V()) {
            ab00VarA.R(ohdVar);
            return;
        }
        ab00VarA.T(true);
        try {
            z(ohdVar, vfuVar, true);
            do {
            } while (ab00VarA.Z());
        } catch (Throwable th) {
            try {
                ohdVar.g(th);
            } finally {
                ab00VarA.N(true);
            }
        }
    }

    public static final String n(sbw0 sbw0Var) {
        String str = sbw0Var.d.b.e;
        return str == null ? "" : str;
    }

    public static final boolean o(Object obj, Object obj2) {
        return u890.j(obj, obj2);
    }

    public static pr31 p() {
        return pr31.r;
    }

    public static final Next q(qfw0 qfw0Var, qfw0 qfw0Var2) {
        boolean zA = qfw0Var.g.a();
        sz20 sz20Var = qfw0Var2.g;
        sbw0 sbw0Var = qfw0Var2.a;
        boolean zA2 = sz20Var.a();
        acw0 acw0Var = acw0.a;
        if (!zA && zA2) {
            boolean zB = qfw0Var2.b();
            xj61 xj61Var = new xj61();
            if (!qfw0Var2.j && sbw0Var.h) {
                xj61Var.add(vbw0.a);
            }
            if (zB) {
                xj61Var.add(acw0Var);
            }
            return Next.i(qfw0.a(qfw0Var2, (sbw0) null, false, false, qfw0Var2.d || zB, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 16375), cwl1.j(xj61Var));
        }
        if (!zA || zA2) {
            return Next.h(qfw0Var2);
        }
        xj61 xj61Var2 = new xj61();
        xj61Var2.add(wbw0.a);
        xj61Var2.add(mcw0.a);
        if (qfw0Var.c()) {
            xj61Var2.add(acw0Var);
        }
        if (sbw0Var.f) {
            xj61Var2.add(ncw0.a);
            xj61Var2.add(new fcw0(n(sbw0Var)));
        }
        return Next.i(qfw0.a(qfw0Var2, (sbw0) null, false, false, false, (i091) null, false, (sz20) null, (hwt) null, (zkm) null, false, false, false, (xii1) null, (xii1) null, 973), cwl1.j(xj61Var2));
    }

    public static final int r(int i) {
        int i2 = i * 4;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        return i2 / 4;
    }

    public static final int s(int i) {
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        return i2 / 8;
    }

    public static final Set t(qfw0 qfw0Var, long j, tv80 tv80Var) {
        zkm zkmVar = qfw0Var.i;
        sbw0 sbw0Var = qfw0Var.a;
        return sbw0Var.f ? Collections.singleton(new ybw0(j, n(sbw0Var), tv80Var)) : Collections.singleton(new zbw0(sbw0Var.d, sbw0Var.a, sbw0Var.c, j, 0L, tv80Var, (zkmVar.d && zkmVar.c && v(zkmVar, sbw0Var)) ? false : true, 144));
    }

    public static final boolean u(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean v(zkm zkmVar, sbw0 sbw0Var) {
        ksm0 ksm0Var = sbw0Var.d.b;
        return p2o1.t(zkmVar, ksm0Var.c, ksm0Var.e, sbw0Var.j);
    }

    public static final boolean w(qxc0 qxc0Var) {
        Map map = qxc0Var != null ? qxc0Var.X : null;
        if (map == null) {
            map = b7x.a;
        }
        return u890.j(map.get("is_genpods"), "true") && u890.j(map.get("is_genpods_recurring"), "true");
    }

    public static final boolean x(int i) {
        return i == 2;
    }

    public static final String y(Context context, boolean z) {
        if (z) {
            return context.getString(2131958903);
        }
        return null;
    }

    public static final void z(ohd ohdVar, lnm lnmVar, boolean z) {
        Object objS = ohdVar.s();
        Throwable thD = ohdVar.d(objS);
        Object m231Var = thD != null ? new m231(thD) : ohdVar.e(objS);
        if (!z) {
            lnmVar.resumeWith(m231Var);
            return;
        }
        vfu vfuVar = (vfu) lnmVar;
        onm onmVar = vfuVar.e;
        Object obj = vfuVar.g;
        o8n context = onmVar.getContext();
        Object objW = flo1.w(context, obj);
        fhh1 fhh1VarU = objW != flo1.a ? ulo1.u(onmVar, context, objW) : null;
        try {
            onmVar.resumeWith(m231Var);
        } finally {
            if (fhh1VarU == null || fhh1VarU.C0()) {
                flo1.p(context, objW);
            }
        }
    }
}
