package p;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class u7n0 {
    public static final yp21 a = new yp21(d7u0.class);
    public static b180 b;

    public static final i930 A(FontWeight fontWeight) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return hm5.d(new a930[]{o0c.a(14, (FontWeight) null, new ja30(new ga30[]{u890.I(50.0f), u890.H(fontWeight.a)}))});
    }

    public static void B(Window.Callback callback, List list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }

    public static final zba1 C(xtb0 xtb0Var, dca1 dca1Var, d0r d0rVar, iea1 iea1Var, cba1 cba1Var, cca1 cca1Var, v6f v6fVar, String str, x340 x340Var) {
        ven0 ven0VarS = v8r.s(dca1Var, x340Var);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            xzq xzqVar = new xzq(iea1Var, bba1.N0);
            x340Var.s0(xzqVar);
            objT = xzqVar;
        }
        tyq tyqVar = (tyq) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            xzq xzqVar2 = new xzq(cba1Var, bba1.Z);
            x340Var.s0(xzqVar2);
            objT2 = xzqVar2;
        }
        tyq tyqVar2 = (tyq) objT2;
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            m441 m441VarQ = rwq.q(new g8y0(ven0VarS, (byte) 26));
            dnc0 dnc0Var = new dnc0(d0rVar, v6fVar, v6fVar, new cc9(15, 8, 4), (guh0) null, 70);
            two1.v(dnc0Var, new yc2(m441VarQ, (byte) 22), false, new iv81(tyqVar, tyqVar2, (byte) 18));
            objT3 = dnc0Var.a();
            x340Var.s0(objT3);
        }
        q1d0 q1d0VarN = jyo1.n(xtb0Var, (cnc0) objT3, (h3h1) null, x340Var, 4);
        ven0 ven0VarK = f4p1.k(q1d0VarN.b, (iac0) null, x340Var, 7);
        boolean zI = x340Var.i(str) | x340Var.i(xtb0Var);
        Object objT4 = x340Var.T();
        if (zI || objT4 == m4cVar) {
            objT4 = new sb91(str, xtb0Var, (lnm) null, (byte) 12);
            x340Var.s0(objT4);
        }
        qxd0.t(str, x340Var, (vu30) objT4);
        boolean zG = x340Var.g(q1d0VarN);
        Object objT5 = x340Var.T();
        if (zG || objT5 == m4cVar) {
            objT5 = new zba1(q1d0VarN, ven0VarS, ven0VarK, cca1Var);
            x340Var.s0(objT5);
        }
        return (zba1) objT5;
    }

    public static final void D(rtb0 rtb0Var, zba1 zba1Var, String str) {
        cca1 cca1Var = (dca1) zba1Var.b.getValue();
        if ((cca1Var instanceof bca1) && !((bca1) cca1Var).a.isEmpty() && ((rnc0) zba1Var.c.getValue()).b.isEmpty()) {
            cca1Var = zba1Var.d;
        }
        if (cca1Var instanceof bca1) {
            jyo1.m(rtb0Var, zba1Var.a, new nl41(str, (byte) 18));
            return;
        }
        if (cca1Var instanceof cca1) {
            cca1 cca1Var2 = cca1Var;
            rtb0.c(rtb0Var, cca1Var2.a, new j2i(333477579, new xw91(str, cca1Var2, (byte) 4), true), 2);
        } else if (!(cca1Var instanceof aca1)) {
            eg.o();
        } else {
            aca1 aca1Var = (aca1) cca1Var;
            rtb0.c(rtb0Var, aca1Var.a, new j2i(-560457332, new xw91(str, aca1Var, (byte) 5), true), 2);
        }
    }

    public static final lee1 E(lee1 lee1Var) {
        return lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, new wdt0(false), new shc0(17, 0, phc0.b), 0, 15204351);
    }

    public static final void a(rpu rpuVar, boolean z, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1311257505);
        int i2 = i | (b0kVar3.e(rpuVar.ordinal()) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new gy((byte) 22, z);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            ngx ngxVar = ngx.e;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, new uvx(0, ngxVar, 0, (vzq0) null, uyn1.h(2, 12.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 493), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-1427650665, new l1y(rpuVar, (byte) 0), b0kVar3), apo.r(-1163953640, new aw1((byte) 25, z), b0kVar3), (xu30) null, (xu30) null, apo.r(-372862565, new l1y(rpuVar, (byte) 1), b0kVar3), b0kVar2, 64, 197040, 26556);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(rpuVar, z, function0, i, (byte) 15);
        }
    }

    public static final void b(q32 q32Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1451330894);
        int i2 = i | (b0kVar3.g(q32Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new ugj(function0, (byte) 19);
                b0kVar3.s0(objT);
            }
            q3p1.b(0, 1, (Function0) objT, b0kVar3, false);
            boolean z2 = (i2 & 896) == 256;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ugj(function1, (byte) 20);
                b0kVar3.s0(objT2);
            }
            rih1 rih1Var = rih1.a;
            qxd0.C(rih1Var, (Function0) objT2, b0kVar3);
            boolean z3 = i3 == 32;
            Object objT3 = b0kVar3.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new me8(function0, null);
                b0kVar3.s0(objT3);
            }
            qxd0.t(rih1Var, b0kVar3, (vu30) objT3);
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar3).g, 32, qim0VarZ);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarP);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwo1.e(ydh.g(cbx.b(b0kVar3).b.a, 2131952003, b0kVar3, b0kVar3, qim0Var2), u291.f(qim0Var2, 1.0f), cbx.d(b0kVar3).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2024);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uwo1.e(ydh.g(12.0f, 2131952002, b0kVar3, b0kVar3, qim0Var2), u291.f(qim0Var2, 1.0f), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2016);
            b0kVar2 = b0kVar3;
            x0d.s(qim0Var2, cbx.b(b0kVar2).b.a, b0kVar2, true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(q32Var, function0, function1, qim0Var2, i, (byte) 27);
        }
    }

    public static final void c(hux huxVar, gbx gbxVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        Function0 function1;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1023096763);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(false) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(gbxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = i0f0.U0;
                b0kVar3.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            boolean z = (57344 & i3) == 16384;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new to1(function2, (lnm) null, (byte) 14);
                b0kVar3.s0(objT2);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT2);
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, ldx.c, u291.B(qim0Var, een.h, 2), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1375953510, new f90(huxVar, (byte) 14), b0kVar3), b0kVar2, ((i3 >> 6) & 14) | 48, 48, 2040);
            function1 = function2;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            function1 = function0;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0((Object) huxVar, (Object) gbxVar, (Object) qim0Var, function1, i, (byte) 22);
        }
    }

    public static final void d(c9 c9Var, xym xymVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(423455007);
        int i2 = i | (x340Var.g(c9Var) ? 4 : 2) | (x340Var.g(xymVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            hm5.a(c9Var, u291.f(qim0Var3, 1.0f), (iu30) null, (tl3) null, "ElementControlPanelAnimation", (iu30) null, apo.r(-237870707, new wh(xymVar, iu30Var, (byte) 19), x340Var), x340Var, (i2 & 14) | 1597440, 44);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, c9Var, xymVar, iu30Var, qim0Var2, (byte) 1);
        }
    }

    public static final void e(c9 c9Var, xym xymVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2008195472);
        int i2 = i | (x340Var.g(c9Var) ? 4 : 2) | (x340Var.g(xymVar) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, f, 0.0f, 16.0f, 5);
            zzq0 zzq0VarH = uyn1.h(2, cbx.b(x340Var).b.a, 0.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j2d0(c9Var, xymVar, (byte) 17);
                x340Var.s0(objT);
            }
            too1.b(qim0VarB, (xtb0) null, zzq0VarH, (iu30) objT, x340Var, 0, 2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(c9Var, xymVar, qim0Var2, i, (byte) 16);
        }
    }

    public static final void f(o2y o2yVar, iu30 iu30Var, otu otuVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        int i2;
        g6o0 g6o0Var;
        Object obj;
        Object next;
        m4c m4cVar;
        m4c m4cVar2 = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-798063186);
        j06 j06Var = ((x340) b0kVar2).a;
        int i3 = i | (b0kVar2.i(o2yVar) ? 4 : 2) | (b0kVar2.i(iu30Var) ? 32 : 16) | (b0kVar2.g(otuVar) ? 256 : 128) | (b0kVar2.i(function0) ? 2048 : 1024) | 24576;
        if (b0kVar2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            rpu rpuVar = o2yVar.e;
            lnm lnmVar = null;
            if (rpuVar == null) {
                b0kVar2.i0(1838843844);
                b0kVar2.r(false);
                i2 = 0;
            } else {
                b0kVar2.i0(1838843845);
                int i4 = i3 & 896;
                boolean zE = (i4 == 256) | b0kVar2.e(rpuVar.ordinal());
                Object objT = b0kVar2.T();
                Object obj2 = objT;
                if (zE || objT == m4cVar2) {
                    nnu nnuVar = new nnu(otuVar, rpuVar, lnmVar, (byte) 17);
                    b0kVar2.s0(nnuVar);
                    obj2 = nnuVar;
                }
                qxd0.t(rpuVar, b0kVar2, (vu30) obj2);
                String strO0 = cwl1.o0(b0kVar2, 2131954114);
                String strO1 = cwl1.o0(b0kVar2, 2131954111);
                String strO2 = cwl1.o0(b0kVar2, 2131954112);
                String strO3 = cwl1.o0(b0kVar2, 2131954113);
                int i5 = i3 & 112;
                boolean zE2 = b0kVar2.e(rpuVar.ordinal()) | (i5 == 32) | (i4 == 256);
                Object objT2 = b0kVar2.T();
                Object obj3 = objT2;
                if (zE2 || objT2 == m4cVar2) {
                    m1y m1yVar = new m1y(iu30Var, otuVar, rpuVar);
                    b0kVar2.s0(m1yVar);
                    obj3 = m1yVar;
                }
                Function0 function1 = (Function0) obj3;
                boolean zE3 = (i4 == 256) | b0kVar2.e(rpuVar.ordinal()) | (i5 == 32);
                Object objT3 = b0kVar2.T();
                Object obj4 = objT3;
                if (zE3 || objT3 == m4cVar2) {
                    m1y m1yVar2 = new m1y(otuVar, rpuVar, iu30Var);
                    b0kVar2.s0(m1yVar2);
                    obj4 = m1yVar2;
                }
                Function0 function2 = (Function0) obj4;
                boolean z = i5 == 32;
                Object objT4 = b0kVar2.T();
                Object obj5 = objT4;
                if (z || objT4 == m4cVar2) {
                    q7u q7uVar = new q7u(iu30Var, (byte) 25);
                    b0kVar2.s0(q7uVar);
                    obj5 = q7uVar;
                }
                i2 = 0;
                yah0.d(strO0, strO1, strO2, strO3, function1, function2, (Function0) obj5, b0kVar2, 0, 0);
                b0kVar2.r(false);
            }
            Boolean boolValueOf = Boolean.valueOf(o2yVar.h);
            int i6 = (b0kVar2.i(o2yVar) ? 1 : 0) | ((i3 & 7168) == 2048 ? 1 : i2);
            Object objT5 = b0kVar2.T();
            if (i6 != 0 || objT5 == m4cVar2) {
                g6o0Var = null;
                nnu nnuVar2 = new nnu(o2yVar, function0, g6o0Var, (byte) 18);
                b0kVar2.s0(nnuVar2);
                obj = nnuVar2;
            } else {
                g6o0Var = null;
                obj = objT5;
            }
            qxd0.t(boolValueOf, b0kVar2, (vu30) obj);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(u291.f(qim0Var3, 1.0f), k1o1.q(b0kVar2), g6o0Var);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, i2);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarL);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z2 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            String strO4 = cwl1.o0(b0kVar2, 2131954120);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).h;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar = cbx.b(b0kVar2).b;
            m4c m4cVar3 = m4cVar2;
            uwo1.e(strO4, uyn1.z(0.0f, 12.0f, 1, qim0VarF), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
            b0kVar2 = b0kVar2;
            rqo1.g(0, 1, b0kVar2, (qim0) null);
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarH);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            if (o2yVar.b || o2yVar.c) {
                b0kVar2.i0(-826541952);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-826800461);
                t0z t0zVar = rpu.d;
                d7 d7Var = new d7(t0zVar, (byte) 0);
                while (d7Var.hasNext()) {
                    rpu rpuVar2 = (rpu) d7Var.next();
                    String str = o2yVar.a;
                    Iterator it = t0zVar.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((rpu) next).a.equals(str));
                    rpu rpuVar3 = (rpu) next;
                    if (rpuVar3 == null) {
                        rpuVar3 = rpu.STANDARD;
                    }
                    boolean z3 = rpuVar2 == rpuVar3;
                    boolean zE4 = ((i3 & 112) == 32) | b0kVar2.e(rpuVar2.ordinal());
                    Object objT6 = b0kVar2.T();
                    if (zE4) {
                        m4cVar = m4cVar3;
                    } else {
                        m4cVar = m4cVar3;
                        if (objT6 == m4cVar) {
                        }
                        a(rpuVar2, z3, (Function0) objT6, b0kVar2, 0);
                        m4cVar3 = m4cVar;
                    }
                    objT6 = new t3x((Object) iu30Var, (Object) rpuVar2, (byte) 4);
                    b0kVar2.s0(objT6);
                    a(rpuVar2, z3, (Function0) objT6, b0kVar2, 0);
                    m4cVar3 = m4cVar;
                }
                b0kVar2.r(false);
            }
            uwr uwrVar2 = cbx.a;
            op71.g(b0kVar2, u291.h(qim0Var3, cbx.b(b0kVar2).b.c));
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            iu30Var = iu30Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 22, i, o2yVar, iu30Var, otuVar, function0, qim0Var2);
        }
    }

    public static final void g(int i, int i2, Function0 function0, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(918369741);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            uwo1.e(cwl1.n0(2131956925, new Object[]{Integer.valueOf(i)}, x340Var), anm1.N("listenAlongSectionHeader", kk0.q(x340Var, qim0VarE, y580.Y, 1.0f, false)), cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(-377222366);
                wro1.h(new gbx(z50.c, function0), ldx.c, anm1.N("listenAlongInfoButton", nim0Var), (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, sti.b, x340Var, 0, 6, 984);
                x340Var.r(false);
            } else {
                x340Var.i0(-376671527);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u2y(i, z, function0, i2, (byte) 3);
        }
    }

    public static final void h(c9 c9Var, boolean z, boolean z2, iu30 iu30Var, r9u0 r9u0Var, xym xymVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1527273154);
        int i2 = i | (x340Var.g(c9Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.g(r9u0Var) ? 16384 : 8192) | (x340Var.g(xymVar) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            fq7.b(pbh.a, !c9Var.isEmpty(), (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(-1798026612, new tf(z2, c9Var, xymVar, iu30Var, (byte) 18), x340Var), x340Var, 1572870, 30);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = z1f0.c1;
                x340Var.s0(objT);
            }
            dgo1.c("footerView", (iu30) objT, apo.r(1601849328, new kf2(z, r9u0Var, (byte) 12), x340Var), x340Var, 438);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(c9Var, z, z2, iu30Var, r9u0Var, xymVar, qim0Var2, i);
        }
    }

    public static final void i(uqm0 uqm0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        List list = uqm0Var.d;
        String str = uqm0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(844738484);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(uqm0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new nfk0(iu30Var, (byte) 7);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(u291.h(i1p1.q(bin.v(qim0Var3, idn0Var, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28), er31.b(8.0f)), 142.0f), 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.d, d4o1.a);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = xjm0.V0;
                x340Var.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarF2, false, (iu30) objT3);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarK = xcg1.k(cbx.a, u291.r(qim0Var3, 142.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarK);
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
            Uri uri = Uri.parse(uqm0Var.c);
            qim0 qim0VarN = anm1.N("multi_event_wide_card_image", u291.r(qim0Var3, 142.0f));
            nkx nkxVar = nkx.c;
            qim0Var2 = qim0Var3;
            eso1.e(uri, isl.a, qim0VarN, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, x340Var, 1073766448, 0, 3560);
            x340Var.r(true);
            qim0 qim0VarY = uyn1.y(u291.d(qim0Var2, 1.0f), 16.0f, 12.0f);
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            uwo1.e(uqm0Var.a, anm1.N("multi_event_wide_card_title", qim0Var2), cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1776);
            x340Var = x340Var;
            if (str.length() > 0) {
                x340Var.i0(-1914784974);
                qim0 qim0VarN2 = anm1.N("multi_event_wide_card_subtitle", qim0Var2);
                String strU = uqm0Var.e;
                if (strU == null) {
                    x340Var.i0(1323712389);
                    strU = cwl1.U(2131820773, list.size(), new Object[]{Integer.valueOf(list.size())}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1323711149);
                    x340Var.r(false);
                }
                uwo1.e(f4i1.f(str, " • ", strU), qim0VarN2, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1712);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-1914221580);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new arm0(uqm0Var, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void j(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-832316380);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(u291.h(i1p1.q(nim0.a, er31.b(8.0f)), 142.0f), 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarF, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 7);
        }
    }

    public static final void k(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-596266476);
        int i2 = (x340Var.e(2131232428) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            int i3 = z ? 2131233464 : 2131233465;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = vap1.a(context, i3);
                x340Var.s0(objT);
            }
            Drawable drawable = (Drawable) objT;
            qim0 qim0Var = nim0.a;
            cwl1.f(x7v.a(drawable, x340Var), (String) null, u291.d(qim0Var, 1.0f).then(z ? i1p1.q(qim0Var, er31.a) : qim0Var), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, x340Var, 24632, 104);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k750((byte) 14, i, z);
        }
    }

    public static final void l(String str, egq0 egq0Var, boolean z, boolean z2, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        float f;
        uwr uwrVar = cbx.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1204232484);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(egq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (z2) {
                b0kVar3.i0(961043724);
                zov0 zov0Var = cbx.b(b0kVar3).g;
                b0kVar3.r(false);
                f = 48.0f;
            } else {
                b0kVar3.i0(961116140);
                zov0 zov0Var2 = cbx.b(b0kVar3).g;
                b0kVar3.r(false);
                f = 64.0f;
            }
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(12.0f, 0.0f, 12.0f, 0.0f);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(1, (pgx) null, 3, zzq0Var, (zzq0) null, new tvx(2.0f, 12.0f, 8.0f), (hw61) null, 0, new p3v(f), 210);
            qim0 qim0VarN = anm1.N("OnboardingRowElementTestTag", pqo.h(qim0Var, z));
            boolean z3 = (i2 & 57344) == 16384;
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new dgq0(iu30Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, (xu30) null, apo.r(-497564795, new qsn0(egq0Var, (byte) 24), b0kVar3), (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-281167584, new qdg0(str, (byte) 17), b0kVar3), b0kVar2, 805306432, 196608, 32188);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(str, egq0Var, z, z2, iu30Var, qim0Var, i);
        }
    }

    public static final void m(boolean z, r9u0 r9u0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        tl3 tl3Var;
        Function0 function0;
        boolean z2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1535413089);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(r9u0Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z4) {
                x340Var.l(function1);
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
            qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0Var3);
            tl3 tl3Var2 = een.d;
            gfh0 gfh0VarC = t1c.c(tl3Var2, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            r9u0Var.b.invoke(x340Var, 0);
            x340Var.r(true);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            if (z) {
                x340Var.i0(1084673732);
                tl3Var = tl3Var2;
                function0 = function1;
                qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 0.0f, 28.0f, 0.0f, 11);
                gfh0 gfh0VarC2 = t1c.c(tl3Var, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                z2 = false;
                ktd.s(r9u0Var.c, x340Var, 0, true, false);
            } else {
                tl3Var = tl3Var2;
                function0 = function1;
                z2 = false;
                x340Var.i0(1084770793);
                x340Var.r(false);
            }
            qim0 qim0VarR = u291.r(qim0Var3, 64.0f);
            gfh0 gfh0VarC3 = t1c.c(een.h, z2);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarR);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            r9u0Var.a.invoke(x340Var, 0);
            x340Var.r(true);
            if (z) {
                x340Var.i0(1084935558);
                qim0 qim0VarB2 = uyn1.B(qim0Var3, 28.0f, 0.0f, 0.0f, 0.0f, 14);
                gfh0 gfh0VarC4 = t1c.c(tl3Var, false);
                int iHashCode6 = Long.hashCode(x340Var.T);
                xos0 xos0VarM6 = x340Var.m();
                qim0 qim0VarE6 = zr7.E(x340Var, qim0VarB2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC4, x340Var, lljVar);
                nko1.H(xos0VarM6, x340Var, lljVar2);
                x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE6, x340Var, lljVar4);
                z3 = true;
                ktd.s(r9u0Var.d, x340Var, 0, true, false);
            } else {
                z3 = true;
                x340Var.i0(1085030697);
                x340Var.r(false);
            }
            x340Var.r(z3);
            x340Var.r(z3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(z, r9u0Var, qim0Var2, i, (byte) 2);
        }
    }

    public static final void n(String str, boolean z, boolean z2, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1480577953);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = str != null;
            String strO0 = cwl1.o0(b0kVar3, z3 ? 2131958352 : 2131958331);
            gdx gdxVarS = yla.s(b0kVar3);
            jdx jdxVar = jdx.c;
            boolean zH = ((i2 & 57344) == 16384) | b0kVar3.h(z3) | ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object objT = b0kVar3.T();
            if (zH || objT == fkj0.X) {
                objT = new zg6(z3, str, function0, iu30Var);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            hax haxVar = (z3 || !z2) ? jax.a : new hax(strO0);
            if (z3) {
                b0kVar3.i0(1417639245);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(1417329896);
                j2iVarR = apo.r(-1928385221, new ov51((byte) 4, z), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, jdxVar, (qim0) null, haxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, j2iVarR, (vu30) null, apo.r(-1354781218, new zsd1(strO0, (byte) 6), b0kVar3), b0kVar2, 0, 48, 1484);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(str, z, z2, function0, iu30Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(String str, String str2, iu30 iu30Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object objI;
        Object obj;
        byte b2;
        Object obj2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(109416391);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objI = objT;
                objI = pzm.i(x340Var);
            }
            objI = objT;
            lz20 lz20Var = (lz20) objI;
            az20 az20Var = (az20) x340Var.k(t4k.i);
            Object[] objArr = new Object[0];
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT2 = x340Var.T();
            Object obj3 = objT2;
            if (z || objT2 == m4cVar) {
                yt3 yt3Var = new yt3(str, (byte) 0);
                x340Var.s0(yt3Var);
                obj3 = yt3Var;
            }
            ven0 ven0VarV = k5p1.v(objArr, c8e1.d, (Function0) obj3, x340Var, 0);
            boolean zI = (i3 == 4) | x340Var.i(ven0VarV);
            Object objT3 = x340Var.T();
            Object obj4 = objT3;
            if (zI || objT3 == m4cVar) {
                k2 k2Var = new k2(str, ven0VarV, (lnm) null, (byte) 26);
                x340Var.s0(k2Var);
                obj4 = k2Var;
            }
            qxd0.t(str, x340Var, (vu30) obj4);
            boolean zI2 = x340Var.i(lz20Var);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                fx1 fx1Var = new fx1(lz20Var, (lnm) null, (byte) 1);
                x340Var.s0(fx1Var);
                obj = fx1Var;
            } else {
                obj = objT4;
            }
            qxd0.t(rih1.a, x340Var, (vu30) obj);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var4, 1.0f), 56.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, dug.f(qim0VarH, cbx.a(x340Var).a.b.a(), d4o1.a));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            w0h1.a(ikx.c, new jsl(cwl1.o0(x340Var, 2131961550)), uyn1.x(bin.x(py20.a(u291.r(qim0Var4, 48.0f), 0L, (cr31) null, x340Var, 0, 15), false, (String) null, (pm31) null, (idn0) null, function1, 15), 12.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, ikx.d, 48);
            c8e1 c8e1Var = (c8e1) ven0VarV.getValue();
            qim0 qim0VarP = vby0.p(anm1.N("allboarding_search_field", new wnb0(1.0f, true)), lz20Var);
            boolean zI3 = x340Var.i(az20Var);
            Object objT5 = x340Var.T();
            if (zI3 || objT5 == m4cVar) {
                b2 = 0;
                wt3 wt3Var = new wt3(az20Var, (byte) 0);
                x340Var.s0(wt3Var);
                obj2 = wt3Var;
            } else {
                b2 = 0;
                obj2 = objT5;
            }
            qim0 qim0VarT = y9g1.t(qim0VarP, (iu30) obj2);
            kua0 kua0Var = new kua0(-1, Boolean.FALSE, 1, 3, (Boolean) null, (LocaleList) null);
            boolean zI4 = x340Var.i(az20Var);
            Object objT6 = x340Var.T();
            Object obj5 = objT6;
            if (zI4 || objT6 == m4cVar) {
                wt3 wt3Var2 = new wt3(az20Var, (byte) 1);
                x340Var.s0(wt3Var2);
                obj5 = wt3Var2;
            }
            bua0 bua0Var = new bua0((iu30) null, (iu30) null, (iu30) obj5, 47);
            lee1 lee1Var = new lee1(cbx.a(x340Var).b.a, cbx.d(x340Var).g.a.b, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777212);
            n6a1 n6a1Var = new n6a1(cbx.a(x340Var).b.c);
            int i4 = (x340Var.i(ven0VarV) ? 1 : 0) | ((i2 & 896) == 256 ? (byte) 1 : b2);
            Object objT7 = x340Var.T();
            Object obj6 = objT7;
            if (i4 != 0 || objT7 == m4cVar) {
                gp0 gp0Var = new gp0(iu30Var, ven0VarV, (byte) 1);
                x340Var.s0(gp0Var);
                obj6 = gp0Var;
            }
            boolean z2 = b2;
            xea.d(c8e1Var, (iu30) obj6, qim0VarT, false, lee1Var, kua0Var, bua0Var, true, 0, 0, (elk1) null, (iu30) null, n6a1Var, apo.r(66229352, new xt3(str2, ven0VarV, b2), x340Var), x340Var, 100663296, 196608, 15896);
            x340Var = x340Var;
            if (((c8e1) ven0VarV.getValue()).a.b.length() > 0) {
                x340Var.i0(-528080217);
                qim0Var3 = qim0Var4;
                w0h1.a(fux.c, new jsl(cwl1.o0(x340Var, 2131961489)), uyn1.x(bin.x(py20.a(u291.r(qim0Var3, 48.0f), 0L, (cr31) null, x340Var, 0, 15), false, (String) null, (pm31) null, (idn0) null, function0, 15), 12.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, fux.d, 48);
                x340Var = x340Var;
                x340Var.r(z2);
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(-527751369);
                x340Var.r(z2);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40((Object) str, (Object) str2, iu30Var, (Object) function0, (cv30) function1, qim0Var2, i, (byte) 3);
        }
    }

    public static final void p(rca1 rca1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1479849597);
        int i2 = (x340Var.i(rca1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            sca1.a.f(rca1Var, x340Var, i2 & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wh91(rca1Var, i, (byte) 10);
        }
    }

    public static final void q(boolean z, boolean z2, Function0 function0, boolean z3, String str, boolean z4, boolean z5, Function0 function1, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z6;
        boolean z7;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1738985225);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.h(z5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 67108864 : 33554432;
        }
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            qim0 qim0VarN = anm1.N("collection_preview_show_all", u291.f(nim0.a, 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            int i3 = i2;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z) {
                x340Var.i0(251668695);
                z6 = false;
                z7 = true;
                hr80.c(z2, function0, (qim0) null, 0.0f, x340Var, (i3 >> 3) & 126, 4);
                x340Var.r(false);
            } else {
                z6 = false;
                z7 = true;
                x340Var.i0(251820533);
                x340Var.r(false);
            }
            if (z3) {
                x340Var.i0(251859035);
                n(str, z4, z5, function1, iu30Var, x340Var, (i3 >> 12) & 65534);
                x340Var = x340Var;
                x340Var.r(z6);
            } else {
                x340Var.i0(252160789);
                x340Var.r(z6);
            }
            x340Var.r(z7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xrf1(z, z2, function0, z3, str, z4, z5, function1, iu30Var, i);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v60 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v60 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v61 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v61 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v67 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v67 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v70 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v70 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r38v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v31 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v33 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v37 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r64v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r64v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r65v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r65v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v28 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r64v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r64v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r65v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r65v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void r(java.lang.String r43, p.c380 r44, boolean r45, boolean r46, p.vu30 r47, kotlin.jvm.functions.Function0 r48, kotlin.jvm.functions.Function0 r49, p.vu30 r50, p.l6q r51, p.j2i r52, p.d0r r53, boolean r54, p.qim0 r55, boolean r56, boolean r57, java.lang.String r58, boolean r59, boolean r60, kotlin.jvm.functions.Function0 r61, p.iu30 r62, p.b0k r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instruction units count: 1710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u7n0.r(java.lang.String, p.c380, boolean, boolean, p.vu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.vu30, p.l6q, p.j2i, p.d0r, boolean, p.qim0, boolean, boolean, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, p.iu30, p.b0k, int, int, int):void");
    }

    public static final void s(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(440299409);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gra graVar = een.h;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = dug.f(u291.r(u291.B(qim0Var2, graVar, 2), 24.0f), u7h.j, er31.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            rhx0.a(h2c.a.a(qim0Var2, graVar), u7h.f, 4.0f, 0L, 0, 0.0f, x340Var, 432, 56);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 4);
        }
    }

    public static final Object t(x4t x4tVar, Function0 function0, onm onmVar) {
        pim0 pim0Var;
        ndo0 ndo0VarZ;
        Object objC;
        jdo0 jdo0Var;
        if (((pim0) x4tVar).a.N0) {
            pim0 pim0Var2 = (pim0) x4tVar;
            if (!pim0Var2.a.N0) {
                qf80.c("visitAncestors called on an unattached node");
            }
            pim0 pim0Var3 = pim0Var2.a.e;
            hmb0 hmb0VarB = oap1.B(x4tVar);
            loop0: while (true) {
                pim0Var = null;
                if (hmb0VarB == null) {
                    break;
                }
                if ((((pim0) hmb0VarB.e1.g).d & 524288) != 0) {
                    while (pim0Var3 != null) {
                        if ((pim0Var3.c & 524288) != 0) {
                            pim0 pim0VarS = pim0Var3;
                            bfn0 bfn0Var = null;
                            while (pim0VarS != null) {
                                if (pim0VarS instanceof f5c) {
                                    pim0Var = pim0VarS;
                                    break loop0;
                                }
                                if ((pim0VarS.c & 524288) != 0 && (pim0VarS instanceof l5t)) {
                                    int i = 0;
                                    for (pim0 pim0Var4 = ((l5t) pim0VarS).P0; pim0Var4 != null; pim0Var4 = pim0Var4.f) {
                                        if ((pim0Var4.c & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                pim0VarS = pim0Var4;
                                            } else {
                                                if (bfn0Var == null) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarS != null) {
                                                    bfn0Var.b(pim0VarS);
                                                    pim0VarS = null;
                                                }
                                                bfn0Var.b(pim0Var4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                pim0VarS = oap1.s(bfn0Var);
                            }
                        }
                        pim0Var3 = pim0Var3.e;
                    }
                }
                hmb0VarB = hmb0VarB.v();
                pim0Var3 = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
            }
            f5c f5cVar = (f5c) pim0Var;
            if (f5cVar != null && (objC = f5cVar.C((ndo0VarZ = oap1.z(x4tVar)), new og(function0, ndo0VarZ, (byte) 13), onmVar)) == d9n.a) {
                return objC;
            }
        }
        return rih1.a;
    }

    public static final yrw u(d7u0 d7u0Var) {
        tqj1 tqj1Var = (tqj1) o7h.s0(d7u0Var.b);
        f2k1 f2k1Var = tqj1Var != null ? tqj1Var.b : null;
        if (f2k1Var == null) {
            f2k1Var = null;
        }
        if (f2k1Var != null) {
            String str = f2k1Var.a;
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                return new yrw(Collections.singletonList(new asw((Integer) null, str, (Integer) null)));
            }
        }
        return null;
    }

    public static final boolean v(String str, String str2) {
        return u890.j(str, str2);
    }

    public static krw0 w() {
        return krw0.i;
    }

    public static final boolean x(m790 m790Var) {
        return m790Var.h || m790Var.e;
    }

    public static void y(Context context) {
        krw0 krw0Var = krw0.i;
        krw0Var.getClass();
        krw0Var.e = new Handler();
        krw0Var.f.g(k8c0.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new jrw0(krw0Var));
    }

    public static final lee1 z(i930 i930Var, lee1 lee1Var, long j) {
        lee1 lee1VarA = lee1.a(lee1Var, 0L, j, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, i930Var == null ? lee1Var.a.f : i930Var, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, TextUnit.c, (u8e1) null, (wdt0) null, (shc0) null, 0, 16646101);
        if (i930Var != null) {
            lee1VarA = lee1.a(lee1VarA, 0L, 0L, FontWeight.t, (FontStyle) null, new FontSynthesis(2), (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777195);
        }
        return E(lee1VarA);
    }
}
