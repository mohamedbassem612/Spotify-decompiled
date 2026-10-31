package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vyo1 {
    public static b180 a;
    public static b180 b;

    public static final Typeface A(Typeface typeface, ja30 ja30Var, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? v1h1.a(typeface, ja30Var, context) : typeface;
    }

    public static final long B(PointF pointF, float f) {
        float f2 = (pointF.x + 1.0f) * f;
        return (((long) Float.floatToRawIntBits((pointF.y + 1.0f) * f)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final Map C(ioj0 ioj0Var) {
        Object obj;
        m7 m7Var = ioj0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : m7Var.a()) {
            String str = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : map.entrySet()) {
                Class cls = (Class) entry2.getKey();
                hoj0 hoj0Var = (hoj0) entry2.getValue();
                xv00 xv00Var = new xv00(rc11.a.b(cls));
                goj0 goj0VarA = hoj0Var.a();
                mmr0 mmr0Var = (goj0VarA == null || (obj = goj0VarA.a) == null) ? null : new mmr0(new jh5(xv00Var, str), obj);
                if (mmr0Var != null) {
                    arrayList2.add(mmr0Var);
                }
            }
            r7h.W(arrayList2, arrayList);
        }
        return sqg0.T(arrayList);
    }

    public static void D(Parcel parcel) {
        parcel.writeInt(-1);
    }

    public static void E(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static final void a(e40 e40Var, xho xhoVar, hft0 hft0Var, xgx0 xgx0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-905881086);
        int i2 = i | (x340Var.g(e40Var) ? 4 : 2) | (x340Var.i(xhoVar) ? 32 : 16) | (x340Var.i(hft0Var) ? 256 : 128) | (x340Var.i(xgx0Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            nyx.a(2, (wux) null, apo.r(-652387185, new j40(e40Var, ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp, iu30Var, xhoVar, hft0Var, xgx0Var), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(e40Var, xhoVar, hft0Var, xgx0Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(g211 g211Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(270968693);
        int i2 = i | (x340Var.g(g211Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = (i2 >> 6) & 14;
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
            who1.h(s161.b(qim0Var, false, new tu(ufh0Var, (byte) 18)), apo.i(x340Var, -1488813576, new wnx0(ven0Var2, xhlVar, i3, new su(ven0Var, nilVar, (byte) 14), g211Var, iu30Var)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 14), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s111(g211Var, iu30Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void c(y30 y30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1895528458);
        int i2 = (x340Var.g(y30Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = y30Var != null ? y30Var.a : 0;
            int i4 = i3 == 0 ? -1 : l40.a[l1d.C(i3)];
            if (i4 == -1) {
                x340Var.i0(542128266);
                x340Var.r(false);
            } else if (i4 == 1) {
                x340Var.i0(-536708129);
                kqn1.d(2, (i2 & 112) | 6, 0, x340Var, qim0Var);
                x340Var.r(false);
            } else {
                if (i4 != 2) {
                    throw p3d1.k(x340Var, -536710616, false);
                }
                x340Var.i0(-536704063);
                kqn1.d(1, (i2 & 112) | 6, 0, x340Var, qim0Var);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n2(y30Var, qim0Var, i, (byte) 4);
        }
    }

    public static final void d(l9a0 l9a0Var, qim0 qim0Var, float f, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1648569177);
        int i3 = (x340Var.g(l9a0Var) ? 4 : 2) | i | 176;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                f = dsa0.m(x340Var, 2131166195);
                i2 = i3 & (-897);
                qim0Var = nim0.a;
            } else {
                x340Var.b0();
                i2 = i3 & (-897);
            }
            x340Var.s();
            x9a0 x9a0Var = (x9a0) x340Var.k(y9a0.a);
            qim0 qim0VarX = uyn1.x(u291.d(qim0Var, 1.0f), f);
            boolean zG = x340Var.g(x9a0Var) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new y0o(l9a0Var, x9a0Var, (byte) 9);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarX);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        float f2 = f;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gf(l9a0Var, qim0Var2, f2, i, (byte) 4);
        }
    }

    public static final void e(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-205383567);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.g(13, apo.r(-429302684, new ql(cwl1.o0(x340Var, 2131957359), function0, (byte) 13), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 14, i, function0, false);
        }
    }

    public static final void f(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-266009820);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            g(unx.c, cwl1.o0(x340Var, z ? 2131957361 : 2131957360), x340Var, unx.d);
            g(znx.c, cwl1.o0(x340Var, z ? 2131957363 : 2131957362), x340Var, znx.d);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k750((byte) 4, i, z);
        }
    }

    public static final void g(hux huxVar, String str, b0k b0kVar, int i) {
        String str2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1533174485);
        int i2 = i | ((i & 8) == 0 ? b0kVar2.g(huxVar) : b0kVar2.i(huxVar) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
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
            zov0 zov0Var = cbx.b(b0kVar2).g;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, 56 | (i2 & 14), 48);
            b0kVar2 = b0kVar2;
            str2 = str;
            uwo1.e(str2, new wnb0(1.0f, true), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar2, (i2 >> 3) & 14, 0, 2032);
            b0kVar2.r(true);
        } else {
            str2 = str;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new grc(huxVar, str2, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x0327 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0329  */
    /* JADX WARN: Code duplicated, block: B:82:0x033e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0344  */
    /* JADX WARN: Code duplicated, block: B:85:0x034f  */
    /* JADX WARN: Code duplicated, block: B:89:0x038d  */
    /* JADX WARN: Code duplicated, block: B:90:0x039f  */
    /* JADX WARN: Code duplicated, block: B:93:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:94:0x03e8  */
    public static final void h(z5d0 z5d0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        float f;
        Object obj;
        boolean z;
        String strU;
        boolean z2;
        String str;
        String strK;
        float f2;
        float f3;
        boolean z3;
        boolean z4 = z5d0Var.a;
        boolean z5 = z5d0Var.c;
        ArrayList arrayList = z5d0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(988440818);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(z5d0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
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
            qim0 qim0VarH = l6o1.H(kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, false), l6o1.C(0, 0, 1, x340Var), false, 14);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            Object objX0 = o7h.X0(arrayList);
            my90 my90Var = objX0 instanceof my90 ? (my90) objX0 : null;
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            if (my90Var != null) {
                x340Var.i0(1700280849);
                f = 1.0f;
                m1p1.a(my90Var.b, my90Var.c, my90Var.a, null, x340Var, 0);
                x340Var.r(false);
            } else {
                f = 1.0f;
                x340Var.i0(1700287744);
                ArrayList<my90> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof my90) {
                        arrayList2.add(obj2);
                    }
                }
                c380 c380VarP = ezn1.p(x340Var, arrayList.size() - arrayList2.size());
                boolean zG = x340Var.g(arrayList2) | x340Var.g(c380VarP);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    obj = objT;
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    for (my90 my90Var2 : arrayList2) {
                        String str2 = my90Var2.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList3.add(new phx(8, 0L, str2, my90Var2.b, my90Var2.c));
                    }
                    c380 c380VarA = mqo1.A(o7h.N0(c380VarP, arrayList3));
                    x340Var.s0(c380VarA);
                    obj = c380VarA;
                }
                obj = objT;
                i((c380) obj, x340Var, 8);
                x340Var.r(false);
            }
            uwr uwrVar2 = cbx.a;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarO = ab80.o(nim0Var, 16.0f, x340Var, nim0Var, f);
            lee1 lee1VarA = lee1.a(cbx.d(x340Var).e, 0L, fc11.G(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
            long j = cbx.a(x340Var).b.a;
            int size = arrayList.size();
            if (z5 && size == 1) {
                z = false;
                strU = x0d.k(x340Var, -1574554771, 2131957368, x340Var, false);
            } else if (z5) {
                x340Var.i0(-1574551417);
                int i3 = size - 1;
                strU = cwl1.U(2131820724, i3, new Object[]{Integer.valueOf(i3)}, x340Var);
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                if (my90Var != null) {
                    x340Var.i0(-1574545516);
                    strU = cwl1.n0(2131957365, new Object[]{my90Var.c}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1574541896);
                    strU = cwl1.U(2131820723, size, new Object[]{Integer.valueOf(size)}, x340Var);
                    x340Var.r(false);
                }
                z2 = z;
                uwo1.e(strU, qim0VarO, lee1VarA, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                x340Var = x340Var;
                if (z4) {
                    x340Var.i0(1169734765);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(nim0Var, 8.0f));
                    if (arrayList.size() == 1) {
                        z3 = true;
                    } else {
                        z3 = z2 ? 1 : 0;
                    }
                    f(z3, x340Var, z2 ? 1 : 0);
                    x340Var.r(z2);
                    f2 = 8.0f;
                } else {
                    x340Var.i0(1169887719);
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    qim0 qim0VarO2 = ab80.o(nim0Var, 6.0f, x340Var, nim0Var, f);
                    lee1 lee1Var = cbx.d(x340Var).j;
                    long j2 = cbx.a(x340Var).b.b;
                    str = z5d0Var.d;
                    if (!z5 && arrayList.size() == 1) {
                        x340Var.i0(-1380060125);
                        strK = cwl1.n0(2131957366, new Object[]{str}, x340Var);
                        x340Var.r(z2);
                    } else if (z5) {
                        x340Var.i0(-1380056375);
                        strK = cwl1.n0(2131957358, new Object[]{str}, x340Var);
                        x340Var.r(z2);
                    } else if (arrayList.size() == 1) {
                        strK = x0d.k(x340Var, -1380052903, 2131957357, x340Var, z2);
                    } else {
                        strK = x0d.k(x340Var, -1380050606, 2131957356, x340Var, z2);
                    }
                    f2 = 8.0f;
                    uwo1.e(strK, qim0VarO2, lee1Var, j2, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                    x340Var = x340Var;
                    x340Var.r(z2);
                }
                x340Var.r(true);
                if (z4) {
                    x340Var.i0(1009875748);
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    x340Var.r(z2);
                    f3 = f2;
                } else {
                    x340Var.i0(1009876835);
                    f3 = cbx.b(x340Var).b.b;
                    x340Var.r(z2);
                }
                op71.g(x340Var, u291.h(nim0Var, f3));
                e(function0, x340Var, (i2 >> 3) & 14);
                if (z4) {
                    x340Var.i0(1241520431);
                    cvx cvxVar7 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(nim0Var, 16.0f));
                    k(function1, x340Var, (i2 >> 6) & 14);
                    x0d.s(nim0Var, cbx.b(x340Var).b.a, x340Var, z2);
                } else {
                    x340Var.i0(1241735385);
                    x0d.s(nim0Var, cbx.b(x340Var).b.c, x340Var, z2);
                }
                x340Var.r(true);
            }
            z2 = z;
            uwo1.e(strU, qim0VarO, lee1VarA, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            if (z4) {
                x340Var.i0(1169734765);
                cvx cvxVar8 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 8.0f));
                if (arrayList.size() == 1) {
                    z3 = true;
                } else {
                    z3 = z2 ? 1 : 0;
                }
                f(z3, x340Var, z2 ? 1 : 0);
                x340Var.r(z2);
                f2 = 8.0f;
            } else {
                x340Var.i0(1169887719);
                cvx cvxVar9 = cbx.b(x340Var).b;
                qim0 qim0VarO3 = ab80.o(nim0Var, 6.0f, x340Var, nim0Var, f);
                lee1 lee1Var2 = cbx.d(x340Var).j;
                long j3 = cbx.a(x340Var).b.b;
                str = z5d0Var.d;
                if (!z5) {
                    if (z5) {
                        x340Var.i0(-1380056375);
                        strK = cwl1.n0(2131957358, new Object[]{str}, x340Var);
                        x340Var.r(z2);
                    } else if (arrayList.size() == 1) {
                        strK = x0d.k(x340Var, -1380052903, 2131957357, x340Var, z2);
                    } else {
                        strK = x0d.k(x340Var, -1380050606, 2131957356, x340Var, z2);
                    }
                } else if (z5) {
                    x340Var.i0(-1380056375);
                    strK = cwl1.n0(2131957358, new Object[]{str}, x340Var);
                    x340Var.r(z2);
                } else if (arrayList.size() == 1) {
                    strK = x0d.k(x340Var, -1380052903, 2131957357, x340Var, z2);
                } else {
                    strK = x0d.k(x340Var, -1380050606, 2131957356, x340Var, z2);
                }
                f2 = 8.0f;
                uwo1.e(strK, qim0VarO3, lee1Var2, j3, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                x340Var = x340Var;
                x340Var.r(z2);
            }
            x340Var.r(true);
            if (z4) {
                x340Var.i0(1009875748);
                cvx cvxVar10 = cbx.b(x340Var).b;
                x340Var.r(z2);
                f3 = f2;
            } else {
                x340Var.i0(1009876835);
                f3 = cbx.b(x340Var).b.b;
                x340Var.r(z2);
            }
            op71.g(x340Var, u291.h(nim0Var, f3));
            e(function0, x340Var, (i2 >> 3) & 14);
            if (z4) {
                x340Var.i0(1241520431);
                cvx cvxVar11 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 16.0f));
                k(function1, x340Var, (i2 >> 6) & 14);
                x0d.s(nim0Var, cbx.b(x340Var).b.a, x340Var, z2);
            } else {
                x340Var.i0(1241735385);
                x0d.s(nim0Var, cbx.b(x340Var).b.c, x340Var, z2);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(z5d0Var, function0, function1, i, (byte) 24);
        }
    }

    public static final void i(c380 c380Var, b0k b0kVar, int i) {
        h311 h311VarV;
        i90 i90Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-410676342);
        int i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            if (c380Var.size() == 1) {
                x340Var.i0(1903041816);
                m1p1.k(48, 1, apo.r(-655102818, new i90(c380Var, (byte) 1), x340Var), x340Var, null);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    i90Var = new i90(c380Var, i, (byte) 2);
                }
            } else {
                x340Var.i0(1903103320);
                x340Var.r(false);
                boolean z = (i2 & 14) == 4 || x340Var.g(c380Var);
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = mqo1.A(o7h.N0(c380Var, Collections.singletonList(new phx(14, 0L, f4i1.f("android.resource://", context.getPackageName(), "/2131233468"), (String) null, (String) null))));
                    x340Var.s0(objT);
                }
                j((c380) objT, x340Var, 8);
            }
            h311VarV.d = i90Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            i90Var = new i90(c380Var, i, (byte) 3);
            h311VarV.d = i90Var;
        }
    }

    public static final void j(c380 c380Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1313584139);
        int i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mod.b(t4k.n.a(flb0.a), apo.r(-706494283, new i90(c380Var, (byte) 4), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i90(c380Var, i, (byte) 5);
        }
    }

    public static final void k(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-718616637);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131957364);
            qim0 qim0VarN = anm1.N("manageAccessButton", nim0.a);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldx.c, qim0VarN, null, null, null, null, null, null, null, apo.r(-633465278, new y5d0(strO0, (byte) 1), x340Var), x340Var, 0, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 15, i, function0, false);
        }
    }

    public static final void l(g211 g211Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qk1 qk1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(318065864);
        int i2 = i | (x340Var2.g(g211Var) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            qim0 qim0VarN = anm1.N("recommended-playlist-add-button-tag", nim0Var);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarThen = qim0VarN.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var2).g;
            qim0 qim0VarD = u291.D(u291.r(qim0VarThen, 48.0f), een.P0, 2);
            int iC = l1d.C(g211Var.b);
            if (iC == 0) {
                qk1Var = qk1.b;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                qk1Var = qk1.a;
            }
            pk1 pk1Var = new pk1(qk1Var, false, (String) null, (String) null, (j7p1) null, 30);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new fr01(iu30Var, (byte) 19);
                x340Var2.s0(objT);
            }
            float f = 1.0f;
            h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT), qim0VarD, jax.a, null, x340Var2, 0, 16);
            qim0 qim0VarN2 = anm1.N("recommended-playlist-play-button-tag", nim0Var);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            qim0 qim0VarD2 = u291.D(qim0VarN2.then(new wnb0(f, true)), een.R0, 2);
            boolean z2 = g211Var.c == 1;
            boolean z3 = (i3 == 32) | ((i2 & 14) == 4);
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new zkz0(iu30Var, g211Var, (byte) 15);
                x340Var2.s0(objT2);
            }
            czo1.d(z2, true, (Function0) objT2, qim0VarD2, x340Var2, 48, 0);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s111(g211Var, iu30Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void m(g211 g211Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-729600215);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(g211Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(anm1.N("recommended-playlist-card-tag", qim0Var3), 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, cbx.b(x340Var).b.b, 0.0f, 0.0f, 13);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarB, er31.b(8.0f)), f5p1.k(x340Var, 2131104259), d4o1.a);
            String strO0 = cwl1.o0(x340Var, 2131963619);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            pm31 pm31Var = new pm31(0);
            boolean z = (i3 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new fr01(iu30Var, (byte) 20);
                x340Var.s0(objT2);
            }
            qim0 qim0VarU = bin.u(qim0VarF, idn0Var, jtrVar, true, strO0, pm31Var, (Function0) objT2);
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT5);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT5;
            x340Var.j0(-492369756);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT6;
            x340Var.j0(-492369756);
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT7;
            who1.h(s161.b(qim0VarU, false, new tu(ufh0Var, (byte) 19)), apo.i(x340Var, -1488813576, new wnx0(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 15), g211Var, iu30Var, (byte) 3)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 15), x340Var, 48);
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(g211Var, iu30Var, qim0Var2, i, (byte) 18);
        }
    }

    public static final void n(g211 g211Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1854265370);
        int i2 = i | (x340Var.g(g211Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(anm1.N("recommended-playlist-component-tag", qim0Var3), 1.0f), een.Z, 2);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.c;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarZ, 16.0f, f, 16.0f, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            String str = g211Var.a.a;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = t011.O0;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(qim0Var3, false, (iu30) objT), cbx.d(x340Var).e, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1720);
            m(g211Var, iu30Var, null, x340Var, i2 & 126);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s111(g211Var, iu30Var, qim0Var2, i, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v59, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v63 */
    public static final void o(hdk hdkVar, iu30 iu30Var, long j, long j2, float f, boolean z, float f2, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        Function0 function1;
        u7h u7hVar;
        long j3;
        long j4;
        int i2;
        int i3;
        u7h u7hVar2;
        long j5;
        int i4;
        boolean z2;
        boolean z3;
        long j6;
        long j7;
        int i5;
        ?? r9;
        long j8;
        long j9;
        m4c m4cVar;
        float f3;
        boolean z4;
        boolean z5;
        ?? r10;
        int i6;
        long j10;
        boolean z6;
        String str = hdkVar.d;
        fra fraVar = een.N0;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1527457198);
        j06 j06Var = x340Var.a;
        int i7 = i | (x340Var.i(hdkVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.f(j2) ? 2048 : 1024) | (x340Var.d(f) ? 16384 : 8192) | (x340Var.h(z) ? 131072 : 65536) | (x340Var.d(f2) ? 1048576 : 524288) | (x340Var.i(function0) ? 8388608 : 4194304);
        if (x340Var.Y(i7 & 1, (i7 & 4793491) != 4793490)) {
            qim0 qim0Var = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            fra fraVar2 = een.Z;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar2, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z7 = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z7) {
                x340Var.l(function2);
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
            vu30 vu30Var = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var);
            String str2 = hdkVar.c;
            boolean z8 = hdkVar.s;
            String str3 = hdkVar.g;
            String str4 = hdkVar.e;
            String str5 = hdkVar.f;
            u7h u7hVar3 = hdkVar.j;
            if (str2.length() <= 0) {
                str2 = null;
            }
            Uri uri = str2 != null ? Uri.parse(str2) : Uri.EMPTY;
            uri.getClass();
            Uri uri2 = uri;
            nkx nkxVar = nkx.c;
            nux nuxVar = new nux(nkxVar, nkxVar);
            qim0 qim0VarR = d7e.r(1.0f, u291.c(qim0Var, 1.0f), false);
            isl islVar = isl.a;
            eso1.e(uri2, islVar, qim0VarR, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, true, x340Var, 1073766448, 48, 1512);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarX = uyn1.x(u291.c(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), 16.0f);
            era eraVar = een.P0;
            b36 b36Var = h36.g;
            mbh mbhVarA = jbh.a(b36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                function1 = function2;
                x340Var.l(function1);
            } else {
                function1 = function2;
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            vu30 vu30Var2 = vu30Var;
            nko1.H(qim0VarE2, x340Var, vu30Var2);
            String str6 = str4.length() == 0 ? " " : str4;
            uwr uwrVar = cbx.a;
            Function0 function3 = function1;
            lee1 lee1VarA = lee1.a(cbx.d(x340Var).k, 0L, j2, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
            if (str4.length() > 0) {
                x340Var.i0(833104513);
                u7hVar = u7hVar3;
                if (u7hVar == null) {
                    x340Var.i0(2105085592);
                    j3 = cbx.a(x340Var).b.a;
                    z6 = false;
                    x340Var.r(false);
                } else {
                    z6 = false;
                    x340Var.i0(2105084321);
                    x340Var.r(false);
                    j3 = u7hVar.a;
                }
                x340Var.r(z6);
            } else {
                str6 = str6;
                vu30Var2 = vu30Var2;
                u7hVar = u7hVar3;
                x340Var.i0(2105086431);
                x340Var.r(false);
                j3 = u7h.j;
            }
            u7h u7hVar4 = u7hVar;
            vu30 vu30Var3 = vu30Var2;
            uwo1.e(str6, null, lee1VarA, j3, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
            f36 f36Var = h36.c;
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            qim0 qim0Var2 = qim0Var;
            if (x340Var.S) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, vu30Var3);
            String upperCase = hdkVar.b.toUpperCase(Locale.ROOT);
            lee1 lee1Var = cbx.d(x340Var).a;
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
            if (u7hVar4 == null) {
                x340Var.i0(921561250);
                j4 = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(921559979);
                x340Var.r(false);
                j4 = u7hVar4.a;
            }
            gxo1.c(upperCase, null, lee1Var, j4, null, 2, false, new cjc0(2), new px8(fc11.G(20), j, 0L, new mx8(1), 4), 150.0f, fontWeight, null, x340Var, 134217728, 0, 2130);
            x340Var = x340Var;
            if (str.length() > 0) {
                x340Var.i0(-1496016130);
                lee1 lee1Var2 = cbx.d(x340Var).j;
                if (u7hVar4 == null) {
                    x340Var.i0(921577506);
                    j10 = cbx.a(x340Var).b.a;
                    x340Var.r(false);
                } else {
                    x340Var.i0(921576235);
                    x340Var.r(false);
                    j10 = u7hVar4.a;
                }
                uwo1.e(str, null, lee1Var2, j10, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
                x340Var = x340Var;
                i2 = 0;
                x340Var.r(false);
            } else {
                i2 = 0;
                x340Var.i0(-1495754428);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (str5.length() <= 0 && str3.length() <= 0) {
                boolean z9 = i2;
                u7hVar2 = u7hVar4;
                z3 = true;
                x340Var.i0(835532588);
                op71.g(x340Var, qim0Var2);
                x340Var.r(z9);
                i5 = z9;
            } else {
                x340Var.i0(834364694);
                jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, i2);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0Var2);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function3);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, (llj) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0441: INVOKE 
                      (r9v15 'iHashCode4' int)
                      (r13v14 'x340Var' p.x340)
                      (wrap p.llj:?: CAST (p.llj) (r9v5 ?? I:??[OBJECT, ARRAY]))
                      (r13v14 'x340Var' p.x340)
                     STATIC call: p.x0d.q(int, p.x340, p.llj, p.x340):void (LINE:1090) in method: p.vyo1.o(p.hdk, p.iu30, long, long, float, boolean, float, kotlin.jvm.functions.Function0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v5 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2241
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.vyo1.o(p.hdk, p.iu30, long, long, float, boolean, float, kotlin.jvm.functions.Function0, p.b0k, int):void");
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public static final void p(wck wckVar, u7h u7hVar, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                long j;
                hdx hdxVar;
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(2066198046);
                int i2 = i | (x340Var.g(wckVar) ? 4 : 2) | (x340Var.g(u7hVar) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
                if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var.b0();
                } else {
                    if (wckVar.getLabel().length() == 0) {
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new skd1(wckVar, u7hVar, function0, i, (byte) 0);
                            return;
                        }
                        return;
                    }
                    String label = wckVar.getLabel();
                    x340Var.i0(-1364853468);
                    x340Var.r(false);
                    uwr uwrVar = cbx.a;
                    long j2 = cbx.a(x340Var).c.a;
                    if (u7hVar == null) {
                        x340Var.i0(1341449698);
                        j = cbx.a(x340Var).b.a;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1341448458);
                        x340Var.r(false);
                        j = u7hVar.a;
                    }
                    int iC = l1d.C(wckVar.a());
                    if (iC == 0) {
                        x340Var.i0(1341459305);
                        boolean zF = ((i2 & 112) == 32) | x340Var.f(j2);
                        Object objT = x340Var.T();
                        if (zF || objT == m4cVar) {
                            objT = new qck(u7hVar, j2, (byte) 1);
                            x340Var.s0(objT);
                        }
                        hdx hdxVar2 = new hdx(6, (vu30) null, (vu30) objT, (vu30) null, (hw61) null, 26);
                        x340Var.r(false);
                        hdxVar = hdxVar2;
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var, 1341451034, false);
                        }
                        x340Var.i0(1341454215);
                        boolean zF2 = x340Var.f(j);
                        Object objT2 = x340Var.T();
                        if (zF2 || objT2 == m4cVar) {
                            objT2 = new q9j0((byte) 24, j);
                            x340Var.s0(objT2);
                        }
                        vu30 vu30Var = (vu30) objT2;
                        boolean zF3 = x340Var.f(j);
                        Object objT3 = x340Var.T();
                        if (zF3 || objT3 == m4cVar) {
                            objT3 = new q9j0((byte) 25, j);
                            x340Var.s0(objT3);
                        }
                        hdxVar = new hdx(0, vu30Var, (vu30) null, (vu30) objT3, (hw61) null, 21);
                        x340Var.r(false);
                    }
                    if (ihc1.y0(label)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar = new gbx(new y50(label), function0);
                    qim0 qim0VarN = anm1.N("cta_button", u291.f(nim0.a, 1.0f));
                    gdx gdxVarS = yla.s(x340Var);
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    foo1.c(gbxVar, hdxVar, qim0VarN, null, gdxVarS, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), null, null, null, null, apo.r(1941870399, new sdb1(wckVar, label, (byte) 12), x340Var), x340Var, 0, 48, 1944);
                }
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new skd1(wckVar, u7hVar, function0, i, (byte) 1);
                }
            }

            public static final void q(hdk hdkVar, iu30 iu30Var, boolean z, float f, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
                b0k b0kVar2;
                qim0 qim0Var2;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(1293857206);
                int i2 = i | (b0kVar3.i(hdkVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.d(f) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | 196608;
                if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
                    gv21 gv21VarZ = sj1.z(hdkVar.p, hdkVar.m, vqo1.j(b0kVar3), hdkVar.q, hdkVar.r, true);
                    ven0 ven0VarD = pap1.D(gv21VarZ.a || gv21VarZ.b || gv21VarZ.c, b0kVar3);
                    d7d d7dVar = hdkVar.m;
                    float f2 = ((d7dVar instanceof y6d) || (d7dVar instanceof w6d)) ? 0.2f : 0.3f;
                    float f3 = rck.e;
                    qim0 qim0Var3 = nim0.a;
                    b0kVar2 = b0kVar3;
                    w2g0.c(u291.f(uyn1.x(qim0Var3, f3), 1.0f), (tl3) null, apo.r(-53740512, new tkd1(hdkVar, ven0VarD, gv21VarZ, f2, iu30Var, z, f, function0), b0kVar3), b0kVar2, 3072, 6);
                    qim0Var2 = qim0Var3;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new eck(hdkVar, iu30Var, z, f, function0, qim0Var2, i, (byte) 1);
                }
            }

            public static final void r(dyi1 dyi1Var, iu30 iu30Var, boolean z, j2i j2iVar, b0k b0kVar, int i) {
                int i2;
                x340 x340Var;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-2055256722);
                j06 j06Var = x340Var2.a;
                if ((i & 6) == 0) {
                    i2 = (x340Var2.i(dyi1Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var2.i(iu30Var) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var2.h(z) ? 256 : 128;
                }
                int i3 = i & 3072;
                nim0 nim0Var = nim0.a;
                if (i3 == 0) {
                    i2 |= x340Var2.i(nim0Var) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i2 |= x340Var2.i(j2iVar) ? 16384 : 8192;
                }
                if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    boolean z2 = x340Var2.S;
                    n4k n4kVar = hmb0.t1;
                    if (z2) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    qim0 qim0VarN = anm1.N("map", d9y0.k(nim0Var, z ? 1.0f : 0.0f));
                    int i4 = i2 & 112;
                    boolean z3 = i4 == 32;
                    Object objT = x340Var2.T();
                    if (z3 || objT == m4cVar) {
                        objT = new uyh1(iu30Var, (byte) 21);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarQ = i1p1.q(u291.h(bin.x(qim0VarN, false, null, null, null, (Function0) objT, 15), 200.0f), er31.b(8.0f));
                    gra graVar = een.d;
                    int i5 = i2;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarQ);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    boolean z4 = true;
                    dv20.l((i5 >> 12) & 14, j2iVar, x340Var2, true);
                    byi1 byi1Var = dyi1Var.e;
                    if (byi1Var == null) {
                        x340Var2.i0(1674309846);
                        x340Var2.r(false);
                        x340Var = x340Var2;
                    } else {
                        x340Var2.i0(1674309847);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        qim0 qim0VarN2 = anm1.N("map_attribution", u291.j(48.0f, 0.0f, 2, ab80.o(nim0Var, 8.0f, x340Var2, nim0Var, 1.0f)));
                        boolean z5 = i4 == 32;
                        Object objT2 = x340Var2.T();
                        if (z5 || objT2 == m4cVar) {
                            objT2 = new uyh1(iu30Var, (byte) 22);
                            x340Var2.s0(objT2);
                        }
                        qim0 qim0VarX = bin.x(qim0VarN2, false, null, null, null, (Function0) objT2, 15);
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        int iHashCode3 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM3 = x340Var2.m();
                        qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarX);
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var2, lljVar);
                        nko1.H(xos0VarM3, x340Var2, lljVar2);
                        x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                        nko1.H(qim0VarE3, x340Var2, lljVar4);
                        x340Var2.i0(-248365455);
                        ye5 ye5Var = new ye5();
                        String str = byi1Var.a;
                        String str2 = byi1Var.b;
                        zma1 zma1Var = new zma1(cbx.a(x340Var2).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438);
                        boolean z6 = i4 == 32;
                        Object objT3 = x340Var2.T();
                        if (z6 || objT3 == m4cVar) {
                            objT3 = new ceg1(iu30Var, (byte) 11);
                            x340Var2.s0(objT3);
                        }
                        vhg.c(ye5Var, str, str2, zma1Var, (iu30) objT3);
                        af5 af5VarP = ye5Var.p();
                        x340Var2.r(false);
                        z4 = true;
                        uwo1.d(af5VarP, cbx.a(x340Var2).b.b, null, cbx.d(x340Var2).j, null, null, 0, false, null, 0, null, null, x340Var2, 0, 0, 4084);
                        x340Var = x340Var2;
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    x340Var.r(z4);
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new h8i0(dyi1Var, iu30Var, z, j2iVar, i);
                }
            }

            public static final void s(dyi1 dyi1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1244302518);
                int i2 = (x340Var.i(dyi1Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | 384;
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT);
                    }
                    ven0 ven0Var = (ven0) objT;
                    r(dyi1Var, iu30Var, ((Boolean) ven0Var.getValue()).booleanValue(), apo.r(-2057435545, new wpg1((Object) dyi1Var, (Object) iu30Var, (Object) ven0Var, (byte) 21), x340Var), x340Var, (i2 & 112) | (i2 & 14) | 24576 | 3072);
                    qim0Var2 = nim0.a;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wpg1((Object) dyi1Var, (Object) iu30Var, (Object) qim0Var2, i, (byte) 22);
                }
            }

            public static final void t(String str, String str2, sag sagVar, b0k b0kVar, int i) {
                boolean z;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-295071548);
                int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(sagVar) ? 2048 : 1024);
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    kk4 kk4Var = sagVar.j;
                    x340Var.i0(-479104178);
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        u9g u9gVar = new u9g(kk4Var.g(), kk4Var.d(), kk4Var.a(), kk4Var.c(), kk4Var.b(), kk4Var.e());
                        x340Var.s0(u9gVar);
                        objT = u9gVar;
                    }
                    u9g u9gVar2 = (u9g) objT;
                    Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                    if (u9gVar2.a) {
                        x340Var.i0(-815338972);
                        Object objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            gag gagVar = new gag(context, sagVar.b, sagVar.p, sagVar.q, sagVar.d, sagVar.e, sagVar.f, sagVar.g, sagVar.h, u9gVar2, new lag(sagVar.k.a((muz) null), sagVar.l, sagVar.m, context.getResources(), (byte) 0), new jut(sagVar.n, sagVar.o, (byte) 29));
                            x340Var.s0(gagVar);
                            objT2 = gagVar;
                        }
                        xag.a(str, str2, (gag) objT2, sagVar.a, sagVar.i, u9gVar2.b && u9gVar2.f, x340Var, (i2 & 126) | 196608);
                        z = false;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-815621754);
                        qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                        uwr uwrVar = cbx.a;
                        t1c.a(dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a), x340Var, 0);
                        boolean zI = x340Var.i(context);
                        Object objT3 = x340Var.T();
                        if (zI || objT3 == m4cVar) {
                            objT3 = new p82(context, (lnm) null, (byte) 1);
                            x340Var.s0(objT3);
                        }
                        qxd0.t(rih1.a, x340Var, (vu30) objT3);
                        x340Var.r(false);
                        z = false;
                    }
                    x340Var.r(z);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new swc(str, str2, sagVar, i, (byte) 19);
                }
            }

            public static final gka0 u() {
                return i520.a;
            }

            public static final void v(DrawScope drawScope, List list, long j) {
                if (list.isEmpty()) {
                    return;
                }
                float f = hrt.f(drawScope, 2.0f);
                tw4 tw4VarA = ww4.a();
                long jB = B(((beo) o7h.q0(list)).a, f);
                char c = ' ';
                long j2 = 4294967295L;
                tw4VarA.k(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    beo beoVar = (beo) it.next();
                    long jB2 = B(beoVar.b, f);
                    long jB3 = B(beoVar.c, f);
                    long jB4 = B(beoVar.d, f);
                    char c2 = c;
                    long j3 = j2;
                    tw4VarA.h(Float.intBitsToFloat((int) (jB2 >> c2)), Float.intBitsToFloat((int) (jB2 & j3)), Float.intBitsToFloat((int) (jB3 >> c2)), Float.intBitsToFloat((int) (jB3 & j3)), Float.intBitsToFloat((int) (jB4 >> c2)), Float.intBitsToFloat((int) (jB4 & j3)));
                    c = c2;
                    j2 = j3;
                }
                DrawScope.w0(drawScope, tw4VarA, j, new phc1((float) Math.ceil(Size.e(drawScope.j()) * 0.06508876f), 0.0f, 0, 0, (uw4) null, 30), 52);
            }

            public static final b180 w() {
                b180 b180Var = b;
                if (b180Var != null) {
                    return b180Var;
                }
                a180 a180Var = new a180("Encore.Vector.Plus16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
                int i = bui1.a;
                n6a1 n6a1Var = new n6a1(u7h.b);
                cwh0 cwh0VarG = lf51.g(15.25f, 8.0f);
                cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
                cwh0VarG.h(8.75f);
                cwh0VarG.v(5.75f);
                cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
                cwh0VarG.u(8.75f);
                cwh0VarG.h(1.5f);
                cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
                cwh0VarG.i(5.75f);
                cwh0VarG.u(1.5f);
                cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
                cwh0VarG.v(5.75f);
                cwh0VarG.i(5.75f);
                cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
                a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
                b180 b180VarB = a180Var.b();
                b = b180VarB;
                return b180VarB;
            }

            public static final go80 x(klm klmVar, ubp0 ubp0Var, ubp0 ubp0Var2, ubp0 ubp0Var3) {
                return klmVar.a("JamDaemon", new iyo0(ubp0Var, ubp0Var2, ubp0Var3, (byte) 19));
            }

            public static void y(g871 g871Var, k771 k771Var, Throwable th, p371 p371Var, ela1 ela1Var, o571 o571Var, String str, int i) {
                String str2;
                yy61 yy61Var;
                String str3 = null;
                p371 p371Var2 = (i & 4) != 0 ? null : p371Var;
                ela1 ela1Var2 = (i & 8) != 0 ? null : ela1Var;
                o571 o571Var2 = (i & 16) != 0 ? null : o571Var;
                String strD = (i & 32) != 0 ? null : str;
                String strP = e9p1.p(th);
                String strL = e9p1.l(th);
                if (strD != null) {
                    str2 = strD;
                } else if (p371Var2 != null) {
                    strD = p371Var2.d();
                    str2 = strD;
                } else {
                    str2 = null;
                }
                String str4 = ela1Var2 != null ? ela1Var2.c : null;
                String str5 = ela1Var2 != null ? ela1Var2.b : null;
                String str6 = ela1Var2 != null ? ela1Var2.a : null;
                String str7 = o571Var2 != null ? o571Var2.a : null;
                if (p371Var2 != null) {
                    if (p371Var2 instanceof g9c1) {
                        yy61Var = yy61.f;
                    } else if (p371Var2 instanceof f9c1) {
                        yy61Var = yy61.e;
                    } else if (p371Var2 instanceof h9c1) {
                        yy61Var = yy61.g;
                    } else if (p371Var2 instanceof pz70) {
                        yy61Var = yy61.d;
                    } else {
                        boolean z = p371Var2 instanceof a6j0;
                        yy61 yy61Var2 = yy61.b;
                        if (z) {
                            String str8 = ((a6j0) p371Var2).b;
                            if (str8 != null && !ihc1.y0(str8)) {
                                yy61Var = yy61.c;
                            }
                        } else if (!(p371Var2 instanceof vkc0)) {
                            eg.o();
                            return;
                        }
                        yy61Var = yy61Var2;
                    }
                    str3 = yy61Var.a;
                }
                g871Var.a(new i771(k771Var, strL, strP, str2, str4, str5, str6, str7, str3, 512));
            }

            public static Object z(Parcel parcel, Parcelable.Creator creator) {
                if (parcel.readInt() != 0) {
                    return creator.createFromParcel(parcel);
                }
                return null;
            }
        }
