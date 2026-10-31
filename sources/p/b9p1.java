package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class b9p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(String str, zl80 zl80Var, vl80 vl80Var, vu30 vu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1946108352);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(zl80Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(vl80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(vu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            ven0 ven0VarM = k1u.m(idn0Var, x340Var, 0);
            float f = ((Boolean) ven0VarM.getValue()).booleanValue() ? 0.9f : 1.0f;
            uwr uwrVar = cbx.a;
            long j = cbx.c(x340Var).b.c;
            ngv ngvVar = ngv.d;
            tob1 tob1VarB = z95.b(f, irn1.o0(jfv.t(j, ngvVar), 0, ((jhx) cbx.c(x340Var).a.d).a, 2), "scale", (iu30) null, x340Var, 3072, 20);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.97f : 1.0f, irn1.o0(jfv.t(cbx.c(x340Var).b.c, ngvVar), 0, ((jhx) cbx.c(x340Var).a.d).a, 2), "alpha", (iu30) null, x340Var, 3072, 20);
            String strO0 = cwl1.o0(x340Var, zl80Var == zl80.a ? 2131963624 : 2131963599);
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new xvy(vu30Var, zl80Var, vl80Var, (byte) 24);
                x340Var.s0(objT2);
            }
            qim0 qim0VarV = bin.v(qim0Var, idn0Var, null, false, strO0, null, (Function0) objT2, 20);
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            qim0 qim0VarK = d9y0.k(fj30.F(qim0VarV, fFloatValue, fFloatValue), ((Number) tob1VarB2.getValue()).floatValue());
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = td80.S0;
                x340Var.s0(objT3);
            }
            qim0 qim0VarN = anm1.N(str, s161.b(qim0VarK, false, (iu30) objT3));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            dv20.l((i2 >> 15) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(str, zl80Var, vl80Var, vu30Var, qim0Var, j2iVar, i);
        }
    }

    public static final void b(hux huxVar, String str, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(63115230);
        int i4 = i | ((i & 8) == 0 ? b0kVar2.g(huxVar) : b0kVar2.i(huxVar) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (b0kVar2.i(qim0Var2) ? 256 : 128);
        }
        int i6 = i3;
        if (b0kVar2.Y(i6 & 1, (i6 & 147) != 146)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0Var5 = i5 != 0 ? qim0Var4 : qim0Var2;
            qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            w0h1.a(huxVar, isl.a, (qim0) null, 0L, 0L, false, b0kVar2, 56 | (i6 & 14), 60);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            lee1 lee1Var = ktd.l(qim0Var4, 12.0f, b0kVar2, b0kVar2).j;
            b0kVar2 = b0kVar2;
            uwo1.e(str, u291.f(qim0Var4, 1.0f), lee1Var, 0L, null, null, 0, false, null, 0, null, b0kVar2, (i6 >> 3) & 14, 0, 2040);
            b0kVar2.r(true);
            qim0Var3 = qim0Var5;
        } else {
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ika((byte) 0, i, i2, huxVar, str, qim0Var3);
        }
    }

    public static final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(11590240);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131952892);
            String strN0 = cwl1.n0(2131952877, new Object[]{strO0}, x340Var);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).k;
            StringBuilder sb = new StringBuilder(16);
            ArrayList arrayListM = xvj1.m();
            new ArrayList();
            sb.append(strN0);
            int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
            zma1 zma1Var = lee1Var.a;
            arrayListM.add(new xe5(iW0, strO0.length() + iW0, 8, new zma1(0L, 0L, zma1Var.c, zma1Var.d, (FontSynthesis) null, zma1Var.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65491), (String) null));
            String string = sb.toString();
            ArrayList arrayList = new ArrayList(arrayListM.size());
            int size = arrayListM.size();
            for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
            }
            uwo1.d(new af5(string, arrayList), cbx.a(x340Var).b.b, null, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4084);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 8);
        }
    }

    public static final void d(hux huxVar, String str, b0k b0kVar, int i) {
        hux huxVar2;
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(881423963);
        int i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            huxVar2 = huxVar;
            str2 = str;
            b(huxVar2, str2, uyn1.z(0.0f, 8.0f, 1, nim0.a), x340Var, (i2 & 14) | 8 | (i2 & 112), 0);
        } else {
            huxVar2 = huxVar;
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new grc(huxVar2, str2, i, (byte) 7);
        }
    }

    public static final void e(adj1 adj1Var, Function0 function0, qim0 qim0Var, int i, b0k b0kVar, int i2, int i3) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2046395941);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var.g(adj1Var) : x340Var.i(adj1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(function0) ? 32 : 16;
        }
        int i5 = i4 | 384;
        int i6 = i3 & 8;
        if (i6 != 0) {
            i5 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            i5 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024;
        }
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            if (i6 != 0) {
                i = 1;
            }
            gfx.b(18, apo.r(-739385126, new say(i, adj1Var, function0), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        int i7 = i;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new za30(adj1Var, function0, qim0Var2, i7, i2, i3);
        }
    }

    public static final void f(vl80 vl80Var, b0k b0kVar, int i) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1435711012);
        int i2 = i | (x340Var.g(vl80Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            String str = vl80Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).g, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1722);
            String str2 = vl80Var.b;
            if (str2 == null || ihc1.y0(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                x340Var.i0(1326901977);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(1326901978);
                z = true;
                uwo1.e(str2, null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jb50(vl80Var, i, (byte) 25);
        }
    }

    public static final void g(zl80 zl80Var, wl80 wl80Var, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2015878701);
        int i2 = i | (x340Var.e(zl80Var.ordinal()) ? 4 : 2) | (x340Var.g(wl80Var) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | (x340Var.i(vu30Var2) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarD = sgc1.D(1, qim0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            int i3 = wl80Var.a;
            vl80 vl80Var = wl80Var.c;
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            int i4 = i2 << 3;
            int i5 = (i4 & 112) | 3072;
            h(i3, zl80Var, vl80Var, "lowest-highlight-tag", vu30Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, x340Var, i5 | ((i2 << 6) & 57344), 64);
            hr80.h(0, cbx.a(x340Var).d.b, x340Var, (qim0) null);
            int i6 = wl80Var.b;
            vl80 vl80Var2 = wl80Var.d;
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            h(i6, zl80Var, vl80Var2, "highest-highlight-tag", vu30Var2, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), Integer.valueOf(wl80Var.e), x340Var, i5 | (i4 & 57344), 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 13, i, (Object) zl80Var, (Object) wl80Var, (Object) vu30Var, (Object) vu30Var2, (Object) qim0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void h(int i, zl80 zl80Var, vl80 vl80Var, String str, vu30 vu30Var, qim0 qim0Var, Integer num, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        Integer num2;
        boolean z;
        h311 h311VarV;
        Integer num3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1965573474);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.e(zl80Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.g(vl80Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.g(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var.i(vu30Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            qim0Var2 = qim0Var;
            i4 |= x340Var.i(qim0Var2) ? 131072 : 65536;
        } else {
            qim0Var2 = qim0Var;
        }
        int i5 = i3 & 64;
        if (i5 == 0) {
            if ((1572864 & i2) == 0) {
                num2 = num;
                i4 |= x340Var.g(num2) ? 1048576 : 524288;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                int i6 = 196608 | ((i4 >> 9) & 14) | (i4 & 112) | (i4 & 896);
                int i7 = i4 >> 3;
                a(str, zl80Var, vl80Var, vu30Var, qim0Var2, apo.r(-1742659891, new ri60(i, num3, vl80Var, zl80Var), x340Var), x340Var, i6 | (i7 & 7168) | (i7 & 57344));
                num2 = num3;
            } else {
                x340Var.b0();
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ns7(i, zl80Var, vl80Var, str, vu30Var, qim0Var, num2, i2, i3);
            }
        }
        i4 |= 1572864;
        num2 = num;
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i5 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            int i8 = 196608 | ((i4 >> 9) & 14) | (i4 & 112) | (i4 & 896);
            int i9 = i4 >> 3;
            a(str, zl80Var, vl80Var, vu30Var, qim0Var2, apo.r(-1742659891, new ri60(i, num3, vl80Var, zl80Var), x340Var), x340Var, i8 | (i9 & 7168) | (i9 & 57344));
            num2 = num3;
        } else {
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns7(i, zl80Var, vl80Var, str, vu30Var, qim0Var, num2, i2, i3);
        }
    }

    public static final void i(String str, boolean z, boolean z2, boolean z3, String str2, List list, String str3, List list2, iu30 iu30Var, vu30 vu30Var, Function0 function0, Function0 function1, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2029835129);
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.h(z3) ? 2048 : 1024) | (x340Var.g(str2) ? 16384 : 8192) | (x340Var.i(list) ? 131072 : 65536) | (x340Var.g(str3) ? 1048576 : 524288) | (x340Var.i(list2) ? 8388608 : 4194304) | (x340Var.i(iu30Var) ? 67108864 : 33554432) | (x340Var.i(vu30Var) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (x340Var.i(function0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(function1) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            nyx.a(0, (wux) null, apo.r(-1309526452, new jje0(str2, iu30Var, str, z, z2, function0, function1, z3, list2, j2iVar, str3, list, (k6a1) x340Var.k(t4k.q), (az20) x340Var.k(t4k.i), vu30Var), x340Var), x340Var, 3072, 7);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kje0(str, z, z2, z3, str2, list, str3, list2, iu30Var, vu30Var, function0, function1, qim0Var2, j2iVar, i, i2);
        }
    }

    public static final void j(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1083152515);
        if (x340Var.Y(i & 1, i != 0)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarF);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = gje0.d;
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, true, (iu30) objT2);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            cnx cnxVar = cnx.c;
            long j = cbx.a(x340Var).b.e;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = gje0.e;
                x340Var.s0(objT3);
            }
            w0h1.a(cnxVar, isl.a, new uul1(new mi31((iu30) objT3)), j, 0L, false, x340Var, cnx.d | 48, 48);
            String strO0 = cwl1.o0(x340Var, 2131952886);
            lee1 lee1Var = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.e;
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean zI = x340Var.i(hdn0Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new tu9(hdn0Var, (byte) 26);
                x340Var.s0(objT4);
            }
            qim0 qim0VarThen = wnb0Var.then(new uul1(new mi31((iu30) objT4)));
            boolean zI2 = x340Var.i(hdn0Var);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new tu9(hdn0Var, (byte) 27);
                x340Var.s0(objT5);
            }
            uwo1.e(strO0, qim0VarThen, lee1Var, j2, null, (iu30) objT5, 0, false, null, 0, null, x340Var, 0, 0, 2000);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 9);
        }
    }

    public static final void k(boolean z, boolean z2, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var;
        boolean z3;
        int i2;
        int i3;
        b0k b0kVar3;
        int i4;
        m4c m4cVar = fkj0.X;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-558395960);
        j06 j06Var = ((x340) b0kVar4).a;
        int i5 = i | (b0kVar4.h(z) ? 4 : 2) | (b0kVar4.h(z2) ? 32 : 16) | (b0kVar4.i(iu30Var) ? 256 : 128) | (b0kVar4.i(function0) ? 2048 : 1024);
        if (b0kVar4.Y(i5 & 1, (i5 & 1171) != 1170)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(b0kVar4).e.b, 0.0f, 2, qim0VarF);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar4).g, 32, qim0VarZ);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, b0kVar4, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM = b0kVar4.m();
            qim0 qim0VarE = zr7.E(b0kVar4, qim0VarP);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar4.m0();
            boolean z4 = ((x340) b0kVar4).S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                b0kVar4.l(n4kVar);
            } else {
                b0kVar4.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar4, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar4, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar4, lljVar3);
            nko1.F(b0kVar4);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar4, lljVar4);
            if (z) {
                b0kVar4.i0(-1821062922);
                cvx cvxVar = cbx.b(b0kVar4).b;
                uwo1.e(cwl1.o0(b0kVar4, 2131953534), uyn1.z(0.0f, 16.0f, 1, qim0Var2), cbx.d(b0kVar4).e, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar4, 0, 0, 2024);
                pm31 pm31Var = new pm31(1);
                boolean z5 = ((i5 & 112) == 32) | ((i5 & 896) == 256);
                Object objT = b0kVar4.T();
                if (z5 || objT == m4cVar) {
                    objT = new ag21(iu30Var, z2, (byte) 0);
                    b0kVar4.s0(objT);
                }
                qim0 qim0VarQ = dgo1.q(qim0Var2, z2, false, pm31Var, (Function0) objT, 10);
                cvx cvxVar2 = cbx.b(b0kVar4).b;
                qim0 qim0VarZ2 = uyn1.z(0.0f, 16.0f, 1, qim0VarQ);
                fra fraVar = een.N0;
                cvx cvxVar3 = cbx.b(b0kVar4).b;
                jw31 jw31VarA = ew31.a(new d36(16.0f, true, new g21(eraVar, (byte) 29)), fraVar, b0kVar4, 0);
                int iHashCode2 = Long.hashCode(((x340) b0kVar4).T);
                xos0 xos0VarM2 = b0kVar4.m();
                qim0 qim0VarE2 = zr7.E(b0kVar4, qim0VarZ2);
                b0kVar4.m0();
                if (((x340) b0kVar4).S) {
                    b0kVar4.l(n4kVar);
                } else {
                    b0kVar4.v0();
                }
                nko1.H(jw31VarA, b0kVar4, lljVar);
                nko1.H(xos0VarM2, b0kVar4, lljVar2);
                x0d.q(iHashCode2, b0kVar4, lljVar3, b0kVar4);
                uwo1.e(cwl1.o0(b0kVar4, 2131953530), kk0.q(b0kVar4, qim0VarE2, lljVar4, 1.0f, false), cbx.d(b0kVar4).g, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar4, 0, 0, 2024);
                Object objT2 = b0kVar4.T();
                if (objT2 == m4cVar) {
                    objT2 = ma21.V0;
                    b0kVar4.s0(objT2);
                }
                aex.b(z2, iu30Var, s161.a(qim0Var2, (iu30) objT2), null, 0, null, null, b0kVar4, (i5 >> 3) & 126, 120);
                b0kVar4.r(true);
                b0kVar4.r(false);
                z3 = false;
                i3 = 4;
                qim0Var = qim0Var2;
                i4 = 1;
                b0kVar3 = b0kVar4;
                i2 = i5;
            } else {
                qim0Var = qim0Var2;
                z3 = false;
                b0kVar4.i0(-1819845273);
                cvx cvxVar4 = cbx.b(b0kVar4).b;
                qim0 qim0VarZ3 = uyn1.z(0.0f, 16.0f, 1, qim0Var);
                cvx cvxVar5 = cbx.b(b0kVar4).b;
                mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, b0kVar4, 0);
                int iHashCode3 = Long.hashCode(((x340) b0kVar4).T);
                xos0 xos0VarM3 = b0kVar4.m();
                qim0 qim0VarE3 = zr7.E(b0kVar4, qim0VarZ3);
                b0kVar4.m0();
                if (((x340) b0kVar4).S) {
                    b0kVar4.l(n4kVar);
                } else {
                    b0kVar4.v0();
                }
                nko1.H(mbhVarA2, b0kVar4, lljVar);
                nko1.H(xos0VarM3, b0kVar4, lljVar2);
                x0d.q(iHashCode3, b0kVar4, lljVar3, b0kVar4);
                nko1.H(qim0VarE3, b0kVar4, lljVar4);
                i2 = i5;
                i3 = 4;
                uwo1.e(cwl1.o0(b0kVar4, 2131953534), null, cbx.d(b0kVar4).e, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar4, 0, 0, 2026);
                uwo1.e(cwl1.o0(b0kVar4, 2131953533), null, cbx.d(b0kVar4).g, cbx.a(b0kVar4).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar4, 0, 0, 2018);
                b0kVar3 = b0kVar4;
                i4 = 1;
                b0kVar3.r(true);
                b0kVar3.r(false);
            }
            cvx cvxVar6 = cbx.b(b0kVar3).b;
            qim0 qim0VarZ4 = uyn1.z(0.0f, 8.0f, i4, qim0Var);
            idx idxVar = new idx(i3);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            }
            Object objT3 = b0kVar3.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new lpx0(function0, (byte) 26);
                b0kVar3.s0(objT3);
            }
            b0k b0kVar5 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT3), idxVar, qim0VarZ4, null, null, null, null, null, mdj.a, null, mdj.b, b0kVar5, 805306368, 48, 1528);
            b0kVar2 = b0kVar5;
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar4;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(z, z2, (Object) iu30Var, (Object) function0, i, (byte) 11);
        }
    }

    public static final void l(kg0 kg0Var, cd71 cd71Var, z710 z710Var, wj81 wj81Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-47652211);
        int i2 = i | (b0kVar3.i(kg0Var) ? 4 : 2) | (b0kVar3.i(cd71Var) ? 32 : 16) | (b0kVar3.i(z710Var) ? 256 : 128) | (b0kVar3.g(wj81Var) ? 2048 : 1024);
        byte b2 = 0;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            cgj1.n((qim0) null, apo.r(105584465, new vj81(kg0Var, b2), b0kVar3), (vu30) null, (vu30) null, (vu30) null, 0, u7h.j, 0L, (erl1) null, apo.r(1807359516, new nu31(cd71Var, z710Var, wj81Var, (byte) 12), b0kVar3), b0kVar2, 805306416, 445);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, kg0Var, cd71Var, z710Var, wj81Var, (byte) 12);
        }
    }

    public static final long m(long j) {
        return TimeUnit.MILLISECONDS.toMicros(j);
    }

    public static agg1 n(View view) {
        wfg1 wfg1VarA = new vfg1(0.0f, 1.0f, new yfg1(0.0f, 1.0f)).a(0.0f);
        wfg1VarA.e.d = hlv.a;
        xrd1[] xrd1VarArr = {new xrd1(view, Collections.singletonList(View.ALPHA))};
        wfg1VarA.e.e = Arrays.asList(xrd1VarArr);
        wfg1 wfg1VarA2 = wfg1VarA.f.a(0.8f);
        xrd1[] xrd1VarArr2 = {new xrd1(view, Arrays.asList(View.SCALE_X, View.SCALE_Y))};
        wfg1VarA2.e.e = Arrays.asList(xrd1VarArr2);
        vfg1 vfg1Var = wfg1VarA2.f;
        yfg1 yfg1Var = vfg1Var.c;
        return vfg1Var.d;
    }

    public static e9d1 o(Context context, int i) {
        long jE = z4p1.e(i);
        String string = context.getString(2131954025);
        return new e9d1(p7h.M(new p8d1[]{new p8d1(p7h.M(new Integer[]{Integer.valueOf(z4p1.G(jE)), Integer.valueOf(z4p1.G(jE))}), string), new p8d1(p7h.M(new Integer[]{Integer.valueOf(z4p1.G(jE)), Integer.valueOf(z4p1.G(u7h.b))}), string), new p8d1(p7h.M(new Integer[]{-15987957, -15987957}), context.getString(2131954025))}));
    }

    public static void p() {
        int i = rbk1.a;
    }

    public static ksk0 q() {
        return new ksk0((byte) 12);
    }

    public static final qim0 r(qim0 qim0Var, k75 k75Var) {
        pav0 pav0Var = new pav0();
        pav0Var.a = new f75(k75Var, (byte) 2);
        gqb0 gqb0Var = new gqb0();
        gqb0 gqb0Var2 = pav0Var.b;
        if (gqb0Var2 != null) {
            gqb0Var2.f((pav0) null);
        }
        pav0Var.b = gqb0Var;
        gqb0Var.f(pav0Var);
        k75Var.setOnRequestDisallowInterceptTouchEvent$ui(gqb0Var);
        return qim0Var.then(pav0Var);
    }

    public static qim0 s(qim0 qim0Var, iu30 iu30Var) {
        return zr7.i(qim0Var, new nhd(iu30Var, (byte) 2));
    }

    public static final ho11 t(long j, long j2, long j3, long j4, long j5, pim0 pim0Var, float[] fArr) {
        ndo0 ndo0VarW = oap1.w(pim0Var, 2);
        hmb0 hmb0VarB = oap1.B(pim0Var);
        boolean zJ = hmb0VarB.J();
        jdo0 jdo0Var = hmb0VarB.e1;
        if (!zJ) {
            return null;
        }
        if (((ndo0) jdo0Var.e) == ndo0VarW) {
            return new ho11(j, j2, j3, j4, j5, pim0Var, fArr);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L);
        long j6 = ((q5t0) ndo0VarW).c;
        ndo0 ndo0Var = (ndo0) jdo0Var.e;
        ndo0Var.getClass();
        long jC0 = dm5.c0(ndo0Var.q(ndo0VarW, jFloatToRawIntBits, true));
        return new ho11(jC0, (4294967295L & ((long) (((int) (jC0 & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jC0 >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, pim0Var, fArr);
    }

    public static final Set u(gy1 gy1Var, xj61 xj61Var, Set set) {
        zx1 zx1Var = gy1Var instanceof zx1 ? (zx1) gy1Var : null;
        Set set2 = zx1Var != null ? zx1Var.b : null;
        if (set2 == null) {
            set2 = w7x.a;
        }
        LinkedHashSet linkedHashSetY0 = dm61.y0(set2, set);
        int iS = zno1.s(q7h.U(linkedHashSetY0, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : linkedHashSetY0) {
            linkedHashMap.put(((hmg) obj).a, obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (xj61Var.a.containsKey((String) entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return o7h.p1(linkedHashMap2.values());
    }
}
