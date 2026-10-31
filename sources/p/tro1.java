package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class tro1 {
    public static b180 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object A(qto0 qto0Var, hvp0 hvp0Var, onm onmVar) {
        sbf sbfVar;
        qto0 qto0Var2;
        if (onmVar instanceof sbf) {
            sbfVar = (sbf) onmVar;
            int i = sbfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbfVar.c = i - Integer.MIN_VALUE;
            } else {
                sbfVar = new sbf(onmVar);
            }
        } else {
            sbfVar = new sbf(onmVar);
        }
        Object objO = sbfVar.b;
        int i2 = sbfVar.c;
        if (i2 == 0) {
            hm5.M(objO);
            String str = qto0Var.i;
            if (str == null) {
                return qto0Var.c;
            }
            sxa sxaVar = new sxa(hvp0Var, str, qto0Var, (lnm) null, (byte) 29);
            sbfVar.a = qto0Var;
            sbfVar.c = 1;
            objO = rc2.O(5000L, sxaVar, sbfVar);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
            qto0Var2 = qto0Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qto0Var2 = sbfVar.a;
            hm5.M(objO);
        }
        String str2 = (String) objO;
        if (str2 == null) {
            return qto0Var2.c;
        }
        ujo0 ujo0Var = qto0Var2.c;
        return new ujo0(ujo0Var.a, str2, ujo0Var.c);
    }

    public static final String B(uqo uqoVar, b0k b0kVar, int i) {
        String strU = zmo1.u(uqoVar.a, uqoVar.b, b0kVar);
        strU.getClass();
        return strU;
    }

    public static final w281 C(i7e0 i7e0Var) {
        if (i7e0Var instanceof k8e0) {
            return ((k8e0) i7e0Var).l.a(w281.class);
        }
        return null;
    }

    public static final String D(k8e0 k8e0Var) {
        zc8 zc8VarA = k8e0Var.l.a(zc8.class);
        String str = zc8VarA != null ? zc8VarA.b : null;
        return str == null ? "" : str;
    }

    public static final fh90 E(k8e0 k8e0Var) {
        String strA;
        String str;
        tu00 tu00Var = k8e0Var.l;
        String strD = D(k8e0Var);
        String str2 = k8e0Var.c;
        String str3 = str2 == null ? "" : str2;
        va81 va81VarA = tu00Var.a(va81.class);
        String str4 = va81VarA != null ? va81VarA.c : null;
        if (str4 == null) {
            str4 = "";
        }
        w281 w281VarA = tu00Var.a(w281.class);
        if (w281VarA == null) {
            w281VarA = new w281((e6p1) null, (k281) null, false, (ArrayList) null, (ArrayList) null, (u281) null, (q281) null, (t281) null, (byte[]) null, (r281) null, false, 4095);
        }
        den denVarA = tu00Var.a(den.class);
        if (denVarA == null || (str = denVarA.a) == null) {
            va81 va81VarA2 = tu00Var.a(va81.class);
            strA = va81VarA2 != null ? va81VarA2.g.a(zdn.a) : null;
            if (strA == null) {
                strA = "";
            }
        } else {
            strA = str;
        }
        return new fh90(str4, strA, strD, str3, w281VarA);
    }

    public static final void a(String str, String str2, boolean z, String str3, qim0 qim0Var, Function0 function0, j2i j2iVar, j2i j2iVar2, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1335829305);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.g(str3) ? 2048 : 1024) | 24576 | (x340Var2.i(function0) ? 131072 : 65536);
        if (x340Var2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var3);
            hzj.A.getClass();
            xu30 xu30VarR = null;
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
            String strO0 = cwl1.o0(x340Var2, 2131951660);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 16.0f, 2), cbx.d(x340Var2).e, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27);
            gbx gbxVar = new gbx(z50.c, function0);
            if (z || str2 != null) {
                x340Var2.i0(-563027436);
                xu30VarR = apo.r(-846294882, new o3(z, j2iVar2, str2, (byte) 0), x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-562283591);
                x340Var2.r(false);
            }
            jto1.b(null, uvxVar, null, false, null, null, gbxVar, null, null, apo.r(-141524328, new p3(str3, (byte) 0), x340Var2), null, xu30VarR, apo.r(-405793322, new rv71(j2iVar, (byte) 1), x340Var2), null, null, apo.r(-1130885261, new p3(str, (byte) 1), x340Var2), x340Var2, 805306432, 196992, 26045);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(str, str2, z, str3, qim0Var2, function0, j2iVar, j2iVar2, i);
        }
    }

    public static final void b(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        vu30 vu30Var;
        vu30 vu30Var2;
        llj lljVar;
        Function0 function1;
        int i2;
        qim0 qim0Var3;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(767283227);
        j06 j06Var = ((x340) b0kVar2).a;
        int i3 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | 384;
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            yux yuxVar = cbx.b(b0kVar2).e;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarY = uyn1.y(bin.x(u291.f(qim0Var4, 1.0f), false, null, null, null, function0, 15), yuxVar.b, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            Function0 function2 = hmb0.t1;
            if (z) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, vu30Var4);
            if (str != null) {
                b0kVar2.i0(811765706);
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                qim0Var3 = qim0Var4;
                lljVar = lljVar3;
                function1 = function2;
                ni7 ni7VarA = oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 131070);
                b0kVar2 = b0kVar2;
                zov0 zov0Var = cbx.b(b0kVar2).g;
                qim0 qim0VarR = u291.r(qim0Var3, 48.0f);
                cua cuaVar = cbx.b(b0kVar2).f;
                cwl1.f(ni7VarA, (String) null, i1p1.q(qim0VarR, er31.b(4.0f)), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, b0kVar2, 48, 104);
                i2 = 0;
                b0kVar2.r(false);
            } else {
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                lljVar = lljVar3;
                function1 = function2;
                i2 = 0;
                qim0Var3 = qim0Var4;
                b0kVar2.i0(812097251);
                b0kVar2.r(false);
            }
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, new wnb0(1.0f, true));
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, i2);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarZ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar2);
            nko1.H(xos0VarM2, b0kVar2, vu30Var);
            x0d.q(iHashCode2, b0kVar2, lljVar, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, vu30Var2);
            Function0 function3 = function1;
            vu30 vu30Var5 = vu30Var;
            llj lljVar4 = lljVar;
            vu30 vu30Var6 = vu30Var2;
            uwo1.e(cwl1.o0(b0kVar2, 2131955649), null, cbx.d(b0kVar2).g, 0L, null, null, 0, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1786);
            uwo1.e(cwl1.o0(b0kVar2, 2131955650), null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1778);
            b0kVar2.r(true);
            mta mtaVar = cbx.b(b0kVar2).d;
            qim0 qim0VarF = dug.f(i1p1.q(u291.r(qim0Var3, 32.0f), er31.a), cbx.a(b0kVar2).b.c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarF);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function3);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar2);
            nko1.H(xos0VarM3, b0kVar2, vu30Var5);
            x0d.q(iHashCode3, b0kVar2, lljVar4, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, vu30Var6);
            xpx xpxVar = xpx.c;
            jsl jslVar = new jsl(cwl1.o0(b0kVar2, 2131955649));
            long j = u7h.b;
            zov0 zov0Var2 = cbx.b(b0kVar2).g;
            w0h1.a(xpxVar, jslVar, u291.r(qim0Var3, 16.0f), j, 0L, false, b0kVar2, xpx.d, 48);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void c(qim0 qim0Var, qim0 qim0Var2, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var3;
        boolean z;
        qim0 qim0Var4;
        h311 h311VarV;
        qim0 qim0Var5;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1755468924);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                qim0Var3 = qim0Var2;
                i3 |= x340Var.i(qim0Var3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (x340Var.i(j2iVar)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i5 != 0) {
                    qim0Var5 = nim0.a;
                } else {
                    qim0Var5 = qim0Var3;
                }
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarB = u291.b(0.0f, 50.0f, 1, dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), cbx.a(x340Var).a.b.a(), d4o1.a).then(qim0Var5));
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB2 = uyn1.B(qim0VarB, 8.0f, 0.0f, 16.0f, 0.0f, 10);
                jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                j2iVar.invoke(pw31.a, x340Var, Integer.valueOf(((i3 >> 3) & 112) | 6));
                x340Var.r(true);
                qim0Var4 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var4 = qim0Var3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1(qim0Var, (Object) qim0Var4, j2iVar, i, i2, (byte) 18);
            }
        }
        i3 |= 48;
        qim0Var3 = qim0Var2;
        if ((i & 384) == 0) {
            if (x340Var.i(j2iVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i5 != 0) {
                qim0Var5 = nim0.a;
            } else {
                qim0Var5 = qim0Var3;
            }
            qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
            uwr uwrVar2 = cbx.a;
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarB3 = u291.b(0.0f, 50.0f, 1, dug.f(i1p1.q(qim0VarF2, er31.b(16.0f)), cbx.a(x340Var).a.b.a(), d4o1.a).then(qim0Var5));
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarB4 = uyn1.B(qim0VarB3, 8.0f, 0.0f, 16.0f, 0.0f, 10);
            jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar.invoke(pw31.a, x340Var, Integer.valueOf(((i3 >> 3) & 112) | 6));
            x340Var.r(true);
            qim0Var4 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var4 = qim0Var3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(qim0Var, (Object) qim0Var4, j2iVar, i, i2, (byte) 18);
        }
    }

    public static final void d(vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1972856217);
        int i2 = i | (x340Var.i(vu30Var) ? 4 : 2) | (x340Var.i(vu30Var2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fra fraVar = een.N0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarJ = u291.j(24.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarJ);
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
            if (vu30Var == null) {
                x340Var.i0(-917289226);
                x340Var.r(false);
            } else {
                x340Var.i0(-2107799957);
                us71.j(i2 & 14, vu30Var, x340Var, false);
            }
            String strO0 = cwl1.o0(x340Var, 2131958591);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = ((yex) zex.a.d).g;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.z(2.0f, 0.0f, 2, qim0Var3), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            if (vu30Var2 == null) {
                x340Var.i0(-916997578);
                x340Var.r(false);
            } else {
                x340Var.i0(-2107790549);
                us71.j((i2 >> 3) & 14, vu30Var2, x340Var, false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new won(vu30Var, vu30Var2, qim0Var2, i, (byte) 1);
        }
    }

    public static final void e(long j, j2i j2iVar, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-283859295);
        int i3 = (((i2 & 1) == 0 && x340Var.f(j)) ? 4 : 2) | i;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                int i4 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                j = u7h.j;
            }
            x340Var.s();
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, nim0.a);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarF = dug.f(i1p1.q(u291.r(qim0VarZ, 32.0f), er31.a), j, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        long j2 = j;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qms0(j2, j2iVar, i, i2);
        }
    }

    public static final void f(r281 r281Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        String str = r281Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-421196630);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(r281Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function0;
            i2 |= x340Var.i(function2) ? 32 : 16;
        } else {
            function2 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str2 = r281Var.a;
            uwr uwrVar = cbx.a;
            int i3 = i2;
            uwo1.e(str2, null, cbx.d(x340Var).c, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            StringBuilder sb = new StringBuilder(r281Var.b);
            if (str.length() > 0) {
                sb.append("\n\n");
                sb.append(str);
            }
            uwo1.e(sb.toString(), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            xto1.n((i3 << 6) & 7168, 4, r281Var.d, function2, x340Var, u291.D(nim0Var, (era) null, 3), false);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            String str3 = r281Var.e;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(nim0Var, 6.0f, 16.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            uwo1.e(str3, bin.v(qim0VarY, (idn0) objT, null, false, null, null, function1, 28), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(r281Var, function0, function1, i, (byte) 20);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(tms0 tms0Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-844349649);
        int i2 = (x340Var.g(tms0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (tms0Var.equals(rms0.a)) {
            x340Var.i0(328813870);
            i(((i2 >> 6) & 112) | ((i2 >> 3) & 14), function0, x340Var, qim0Var);
            x340Var.r(false);
        } else {
            if (!(tms0Var instanceof sms0)) {
                throw p3d1.k(x340Var, 328812020, false);
            }
            x340Var.i0(328817751);
            l((i2 >> 3) & 1008, ((sms0) tms0Var).a, function1, x340Var, qim0Var);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, tms0Var, function0, function1, qim0Var, (byte) 15);
        }
    }

    public static final void h(lgu0 lgu0Var, String str, String str2, String str3, String str4, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(335674579);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(lgu0Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.g(str4) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (i2 & 599187) != 599186)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            yux yuxVar = cbx.b(x340Var).e;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarY = uyn1.y(bin.x(u291.f(qim0Var3, 1.0f), false, null, null, null, function0, 15), yuxVar.b, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            otw.c(lgu0Var, new jgu0(str, str2), (qim0) null, (ipb1) null, x340Var, i2 & 14, 12);
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, new wnb0(1.0f, true));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(str3, null, cbx.d(x340Var).g, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var, (i2 >> 9) & 14, 0, 1786);
            uwo1.e(str4, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, (i2 >> 12) & 14, 0, 1778);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0(lgu0Var, str, str2, str3, str4, function0, qim0Var2, i);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        Function0 function1;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-262746436);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131959716);
            function1 = function0;
            qim0Var2 = qim0Var;
            c(qim0Var2, bin.x(nim0.a, false, strO0, new pm31(0), null, function1, 9), apo.r(374087836, new qdg0(strO0, (byte) 25), x340Var), x340Var, ((i2 >> 3) & 14) | 384, 0);
        } else {
            function1 = function0;
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function1, qim0Var2, i, (byte) 17);
        }
    }

    public static final void j(dc8 dc8Var, String str, List list, lgu0 lgu0Var, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2109516143);
        int i2 = i | (x340Var.g(dc8Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(list) ? 256 : 128) | (x340Var.g(lgu0Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x74.f(function0, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(1340369010, new n2y0(dc8Var, str, list, lgu0Var, iu30Var), x340Var), x340Var, ((i2 >> 15) & 14) | 12607488, 48, 1902);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(dc8Var, str, list, lgu0Var, iu30Var, function0, i);
        }
    }

    public static final void k(c380 c380Var, irp irpVar, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1120539342);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.g(irpVar) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            hab1 hab1Var = new hab1();
            float f = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).fontScale;
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.i0(-1559286498);
            uwr uwrVar = cbx.a;
            long j = cbx.d(x340Var).g.a.b;
            fc11.o(j);
            float fY = watVar.y(fc11.Y(TextUnit.c(j) * f, 1095216660480L & j));
            x340Var.r(false);
            cvx cvxVar = cbx.b(x340Var).b;
            zov0 zov0Var = cbx.b(x340Var).g;
            mta mtaVar = cbx.b(x340Var).d;
            float f2 = pap1.y(new p3v(48.0f), pap1.y(new p3v(16.0f), new p3v(fY + 24.0f))).a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(qim0Var3, (f2 * 2.0f) + 12.0f + 16.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            cvx cvxVar6 = cbx.b(x340Var).b;
            cvx cvxVar7 = cbx.b(x340Var).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            boolean zI = ((i2 & 112) == 32) | x340Var.i(c380Var) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new rsc1(c380Var, irpVar, vu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            boo1.e(hab1Var, qim0VarH, null, zzq0Var, d36Var, 12.0f, null, false, null, (iu30) objT, x340Var, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, c380Var, irpVar, vu30Var, qim0Var2, (byte) 25);
        }
    }

    public static final void l(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2057666026);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        byte b = 1;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            c(qim0Var, null, apo.r(1050341322, new dp30(str, cwl1.o0(x340Var, 2131959715), function0, b), x340Var), x340Var, ((i2 >> 6) & 14) | 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, function0, qim0Var, i, (byte) 10);
        }
    }

    public static final am1 m(i7e0 i7e0Var, String str) {
        if (i7e0Var instanceof k8e0) {
            k8e0 k8e0Var = (k8e0) i7e0Var;
            Boolean bool = k8e0Var.g;
            if (bool != null) {
                return new am1(2, k8e0Var.c, (String) null, str, s(i7e0Var), bool.booleanValue());
            }
        } else if (!(i7e0Var instanceof jae0)) {
            eg.o();
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Code duplicated, block: B:43:0x0136 A[Catch: Exception -> 0x013f, TRY_LEAVE, TryCatch #0 {Exception -> 0x013f, blocks: (B:41:0x0132, B:43:0x0136), top: B:70:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:48:0x0147  */
    /* JADX WARN: Code duplicated, block: B:52:0x015a A[Catch: Exception -> 0x0163, TRY_LEAVE, TryCatch #1 {Exception -> 0x0163, blocks: (B:50:0x0156, B:52:0x015a), top: B:72:0x0156 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:56:0x0166  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object n(nbc nbcVar, dc31 dc31Var, Context context, gb9 gb9Var, String str, onm onmVar) {
        rbf rbfVar;
        Bitmap bitmap;
        String str2;
        int iX;
        int iX2;
        plm plmVar;
        String str3;
        Integer numValueOf;
        int iO;
        String str4;
        Integer numValueOf2;
        int iO2;
        Drawable drawable;
        Drawable drawableMutate;
        String string;
        String string2;
        if (onmVar instanceof rbf) {
            rbfVar = (rbf) onmVar;
            int i = rbfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbfVar.f = i - Integer.MIN_VALUE;
            } else {
                rbfVar = new rbf(onmVar);
            }
        } else {
            rbfVar = new rbf(onmVar);
        }
        Object objG = rbfVar.e;
        int i2 = rbfVar.f;
        InsetDrawable insetDrawable = null;
        insetDrawable = null;
        if (i2 == 0) {
            hm5.M(objG);
            if (gb9Var == null || (str2 = gb9Var.a) == null) {
                bitmap = null;
            } else {
                rbfVar.a = nbcVar;
                rbfVar.b = context;
                rbfVar.c = gb9Var;
                rbfVar.d = str;
                rbfVar.f = 1;
                objG = dc31Var.g(str2, rbfVar);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            }
            if (bitmap == null) {
                return bitmap;
            }
            if (str != null) {
                char cCharAt = str.charAt(0);
                if (gb9Var != null) {
                    string = gb9Var.b;
                } else {
                    string = null;
                }
                string2 = gb9Var != null ? gb9Var.c : null;
                int dimension = (int) context.getResources().getDimension(2131165489);
                int dimension2 = (int) context.getResources().getDimension(2131165488);
                nbcVar.getClass();
                int iX3 = (int) o0c.x(context, dimension);
                int iX4 = (int) o0c.x(context, dimension2);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iX3, iX3, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (string == null) {
                    string = context.getResources().getString(2131953657);
                }
                if (string2 == null) {
                    string2 = context.getResources().getString(2131953658);
                }
                canvas.drawColor(Color.parseColor(string));
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setHinting(1);
                paint.setColor(Color.parseColor(string2));
                paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(iX4);
                paint.setTextScaleX(1.0f);
                String upperCase = String.valueOf(cCharAt).toUpperCase(Locale.ROOT);
                Rect rect = new Rect();
                paint.getTextBounds(upperCase, 0, upperCase.length(), rect);
                canvas.drawText(upperCase, canvas.getWidth() / 2.0f, (canvas.getHeight() / 2.0f) - ((rect.top + rect.bottom) / 2.0f), paint);
                return bitmapCreateBitmap;
            }
            nbcVar.getClass();
            iX = (int) o0c.x(context, 108);
            iX2 = (iX - ((int) o0c.x(context, 36))) / 2;
            plmVar = new plm(context, 2132018135);
            if (gb9Var != null) {
                try {
                    str3 = gb9Var.c;
                    if (str3 != null) {
                        numValueOf = Integer.valueOf(Color.parseColor(str3));
                    } else {
                        numValueOf = null;
                    }
                } catch (Exception unused) {
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iO = numValueOf.intValue();
            } else {
                iO = ago1.o(plmVar, 2130968791, Color.parseColor("#B3B3B3"));
            }
            if (gb9Var != null) {
                try {
                    str4 = gb9Var.b;
                    if (str4 != null) {
                        numValueOf2 = Integer.valueOf(Color.parseColor(str4));
                    } else {
                        numValueOf2 = null;
                    }
                } catch (Exception unused2) {
                }
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                iO2 = numValueOf2.intValue();
            } else {
                iO2 = ago1.o(plmVar, 2130968770, Color.parseColor("#2A2A2A"));
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.setIntrinsicWidth(iX);
            shapeDrawable.setIntrinsicHeight(iX);
            shapeDrawable.getPaint().setColor(iO2);
            drawable = context.getDrawable(2131231940);
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                drawableMutate.setTint(iO);
                drawableMutate.setBounds(0, 0, iX, iX);
                insetDrawable = new InsetDrawable(drawableMutate, iX2);
            }
            return insetDrawable != null ? mno1.z(new LayerDrawable(new Drawable[]{shapeDrawable, insetDrawable}), 0, 0, 7) : Bitmap.createBitmap(iX, iX, Bitmap.Config.ARGB_8888);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = rbfVar.d;
        gb9 gb9Var2 = rbfVar.c;
        context = rbfVar.b;
        nbc nbcVar2 = rbfVar.a;
        hm5.M(objG);
        gb9Var = gb9Var2;
        nbcVar = nbcVar2;
        bitmap = (Bitmap) objG;
        if (bitmap == null) {
            return bitmap;
        }
        if (str != null) {
            char cCharAt2 = str.charAt(0);
            if (gb9Var != null) {
                string = gb9Var.b;
            } else {
                string = null;
            }
            if (gb9Var != null) {
            }
            int dimension3 = (int) context.getResources().getDimension(2131165489);
            int dimension4 = (int) context.getResources().getDimension(2131165488);
            nbcVar.getClass();
            int iX5 = (int) o0c.x(context, dimension3);
            int iX6 = (int) o0c.x(context, dimension4);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iX5, iX5, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            if (string == null) {
                string = context.getResources().getString(2131953657);
            }
            if (string2 == null) {
                string2 = context.getResources().getString(2131953658);
            }
            canvas2.drawColor(Color.parseColor(string));
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setHinting(1);
            paint2.setColor(Color.parseColor(string2));
            paint2.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setTextSize(iX6);
            paint2.setTextScaleX(1.0f);
            String upperCase2 = String.valueOf(cCharAt2).toUpperCase(Locale.ROOT);
            Rect rect2 = new Rect();
            paint2.getTextBounds(upperCase2, 0, upperCase2.length(), rect2);
            canvas2.drawText(upperCase2, canvas2.getWidth() / 2.0f, (canvas2.getHeight() / 2.0f) - ((rect2.top + rect2.bottom) / 2.0f), paint2);
            return bitmapCreateBitmap2;
        }
        nbcVar.getClass();
        iX = (int) o0c.x(context, 108);
        iX2 = (iX - ((int) o0c.x(context, 36))) / 2;
        plmVar = new plm(context, 2132018135);
        if (gb9Var != null) {
            str3 = gb9Var.c;
            if (str3 != null) {
                numValueOf = Integer.valueOf(Color.parseColor(str3));
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iO = numValueOf.intValue();
        } else {
            iO = ago1.o(plmVar, 2130968791, Color.parseColor("#B3B3B3"));
        }
        if (gb9Var != null) {
            str4 = gb9Var.b;
            if (str4 != null) {
                numValueOf2 = Integer.valueOf(Color.parseColor(str4));
            } else {
                numValueOf2 = null;
            }
        } else {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            iO2 = numValueOf2.intValue();
        } else {
            iO2 = ago1.o(plmVar, 2130968770, Color.parseColor("#2A2A2A"));
        }
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        shapeDrawable2.setIntrinsicWidth(iX);
        shapeDrawable2.setIntrinsicHeight(iX);
        shapeDrawable2.getPaint().setColor(iO2);
        drawable = context.getDrawable(2131231940);
        if (drawable != null) {
            drawableMutate.setTint(iO);
            drawableMutate.setBounds(0, 0, iX, iX);
            insetDrawable = new InsetDrawable(drawableMutate, iX2);
        }
        if (insetDrawable != null) {
        }
    }

    public static final if5 o(uqo uqoVar) {
        return new if5(uqoVar.c, (String) null, uqoVar.d, (hf5) null, 8);
    }

    public static final y2m0 p(coi1 coi1Var) {
        if (coi1Var instanceof aoi1) {
            return y2m0.d;
        }
        if (coi1Var instanceof boi1) {
            return y2m0.f;
        }
        if (coi1Var instanceof zni1) {
            return y2m0.e;
        }
        if (coi1Var instanceof xni1) {
            return y2m0.b;
        }
        if (coi1Var instanceof yni1) {
            return y2m0.c;
        }
        eg.o();
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String q(sq61 sq61Var, x340 x340Var, int i) throws NoWhenBranchMatchedException {
        if (sq61Var instanceof jgb1) {
            x340Var.i0(105033396);
            jgb1 jgb1Var = (jgb1) sq61Var;
            String strU = zmo1.u(jgb1Var.c, jgb1Var.d, x340Var);
            x340Var.r(false);
            return strU;
        }
        if (!(sq61Var instanceof vqo)) {
            throw p3d1.k(x340Var, 105032070, false);
        }
        x340Var.i0(105035476);
        uqo uqoVar = ((vqo) sq61Var).b;
        String strU2 = zmo1.u(uqoVar.a, uqoVar.b, x340Var);
        x340Var.r(false);
        return strU2;
    }

    public static final go80 r(klm klmVar, y52 y52Var, vcp0 vcp0Var, vcp0 vcp0Var2, vcp0 vcp0Var3, vcp0 vcp0Var4, rbp0 rbp0Var, vcp0 vcp0Var5, vcp0 vcp0Var6, vcp0 vcp0Var7, rbp0 rbp0Var2, rbp0 rbp0Var3, rbp0 rbp0Var4, vcp0 vcp0Var8, rbp0 rbp0Var5, rbp0 rbp0Var6, vcp0 vcp0Var9, vcp0 vcp0Var10) {
        return klmVar.a("AudioFocusDaemon", new qap0(y52Var, vcp0Var, vcp0Var2, vcp0Var3, vcp0Var4, rbp0Var, vcp0Var5, vcp0Var6, vcp0Var7, rbp0Var2, rbp0Var3, rbp0Var4, vcp0Var8, rbp0Var5, rbp0Var6, vcp0Var9, vcp0Var10));
    }

    public static final boolean s(i7e0 i7e0Var) {
        att0 att0Var = i7e0Var instanceof k8e0 ? (att0) ((k8e0) i7e0Var).l.a(att0.class) : null;
        return att0Var != null && att0Var.a;
    }

    public static final int t(boolean z) {
        if (z) {
            return 2131964140;
        }
        if (!z) {
            return 2131964141;
        }
        eg.o();
        return 0;
    }

    public static final Object u(tp60 tp60Var, kq60 kq60Var, aq60 aq60Var, Function0 function0) {
        fq60 fq60VarD = tp60Var.d(kq60Var);
        try {
            return function0.invoke();
        } finally {
            tp60Var.b(fq60VarD, aq60Var);
        }
    }

    public static final Object v(tp60 tp60Var, vt1 vt1Var) {
        kq60 kq60Var = kq60.h;
        tp60Var.g(kq60Var);
        try {
            return vt1Var.invoke();
        } finally {
            tp60Var.p(kq60Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object w(tp60 tp60Var, kq60 kq60Var, iu30 iu30Var, onm onmVar) {
        jq60 jq60Var;
        if (onmVar instanceof jq60) {
            jq60Var = (jq60) onmVar;
            int i = jq60Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jq60Var.d = i - Integer.MIN_VALUE;
            } else {
                jq60Var = new jq60(onmVar);
            }
        } else {
            jq60Var = new jq60(onmVar);
        }
        Object objInvoke = jq60Var.c;
        int i2 = jq60Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                tp60Var.g(kq60Var);
                jq60Var.a = tp60Var;
                jq60Var.b = kq60Var;
                jq60Var.d = 1;
                objInvoke = iu30Var.invoke(jq60Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kq60Var = jq60Var.b;
                tp60Var = jq60Var.a;
                hm5.M(objInvoke);
            }
            tp60Var.p(kq60Var);
            return objInvoke;
        } catch (Throwable th) {
            tp60Var.p(kq60Var);
            throw th;
        }
    }

    public static final pft0 x(dob1 dob1Var) {
        k8e0 k8e0Var = dob1Var.a;
        int i = dob1Var.d;
        if (i == 1) {
            return oft0.a;
        }
        if (i == 2) {
            return new nft0(2);
        }
        if (C(k8e0Var) == null) {
            return new mft0(1);
        }
        if (dob1Var.c) {
            return new nft0(1);
        }
        w281 w281VarC = C(k8e0Var);
        if ((w281VarC != null ? w281VarC.a : null) instanceof o281) {
            return new nft0(3);
        }
        att0 att0Var = k8e0Var instanceof k8e0 ? (att0) k8e0Var.l.a(att0.class) : null;
        if (att0Var == null || !att0Var.a) {
            return new mft0(1);
        }
        w281 w281VarC2 = C(k8e0Var);
        return (w281VarC2 == null || !(w281VarC2.c ^ true)) ? new nft0(2) : new mft0(2);
    }

    public static final c1x0 y(i7e0 i7e0Var) {
        if (!(i7e0Var instanceof k8e0)) {
            if (i7e0Var instanceof jae0) {
                return null;
            }
            eg.o();
            return null;
        }
        k8e0 k8e0Var = (k8e0) i7e0Var;
        x4i1 x4i1Var = k8e0Var.e;
        if (x4i1Var != null) {
            return new c1x0(k8e0Var.c, x4i1Var, s(i7e0Var));
        }
        return null;
    }

    public static fjx z(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onz0.a, i, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return new fjx(z);
    }
}
