package p;

import android.content.ClipboardManager;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class ob51 {
    public static final f170 a = new f170();
    public static b180 b;

    public static final void a(jkr0 jkr0Var, j2i j2iVar, boolean z, j2i j2iVar2, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        j2i j2iVar3;
        jkr0 jkr0Var2;
        Object objA;
        j2i j2iVar4 = bsj.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-100049712);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(jkr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(j2iVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 1048576 : 524288;
        }
        int i3 = 12582912 & i;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var = (drr0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var2 = (drr0) objT2;
            wat watVar = (wat) x340Var.k(t4k.h);
            int i4 = i2 & 896;
            int i5 = i2;
            boolean z3 = (i4 == 256) | ((i2 & 57344) == 16384);
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                jkr0Var2 = jkr0Var;
                objA = yv91.a(new n6v(jkr0Var2, z, z2, drr0Var, drr0Var2));
                x340Var.s0(objA);
            } else {
                objA = objT3;
                jkr0Var2 = jkr0Var;
            }
            tob1 tob1Var = (tob1) objA;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = wm5.e(ma80.a, (wvr) tob1Var.getValue(), o6v.b, new pj(watVar, (byte) 4), irn1.o0(200, 0, mlv.a, 2), dem1.A(watVar));
                x340Var.s0(objT4);
            }
            t24 t24Var = (t24) objT4;
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = yv91.a(new ots(t24Var, (byte) 29));
                x340Var.s0(objT5);
            }
            tob1 tob1Var2 = (tob1) objT5;
            Boolean bool = (Boolean) tob1Var2.getValue();
            bool.getClass();
            boolean zI = x340Var.i(ven0VarS) | x340Var.i(tob1Var2);
            Object objT6 = x340Var.T();
            if (zI || objT6 == m4cVar) {
                objT6 = new nnu(ven0VarS, tob1Var2, (lnm) null);
                x340Var.s0(objT6);
            }
            qxd0.t(bool, x340Var, (vu30) objT6);
            Object value = tob1Var.getValue();
            boolean zI2 = x340Var.i(t24Var) | x340Var.i(tob1Var);
            Object objT7 = x340Var.T();
            if (zI2 || objT7 == m4cVar) {
                objT7 = new nnu(t24Var, tob1Var, (lnm) null, (byte) 9);
                x340Var.s0(objT7);
            }
            qxd0.t(value, x340Var, (vu30) objT7);
            boolean zG = x340Var.g(jkr0Var2) | x340Var.g(t24Var) | (i4 == 256);
            Object objT8 = x340Var.T();
            if (zG || objT8 == m4cVar) {
                objT8 = new q6v(tob1Var, t24Var);
                x340Var.s0(objT8);
            }
            qim0 qim0VarL = bmq0.L(nim0Var, (q6v) objT8, (g6o0) null);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            gra graVar2 = een.X;
            h2c h2cVar = h2c.a;
            qim0 qim0VarF = u291.f(h2cVar.a(nim0Var, graVar2), 1.0f);
            boolean zI3 = x340Var.i(drr0Var);
            Object objT9 = x340Var.T();
            if (zI3 || objT9 == m4cVar) {
                objT9 = new qg6(drr0Var, (byte) 13);
                x340Var.s0(objT9);
            }
            qim0 qim0VarU = lrn1.u(qim0VarF, (iu30) objT9);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarU);
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
            if (z) {
                x340Var.i0(-2116856038);
                dv20.l((i5 >> 9) & 14, j2iVar2, x340Var, false);
            } else {
                x340Var.i0(-2116813754);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0 qim0VarF2 = u291.f(h2cVar.a(nim0Var, een.e), 1.0f);
            boolean zI4 = x340Var.i(drr0Var2);
            Object objT10 = x340Var.T();
            if (zI4 || objT10 == m4cVar) {
                objT10 = new qg6(drr0Var2, (byte) 14);
                x340Var.s0(objT10);
            }
            qim0 qim0VarU2 = lrn1.u(qim0VarF2, (iu30) objT10);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarU2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            if (z2) {
                x340Var.i0(1705294271);
                dv20.l((i5 >> 15) & 14, j2iVar4, x340Var, false);
            } else {
                x340Var.i0(1705340399);
                x340Var.r(false);
            }
            x340Var.r(true);
            tob1 tob1VarB = z95.b(Math.abs(t24Var.j.s()) <= Float.MAX_VALUE ? t24Var.j.s() : 0.0f, irn1.l0(0.5f, 200.0f, (Object) null, 4), "offsetAnimation", (iu30) null, x340Var, 3072, 20);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            boolean zI5 = x340Var.i(tob1VarB);
            Object objT11 = x340Var.T();
            if (zI5 || objT11 == m4cVar) {
                objT11 = new pak(tob1VarB, (byte) 3);
                x340Var.s0(objT11);
            }
            qim0 qim0VarB = eqr0.B(qim0VarD, (iu30) objT11);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF3 = dug.f(qim0VarB, ((yex) zex.a.d).a, d4o1.a);
            gfh0 gfh0VarC4 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarF3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC4, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            j2iVar3 = j2iVar;
            k4s0.i((i5 >> 3) & 14, j2iVar3, x340Var, true, true);
        } else {
            j2iVar3 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(jkr0Var, j2iVar3, z, j2iVar2, z2, iu30Var, i);
        }
    }

    public static final void b(hob1 hob1Var, j2i j2iVar, Function0 function0, Function0 function1, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, boolean z, qim0 qim0Var, i091 i091Var, boolean z2, vu30 vu30Var, float f, vu30 vu30Var2, b0k b0kVar, int i, int i2) {
        i091 i091Var2;
        boolean z3;
        int i3;
        float f2;
        vu30 vu30Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(351457709);
        int i4 = i | (x340Var.i(hob1Var) ? 4 : 2) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if ((i & 12582912) == 0) {
            i4 |= x340Var.h(z) ? 8388608 : 4194304;
        }
        int i5 = i4 | (x340Var.i(qim0Var) ? 67108864 : 33554432);
        if ((i & 805306368) == 0) {
            i091Var2 = i091Var;
            i5 |= x340Var.i(i091Var2) ? 536870912 : 268435456;
        } else {
            i091Var2 = i091Var;
        }
        if ((i2 & 6) == 0) {
            z3 = z2;
            i3 = (x340Var.h(z3) ? 4 : 2) | i2;
        } else {
            z3 = z2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i3 |= x340Var.d(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            vu30Var3 = vu30Var2;
            i3 |= x340Var.i(vu30Var3) ? 2048 : 1024;
        } else {
            vu30Var3 = vu30Var2;
        }
        if (x340Var.Y(i5 & 1, ((306783379 & i5) == 306783378 && (i3 & 1171) == 1170) ? false : true)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            nyx.a(2, (wux) null, apo.r(-1612613952, new wtf0(hob1Var, qim0Var, f2, function1, function0, i091Var2, j2iVar, z, z3, j2iVar2, j2iVar3, vu30Var, vu30Var3, j2iVar4, (byte) 1), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xtf0(hob1Var, j2iVar, function0, function1, j2iVar2, j2iVar3, j2iVar4, z, qim0Var, i091Var, z2, vu30Var, f, vu30Var2, i, i2);
        }
    }

    public static final void c(String str, Function0 function0, h9n h9nVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1091039601);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(h9nVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new xho(((mko) h9nVar.b).b());
                x340Var.s0(objT);
            }
            xho xhoVar = (xho) objT;
            Set set = s4b1.f;
            String strZ = uic.x(str).z();
            if (strZ == null) {
                strZ = str;
            }
            String strO0 = cwl1.o0(x340Var, 2131951789);
            boolean z = (i3 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new us21(function0, (byte) 14);
                x340Var.s0(objT2);
            }
            otw.c(xhoVar, new uho(strZ, str, null, null, strO0, (Function0) objT2, 172), (qim0) null, (ipb1) null, x340Var, 8, 12);
            String strO1 = cwl1.o0(x340Var, 2131951790);
            uwr uwrVar = cbx.a;
            uwo1.e(strO1, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, (Object) str, (Object) function0, (Object) h9nVar, (Object) qim0Var2, (byte) 4);
        }
    }

    public static void d(bx40 bx40Var, bz50 bz50Var) {
        bx40Var.getClass();
        kw40 kw40Var = new kw40(bx40Var.getContext(), bx40Var);
        LinearLayout linearLayout = kw40Var.c;
        linearLayout.setTag(2131429011, kw40Var);
        View view = ((cz50) bz50Var).a;
        kw40Var.a.add(view);
        kw40Var.b.add(bz50Var);
        linearLayout.addView(view, -1, new LinearLayout.LayoutParams(-1, -2));
        bx40Var.setContentViewBinder(kw40Var);
    }

    public static void e(long j, nac nacVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            hhg1.n("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((rhc) arrayList4.get(i8)).d() < i7) {
                hhg1.n("Failed requirement.");
                return;
            }
        }
        rhc rhcVar = (rhc) arrayList.get(i2);
        rhc rhcVar2 = (rhc) arrayList4.get(i3 - 1);
        if (i7 == rhcVar.d()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            rhc rhcVar3 = (rhc) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            rhcVar = rhcVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (rhcVar.i(i7) == rhcVar2.i(i7)) {
            int iMin = Math.min(rhcVar.d(), rhcVar2.d());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && rhcVar.i(i11) == rhcVar2.i(i11); i11++) {
                i10++;
            }
            long j3 = (nacVar.b / 4) + j + 2 + ((long) i10) + 1;
            nacVar.U(-i10);
            nacVar.U(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                nacVar.U(rhcVar.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((rhc) arrayList4.get(i4)).d()) {
                    nacVar.U(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    eg.m("Check failed.");
                    return;
                }
            }
            nac nacVar2 = new nac();
            nacVar.U(((int) ((nacVar2.b / 4) + j3)) * (-1));
            e(j3, nacVar2, i12, arrayList4, i4, i3, arrayList5);
            nacVar.B(nacVar2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((rhc) arrayList4.get(i14 - 1)).i(i7) != ((rhc) arrayList4.get(i14)).i(i7)) {
                i13++;
            }
        }
        long j4 = (nacVar.b / 4) + j + 2 + ((long) (i13 * 2));
        nacVar.U(i13);
        nacVar.U(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            byte bI = ((rhc) arrayList4.get(i15)).i(i7);
            if (i15 == i4 || bI != ((rhc) arrayList4.get(i15 - 1)).i(i7)) {
                nacVar.U(bI & 255);
            }
        }
        nac nacVar3 = new nac();
        int i16 = i4;
        while (i16 < i3) {
            byte bI2 = ((rhc) arrayList4.get(i16)).i(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bI2 != ((rhc) arrayList4.get(i18)).i(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((rhc) arrayList4.get(i16)).d()) {
                nacVar.U(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                nacVar.U(((int) ((nacVar3.b / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                e(j2, nacVar3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        nacVar.B(nacVar3);
    }

    public static final boolean f(dmh1 dmh1Var, jh5 jh5Var) {
        zjd1 zjd1Var = jh5Var.a;
        yla1 yla1VarE = dmh1Var.e();
        if (yla1VarE instanceof wla1) {
            return u890.j(zjd1Var, ((wla1) yla1VarE).a);
        }
        if (yla1VarE instanceof xla1) {
            return ((xla1) yla1VarE).a.m(zjd1Var);
        }
        if (yla1VarE instanceof vla1) {
            return ((Boolean) ((vla1) yla1VarE).a.invoke(jh5Var)).booleanValue();
        }
        eg.o();
        return false;
    }

    public static final kf30 g(String str, kf30 kf30Var) {
        return kf30Var.a(ajn0.e(str));
    }

    public static final int h(z8d0 z8d0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            return z8d0Var.c.get();
        }
        return z8d0Var.b() ? -512 : -256;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0359  */
    public static final af5 i(String str, pae1 pae1Var, rjc0 rjc0Var) {
        int i;
        String url;
        zh40 zh40VarC;
        zma1 zma1Var;
        int i2;
        Spanned spannedFromHtml = Html.fromHtml(l1d.m("<ContentHandlerReplacementTag />", str), 63, null, a);
        ye5 ye5Var = new ye5(spannedFromHtml.length());
        ye5Var.f(spannedFromHtml);
        Object[] spans = spannedFromHtml.getSpans(0, ye5Var.a.length(), Object.class);
        int i3 = 0;
        for (int length = spans.length; i3 < length; length = i) {
            Object obj = spans[i3];
            long jE = e6p1.e(spannedFromHtml.getSpanStart(obj), spannedFromHtml.getSpanEnd(obj));
            int i4 = nbe1.c;
            int i5 = (int) (jE >> 32);
            int i6 = (int) (jE & 4294967295L);
            if (obj instanceof AbsoluteSizeSpan) {
                i = length;
            } else {
                boolean z = obj instanceof AlignmentSpan;
                ArrayList arrayList = ye5Var.c;
                int i7 = 3;
                if (z) {
                    Layout.Alignment alignment = ((AlignmentSpan) obj).getAlignment();
                    int i8 = alignment == null ? -1 : g170.a[alignment.ordinal()];
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                i2 = 0;
                            } else {
                                i7 = 6;
                            }
                        }
                        arrayList.add(new xe5(i5, i6, 8, new cpr0(i2, 0, 0L, (u8e1) null, (edt0) null, 0, 0, 510), (String) null));
                    } else {
                        i7 = 5;
                    }
                    i2 = i7;
                    arrayList.add(new xe5(i5, i6, 8, new cpr0(i2, 0, 0L, (u8e1) null, (edt0) null, 0, 0, 510), (String) null));
                } else if (obj instanceof xf5) {
                    xf5 xf5Var = (xf5) obj;
                    ye5Var.c(i5, xf5Var.a, i6, xf5Var.b);
                } else if (obj instanceof BackgroundColorSpan) {
                    ye5Var.d(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, z4p1.e(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 63487), i5, i6);
                } else if (obj instanceof jcc) {
                    long j = gcc.d;
                    jcc jccVar = (jcc) obj;
                    int i9 = jccVar.b;
                    fc11.o(j);
                    i = length;
                    long jY = fc11.Y(TextUnit.c(j) * i9, j & 1095216660480L);
                    gcc gccVar = jccVar.a;
                    arrayList.add(new xe5(i5, i6, 8, new cpr0(0, 0, 0L, new u8e1(jY, jY), (edt0) null, 0, 0, 503), (String) null));
                    arrayList.add(new xe5(i5, i6, 8, gccVar, (String) null));
                } else {
                    i = length;
                    if (obj instanceof ForegroundColorSpan) {
                        ye5Var.d(new zma1(z4p1.e(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), i5, i6);
                    } else if (obj instanceof RelativeSizeSpan) {
                        ye5Var.d(new zma1(0L, fc11.Y(((RelativeSizeSpan) obj).getSizeChange(), 8589934592L), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65533), i5, i6);
                    } else if (obj instanceof StrikethroughSpan) {
                        ye5Var.d(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.d, (Shadow) null, (PlatformSpanStyle) null, 61439), i5, i6);
                    } else if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style == 1) {
                            zma1Var = new zma1(0L, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65531);
                        } else if (style != 2) {
                            zma1Var = style != 3 ? null : new zma1(0L, 0L, FontWeight.Z, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65523);
                        } else {
                            zma1Var = new zma1(0L, 0L, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65527);
                        }
                        if (zma1Var != null) {
                            ye5Var.d(zma1Var, i5, i6);
                        }
                    } else if (obj instanceof SubscriptSpan) {
                        ye5Var.d(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, new BaselineShift(-0.5f), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65279), i5, i6);
                    } else if (obj instanceof SuperscriptSpan) {
                        ye5Var.d(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, new BaselineShift(0.5f), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65279), i5, i6);
                    } else if (obj instanceof TypefaceSpan) {
                        TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                        String family = typefaceSpan.getFamily();
                        if (u890.j(family, "cursive")) {
                            zh40VarC = FontFamily.e;
                        } else if (u890.j(family, "monospace")) {
                            zh40VarC = FontFamily.d;
                        } else if (u890.j(family, "sans-serif")) {
                            zh40VarC = FontFamily.b;
                        } else if (u890.j(family, "serif")) {
                            zh40VarC = FontFamily.c;
                        } else {
                            String family2 = typefaceSpan.getFamily();
                            if (family2 == null || family2.length() == 0) {
                                zh40VarC = null;
                            } else {
                                Typeface typefaceCreate = Typeface.create(family2, 0);
                                Typeface typeface = Typeface.DEFAULT;
                                if (u890.j(typefaceCreate, typeface) || u890.j(typefaceCreate, Typeface.create(typeface, 0))) {
                                    typefaceCreate = null;
                                }
                                if (typefaceCreate != null) {
                                    zh40VarC = qon1.c(typefaceCreate);
                                } else {
                                    zh40VarC = null;
                                }
                            }
                        }
                        ye5Var.d(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, zh40VarC, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65503), i5, i6);
                    } else if (obj instanceof UnderlineSpan) {
                        ye5Var.d(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), i5, i6);
                    } else if ((obj instanceof URLSpan) && (url = ((URLSpan) obj).getURL()) != null) {
                        ye5Var.b(new ljc0(url, pae1Var, rjc0Var), i5, i6);
                    }
                }
                i = length;
            }
            i3++;
        }
        return ye5Var.p();
    }

    public static /* synthetic */ af5 j(String str, pae1 pae1Var, int i) {
        if ((i & 2) != 0) {
            pae1Var = null;
        }
        return i(str, pae1Var, null);
    }

    public static final ClipboardManager l(ung ungVar) {
        if (ungVar instanceof e94) {
            return ((f94) ((e94) ungVar)).a.a();
        }
        hhg1.f(l1d.m("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", rc11.a.b(ungVar.getClass()).o()));
        return null;
    }

    public static final boolean m(String str, mtl mtlVar) {
        Set set = s4b1.f;
        if (uic.g(str, blc0.ed)) {
            return (mtlVar != null ? mtlVar.a : null) == ktl.b;
        }
        return false;
    }

    public static cqq0 n(rhc... rhcVarArr) {
        if (rhcVarArr.length == 0) {
            return new cqq0(new rhc[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList((Collection) new i36(rhcVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int length = rhcVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList2.set(p7h.I(arrayList, rhcVarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((rhc) arrayList.get(0)).d() <= 0) {
            hhg1.n("the empty byte string is not a supported option");
            return null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            rhc rhcVar = (rhc) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                rhc rhcVar2 = (rhc) arrayList.get(i6);
                rhcVar2.getClass();
                if (!rhcVar2.k(0, rhcVar, rhcVar.d())) {
                    break;
                }
                if (rhcVar2.d() == rhcVar.d()) {
                    bhn0.s(rhcVar2, "duplicate option: ");
                    return null;
                }
                if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        nac nacVar = new nac();
        e(0L, nacVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (nacVar.b / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = nacVar.C();
        }
        return new cqq0((rhc[]) Arrays.copyOf(rhcVarArr, rhcVarArr.length), iArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    public static final r7x0 o(z6x0 z6x0Var) {
        m3x0 m3x0Var = z6x0Var.a;
        int i = 3;
        if (m3x0Var.k1 != 3) {
            return null;
        }
        String str = m3x0Var.a;
        boolean z = m3x0Var.f1;
        String str2 = m3x0Var.U0;
        String str3 = m3x0Var.i1;
        String str4 = m3x0Var.c;
        String str5 = m3x0Var.d;
        if (str5 == null || str5.length() <= 0) {
            str5 = null;
        }
        boolean z2 = m3x0Var.e;
        String str6 = str5;
        boolean z3 = m3x0Var.f;
        smc0 smc0VarN = k4p1.n();
        boolean z4 = z6x0Var.t;
        boolean z5 = z6x0Var.b;
        if (z4) {
            switch (l1d.C(z6x0Var.X)) {
                case 0:
                case 1:
                case 7:
                    i = 0;
                    if (i != 0) {
                        smc0VarN.add(new m7x0(i));
                    }
                    break;
                case 2:
                    i = 1;
                    if (i != 0) {
                        smc0VarN.add(new m7x0(i));
                    }
                    break;
                case 3:
                    if (i != 0) {
                        smc0VarN.add(new m7x0(i));
                    }
                    break;
                case 4:
                    i = 4;
                    if (i != 0) {
                        smc0VarN.add(new m7x0(i));
                    }
                    break;
                case 5:
                case 6:
                    i = 2;
                    if (i != 0) {
                        smc0VarN.add(new m7x0(i));
                    }
                    break;
                default:
                    eg.o();
                    return null;
            }
        }
        if (z6x0Var.i) {
            smc0VarN.add(n7x0.a);
        }
        if (z6x0Var.d) {
            boolean z6 = z6x0Var.e;
            smc0VarN.add(new l7x0(z6, z6x0Var.h, (z6 || m3x0Var.Y) ? false : true));
        }
        if (z5) {
            smc0VarN.add(k7x0.a);
        }
        if (z5 && z6x0Var.c) {
            smc0VarN.add(o7x0.a);
        }
        if (!m3x0Var.W0) {
            smc0VarN.add(j7x0.a);
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        boolean z7 = m3x0Var.Z;
        boolean z8 = !z7;
        q730 q730Var = m3x0Var.X;
        int i2 = q730Var.c;
        int i3 = q730Var.d;
        int iL = uah.l(m3x0Var.O0, 255);
        boolean z9 = z6x0Var.Y == wbk1.a;
        String str7 = m3x0Var.Q0;
        String str8 = m3x0Var.S0;
        boolean z10 = m3x0Var.T0;
        String str9 = m3x0Var.R0;
        boolean z11 = m3x0Var.h1;
        return new r7x0(str, str4, str6, z2, z3, smc0VarK, z7, z8, i2, i3, iL, m3x0Var.W0, z9, str7, str8, z10, str9, (!z11 || str3 == null) ? str2 : str3, z11 ? str3 != null || z : z, !z11 && m3x0Var.g1, z11);
    }

    public static final int p(y8d0 y8d0Var) {
        if (y8d0Var instanceof x8d0) {
            return 1;
        }
        return y8d0Var instanceof w8d0 ? 2 : 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList q(k8g1 k8g1Var, vcg1 vcg1Var) {
        int i;
        ArrayList arrayList;
        Throwable th;
        int i2;
        jx31 ax31Var;
        jx31 zw31Var;
        ArrayList arrayList2;
        tcd1 tcd1VarQ = bbp1.q(k8g1Var.X);
        boolean z = k8g1Var.Z;
        int iOrdinal = tcd1VarQ.ordinal();
        Throwable th2 = null;
        boolean z2 = true;
        if (iOrdinal == 0 || iOrdinal == 1) {
            i = z ? 3 : 2;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            i = z ? 4 : 5;
        }
        boolean zO = dgo1.o(k8g1Var.e);
        List list = k8g1Var.i;
        int i3 = 10;
        ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                Throwable th3 = th2;
                p7h.T();
                throw th3;
            }
            of51 of51Var = (of51) obj;
            String str = k8g1Var.a;
            boolean z3 = zO;
            int i6 = k8g1Var.f;
            zO = z3;
            int i7 = k8g1Var.g;
            boolean z4 = of51Var instanceof kye1;
            tcd1 tcd1Var = tcd1.c;
            if (z4) {
                kye1 kye1Var = (kye1) of51Var;
                int i8 = kye1Var.a;
                ax31Var = new ix31(i8, bbp1.i(i8), kye1Var.b, zO, tcd1VarQ != tcd1Var ? z2 : false);
                arrayList = arrayList3;
                th = th2;
                i2 = i3;
            } else if (of51Var instanceof yde1) {
                String str2 = str + ":" + i4;
                yde1 yde1Var = (yde1) of51Var;
                List list2 = yde1Var.c;
                ArrayList arrayList4 = arrayList3;
                int i9 = yde1Var.a;
                mbe1 mbe1Var = (mbe1) o7h.C0(list2);
                int i10 = mbe1Var != null ? mbe1Var.a : yde1Var.a;
                String str3 = yde1Var.b;
                th = th2;
                if (tcd1VarQ == tcd1.a) {
                    List<mbe1> list3 = list2;
                    arrayList2 = new ArrayList(q7h.U(list3, i3));
                    for (mbe1 mbe1Var2 : list3) {
                        arrayList2.add(new fx31(mbe1Var2.a, mbe1Var2.b));
                    }
                } else {
                    arrayList2 = z6x.a;
                }
                arrayList = arrayList4;
                int i11 = i10;
                ArrayList arrayList5 = arrayList2;
                i2 = 10;
                ax31Var = new hx31(str2, i9, i11, str3, i6, i7, zO, true, tcd1VarQ, arrayList5);
                zO = zO;
            } else {
                arrayList = arrayList3;
                th = th2;
                i2 = i3;
                if (of51Var instanceof kz70) {
                    kz70 kz70Var = (kz70) of51Var;
                    zw31Var = new cx31(i4, str, kz70Var.b, kz70Var.c, kz70Var.d, kz70Var.e, kz70Var.f, kz70Var.g);
                } else {
                    int i12 = i4;
                    if (of51Var instanceof j2n0) {
                        j2n0 j2n0Var = (j2n0) of51Var;
                        ax31Var = new ex31(j2n0Var.a, j2n0Var.b, str, j2n0Var.c, zO, tcd1VarQ != tcd1Var);
                        zO = zO;
                    } else if (of51Var instanceof r7f0) {
                        r7f0 r7f0Var = (r7f0) of51Var;
                        zw31Var = new dx31(i12, str, r7f0Var.b, r7f0Var.c, r7f0Var.d, r7f0Var.e);
                    } else if (of51Var instanceof spy) {
                        spy spyVar = (spy) of51Var;
                        String str4 = spyVar.h;
                        rpy rpyVar = spyVar.e;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = spyVar.c;
                        String str7 = spyVar.d;
                        String str8 = rpyVar.a;
                        String strY0 = (str8 == null || str8.length() == 0) ? o7h.y0(rpyVar.b, (CharSequence) null, (String) null, (String) null, h5g1.N0, 31) : rpyVar.a;
                        cq70 cq70Var = (cq70) o7h.s0(spyVar.f);
                        Object obj2 = cq70Var != null ? cq70Var.b : th;
                        String str9 = obj2 == null ? "" : obj2;
                        String str10 = spyVar.g;
                        zw31Var = new zw31(str, str5, str6, str7, strY0, str9, str10 == null ? "" : str10, str4 == null ? "" : str4);
                    } else if (of51Var instanceof gw0) {
                        gw0 gw0Var = (gw0) of51Var;
                        ax31Var = new ww31(str, gw0Var.a, gw0Var.b, zO);
                    } else if (of51Var instanceof v710) {
                        v710 v710Var = (v710) of51Var;
                        ax31Var = new ax31(str, v710Var.b, v710Var.c);
                    } else {
                        ax31Var = bx31.a;
                    }
                }
                ax31Var = zw31Var;
            }
            arrayList.add(ax31Var);
            arrayList3 = arrayList;
            i3 = i2;
            i4 = i5;
            th2 = th;
            z2 = true;
        }
        ArrayList arrayList6 = arrayList3;
        return vcg1Var.b != 2 ? o7h.N0(arrayList6, Collections.singletonList(new yw31(i))) : arrayList6;
    }

    public static final pfl r(uel uelVar) {
        ifl iflVar;
        jfl jflVarA = nb51.A(uelVar);
        ArrayList arrayList = jflVarA.a;
        int size = arrayList.size();
        yel yelVar = uelVar.a;
        if (u890.j(yelVar, vel.a)) {
            iflVar = ifl.a;
        } else {
            boolean z = yelVar instanceof xel;
            ifl iflVar2 = ifl.b;
            if (!z && !(yelVar instanceof wel)) {
                eg.o();
                return null;
            }
            iflVar = iflVar2;
        }
        int i = !arrayList.isEmpty() ? 1 : 2;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        int i2 = 0;
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            vcl vclVar = (vcl) obj;
            int iS = s(jflVarA, vclVar.a);
            String str = vclVar.f;
            arrayList2.add(new kdl(vclVar.a, vclVar.b, vclVar.c, str.length() > 0 ? str : null, vclVar.d, zcl.a, i3, iS));
            i3 = i4;
        }
        ArrayList arrayList3 = jflVarA.b;
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        for (Object obj2 : arrayList3) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            vcl vclVar2 = (vcl) obj2;
            bdl bdlVar = nb51.x(uelVar) ? new bdl(uelVar.c.contains(vclVar2.a)) : adl.a;
            int i6 = size + i2;
            int iS2 = s(jflVarA, vclVar2.a);
            String str2 = vclVar2.f;
            arrayList4.add(new kdl(vclVar2.a, vclVar2.b, vclVar2.c, str2.length() > 0 ? str2 : null, vclVar2.d, bdlVar, i6, iS2));
            i2 = i5;
        }
        return new pfl(i, iflVar, arrayList2, arrayList4);
    }

    public static final int s(jfl jflVar, String str) {
        int i;
        if (!u890.j(jflVar.c, str) || (i = jflVar.d) == 0) {
            return 0;
        }
        int iC = l1d.C(i);
        if (iC == 0) {
            return 1;
        }
        if (iC == 1) {
            return 2;
        }
        if (iC == 2) {
            return 3;
        }
        eg.o();
        return 0;
    }

    public int k() {
        return 2;
    }
}
