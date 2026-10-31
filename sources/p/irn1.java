package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.net.Uri;
import android.text.format.DateUtils;
import android.view.KeyEvent;
import androidx.compose.ui.graphics.ColorFilter;
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
import com.spotify.base.java.logging.Logger;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class irn1 {
    public static b180 a;

    public static final mmr0 A(ejk1 ejk1Var, float f, int i, float f2) {
        int iB = (int) ((ejk1Var.b() * ejk1Var.c) + f);
        int i2 = ((int) ((2.0f * f) + (i * f2))) - ((int) ejk1Var.b);
        if (i2 < 0) {
            i2 = 0;
        }
        int iP = yoi1.p(iB, 0, i2);
        int iP2 = yoi1.p((int) (iP / f2), 0, i - 1);
        return new mmr0(Integer.valueOf(iP2), Integer.valueOf(iP - ((int) (iP2 * f2))));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void B(String str, grn1 grn1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        int i2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1824503106);
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(grn1Var) ? 32 : 16) | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("contributor-card-subtitle", u291.f(qim0Var3, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, new a0e1(3), null, 2, false, new cjc0(1), 0, null, x340Var, i4 & 14, 0, 1698);
            if (grn1Var instanceof jlg0) {
                i2 = 651505309;
                i3 = 2131953961;
            } else if (grn1Var instanceof klg0) {
                i2 = 651508614;
                i3 = 2131953964;
            } else if (grn1Var instanceof mlg0) {
                i2 = 651512260;
                i3 = 2131953962;
            } else {
                if (!(grn1Var instanceof llg0)) {
                    throw p3d1.k(x340Var, 651503609, false);
                }
                i2 = 651516036;
                i3 = 2131953963;
            }
            uwo1.e(x0d.k(x340Var, i2, i3, x340Var, false), null, cbx.d(x340Var).m, cbx.a(x340Var).b.a, new a0e1(3), null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1698);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(str, grn1Var, qim0Var2, i, (byte) 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x026b  */
    public static final void C(String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, qim0 qim0Var, Integer num, String str2, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        hdn0 hdn0Var;
        frr0 frr0Var;
        ven0 ven0Var;
        int length;
        int i3;
        boolean z;
        ven0 ven0Var2;
        Object objM;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-684232943);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= b0kVar3.g(num) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= b0kVar3.g(str2) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            String strI = str2 != null ? I(str, str2) : str;
            boolean zG = b0kVar3.g(strI);
            Object objT = b0kVar3.T();
            if (zG || objT == obj) {
                objT = h0(strI);
                b0kVar3.s0(objT);
            }
            List list = (List) objT;
            boolean zG2 = b0kVar3.g(list);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == obj) {
                objT2 = o7h.y0(list, "", (String) null, (String) null, z4m.U0, 30);
                b0kVar3.s0(objT2);
            }
            String str3 = (String) objT2;
            boolean zG3 = b0kVar3.g(str3);
            Object objT3 = b0kVar3.T();
            if (zG3 || objT3 == obj) {
                smc0 smc0VarN = k4p1.n();
                nh40 nh40Var = new nh40(se11.b(new se11("\\S+"), str3));
                while (nh40Var.hasNext()) {
                    smc0VarN.add(Integer.valueOf(((rr80) ((mbh0) nh40Var.next()).b()).b + 1));
                }
                objT3 = k4p1.k(smc0VarN);
                b0kVar3.s0(objT3);
            }
            List list2 = (List) objT3;
            int i5 = i4 & 14;
            boolean z2 = i5 == 4;
            Object objT4 = b0kVar3.T();
            hdn0 hdn0Var2 = (hdn0) ((z2 || objT4 == obj) ? bb00.h(0, b0kVar3) : objT4);
            boolean z3 = i5 == 4;
            Object objT5 = b0kVar3.T();
            if (z3 || objT5 == obj) {
                objT5 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var3 = (ven0) objT5;
            boolean z4 = i5 == 4;
            Object objT6 = b0kVar3.T();
            if (z4 || objT6 == obj) {
                objT6 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT6);
            }
            ven0 ven0Var4 = (ven0) objT6;
            boolean z5 = i5 == 4;
            Object objT7 = b0kVar3.T();
            if (z5 || objT7 == obj) {
                objT7 = v8r.q((Object) null);
                b0kVar3.s0(objT7);
            }
            ven0 ven0Var5 = (ven0) objT7;
            boolean z6 = i5 == 4;
            Object objT8 = b0kVar3.T();
            if (z6 || objT8 == obj) {
                objT8 = p3d1.m(0L, b0kVar3);
            }
            frr0 frr0Var2 = (frr0) objT8;
            int i6 = i4 & 112;
            boolean zI = (i6 == 32) | b0kVar3.i(ven0Var3) | b0kVar3.g(list2) | b0kVar3.i(hdn0Var2) | b0kVar3.i(frr0Var2) | b0kVar3.i(ven0Var4);
            Object objT9 = b0kVar3.T();
            if (zI || objT9 == obj) {
                hdn0Var = hdn0Var2;
                l9m l9mVar = new l9m(list2, iu30Var, ven0Var3, hdn0Var, frr0Var2, ven0Var4, (lnm) null);
                frr0Var = frr0Var2;
                ven0Var = ven0Var4;
                b0kVar3.s0(l9mVar);
                objT9 = l9mVar;
            } else {
                ven0Var = ven0Var4;
                frr0Var = frr0Var2;
                hdn0Var = hdn0Var2;
            }
            qxd0.t(str, b0kVar3, (vu30) objT9);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar3).b.a;
            int i7 = i6;
            long j2 = cbx.a(b0kVar3).b.b;
            zma1 zma1VarA = zma1.a(cbx.d(b0kVar3).h.a, j, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            ven0 ven0Var6 = ven0Var;
            String strO0 = cwl1.o0(b0kVar3, 2131958337);
            float fF0 = f0(strO0, zma1VarA, b0kVar3);
            if (((Boolean) ven0Var3.getValue()).booleanValue()) {
                length = str3.length();
            } else {
                err0 err0Var = (err0) hdn0Var;
                if (err0Var.s() >= list2.size()) {
                    length = str3.length();
                } else {
                    length = err0Var.s() > 0 ? ((Number) list2.get(err0Var.s() - 1)).intValue() : 0;
                }
            }
            Integer num2 = (Integer) ven0Var5.getValue();
            long jS = frr0Var.s();
            boolean zG4 = b0kVar3.g(list) | b0kVar3.e(length) | b0kVar3.f(j) | b0kVar3.f(j2) | ((i4 & 896) == 256) | b0kVar3.g(num2);
            int i8 = i4 & 7168;
            boolean zF = b0kVar3.f(jS) | zG4 | (i8 == 2048) | b0kVar3.g(zma1VarA) | b0kVar3.g(strO0);
            Object objT10 = b0kVar3.T();
            if (zF || objT10 == obj) {
                if (((Integer) ven0Var5.getValue()) == null || function0 == null) {
                    i3 = i4;
                    z = false;
                    ven0Var2 = ven0Var5;
                    objM = M(list, length, j, j2, iu30Var2, (((Boolean) ven0Var3.getValue()).booleanValue() || ((Integer) ven0Var2.getValue()) != null) ? null : new o0d(str3, list2, frr0Var));
                } else {
                    Iterator it = list.iterator();
                    int length2 = 0;
                    while (it.hasNext()) {
                        length2 += ((qce1) it.next()).a.length();
                    }
                    af5 af5VarM = M(list, length2, j, j2, iu30Var2, null);
                    Integer num3 = (Integer) ven0Var5.getValue();
                    num3.getClass();
                    i3 = i4;
                    ven0Var2 = ven0Var5;
                    z = false;
                    objM = O(af5VarM, num3.intValue(), j2, strO0, zma1VarA, function0);
                }
                b0kVar3.s0(objM);
            } else {
                ven0Var2 = ven0Var5;
                objM = objT10;
                i3 = i4;
                ven0Var6 = ven0Var6;
                i7 = i7;
                z = false;
            }
            af5 af5Var = (af5) objM;
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).g;
            cjc0 cjc0Var = num != null ? new cjc0(num.intValue()) : bjc0.a;
            boolean zI2 = b0kVar3.i(ven0Var6) | (i8 == 2048 ? true : z) | b0kVar3.i(ven0Var2) | b0kVar3.d(fF0) | (i7 != 32 ? z : true);
            Object objT11 = b0kVar3.T();
            if (zI2 || objT11 == obj) {
                i9m i9mVar = new i9m(function0, fF0, iu30Var, ven0Var6, ven0Var2, (byte) 1);
                b0kVar3.s0(i9mVar);
                objT11 = i9mVar;
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            uwo1.f(af5Var, qim0Var3, lee1Var, null, null, (iu30) objT11, 1, false, cjc0Var, 0, null, null, b0kVar2, (i3 >> 9) & 112, 0, 3736);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(str, iu30Var, iu30Var2, function0, qim0Var2, num, str2, i);
        }
    }

    public static final void D(String str, qim0 qim0Var, lee1 lee1Var, long j, iu30 iu30Var, b0k b0kVar, int i) {
        String str2;
        int i2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(663797573);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (x340Var.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(lee1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = adg.b(str2);
                x340Var.s0(objT);
            }
            List list = (List) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = xox0.Z;
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0Var3, true, (iu30) objT2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            k5p1.d(qim0VarB, new d36(4.0f, true, new um5(false)), null, null, 0, 0, apo.r(-764840192, new nhg(list, lee1Var, j, iu30Var, (byte) 4), x340Var), x340Var, 1572864, 60);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si6(str2, qim0Var2, lee1Var, j, iu30Var, i);
        }
    }

    public static final void E(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(117956836);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var2, 8.0f);
            uwr uwrVar = cbx.a;
            t1c.a(dug.f(qim0VarR, cbx.a(x340Var).c.g, er31.a), x340Var, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 27);
        }
    }

    public static final void F(umo0 umo0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(221918620);
        int i2 = (x340Var.i(umo0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            kno1.e(er31.a, apo.r(-508808281, new p2n1(umo0Var, (byte) 0), x340Var), null, apo.r(-10251479, new p2n1(umo0Var, (byte) 1), x340Var), x340Var, 25008, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p2n1(umo0Var, i);
        }
    }

    public static final void G(kjo0 kjo0Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(302113151);
        int i2 = i | (b0kVar3.i(kjo0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128) | (b0kVar3.i(function2) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            String strO0 = cwl1.o0(b0kVar3, 2131964187);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            boolean z = false;
            gbx gbxVar = new gbx(new y50(strO0), function2);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            if ((i2 & 896) == 256) {
                z = true;
            }
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new uam1(function1, (byte) 1);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            puo1.c(qim0VarF, null, new n9d1(3, (Function0) objT, cmx.c), false, apo.r(1684492201, new l3j1(gbxVar, function0, kjo0Var, function2, (byte) 9), b0kVar3), b0kVar2, 24576, 10);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 18, i, kjo0Var, function0, function1, function2, qim0Var);
        }
    }

    public static final oe5 H(tzg1 tzg1Var, Object obj) {
        if (obj == null) {
            return null;
        }
        return (oe5) tzg1Var.a.invoke(obj);
    }

    public static final String I(String str, String str2) {
        String string = ihc1.f1(str).toString();
        boolean zR = nhc1.R(string, ".", false);
        if (zR) {
            string = ihc1.m0(1, string);
        }
        return zR ? gvg.h(string, " ", str2, ".") : f4i1.f(string, " ", str2);
    }

    public static final void J(ye5 ye5Var, String str, long j, int i, iu30 iu30Var) {
        int i2;
        if (iu30Var == null) {
            int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(str);
                return;
            } finally {
                ye5Var.k(iO);
            }
        }
        for (int i3 = 0; i3 < str.length(); i3 = i2) {
            float fFloatValue = ((Number) iu30Var.invoke(Integer.valueOf(i + i3))).floatValue();
            long jB = u7h.b(j, u7h.c(j) * fFloatValue, 0.0f, 0.0f, 0.0f, 14);
            i2 = i3 + 1;
            while (i2 < str.length() && ((Number) iu30Var.invoke(Integer.valueOf(i + i2))).floatValue() == fFloatValue) {
                i2++;
            }
            int iO2 = ye5Var.o(new zma1(jB, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(str.substring(i3, i2));
                ye5Var.k(iO2);
            } catch (Throwable th) {
                ye5Var.k(iO2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        p.eg.m("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        p.eg.m("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean K(p.n511 r18, p.n511 r19, p.n511 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = L(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = L(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            p.eg.m(r4)
            return r12
        L94:
            p.eg.m(r4)
            return r12
        L98:
            return r18
        L99:
            p.eg.m(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.irn1.K(p.n511, p.n511, p.n511, int):boolean");
    }

    public static final boolean L(int i, n511 n511Var, n511 n511Var2) {
        if (i == 3 || i == 4) {
            return n511Var.d > n511Var2.b && n511Var.b < n511Var2.d;
        }
        if (i == 5 || i == 6) {
            return n511Var.c > n511Var2.a && n511Var.a < n511Var2.c;
        }
        eg.m("This function should only be used for 2-D focus search");
        return false;
    }

    public static final af5 M(List list, int i, long j, long j2, iu30 iu30Var, o0d o0dVar) {
        ye5 ye5Var = new ye5();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            qce1 qce1Var = (qce1) it.next();
            String str = qce1Var.a;
            String str2 = qce1Var.c;
            int length = str.length() + i2;
            if (i2 >= i) {
                break;
            }
            int iMin = Math.min(str.length(), i - i2);
            String strSubstring = str.substring(0, iMin);
            if (str2 != null && iu30Var != null && iMin == str.length()) {
                vhg.c(ye5Var, strSubstring, str2, new zma1(u7h.b(j2, u7h.c(j2) * (o0dVar != 0 ? ((Number) o0dVar.invoke(Integer.valueOf(i2))).floatValue() : 1.0f), 0.0f, 0.0f, 0.0f, 14), fc11.G(13), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61436), iu30Var);
            } else if (qce1Var.b) {
                J(ye5Var, strSubstring, j, i2, o0dVar);
            } else {
                J(ye5Var, strSubstring, j2, i2, o0dVar);
            }
            i2 = length;
        }
        return ye5Var.p();
    }

    public static final af5 N(String str, long j, long j2, iu30 iu30Var) {
        ArrayList<qce1> arrayListH0 = h0(str);
        ye5 ye5Var = new ye5();
        for (qce1 qce1Var : arrayListH0) {
            String str2 = qce1Var.c;
            String str3 = qce1Var.a;
            if (str2 != null && iu30Var != null) {
                vhg.c(ye5Var, str3, str2, new zma1(j2, fc11.G(13), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61436), iu30Var);
            } else if (qce1Var.b) {
                int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(str3);
                    ye5Var.k(iO);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            } else {
                int iO2 = ye5Var.o(new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(str3);
                    ye5Var.k(iO2);
                } catch (Throwable th2) {
                    ye5Var.k(iO2);
                    throw th2;
                }
            }
        }
        return ye5Var.p();
    }

    public static final af5 O(af5 af5Var, int i, long j, String str, zma1 zma1Var, Function0 function0) {
        int i2 = i < 0 ? 0 : i;
        int iA0 = ihc1.A0(af5Var.b.substring(0, i2), ' ', 0, 6);
        if (iA0 > 0 && i2 - iA0 <= 8) {
            i2 = iA0;
        }
        ye5 ye5Var = new ye5();
        ye5Var.h(af5Var.f(0, i2));
        int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
        try {
            ye5Var.g("… ");
            ye5Var.k(iO);
            vhg.a(ye5Var, str, "SEE_MORE", zma1Var, new vj0(function0, (byte) 26));
            return ye5Var.p();
        } catch (Throwable th) {
            ye5Var.k(iO);
            throw th;
        }
    }

    public static final int P(y9e1 y9e1Var, float f) {
        zrm0 zrm0Var = y9e1Var.b;
        long j = y9e1Var.c;
        lr80 it = yoi1.Q(0, zrm0Var.f).iterator();
        Object obj = null;
        while (((sr80) it).c) {
            Object next = it.next();
            if (zrm0Var.b(((Number) next).intValue()) <= ((int) (4294967295L & j))) {
                obj = next;
            }
        }
        Integer num = (Integer) obj;
        int iIntValue = num != null ? num.intValue() : zrm0Var.f - 1;
        int iC = zrm0Var.c(iIntValue, true);
        int i = y9e1Var.i(iIntValue);
        float f2 = (int) (j >> 32);
        if (i <= iC) {
            while (f2 - y9e1Var.e(iC, true) < f) {
                if (iC != i) {
                    iC--;
                }
            }
            return iC;
        }
        return i;
    }

    public static final void Q(d030 d030Var, bfn0 bfn0Var) {
        if (!((pim0) d030Var).a.N0) {
            qf80.c("visitChildren called on an unattached node");
        }
        bfn0 bfn0Var2 = new bfn0(0, new pim0[16]);
        pim0 pim0Var = ((pim0) d030Var).a;
        pim0 pim0Var2 = pim0Var.f;
        if (pim0Var2 == null) {
            oap1.g(bfn0Var2, pim0Var);
        } else {
            bfn0Var2.b(pim0Var2);
        }
        while (true) {
            int i = bfn0Var2.c;
            if (i == 0) {
                return;
            }
            pim0 pim0VarS = (pim0) bfn0Var2.l(i - 1);
            if ((pim0VarS.d & 1024) == 0) {
                oap1.g(bfn0Var2, pim0VarS);
            } else {
                while (pim0VarS != null) {
                    if ((pim0VarS.c & 1024) != 0) {
                        bfn0 bfn0Var3 = null;
                        while (pim0VarS != null) {
                            if (pim0VarS instanceof d030) {
                                d030 d030Var2 = (d030) pim0VarS;
                                if (((pim0) d030Var2).N0 && !oap1.B(d030Var2).p1) {
                                    if (d030Var2.J1().a) {
                                        bfn0Var.b(d030Var2);
                                    } else {
                                        Q(d030Var2, bfn0Var);
                                    }
                                }
                            } else if ((pim0VarS.c & 1024) != 0 && (pim0VarS instanceof l5t)) {
                                int i2 = 0;
                                for (pim0 pim0Var3 = ((l5t) pim0VarS).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                    if ((pim0Var3.c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            pim0VarS = pim0Var3;
                                        } else {
                                            if (bfn0Var3 == null) {
                                                bfn0Var3 = new bfn0(0, new pim0[16]);
                                            }
                                            if (pim0VarS != null) {
                                                bfn0Var3.b(pim0VarS);
                                                pim0VarS = null;
                                            }
                                            bfn0Var3.b(pim0Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            pim0VarS = oap1.s(bfn0Var3);
                        }
                        break;
                    }
                    pim0VarS = pim0VarS.f;
                }
            }
        }
    }

    public static final yhb1 R(ni20 ni20Var, long j) {
        return new yhb1(ni20Var, j);
    }

    public static final hux S(String str) {
        if (str == null) {
            return box.c;
        }
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
            if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                int iOrdinal = s4b1VarX.c.ordinal();
                if (iOrdinal == 30) {
                    return akx.c;
                }
                if (iOrdinal == 44) {
                    return nkx.c;
                }
                if (iOrdinal == 96 || iOrdinal == 98) {
                    return ukx.c;
                }
                if (iOrdinal != 215) {
                    if (iOrdinal == 226 || iOrdinal == 230) {
                        return bnx.c;
                    }
                    if (iOrdinal != 844 && iOrdinal != 860) {
                        return iOrdinal != 926 ? box.c : ltx.c;
                    }
                }
                return mrx.c;
            }
        }
        return grx.c;
    }

    public static final long T(float f, float f2, float f3, float f4) {
        double dLog;
        if (f2 == 0.0f) {
            return 9223372036854L;
        }
        double d = f;
        double d2 = f2;
        double d3 = f3;
        double d4 = f4;
        double dSqrt = Math.sqrt(d) * d2 * 2.0d;
        double d5 = (dSqrt * dSqrt) - (d * 4.0d);
        double dSqrt2 = d5 < 0.0d ? 0.0d : Math.sqrt(d5);
        double d6 = -dSqrt;
        double d7 = (d6 + dSqrt2) * 0.5d;
        double dSqrt3 = (d5 < 0.0d ? Math.sqrt(Math.abs(d5)) : 0.0d) * 0.5d;
        double d8 = (d6 - dSqrt2) * 0.5d;
        if (d4 == 0.0d && d3 == 0.0d) {
            return 0L;
        }
        if (d4 < 0.0d) {
            d3 = -d3;
        }
        double dAbs = Math.abs(d4);
        double d9 = 1.0d;
        double d10 = -1.0d;
        double dAbs2 = Double.MAX_VALUE;
        if (d2 > 1.0d) {
            double d11 = d7 - d8;
            double d12 = ((d7 * dAbs) - d3) / d11;
            double d13 = dAbs - d12;
            dLog = Math.log(Math.abs(1.0d / d13)) / d7;
            double dLog2 = Math.log(Math.abs(1.0d / d12)) / d8;
            if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                dLog = dLog2;
            } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
            double d14 = d13 * d7;
            double dLog3 = Math.log(d14 / ((-d12) * d8)) / (d8 - d7);
            if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                d9 = -1.0d;
            } else {
                if (dLog3 > 0.0d) {
                    if ((-((Math.exp(dLog3 * d8) * d12) + (Math.exp(d7 * dLog3) * d13))) < 1.0d) {
                        dLog = (d12 <= 0.0d || d13 >= 0.0d) ? dLog : 0.0d;
                        d9 = -1.0d;
                    }
                }
                dLog = Math.log((-((d12 * d8) * d8)) / (d14 * d7)) / d11;
            }
            double d15 = d12 * d8;
            if (Math.abs((Math.exp(d8 * dLog) * d15) + (Math.exp(d7 * dLog) * d14)) >= 1.0E-4d) {
                int i = 0;
                while (dAbs2 > 0.001d && i < 100) {
                    i++;
                    double d16 = d7 * dLog;
                    double d17 = d8 * dLog;
                    double dExp = dLog - ((((Math.exp(d17) * d12) + (Math.exp(d16) * d13)) + d9) / ((Math.exp(d17) * d15) + (Math.exp(d16) * d14)));
                    dAbs2 = Math.abs(dLog - dExp);
                    dLog = dExp;
                }
            }
        } else if (d2 < 1.0d) {
            double d18 = (d3 - (d7 * dAbs)) / dSqrt3;
            dLog = Math.log(1.0d / Math.sqrt((d18 * d18) + (dAbs * dAbs))) / d7;
        } else {
            double d19 = d7 * dAbs;
            double d20 = d3 - d19;
            double dLog4 = Math.log(Math.abs(1.0d / dAbs)) / d7;
            double dLog5 = Math.log(Math.abs(1.0d / d20));
            double dLog6 = dLog5;
            for (int i2 = 0; i2 < 6; i2++) {
                dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d7));
            }
            double d21 = dLog6 / d7;
            if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                dLog4 = d21;
            } else if ((Double.doubleToRawLongBits(d21) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog4 = Math.max(dLog4, d21);
            }
            double d22 = (-(d19 + d20)) / (d7 * d20);
            double d23 = d7 * d22;
            double dExp2 = (Math.exp(d23) * d20 * d22) + (Math.exp(d23) * dAbs);
            if (!Double.isNaN(d22) && d22 > 0.0d) {
                if (d22 <= 0.0d || (-dExp2) >= 1.0d) {
                    dLog4 = (-(2.0d / d7)) - (dAbs / d20);
                    d10 = 1.0d;
                } else if (d20 < 0.0d && dAbs > 0.0d) {
                    dLog4 = 0.0d;
                }
            }
            dLog = dLog4;
            int i3 = 0;
            while (dAbs2 > 0.001d && i3 < 100) {
                i3++;
                double d24 = d7 * dLog;
                double dExp3 = dLog - (((Math.exp(d24) * ((d20 * dLog) + dAbs)) + d10) / (Math.exp(d24) * (((d24 + 1.0d) * d20) + d19)));
                dAbs2 = Math.abs(dLog - dExp3);
                dLog = dExp3;
            }
        }
        return (long) (dLog * 1000.0d);
    }

    public static final d030 U(bfn0 bfn0Var, n511 n511Var, int i) {
        n511 n511VarM;
        d030 d030Var = null;
        if (i == 3) {
            n511VarM = n511Var.m((n511Var.c - n511Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            n511VarM = n511Var.m(-((n511Var.c - n511Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            n511VarM = n511Var.m(0.0f, (n511Var.d - n511Var.b) + 1.0f);
        } else {
            if (i != 6) {
                eg.m("This function should only be used for 2-D focus search");
                return null;
            }
            n511VarM = n511Var.m(0.0f, -((n511Var.d - n511Var.b) + 1.0f));
        }
        Object[] objArr = bfn0Var.a;
        int i2 = bfn0Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            d030 d030Var2 = (d030) objArr[i3];
            if (dm5.R(d030Var2)) {
                n511 n511VarL = dm5.L(d030Var2);
                if (Z(n511VarL, n511VarM, n511Var, i)) {
                    d030Var = d030Var2;
                    n511VarM = n511VarL;
                }
            }
        }
        return d030Var;
    }

    public static final boolean V(d030 d030Var, int i, iu30 iu30Var) {
        n511 n511Var;
        bfn0 bfn0Var = new bfn0(0, new d030[16]);
        Q(d030Var, bfn0Var);
        int i2 = bfn0Var.c;
        if (i2 <= 1) {
            d030 d030Var2 = (d030) (i2 == 0 ? null : bfn0Var.a[0]);
            if (d030Var2 != null) {
                return ((Boolean) iu30Var.invoke(d030Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                n511 n511VarL = dm5.L(d030Var);
                float f = n511VarL.a;
                float f2 = n511VarL.b;
                n511Var = new n511(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    eg.m("This function should only be used for 2-D focus search");
                    return false;
                }
                n511 n511VarL2 = dm5.L(d030Var);
                float f3 = n511VarL2.c;
                float f4 = n511VarL2.d;
                n511Var = new n511(f3, f4, f3, f4);
            }
            d030 d030VarU = U(bfn0Var, n511Var, i);
            if (d030VarU != null) {
                return ((Boolean) iu30Var.invoke(d030VarU)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean W(int i, pg pgVar, d030 d030Var, n511 n511Var) {
        if (i0(i, pgVar, d030Var, n511Var)) {
            return true;
        }
        Boolean bool = (Boolean) uap1.q(d030Var, i, new jt00(oap1.C(d030Var).getFocusOwner().h(), d030Var, n511Var, i, pgVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final int X(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static bb80 Y(zfv zfvVar, int i, long j, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        return new bb80(zfvVar, i, j);
    }

    public static final boolean Z(n511 n511Var, n511 n511Var2, n511 n511Var3, int i) {
        if (!a0(i, n511Var, n511Var3)) {
            return false;
        }
        if (a0(i, n511Var2, n511Var3) && !K(n511Var3, n511Var, n511Var2, i)) {
            return !K(n511Var3, n511Var2, n511Var, i) && b0(i, n511Var3, n511Var) < b0(i, n511Var3, n511Var2);
        }
        return true;
    }

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1773618545);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            f65 f65Var = (f65) x340Var.k(t4k.s);
            String strN0 = cwl1.n0(2131955380, new Object[]{"%1$s"}, x340Var);
            String strO0 = cwl1.o0(x340Var, 2131955381);
            int iW0 = ihc1.w0(strN0, "%1$s", 0, false, 6);
            ye5 ye5VarO = kk0.o(-654583727, x340Var);
            if (iW0 < 0) {
                x340Var.i0(-1310321183);
                x340Var.r(false);
                ye5VarO.g(strN0);
            } else {
                x340Var.i0(-1310280139);
                ye5VarO.g(strN0.substring(0, iW0));
                boolean zI = x340Var.i(f65Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new j03(f65Var, (byte) 4);
                    x340Var.s0(objT);
                }
                vhg.c(ye5VarO, strO0, "https://www.spotify.com/legal/privacy-policy", vhg.a, (iu30) objT);
                ye5VarO.g(strN0.substring(iW0 + 4));
                x340Var.r(false);
            }
            af5 af5VarP = ye5VarO.p();
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).m;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            uwo1.d(af5VarP, j, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4080);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var2, i, (byte) 16);
        }
    }

    public static final boolean a0(int i, n511 n511Var, n511 n511Var2) {
        if (i == 3) {
            float f = n511Var2.c;
            float f2 = n511Var2.a;
            float f3 = n511Var.c;
            return (f > f3 || f2 >= f3) && f2 > n511Var.a;
        }
        if (i == 4) {
            float f4 = n511Var2.a;
            float f5 = n511Var2.c;
            float f6 = n511Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < n511Var.c;
        }
        if (i == 5) {
            float f7 = n511Var2.d;
            float f8 = n511Var2.b;
            float f9 = n511Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > n511Var.b;
        }
        if (i != 6) {
            eg.m("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = n511Var2.b;
        float f11 = n511Var2.d;
        float f12 = n511Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < n511Var.d;
    }

    public static final void b(String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, qim0 qim0Var, Integer num, String str2, long j, tr80 tr80Var, n5f0 n5f0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var3;
        b0k b0kVar2;
        qim0 qim0Var2;
        long j2;
        tr80 tr80Var2;
        n5f0 n5f0Var2;
        tr80 tr80Var3;
        n5f0 n5f0Var3;
        int i3;
        qim0 qim0Var3;
        long j3;
        Object h9mVar;
        hdn0 hdn0Var;
        List list;
        n5f0 n5f0Var4;
        tob1 tob1Var;
        boolean z;
        tob1 tob1Var2;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2017555561);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var3 = iu30Var;
            i2 |= b0kVar3.i(iu30Var3) ? 32 : 16;
        } else {
            iu30Var3 = iu30Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= b0kVar3.g(num) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= b0kVar3.g(str2) ? 1048576 : 524288;
        }
        int i5 = 12582912 | i4;
        if ((i & 100663296) == 0) {
            i5 = 46137344 | i4;
        }
        if ((805306368 & i) == 0) {
            i5 |= 268435456;
        }
        if (b0kVar3.Y(i5 & 1, (306783379 & i5) != 306783378)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                tr80Var3 = new tr80(2, 8, 1);
                n5f0Var3 = new n5f0(5L, 10L);
                i3 = i5 & (-2113929217);
                qim0Var3 = nim0.a;
                j3 = 5;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
                j3 = j;
                n5f0Var3 = n5f0Var;
                i3 = i5 & (-2113929217);
                tr80Var3 = tr80Var;
            }
            b0kVar3.s();
            int i6 = i3 & 14;
            boolean z2 = i6 == 4;
            Object objT = b0kVar3.T();
            hdn0 hdn0Var2 = (hdn0) ((z2 || objT == obj) ? bb00.h(0, b0kVar3) : objT);
            String strI = str2 != null ? I(str, str2) : str;
            boolean zG = b0kVar3.g(strI);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == obj) {
                objT2 = h0(strI);
                b0kVar3.s0(objT2);
            }
            List list2 = (List) objT2;
            boolean z3 = i6 == 4;
            Object objT3 = b0kVar3.T();
            if (z3 || objT3 == obj) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            tob1 tob1Var3 = (ven0) objT3;
            boolean z4 = i6 == 4;
            Object objT4 = b0kVar3.T();
            if (z4 || objT4 == obj) {
                objT4 = v8r.q((Object) null);
                b0kVar3.s0(objT4);
            }
            tob1 tob1Var4 = (ven0) objT4;
            boolean zI = b0kVar3.i(tob1Var3) | b0kVar3.i(hdn0Var2) | b0kVar3.g(list2) | b0kVar3.i(tr80Var3);
            tr80 tr80Var4 = tr80Var3;
            int i7 = i3 & 112;
            boolean zI2 = ((i3 & 29360128) == 8388608) | zI | b0kVar3.i(n5f0Var3) | (i7 == 32);
            Object objT5 = b0kVar3.T();
            if (zI2 || objT5 == obj) {
                n5f0 n5f0Var5 = n5f0Var3;
                hdn0Var = hdn0Var2;
                h9mVar = new h9m(list2, tr80Var4, j3, n5f0Var5, iu30Var3, tob1Var3, hdn0Var, (lnm) null);
                list = list2;
                n5f0Var4 = n5f0Var5;
                tob1Var = tob1Var3;
                b0kVar3.s0(h9mVar);
            } else {
                hdn0Var = hdn0Var2;
                n5f0Var4 = n5f0Var3;
                h9mVar = objT5;
                tob1Var = tob1Var3;
                list = list2;
            }
            qxd0.t(str, b0kVar3, (vu30) h9mVar);
            uwr uwrVar = cbx.a;
            long j4 = cbx.a(b0kVar3).b.a;
            long j5 = cbx.a(b0kVar3).b.b;
            zma1 zma1VarA = zma1.a(cbx.d(b0kVar3).h.a, j4, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            String strO0 = cwl1.o0(b0kVar3, 2131958337);
            float fF0 = f0(strO0, zma1VarA, b0kVar3);
            err0 err0Var = (err0) hdn0Var;
            int i8 = i7;
            tob1 tob1Var5 = tob1Var;
            int i9 = i3 & 7168;
            boolean zG2 = ((i3 & 896) == 256) | b0kVar3.g(list) | b0kVar3.e(err0Var.s()) | b0kVar3.f(j4) | b0kVar3.f(j5) | b0kVar3.h(((Boolean) tob1Var.getValue()).booleanValue()) | b0kVar3.g((Integer) tob1Var4.getValue()) | (i9 == 2048) | b0kVar3.g(zma1VarA) | b0kVar3.g(strO0);
            Object objT6 = b0kVar3.T();
            if (zG2 || objT6 == obj) {
                if (!((Boolean) tob1Var5.getValue()).booleanValue() || ((Integer) tob1Var4.getValue()) == null || function0 == null) {
                    z = false;
                    tob1Var2 = tob1Var4;
                    objT6 = M(list, err0Var.s(), j4, j5, iu30Var2, null);
                } else {
                    Iterator it = list.iterator();
                    int length = 0;
                    while (it.hasNext()) {
                        length = ((qce1) it.next()).a.length() + length;
                    }
                    af5 af5VarM = M(list, length, j4, j5, iu30Var2, null);
                    Integer num2 = (Integer) tob1Var4.getValue();
                    num2.getClass();
                    z = false;
                    objT6 = O(af5VarM, num2.intValue(), j5, strO0, zma1VarA, function0);
                    tob1Var2 = tob1Var4;
                }
                b0kVar3.s0(objT6);
            } else {
                tob1Var2 = tob1Var4;
                i8 = i8;
                tob1Var5 = tob1Var5;
                fF0 = fF0;
                z = false;
            }
            af5 af5Var = (af5) objT6;
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).g;
            cjc0 cjc0Var = num != null ? new cjc0(num.intValue()) : bjc0.a;
            int i10 = (((Integer) tob1Var2.getValue()) == null || function0 == null) ? 2 : 1;
            boolean zI3 = (i9 == 2048 ? true : z) | b0kVar3.i(tob1Var5) | b0kVar3.i(tob1Var2) | b0kVar3.d(fF0) | (i8 == 32 ? true : z);
            Object objT7 = b0kVar3.T();
            if (zI3 || objT7 == obj) {
                i9m i9mVar = new i9m(function0, fF0, iu30Var, tob1Var5, tob1Var2, (byte) 0);
                b0kVar3.s0(i9mVar);
                objT7 = i9mVar;
            }
            b0kVar2 = b0kVar3;
            uwo1.f(af5Var, qim0Var3, lee1Var, null, null, (iu30) objT7, i10, false, cjc0Var, 0, null, null, b0kVar2, (i3 >> 9) & 112, 0, 3736);
            qim0Var2 = qim0Var3;
            tr80Var2 = tr80Var4;
            n5f0Var2 = n5f0Var4;
            j2 = j3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            j2 = j;
            tr80Var2 = tr80Var;
            n5f0Var2 = n5f0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j9m(str, iu30Var, iu30Var2, function0, qim0Var2, num, str2, j2, tr80Var2, n5f0Var2, i);
        }
    }

    public static final long b0(int i, n511 n511Var, n511 n511Var2) {
        float f;
        float f2;
        float fD;
        float f3;
        float f4;
        if (i == 3) {
            f = n511Var.a;
            f2 = n511Var2.c;
        } else if (i == 4) {
            f = n511Var2.a;
            f2 = n511Var.c;
        } else if (i == 5) {
            f = n511Var.b;
            f2 = n511Var2.d;
        } else {
            if (i != 6) {
                eg.m("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = n511Var2.b;
            f2 = n511Var.d;
        }
        float f5 = f - f2;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        long j = (long) f5;
        if (i == 3 || i == 4) {
            float f6 = n511Var.b;
            fD = c13.d(n511Var.d, f6, 2.0f, f6);
            f3 = n511Var2.b;
            f4 = n511Var2.d;
        } else {
            if (i != 5 && i != 6) {
                eg.m("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f7 = n511Var.a;
            fD = c13.d(n511Var.c, f7, 2.0f, f7);
            f3 = n511Var2.a;
            f4 = n511Var2.c;
        }
        long j2 = (long) (fD - (((f4 - f3) / 2.0f) + f3));
        return (j2 * j2) + (13 * j * j);
    }

    public static final void c(x5d x5dVar, l2t l2tVar, tym0 tym0Var, lk31 lk31Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        String str;
        tob1 tob1Var;
        boolean z;
        x5d x5dVar2 = x5dVar;
        String str2 = x5dVar2.g;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-790623661);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(x5dVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(l2tVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(tym0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(lk31Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            String str3 = x5dVar2.d;
            nim0 nim0Var = nim0.a;
            oux ouxVar = oux.a;
            isl islVar = isl.a;
            if (str2 == null || ihc1.y0(str2)) {
                x340Var = x340Var2;
                x340Var.i0(131426660);
                Uri uri = Uri.parse(str3);
                qim0 qim0VarR = u291.r(nim0Var, 143.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                eso1.e(uri, islVar, i1p1.q(qim0VarR, er31.b(8.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, ouxVar, false, false, x340Var, 48, 0, 3576);
                x340Var.r(false);
            } else {
                x340Var2.i0(131792832);
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(aj31.a);
                    x340Var2.s0(objT);
                }
                tob1 tob1Var2 = (ven0) objT;
                boolean zI = x340Var2.i(l2tVar) | x340Var2.i(tob1Var2) | x340Var2.i(tym0Var) | x340Var2.i(x5dVar2);
                Object objT2 = x340Var2.T();
                if (zI || objT2 == m4cVar) {
                    str = str3;
                    tob1Var = tob1Var2;
                    us0 us0Var = new us0(l2tVar, tob1Var, tym0Var, x5dVar2, null, (byte) 13);
                    x5dVar2 = x5dVar2;
                    x340Var2.s0(us0Var);
                    objT2 = us0Var;
                } else {
                    str = str3;
                    tob1Var = tob1Var2;
                }
                qxd0.t(str2, x340Var2, (vu30) objT2);
                bj31 bj31Var = (cj31) tob1Var.getValue();
                if (bj31Var instanceof bj31) {
                    x340Var2.i0(132429262);
                    bj31 bj31Var2 = bj31Var;
                    boolean zG = x340Var2.g(bj31Var2.a);
                    Object objT3 = x340Var2.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = v8r.q((Object) null);
                        x340Var2.s0(objT3);
                    }
                    ven0 ven0Var = (ven0) objT3;
                    if (((Throwable) ven0Var.getValue()) == null) {
                        x340Var2.i0(132546349);
                        byte[] bArr = bj31Var2.a;
                        boolean z2 = x5dVar2.i;
                        int i4 = i3 & 57344;
                        boolean z3 = i4 == 16384;
                        Object objT4 = x340Var2.T();
                        if (z3 || objT4 == m4cVar) {
                            objT4 = new gob(iu30Var, (byte) 2);
                            x340Var2.s0(objT4);
                        }
                        Function0 function0 = (Function0) objT4;
                        boolean zI2 = x340Var2.i(ven0Var) | (i4 == 16384);
                        Object objT5 = x340Var2.T();
                        if (zI2 || objT5 == m4cVar) {
                            objT5 = new gp0(iu30Var, ven0Var, (byte) 3);
                            x340Var2.s0(objT5);
                        }
                        jk31 jk31Var = new jk31(bArr, z2, 2, 0, (ik31) null, function0, (iu30) objT5, 24);
                        qim0 qim0VarR2 = u291.r(nim0Var, 143.0f);
                        uwr uwrVar2 = cbx.a;
                        cua cuaVar2 = cbx.b(x340Var2).f;
                        lk31Var.a(jk31Var, i1p1.q(qim0VarR2, er31.b(8.0f)), x340Var2, (i3 >> 3) & 896);
                        x340Var2.r(false);
                        z = false;
                        x340Var = x340Var2;
                    } else {
                        x340Var2.i0(133130234);
                        Uri uri2 = Uri.parse(str);
                        qim0 qim0VarR3 = u291.r(nim0Var, 143.0f);
                        uwr uwrVar3 = cbx.a;
                        cua cuaVar3 = cbx.b(x340Var2).f;
                        z = false;
                        eso1.e(uri2, islVar, i1p1.q(qim0VarR3, er31.b(8.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, ouxVar, false, false, x340Var2, 48, 0, 3576);
                        x340Var = x340Var2;
                        x340Var.r(false);
                    }
                    x340Var.r(z);
                } else {
                    x340Var = x340Var2;
                    z = false;
                    if (bj31Var instanceof zi31) {
                        x340Var.i0(133536179);
                        iu30Var.invoke(Boolean.TRUE);
                        Uri uri3 = Uri.parse(str);
                        qim0 qim0VarR4 = u291.r(nim0Var, 143.0f);
                        uwr uwrVar4 = cbx.a;
                        cua cuaVar4 = cbx.b(x340Var).f;
                        eso1.e(uri3, islVar, i1p1.q(qim0VarR4, er31.b(8.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, ouxVar, false, false, x340Var, 48, 0, 3576);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(133917293);
                        x340Var.r(false);
                    }
                }
                x340Var.r(z);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 19, i, x5dVar2, l2tVar, tym0Var, lk31Var, iu30Var);
        }
    }

    public static final boolean c0(sn50 sn50Var, pr31 pr31Var) {
        iwh0 iwh0Var = sn50Var.d;
        if (iwh0Var == null) {
            eg.m("Required value was null.");
            return false;
        }
        lwh0 lwh0Var = pr31Var.l;
        if (lwh0Var != null) {
            return iwh0Var.o(lwh0Var);
        }
        eg.m("Required value was null.");
        return false;
    }

    public static final void d(plg0 plg0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        gbx gbxVar;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-762190330);
        int i2 = i | (b0kVar3.g(plg0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            long j = ((u7h) b0kVar3.k(gaa1.a)).a;
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.a.a();
            qim0 qim0VarThen = u291.m(nim0.a, 80.0f).then(qim0Var);
            cr31 cr31Var = er31.a;
            qim0 qim0VarO = i1p1.o(i1p1.q(qim0VarThen, cr31Var), plg0Var.a(), jA);
            if (plg0Var instanceof nlg0) {
                b0kVar3.i0(1080472458);
                boolean zF = ((i2 & 112) == 32) | ((i2 & 14) == 4) | b0kVar3.f(j);
                Object objT = b0kVar3.T();
                if (zF || objT == m4cVar) {
                    xlg0 xlg0Var = new xlg0(plg0Var, iu30Var, j, (byte) 1);
                    b0kVar3.s0(xlg0Var);
                    objT = xlg0Var;
                }
                gbxVar = new gbx(z50.c, (Function0) objT);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1080742406);
                b0kVar3.r(false);
                gbxVar = null;
            }
            gbx gbxVar2 = gbxVar;
            gra graVar = een.h;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = ujf0.Y0;
                b0kVar3.s0(objT2);
            }
            kgx kgxVar = new kgx(0, (vu30) objT2, (vu30) null, (vu30) null, 13);
            vzq0.a.getClass();
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarO, graVar, cr31Var, kgxVar, uzq0.b, (max) null, false, (idn0) null, ny3.a, gbxVar2, (gbx) null, apo.r(988890287, new ylg0(plg0Var, (byte) 1), b0kVar3), b0kVar2, 0, 48, 1248);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(plg0Var, iu30Var, qim0Var, i, (byte) 25);
        }
    }

    public static final boolean d0(sn50 sn50Var, pr31 pr31Var) {
        iwh0 iwh0Var = sn50Var.d;
        if (iwh0Var == null) {
            eg.m("Required value was null.");
            return false;
        }
        lwh0 lwh0Var = pr31Var.l;
        if (lwh0Var != null) {
            return iwh0Var.p(lwh0Var);
        }
        eg.m("Required value was null.");
        return false;
    }

    public static final void e(bv40 bv40Var, d0r d0rVar, mjm mjmVar, clg0 clg0Var, clg0 clg0Var2, int i, b0k b0kVar, int i2) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(651430441);
        int i3 = i2 | (x340Var.i(bv40Var) ? 4 : 2) | (x340Var.i(d0rVar) ? 32 : 16) | (x340Var.i(mjmVar) ? 256 : 128) | (x340Var.g(clg0Var) ? 2048 : 1024) | (x340Var.g(clg0Var2) ? 16384 : 8192) | (x340Var.e(i) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean zG = x340Var.g(d0rVar) | x340Var.g(mjmVar);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                ((r2p) ((jly0) ((a0m) bv40Var.b).b).get()).getClass();
                objT = new jd6(mjmVar, d0rVar, (byte) 2);
                x340Var.s0(objT);
            }
            tyq tyqVar = (tyq) objT;
            boolean z = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new xza(i, clg0Var2.a, clg0Var.a);
                x340Var.s0(objT2);
            }
            i1o1.e(tyqVar, (xza) objT2, d0rVar, null, null, jzi.a, null, 0, null, x340Var, ((i3 << 3) & 896) | 196608, 236);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(bv40Var, d0rVar, mjmVar, clg0Var, clg0Var2, i, i2, (byte) 4);
        }
    }

    public static final yua0 e0(iu30 iu30Var) {
        xua0 xua0Var = new xua0();
        iu30Var.invoke(xua0Var);
        return new yua0(xua0Var);
    }

    public static final void f(x5d x5dVar, l2t l2tVar, tym0 tym0Var, lk31 lk31Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        long j;
        long jE;
        x5d x5dVar2 = x5dVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-30955334);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(x5dVar2) ? 4 : 2) | (x340Var2.i(l2tVar) ? 32 : 16) | (x340Var2.i(tym0Var) ? 256 : 128) | (x340Var2.i(lk31Var) ? 2048 : 1024) | 24576 | (x340Var2.i(iu30Var) ? 131072 : 65536);
        if (x340Var2.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var3, 143.0f);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var2);
            }
            idn0 idn0Var = (idn0) objT2;
            jtr jtrVar = jtr.f;
            boolean z = (458752 & i2) == 131072;
            Object objT3 = x340Var2.T();
            if (z || objT3 == m4cVar) {
                objT3 = new gob(iu30Var, (byte) 3);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarY = bin.y(qim0VarV, idn0Var, jtrVar, false, null, null, null, null, (Function0) objT3, 508);
            boolean zI = x340Var2.i(x5dVar2);
            Object objT4 = x340Var2.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new m4d(x5dVar2, (byte) 1);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarA = s161.a(qim0VarY, (iu30) objT4);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
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
            gra graVar = een.h;
            qim0 qim0VarV2 = u291.v(qim0Var3, 143.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarH = u291.h(uyn1.B(qim0VarV2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 143.0f);
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarQ = i1p1.q(qim0VarH, er31.b(8.0f));
            zsc zscVar = zex.a;
            qim0 qim0VarF = dug.f(qim0VarQ, ((yex) zscVar.d).c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
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
            boolean zI2 = x340Var2.i(ven0Var);
            Object objT5 = x340Var2.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new cy7(ven0Var, (byte) 13);
                x340Var2.s0(objT5);
            }
            x5dVar2 = x5dVar;
            c(x5dVar2, l2tVar, tym0Var, lk31Var, (iu30) objT5, x340Var2, i2 & 8190);
            zsc zscVar2 = zscVar;
            String str = x5dVar2.b;
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            try {
                String str2 = x5dVar2.h;
                try {
                    if (str2 == null || ihc1.y0(str2) || zBooleanValue) {
                        jE = ((vex) zscVar2.b).b;
                    } else {
                        jE = z4p1.e(Color.parseColor(iro1.s(str2) ? "#".concat(iro1.y(str2.substring(1))) : "#".concat(iro1.y(str2))));
                    }
                    j = jE;
                } catch (Exception e) {
                    e = e;
                    Logger.e(e, "Failed to parse color in CampaignLinkCardComposable", new Object[0]);
                    uwr uwrVar2 = cbx.a;
                    zscVar2 = zex.a;
                    j = ((vex) zscVar2.b).b;
                }
            } catch (Exception e2) {
                e = e2;
            }
            uwr uwrVar3 = cbx.a;
            lee1 lee1VarA = lee1.a(cbx.d(x340Var2).f, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 12582911);
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
            px8 px8Var = new px8(cbx.d(x340Var2).j.a.b, cbx.d(x340Var2).f.a.b, 0L, new mx8(3), 4);
            Object objT6 = x340Var2.T();
            if (objT6 == m4cVar) {
                objT6 = jpc.T0;
                x340Var2.s0(objT6);
            }
            ajc0 ajc0Var = new ajc0((iu30) objT6);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            gxo1.c(str, uyn1.z(8.0f, 0.0f, 2, qim0Var3), lee1VarA, j, new a0e1(3), 2, false, ajc0Var, px8Var, 150.0f, fontWeight, null, x340Var2, 134217728, 0, 2112);
            x340Var = x340Var2;
            String str3 = x5dVar2.k;
            if (str3 == null) {
                x340Var.i0(-1534416040);
                x340Var.r(false);
            } else {
                x340Var.i0(-1534416039);
                long j2 = ((xex) ((gmt) zscVar2.c).b).h;
                lee1 lee1Var = cbx.d(x340Var).p;
                cjc0 cjc0Var = new cjc0(1);
                qim0 qim0VarF2 = u291.f(qim0Var3, 0.5f);
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                cvx cvxVar5 = cbx.b(x340Var).b;
                uwo1.e(str3, h2c.a.a(uyn1.B(qim0VarF2, 8.0f, 8.0f, 8.0f, 0.0f, 8), dro.c), lee1Var, j2, new a0e1(2), null, 0, false, cjc0Var, 0, null, x340Var, 0, 0, 1760);
                x340Var.r(false);
            }
            x340Var.r(true);
            uwo1.e(x5dVar2.c, u291.v(qim0Var3, 143.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 2, false, new cjc0(4), 0, null, x340Var, 0, 0, 1696);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(x5dVar2, l2tVar, tym0Var, lk31Var, qim0Var2, iu30Var, i, (byte) 13);
        }
    }

    public static final float f0(String str, zma1 zma1Var, b0k b0kVar) {
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(b0kVar).g;
        yae1 yae1VarQ = d5p1.q(0, b0kVar, 1);
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(lee1Var) | x340Var.g(zma1Var) | x340Var.g(str) | x340Var.g((Object) null);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            ye5 ye5Var = new ye5();
            ye5Var.g("… ");
            int iO = ye5Var.o(zma1Var);
            try {
                ye5Var.g(str);
                ye5Var.k(iO);
                objT = Float.valueOf((int) (yae1.b(yae1VarQ, ye5Var.p(), lee1Var, 0, false, 0, 0L, (flb0) null, (wat) null, (f930) null, 2044).c >> 32));
                x340Var.s0(objT);
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        }
        return ((Number) objT).floatValue();
    }

    public static final void g(r8v r8vVar, int i, String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, qim0 qim0Var, boolean z, Integer num, String str2, b0k b0kVar, int i2) {
        Object k9mVar;
        lee1 lee1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1957389730);
        int i3 = i2 | (x340Var.e(r8vVar.ordinal()) ? 4 : 2) | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(iu30Var2) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(qim0Var) ? 1048576 : 524288) | (x340Var.h(z) ? 8388608 : 4194304) | (x340Var.g(num) ? 67108864 : 33554432) | (x340Var.g(str2) ? 536870912 : 268435456);
        if (x340Var.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            long j2 = cbx.a(x340Var).b.b;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            if (z) {
                x340Var.i0(1112391747);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = z4m.T0;
                    x340Var.s0(objT);
                }
                iu30 iu30Var3 = (iu30) objT;
                int i4 = i3 >> 6;
                ftg0.e(str, (qim0) null, iu30Var2, iu30Var3, x340Var, (i4 & 896) | (i4 & 14) | 3072);
                boolean z2 = (i3 & 7168) == 2048;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new v5a(iu30Var, (lnm) null, (byte) 3);
                    x340Var.s0(objT2);
                }
                qxd0.t(str, x340Var, (vu30) objT2);
                x340Var.r(false);
            } else {
                r8v r8vVar2 = r8v.b;
                if (r8vVar == r8vVar2 && i == 2) {
                    x340Var.i0(1112821593);
                    int i5 = i3 >> 9;
                    C(str, iu30Var, iu30Var2, function0, null, num, str2, x340Var, (458752 & i5) | ((i3 >> 6) & 8190) | (3670016 & i5));
                    x340Var = x340Var;
                    x340Var.r(false);
                } else if (r8vVar == r8vVar2) {
                    x340Var.i0(1113140180);
                    int i6 = i3 >> 9;
                    b(str, iu30Var, iu30Var2, function0, null, num, str2, 0L, null, null, x340Var, (458752 & i6) | ((i3 >> 6) & 8190) | (3670016 & i6));
                    x340Var.r(false);
                    x340Var = x340Var;
                } else {
                    x340Var.i0(1113522844);
                    af5 af5VarN = N(str2 != null ? I(str, str2) : str, j, j2, iu30Var2);
                    zma1 zma1VarA = zma1.a(cbx.d(x340Var).h.a, j, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
                    String strO0 = cwl1.o0(x340Var, 2131958337);
                    StringBuilder sb = new StringBuilder();
                    if (str2 != null) {
                        sb.append(" ");
                        sb.append(Pattern.compile("\\[([^]]+)]\\([^)]+\\)").matcher(str2).replaceAll("$1"));
                    }
                    String strN = l1d.n("… ", strO0, sb);
                    yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
                    lee1 lee1Var2 = cbx.d(x340Var).g;
                    int i7 = i3 & 896;
                    af5 af5Var = af5VarN;
                    int i8 = i3 & 1879048192;
                    boolean z3 = (i7 == 256) | (i8 == 536870912);
                    Object objT3 = x340Var.T();
                    if (z3 || objT3 == m4cVar) {
                        objT3 = v8r.q((Object) null);
                        x340Var.s0(objT3);
                    }
                    ven0 ven0Var = (ven0) objT3;
                    af5 af5Var2 = (af5) ven0Var.getValue();
                    if (af5Var2 != null) {
                        af5Var = af5Var2;
                    }
                    cjc0 cjc0Var = num != null ? new cjc0(num.intValue()) : bjc0.a;
                    int i9 = ((af5) ven0Var.getValue()) != null ? 1 : 2;
                    qim0 qim0VarK = d9y0.k(nim0.a, r8vVar == r8v.c ? 0.0f : 1.0f);
                    boolean zI = ((
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0329: ARITH (r1v16 'zI' boolean) = (wrap boolean:0x031d: ARITH (wrap boolean:0x0318: ARITH (wrap boolean:0x0313: ARITH (wrap boolean:0x0306: ARITH (wrap boolean:0x0301: ARITH (wrap boolean:0x02fc: ARITH (wrap boolean:0x02f4: ARITH (wrap boolean:0x02ef: ARITH (wrap boolean:0x02ea: ARITH (wrap boolean:0x02e5: ARITH (wrap boolean:0x02dd: ARITH (wrap boolean:?: TERNARY null = ((wrap int:0x02d4: ARITH (r14v8 int) & (458752 int) A[WRAPPED] (LINE:725)) == (131072 int)) ? true : false) | (wrap boolean:0x02d3: ARITH (wrap boolean:?: TERNARY null = ((wrap int:0x02c7: ARITH (r14v8 int) & (14 int) A[WRAPPED] (LINE:712)) == (4 int)) ? true : false) | (wrap boolean:0x02cf: INVOKE (r6v1 'x340Var' p.x340), (r15v8 'ven0Var' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:720)) A[DONT_WRAP, WRAPPED] (LINE:724)) A[DONT_WRAP, WRAPPED] (LINE:734)) | (wrap boolean:?: TERNARY null = ((r13v4 'i7' int) == (256 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:742)) | (wrap boolean:0x02e6: INVOKE (r6v1 'x340Var' p.x340), (r0v4 'strN' java.lang.String) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:743)) A[DONT_WRAP, WRAPPED] (LINE:747)) | (wrap boolean:0x02eb: INVOKE (r6v1 'x340Var' p.x340), (r3v23 'yae1VarQ' p.yae1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:748)) A[DONT_WRAP, WRAPPED] (LINE:752)) | (wrap boolean:0x02f0: INVOKE (r6v1 'x340Var' p.x340), (r2v9 'lee1Var2' p.lee1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:753)) A[DONT_WRAP, WRAPPED] (LINE:757)) | (wrap boolean:?: TERNARY null = ((r6v9 'i8' int) == (536870912 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:765)) | (wrap boolean:0x02fd: INVOKE (r6v1 'x340Var' p.x340), (r4v8 'j' long) VIRTUAL call: p.x340.f(long):boolean A[WRAPPED] (LINE:766)) A[DONT_WRAP, WRAPPED] (LINE:770)) | (wrap boolean:0x0302: INVOKE (r6v1 'x340Var' p.x340), (r11v2 'j2' long) VIRTUAL call: p.x340.f(long):boolean A[WRAPPED] (LINE:771)) A[DONT_WRAP, WRAPPED] (LINE:775)) | (wrap boolean:?: TERNARY null = ((wrap int:0x030a: ARITH (r14v8 int) & (57344 int) A[WRAPPED] (LINE:779)) == (16384 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:788)) | (wrap boolean:0x0314: INVOKE (r6v1 'x340Var' p.x340), (r4v15 'strO0' java.lang.String) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:789)) A[DONT_WRAP, WRAPPED] (LINE:793)) | (wrap boolean:0x0319: INVOKE (r6v1 'x340Var' p.x340), (r9v5 'zma1VarA' p.zma1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:794)) A[DONT_WRAP, WRAPPED] (LINE:798)) | (wrap boolean:?: TERNARY null = ((wrap int:0x0320: ARITH (r3v14 'i3' int) & (7168 int) A[WRAPPED] (LINE:801)) == (2048 int)) ? true : false) A[DECLARE_VAR] (LINE:810) in method: p.irn1.g(p.r8v, int, java.lang.String, p.iu30, p.iu30, kotlin.jvm.functions.Function0, p.qim0, boolean, java.lang.Integer, java.lang.String, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v8 int
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 947
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.irn1.g(p.r8v, int, java.lang.String, p.iu30, p.iu30, kotlin.jvm.functions.Function0, p.qim0, boolean, java.lang.Integer, java.lang.String, p.b0k, int):void");
                }

                public static final qim0 g0(qim0 qim0Var, iu30 iu30Var) {
                    return qim0Var.then(new t5q0(iu30Var));
                }

                public static final void h(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-231291184);
                    int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
                    if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                        wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var, null, null, null, false, null, null, htj.a, x340Var, (i2 << 3) & 896, 6, 1016);
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new t531(function0, qim0Var, i, (byte) 16);
                    }
                }

                public static final ArrayList h0(String str) {
                    int iMin;
                    int i;
                    ArrayList arrayList = new ArrayList();
                    int length = 0;
                    while (length < str.length()) {
                        int iW0 = ihc1.w0(str, "[", length, false, 4);
                        int iW1 = ihc1.w0(str, "**", length, false, 4);
                        if (iW0 == -1 && iW1 == -1) {
                            iMin = -1;
                        } else if (iW0 == -1) {
                            iMin = iW1;
                        } else {
                            iMin = iW1 == -1 ? iW0 : Math.min(iW0, iW1);
                        }
                        if (iMin == -1) {
                            arrayList.add(new qce1(4, str.substring(length), (String) null, false));
                            length = str.length();
                        } else if (iMin > length) {
                            arrayList.add(new qce1(4, str.substring(length, iMin), (String) null, false));
                            length = iMin;
                        } else if (iMin == iW0) {
                            length = iW0 + 1;
                            int iW2 = ihc1.w0(str, "]", length, false, 4);
                            if (iW2 == -1 || (i = iW2 + 1) >= str.length() || str.charAt(i) != '(') {
                                arrayList.add(new qce1(6, str.substring(iW0, length), (String) null, false));
                            } else {
                                int i2 = iW2 + 2;
                                int iW3 = ihc1.w0(str, ")", i2, false, 4);
                                if (iW3 != -1) {
                                    String strSubstring = str.substring(length, iW2);
                                    String strSubstring2 = str.substring(i2, iW3);
                                    if (strSubstring.length() <= 0 || strSubstring2.length() <= 0) {
                                        arrayList.add(new qce1(6, str.substring(iW0, length), (String) null, false));
                                    } else {
                                        arrayList.add(new qce1(2, strSubstring, strSubstring2, false));
                                        length = iW3 + 1;
                                    }
                                } else {
                                    arrayList.add(new qce1(6, str.substring(iW0, length), (String) null, false));
                                }
                            }
                        } else {
                            int i3 = iW1 + 2;
                            int iW4 = ihc1.w0(str, "**", i3, false, 4);
                            if (iW4 == -1) {
                                arrayList.add(new qce1(4, str.substring(iW1), (String) null, false));
                                length = str.length();
                            } else {
                                String strSubstring3 = str.substring(i3, iW4);
                                if (strSubstring3.length() > 0) {
                                    arrayList.add(new qce1(4, strSubstring3, (String) null, true));
                                }
                                length = iW4 + 2;
                            }
                        }
                    }
                    return arrayList;
                }

                /* JADX WARN: Code duplicated, block: B:102:0x0231  */
                /* JADX WARN: Code duplicated, block: B:108:0x0270  */
                /* JADX WARN: Code duplicated, block: B:114:0x0317  */
                /* JADX WARN: Code duplicated, block: B:118:0x0358  */
                /* JADX WARN: Code duplicated, block: B:121:0x03c2  */
                /* JADX WARN: Code duplicated, block: B:123:0x03cd  */
                /* JADX WARN: Code duplicated, block: B:124:0x03d1  */
                /* JADX WARN: Code duplicated, block: B:127:0x040b  */
                /* JADX WARN: Code duplicated, block: B:128:0x040e  */
                /* JADX WARN: Code duplicated, block: B:132:0x045e  */
                /* JADX WARN: Code duplicated, block: B:137:0x053f  */
                /* JADX WARN: Code duplicated, block: B:138:0x0545  */
                /* JADX WARN: Code duplicated, block: B:146:0x0586  */
                /* JADX WARN: Code duplicated, block: B:149:0x0597  */
                /* JADX WARN: Code duplicated, block: B:152:0x059c  */
                /* JADX WARN: Code duplicated, block: B:156:0x05cd  */
                /* JADX WARN: Code duplicated, block: B:157:0x05cf  */
                /* JADX WARN: Code duplicated, block: B:160:0x0617 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:161:0x0619  */
                /* JADX WARN: Code duplicated, block: B:166:0x065a  */
                /* JADX WARN: Code duplicated, block: B:168:0x065e  */
                /* JADX WARN: Code duplicated, block: B:171:0x069d  */
                /* JADX WARN: Code duplicated, block: B:173:0x06bb A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:174:0x06bd  */
                /* JADX WARN: Code duplicated, block: B:177:0x06d2 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:178:0x06d4  */
                /* JADX WARN: Code duplicated, block: B:180:0x06fa  */
                /* JADX WARN: Code duplicated, block: B:183:0x070c  */
                /* JADX WARN: Code duplicated, block: B:184:0x0716  */
                /* JADX WARN: Code duplicated, block: B:186:0x0726 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:187:0x0728  */
                /* JADX WARN: Code duplicated, block: B:189:0x073c  */
                public static final void i(String str, String str2, zah1 zah1Var, boolean z, boolean z2, los losVar, nu nuVar, vu30 vu30Var, q3w q3wVar, b0k b0kVar, int i) {
                    x340 x340Var;
                    Object obj;
                    Object zn0Var;
                    j06 j06Var;
                    m4c m4cVar;
                    boolean z3;
                    tob1 tob1Var;
                    ven0 ven0Var;
                    boolean z4;
                    y7e1 y7e1Var;
                    c9n c9nVar;
                    tob1 tob1Var2;
                    boolean z5;
                    boolean z6;
                    boolean zI;
                    tob1 tob1Var3;
                    Object obj2;
                    Function0 function0;
                    boolean zI2;
                    Object objT;
                    Function0 function1;
                    tob1 tob1Var4;
                    tob1 tob1Var5;
                    tob1 tob1Var6;
                    tob1 tob1Var7;
                    ven0 ven0Var2;
                    Function0 function2;
                    ven0 ven0VarS;
                    ven0 ven0VarS2;
                    ven0 ven0VarS3;
                    boolean z7;
                    ven0 ven0VarS4;
                    ven0 ven0VarS5;
                    boolean zI3;
                    Object v3wVar;
                    zah1 zah1Var2;
                    los losVar2;
                    boolean zG;
                    Object obj3;
                    nim0 nim0Var;
                    era eraVar;
                    mbh mbhVarA;
                    int iHashCode;
                    xos0 xos0VarM;
                    qim0 qim0VarE;
                    boolean z8;
                    Function0 function3;
                    tob1 tob1Var8;
                    int i2;
                    boolean z9;
                    tob1 tob1Var9;
                    zah1 zah1Var3;
                    tob1 tob1Var10;
                    boolean zI4;
                    Object v3rVar;
                    Function0 function4;
                    float f;
                    tob1 tob1Var11;
                    c9n c9nVar2;
                    tob1 tob1Var12;
                    ven0 ven0Var3;
                    Function0 function5;
                    zah1 zah1Var4;
                    tob1 tob1Var13;
                    tob1 tob1Var14;
                    tob1 tob1Var15;
                    tob1 tob1Var16;
                    tob1 tob1Var17;
                    tob1 tob1Var18;
                    ven0 ven0Var4;
                    zah1 zah1Var5;
                    tob1 tob1Var19;
                    tob1 tob1Var20;
                    tob1 tob1Var21;
                    y7e1 y7e1Var2;
                    boolean z10;
                    boolean zI5;
                    Object objT2;
                    m4c m4cVar2;
                    String strO0;
                    boolean z11;
                    Function0 function6;
                    tob1 tob1Var22;
                    boolean zI6;
                    Object x3wVar;
                    Function0 function7;
                    tob1 tob1Var23;
                    jax haxVar;
                    boolean z12;
                    zah1 zah1Var6;
                    boolean zI7;
                    Object objT3;
                    Object obj4;
                    tob1 tob1Var24;
                    ven0 ven0Var5;
                    boolean zI8;
                    Object objT4;
                    Object obj5;
                    boolean zI9;
                    Object obj6;
                    x340 x340Var2 = (x340) b0kVar;
                    x340Var2.k0(-474205671);
                    j06 j06Var2 = x340Var2.a;
                    int i3 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.i(zah1Var) ? 256 : 128) | (x340Var2.h(z) ? 2048 : 1024) | (x340Var2.h(z2) ? 16384 : 8192) | (x340Var2.i(losVar) ? 131072 : 65536) | (x340Var2.g(nuVar) ? 1048576 : 524288) | (x340Var2.i(vu30Var) ? 8388608 : 4194304) | (x340Var2.g(q3wVar) ? 67108864 : 33554432);
                    if (x340Var2.Y(i3 & 1, (i3 & 38347923) != 38347922)) {
                        y7e1 y7e1VarD = c4p1.D(i3 & 14, 2, str, x340Var2);
                        Object objT5 = x340Var2.T();
                        m4c m4cVar3 = fkj0.X;
                        if (objT5 == m4cVar3) {
                            obj = objT5;
                            c9n c9nVarM = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(c9nVarM);
                            obj = c9nVarM;
                        }
                        obj = objT5;
                        c9n c9nVar3 = (c9n) obj;
                        Object objT6 = x340Var2.T();
                        z6x z6xVar = z6x.a;
                        Object obj7 = objT6;
                        if (objT6 == m4cVar3) {
                            hrr0 hrr0VarQ = v8r.q(z6xVar);
                            x340Var2.s0(hrr0VarQ);
                            obj7 = hrr0VarQ;
                        }
                        tob1 tob1Var25 = (ven0) obj7;
                        Object objT7 = x340Var2.T();
                        Object obj8 = objT7;
                        if (objT7 == m4cVar3) {
                            hrr0 hrr0VarQ2 = v8r.q((Object) null);
                            x340Var2.s0(hrr0VarQ2);
                            obj8 = hrr0VarQ2;
                        }
                        tob1 tob1Var26 = (ven0) obj8;
                        Object objT8 = x340Var2.T();
                        Object obj9 = objT8;
                        if (objT8 == m4cVar3) {
                            hrr0 hrr0VarQ3 = v8r.q(Boolean.FALSE);
                            x340Var2.s0(hrr0VarQ3);
                            obj9 = hrr0VarQ3;
                        }
                        tob1 tob1Var27 = (ven0) obj9;
                        Object objT9 = x340Var2.T();
                        Object obj10 = objT9;
                        if (objT9 == m4cVar3) {
                            hrr0 hrr0VarQ4 = v8r.q((Object) null);
                            x340Var2.s0(hrr0VarQ4);
                            obj10 = hrr0VarQ4;
                        }
                        ven0 ven0Var6 = (ven0) obj10;
                        boolean zI10 = x340Var2.i(y7e1VarD) | x340Var2.i(ven0Var6) | x340Var2.i(c9nVar3) | x340Var2.i(tob1Var27) | x340Var2.i(tob1Var25) | x340Var2.i(vu30Var) | x340Var2.i(tob1Var26);
                        Object objT10 = x340Var2.T();
                        if (zI10 || objT10 == m4cVar3) {
                            j06Var = j06Var2;
                            m4cVar = m4cVar3;
                            z3 = true;
                            tob1Var = tob1Var25;
                            ven0Var = ven0Var6;
                            z4 = false;
                            zn0Var = new zn0(y7e1VarD, c9nVar3, ven0Var, vu30Var, tob1Var27, tob1Var, tob1Var26, (lnm) null, (byte) 8);
                            y7e1Var = y7e1VarD;
                            c9nVar = c9nVar3;
                            tob1Var2 = tob1Var26;
                            x340Var2.s0(zn0Var);
                        } else {
                            j06Var = j06Var2;
                            c9nVar = c9nVar3;
                            tob1Var2 = tob1Var26;
                            z3 = true;
                            zn0Var = objT10;
                            ven0Var = ven0Var6;
                            tob1Var = tob1Var25;
                            m4cVar = m4cVar3;
                            z4 = false;
                            y7e1Var = y7e1VarD;
                        }
                        qxd0.t(y7e1Var, x340Var2, (vu30) zn0Var);
                        Object objT11 = x340Var2.T();
                        Object obj11 = objT11;
                        if (objT11 == m4cVar) {
                            hrr0 hrr0VarQ5 = v8r.q(Boolean.FALSE);
                            x340Var2.s0(hrr0VarQ5);
                            obj11 = hrr0VarQ5;
                        }
                        tob1 tob1Var28 = (ven0) obj11;
                        Object objT12 = x340Var2.T();
                        Object obj12 = objT12;
                        if (objT12 == m4cVar) {
                            hrr0 hrr0VarQ6 = v8r.q(Boolean.FALSE);
                            x340Var2.s0(hrr0VarQ6);
                            obj12 = hrr0VarQ6;
                        }
                        tob1 tob1Var29 = (ven0) obj12;
                        boolean zG2 = x340Var2.g(zah1Var);
                        Object objT13 = x340Var2.T();
                        Object obj13 = objT13;
                        if (zG2 || objT13 == m4cVar) {
                            hrr0 hrr0VarQ7 = v8r.q(zah1Var);
                            x340Var2.s0(hrr0VarQ7);
                            obj13 = hrr0VarQ7;
                        }
                        tob1 tob1Var30 = (ven0) obj13;
                        c9n c9nVar4 = c9nVar;
                        zah1 zah1Var7 = new zah1(cwl1.o0(x340Var2, 2131955391), z4, z6xVar, (hbh1) null);
                        Object objT14 = x340Var2.T();
                        Object obj14 = objT14;
                        if (objT14 == m4cVar) {
                            hrr0 hrr0VarQ8 = v8r.q(Boolean.FALSE);
                            x340Var2.s0(hrr0VarQ8);
                            obj14 = hrr0VarQ8;
                        }
                        ven0 ven0Var7 = (ven0) obj14;
                        Object objT15 = x340Var2.T();
                        Object obj15 = objT15;
                        if (objT15 == m4cVar) {
                            hrr0 hrr0VarQ9 = v8r.q(Boolean.FALSE);
                            x340Var2.s0(hrr0VarQ9);
                            obj15 = hrr0VarQ9;
                        }
                        tob1 tob1Var31 = (ven0) obj15;
                        Object objT16 = x340Var2.T();
                        Object obj16 = objT16;
                        if (objT16 == m4cVar) {
                            mdt mdtVarA = yv91.a(new f2t(y7e1Var, str2, (byte) 24));
                            x340Var2.s0(mdtVarA);
                            obj16 = mdtVarA;
                        }
                        tob1 tob1Var32 = (tob1) obj16;
                        boolean z13 = (z2 || ((Boolean) tob1Var28.getValue()).booleanValue()) ? false : z3;
                        if (z && z13) {
                            z5 = z13;
                            if (!ihc1.y0(y7e1Var.d().d) && !u890.j(y7e1Var.d().d.toString(), str2)) {
                                z6 = z3;
                            }
                            zI = x340Var2.i(losVar);
                            Object objT17 = x340Var2.T();
                            tob1Var3 = tob1Var;
                            obj2 = objT17;
                            if (zI || objT17 == m4cVar) {
                                v7v v7vVar = new v7v(losVar, (byte) 9);
                                x340Var2.s0(v7vVar);
                                obj2 = v7vVar;
                            }
                            function0 = (Function0) obj2;
                            zI2 = x340Var2.i(tob1Var28) | x340Var2.i(tob1Var29) | x340Var2.i(tob1Var32) | x340Var2.i(tob1Var31) | x340Var2.i(ven0Var7) | x340Var2.g(function0);
                            objT = x340Var2.T();
                            if (!zI2 || objT == m4cVar) {
                                function1 = function0;
                                tob1Var4 = tob1Var31;
                                tob1Var5 = tob1Var32;
                                objT = new dy7((byte) 6, function1, tob1Var28, tob1Var29, tob1Var5, tob1Var4, ven0Var7, false);
                                tob1Var6 = tob1Var28;
                                tob1Var7 = tob1Var29;
                                ven0Var2 = ven0Var7;
                                x340Var2.s0(objT);
                            } else {
                                function1 = function0;
                                tob1Var4 = tob1Var31;
                                tob1Var7 = tob1Var29;
                                tob1Var5 = tob1Var32;
                                ven0Var2 = ven0Var7;
                                tob1Var6 = tob1Var28;
                            }
                            function2 = (Function0) objT;
                            ven0VarS = v8r.s(function2, x340Var2);
                            Boolean bool = (Boolean) tob1Var5.getValue();
                            bool.getClass();
                            ven0VarS2 = v8r.s(bool, x340Var2);
                            Boolean bool2 = (Boolean) tob1Var4.getValue();
                            bool2.getClass();
                            ven0VarS3 = v8r.s(bool2, x340Var2);
                            z7 = z6;
                            Boolean bool3 = (Boolean) tob1Var6.getValue();
                            bool3.getClass();
                            ven0VarS4 = v8r.s(bool3, x340Var2);
                            Boolean bool4 = (Boolean) tob1Var7.getValue();
                            bool4.getClass();
                            ven0VarS5 = v8r.s(bool4, x340Var2);
                            zI3 = x340Var2.i(losVar) | x340Var2.i(ven0VarS4) | x340Var2.i(ven0VarS5) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0VarS3) | x340Var2.i(ven0VarS);
                            Object objT18 = x340Var2.T();
                            if (!zI3 || objT18 == m4cVar) {
                                zah1Var2 = zah1Var7;
                                losVar2 = losVar;
                                v3wVar = new v3w(losVar2, ven0VarS4, ven0VarS5, ven0VarS2, ven0VarS3, ven0VarS, (byte) 1);
                                x340Var2.s0(v3wVar);
                            } else {
                                losVar2 = losVar;
                                zah1Var2 = zah1Var7;
                                v3wVar = objT18;
                            }
                            qxd0.i(losVar2, (iu30) v3wVar, x340Var2);
                            boolean z14 = !((Boolean) ven0Var2.getValue()).booleanValue();
                            zG = x340Var2.g((Object) 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x034c: INVOKE (r8v11 'zG' boolean) = (r0v1 'x340Var2' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r30v1 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean (LINE:97) in method: p.irn1.i(java.lang.String, java.lang.String, p.zah1, boolean, boolean, p.los, p.nu, p.vu30, p.q3w, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v1 ??
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 1896
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p.irn1.i(java.lang.String, java.lang.String, p.zah1, boolean, boolean, p.los, p.nu, p.vu30, p.q3w, p.b0k, int):void");
                        }

                        public static final boolean i0(int i, pg pgVar, d030 d030Var, n511 n511Var) {
                            d030 d030VarU;
                            bfn0 bfn0Var = new bfn0(0, new d030[16]);
                            if (!((pim0) d030Var).a.N0) {
                                qf80.c("visitChildren called on an unattached node");
                            }
                            bfn0 bfn0Var2 = new bfn0(0, new pim0[16]);
                            pim0 pim0Var = ((pim0) d030Var).a;
                            pim0 pim0Var2 = pim0Var.f;
                            if (pim0Var2 == null) {
                                oap1.g(bfn0Var2, pim0Var);
                            } else {
                                bfn0Var2.b(pim0Var2);
                            }
                            while (true) {
                                int i2 = bfn0Var2.c;
                                if (i2 == 0) {
                                    break;
                                }
                                pim0 pim0VarS = (pim0) bfn0Var2.l(i2 - 1);
                                if ((pim0VarS.d & 1024) == 0) {
                                    oap1.g(bfn0Var2, pim0VarS);
                                } else {
                                    while (pim0VarS != null) {
                                        if ((pim0VarS.c & 1024) != 0) {
                                            bfn0 bfn0Var3 = null;
                                            while (pim0VarS != null) {
                                                if (pim0VarS instanceof d030) {
                                                    d030 d030Var2 = (d030) pim0VarS;
                                                    if (((pim0) d030Var2).N0) {
                                                        bfn0Var.b(d030Var2);
                                                    }
                                                } else if ((pim0VarS.c & 1024) != 0 && (pim0VarS instanceof l5t)) {
                                                    int i3 = 0;
                                                    for (pim0 pim0Var3 = ((l5t) pim0VarS).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                                        if ((pim0Var3.c & 1024) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                pim0VarS = pim0Var3;
                                                            } else {
                                                                if (bfn0Var3 == null) {
                                                                    bfn0Var3 = new bfn0(0, new pim0[16]);
                                                                }
                                                                if (pim0VarS != null) {
                                                                    bfn0Var3.b(pim0VarS);
                                                                    pim0VarS = null;
                                                                }
                                                                bfn0Var3.b(pim0Var3);
                                                            }
                                                        }
                                                    }
                                                    if (i3 == 1) {
                                                    }
                                                }
                                                pim0VarS = oap1.s(bfn0Var3);
                                            }
                                            break;
                                        }
                                        pim0VarS = pim0VarS.f;
                                    }
                                }
                            }
                            while (bfn0Var.c != 0 && (d030VarU = U(bfn0Var, n511Var, i)) != null) {
                                if (d030VarU.J1().a) {
                                    return ((Boolean) pgVar.invoke(d030VarU)).booleanValue();
                                }
                                if (W(i, pgVar, d030VarU, n511Var)) {
                                    return true;
                                }
                                bfn0Var.k(d030VarU);
                            }
                            return false;
                        }

                        public static final void j(c9n c9nVar, ven0 ven0Var, vu30 vu30Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, String str) {
                            faa0 faa0Var = (faa0) ven0Var.getValue();
                            if (faa0Var != null) {
                                faa0Var.d((CancellationException) null);
                            }
                            ven0Var.setValue(fn31.T(c9nVar, (o8n) null, 0, new xd1(vu30Var, str, ven0Var2, ven0Var3, ven0Var4, (lnm) null, (byte) 7), 3));
                        }

                        public static zu91 j0() {
                            return new zu91(0);
                        }

                        public static final void k(c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, q3w q3wVar, Function0 function0, zah1 zah1Var, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, vu30 vu30Var, ven0 ven0Var6, ven0 ven0Var7, String str, boolean z) {
                            ven0Var.setValue(Boolean.TRUE);
                            faa0 faa0Var = (faa0) ven0Var2.getValue();
                            if (faa0Var != null) {
                                faa0Var.d((CancellationException) null);
                            }
                            fn31.T(c9nVar, (o8n) null, 0, new y3w(q3wVar, str, z, function0, zah1Var, ven0Var3, ven0Var4, ven0Var5, c9nVar, ven0Var2, vu30Var, ven0Var6, ven0Var7, ven0Var, (lnm) null), 3);
                        }

                        public static final n8b1 k0(float f, float f2, Object obj) {
                            return new n8b1(f, f2, obj);
                        }

                        public static final void l(nmo0 nmo0Var, b0k b0kVar, int i) {
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-809855406);
                            int i2 = (x340Var.i(nmo0Var) ? 4 : 2) | i;
                            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                                String str = nmo0Var.b;
                                if (ihc1.y0(str)) {
                                    str = null;
                                }
                                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                                uri.getClass();
                                uwr uwrVar = cbx.a;
                                zov0 zov0Var = cbx.b(x340Var).g;
                                p3v p3vVar = new p3v(48.0f);
                                hux huxVarS = S(nmo0Var.c);
                                eso1.e(uri, isl.a, (qim0) null, p3vVar, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(huxVarS, huxVarS), false, false, x340Var, 1073741872, 0, 3572);
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fak1(nmo0Var, i, (byte) 27);
                            }
                        }

                        public static n8b1 l0(float f, float f2, Object obj, int i) {
                            if ((i & 1) != 0) {
                                f = 1.0f;
                            }
                            if ((i & 2) != 0) {
                                f2 = 1500.0f;
                            }
                            if ((i & 4) != 0) {
                                obj = null;
                            }
                            return new n8b1(f, f2, obj);
                        }

                        public static final void m(fgz fgzVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-1983688911);
                            int i2 = (x340Var.g(fgzVar) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 256 : 128);
                            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                                qim0 qim0VarD = u291.d(qim0Var, 1.0f);
                                boolean z = (i2 & 14) == 4;
                                Object objT = x340Var.T();
                                if (z || objT == fkj0.X) {
                                    objT = new f0z(iu30Var, fgzVar, (byte) 8);
                                    x340Var.s0(objT);
                                }
                                dm5.a((iu30) objT, qim0VarD, (iu30) null, x340Var, 0, 4);
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new g6w(fgzVar, iu30Var, qim0Var, i, (byte) 24);
                            }
                        }

                        public static final ArrayList m0(String str, ArrayList arrayList) {
                            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                iwh0 iwh0Var = (iwh0) it.next();
                                arrayList2.add(new sn50(e130.v(iwh0Var, str), ((lwh0) iwh0Var).c, e130.w(str, Collections.unmodifiableList(((lwh0) iwh0Var).v)), iwh0Var));
                            }
                            return arrayList2;
                        }

                        public static final void n(long j, sm51 sm51Var, qim0 qim0Var, b0k b0kVar, int i) {
                            long j2;
                            b0k b0kVar2;
                            tob1 tob1Var;
                            m4c m4cVar = fkj0.X;
                            b0k b0kVar3 = (x340) b0kVar;
                            b0kVar3.k0(-406871962);
                            int i2 = i | (b0kVar3.f(j) ? 4 : 2) | (b0kVar3.i(sm51Var) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
                            if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
                                int i3 = i2 & 14;
                                boolean z = i3 == 4;
                                Object objT = b0kVar3.T();
                                if (z || objT == m4cVar) {
                                    objT = v8r.q((Object) null);
                                    b0kVar3.s0(objT);
                                }
                                tob1 tob1Var2 = (ven0) objT;
                                Long lValueOf = Long.valueOf(j);
                                boolean zI = b0kVar3.i(sm51Var) | (i3 == 4) | b0kVar3.i(tob1Var2);
                                Object objT2 = b0kVar3.T();
                                if (zI || objT2 == m4cVar) {
                                    tob1Var = tob1Var2;
                                    xn2 xn2Var = new xn2((Object) sm51Var, j, (Object) tob1Var, (lnm) null, (byte) 13);
                                    j2 = j;
                                    b0kVar3.s0(xn2Var);
                                    objT2 = xn2Var;
                                } else {
                                    tob1Var = tob1Var2;
                                    j2 = j;
                                }
                                qxd0.t(lValueOf, b0kVar3, (vu30) objT2);
                                b0kVar2 = b0kVar3;
                                eth.a((Bitmap) tob1Var.getValue(), qim0Var, o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), l1d.l(j2, "frame_"), oej.a, b0kVar2, ((i2 >> 3) & 112) | 24576, 0);
                            } else {
                                j2 = j;
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                            }
                            h311 h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new qi6(j2, (Object) sm51Var, (Object) qim0Var, i, (byte) 15);
                            }
                        }

                        public static final pxg1 n0(int i, int i2, dlv dlvVar) {
                            return new pxg1(i, i2, dlvVar);
                        }

                        public static final void o(y7e1 y7e1Var, boolean z, boolean z2, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
                            boolean z3;
                            m4c m4cVar = fkj0.X;
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-1910960910);
                            int i2 = i | (x340Var.i(y7e1Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
                            if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                                String strO0 = cwl1.o0(x340Var, 2131955382);
                                String strO1 = cwl1.o0(x340Var, 2131955390);
                                nim0 nim0Var = nim0.a;
                                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                                uwr uwrVar = cbx.a;
                                cvx cvxVar = cbx.b(x340Var).b;
                                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                                gfh0 gfh0VarC = t1c.c(een.h, false);
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
                                nko1.H(gfh0VarC, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                gra graVar = een.g;
                                h2c h2cVar = h2c.a;
                                qim0 qim0VarA = h2cVar.a(nim0Var, graVar);
                                ldx ldxVar = ldx.c;
                                gdx gdxVarA = yla.s(x340Var).a();
                                if (ihc1.y0(strO0)) {
                                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                    return;
                                }
                                wro1.h(new gbx(new y50(strO0), function0), ldxVar, qim0VarA, null, gdxVarA, null, false, null, null, apo.r(-1614547505, new qeu(strO0, (byte) 10), x340Var), x340Var, 0, 6, 984);
                                ltf1 ltf1Var = y7e1Var.g;
                                esa1 esa1Var = ((y7e1) ltf1Var.b).a;
                                boolean z4 = !(((ghh1) esa1Var.b).b.isEmpty() && ((vee1) ((hrr0) esa1Var.c).getValue()) == null) && z2;
                                esa1 esa1Var2 = ((y7e1) ltf1Var.b).a;
                                boolean z5 = !((ghh1) esa1Var2.b).c.isEmpty() && ((vee1) ((hrr0) esa1Var2.c).getValue()) == null && z2;
                                boolean zI = x340Var.i(ltf1Var);
                                Object objT = x340Var.T();
                                if (zI || objT == m4cVar) {
                                    objT = new z3w(ltf1Var, (byte) 0);
                                    x340Var.s0(objT);
                                }
                                Function0 function1 = (Function0) objT;
                                boolean zI2 = x340Var.i(ltf1Var);
                                Object objT2 = x340Var.T();
                                if (zI2 || objT2 == m4cVar) {
                                    z3 = true;
                                    objT2 = new z3w(ltf1Var, (byte) 1);
                                    x340Var.s0(objT2);
                                } else {
                                    z3 = true;
                                }
                                zgo1.l(z4, z5, function1, (Function0) objT2, null, x340Var, 0);
                                qim0 qim0VarA2 = h2cVar.a(nim0Var, een.i);
                                gdx gdxVarA2 = yla.s(x340Var).a();
                                boolean zI3 = x340Var.i(y7e1Var) | ((i2 & 57344) == 16384 ? z3 : false);
                                Object objT3 = x340Var.T();
                                if (zI3 || objT3 == m4cVar) {
                                    objT3 = new efb(iu30Var, y7e1Var, (byte) 5);
                                    x340Var.s0(objT3);
                                }
                                foo1.c(new gbx(new y50(strO1), (Function0) objT3), ldxVar, qim0VarA2, z ? jax.a : new hax(strO1), gdxVarA2, null, null, null, null, null, apo.r(-556907209, new qeu(strO1, (byte) 11), x340Var), x340Var, 0, 48, 1992);
                                x340Var = x340Var;
                                x340Var.r(z3);
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new hy((Object) y7e1Var, z, z2, (Object) function0, (cv30) iu30Var, i, (byte) 6);
                            }
                        }

                        public static pxg1 o0(int i, int i2, dlv dlvVar, int i3) {
                            if ((i3 & 1) != 0) {
                                i = CtaType.CTA_WAITLISTED_FIELD_NUMBER;
                            }
                            if ((i3 & 2) != 0) {
                                i2 = 0;
                            }
                            if ((i3 & 4) != 0) {
                                dlvVar = mlv.a;
                            }
                            return new pxg1(i, i2, dlvVar);
                        }

                        public static final void p(bv40 bv40Var, mjm mjmVar, d0r d0rVar, nlg0 nlg0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
                            int i2;
                            mjm mjmVar2;
                            d0r d0rVar2;
                            b0k b0kVar2;
                            b0k b0kVar3 = (x340) b0kVar;
                            b0kVar3.k0(1929908298);
                            if ((i & 6) == 0) {
                                i2 = (b0kVar3.i(bv40Var) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i & 48) == 0) {
                                mjmVar2 = mjmVar;
                                i2 |= b0kVar3.i(mjmVar2) ? 32 : 16;
                            } else {
                                mjmVar2 = mjmVar;
                            }
                            if ((i & 384) == 0) {
                                d0rVar2 = d0rVar;
                                i2 |= b0kVar3.i(d0rVar2) ? 256 : 128;
                            } else {
                                d0rVar2 = d0rVar;
                            }
                            if ((i & 3072) == 0) {
                                i2 |= b0kVar3.i(nlg0Var) ? 2048 : 1024;
                            }
                            if ((i & 24576) == 0) {
                                i2 |= b0kVar3.i(qim0Var) ? 16384 : 8192;
                            }
                            if ((196608 & i) == 0) {
                                i2 |= b0kVar3.i(iu30Var) ? 131072 : 65536;
                            }
                            if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
                                efv0 efv0VarS = jap1.s(nlg0Var.d, b0kVar3);
                                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                                gra graVar = een.e;
                                Object objT = b0kVar3.T();
                                if (objT == fkj0.X) {
                                    objT = wlg0.h;
                                    b0kVar3.s0(objT);
                                }
                                b0kVar2 = b0kVar3;
                                hm5.a(efv0VarS, qim0VarF, (iu30) objT, graVar, "CollaboratorPopupSwitcher", (iu30) null, apo.r(642176618, new rl6(nlg0Var, iu30Var, bv40Var, d0rVar2, mjmVar2, (byte) 3), b0kVar3), b0kVar2, 1597824, 32);
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                            }
                            h311 h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new kqf0(bv40Var, mjmVar, d0rVar, nlg0Var, qim0Var, iu30Var, i, (byte) 2);
                            }
                        }

                        public static final Boolean p0(int i, pg pgVar, d030 d030Var, n511 n511Var) {
                            int iOrdinal = d030Var.L1().ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    d030 d030VarM = dm5.M(d030Var);
                                    if (d030VarM == null) {
                                        eg.m("ActiveParent must have a focusedChild");
                                        return null;
                                    }
                                    int iOrdinal2 = d030VarM.L1().ordinal();
                                    if (iOrdinal2 != 0) {
                                        if (iOrdinal2 == 1) {
                                            Boolean boolP0 = p0(i, pgVar, d030VarM, n511Var);
                                            if (!u890.j(boolP0, Boolean.FALSE)) {
                                                return boolP0;
                                            }
                                            if (n511Var == null) {
                                                if (d030VarM.L1() != wz20.b) {
                                                    eg.m("Searching for active node in inactive hierarchy");
                                                    return null;
                                                }
                                                d030 d030VarK = dm5.K(d030VarM);
                                                if (d030VarK == null) {
                                                    eg.m("ActiveParent must have a focusedChild");
                                                    return null;
                                                }
                                                n511Var = dm5.L(d030VarK);
                                            }
                                            return Boolean.valueOf(W(i, pgVar, d030Var, n511Var));
                                        }
                                        if (iOrdinal2 != 2) {
                                            if (iOrdinal2 != 3) {
                                                eg.o();
                                                return null;
                                            }
                                            eg.m("ActiveParent must have a focusedChild");
                                            return null;
                                        }
                                    }
                                    if (n511Var == null) {
                                        n511Var = dm5.L(d030VarM);
                                    }
                                    return Boolean.valueOf(W(i, pgVar, d030Var, n511Var));
                                }
                                if (iOrdinal != 2) {
                                    if (iOrdinal != 3) {
                                        eg.o();
                                        return null;
                                    }
                                    if (d030Var.J1().a) {
                                        return (Boolean) pgVar.invoke(d030Var);
                                    }
                                    return n511Var == null ? Boolean.valueOf(V(d030Var, i, pgVar)) : Boolean.valueOf(i0(i, pgVar, d030Var, n511Var));
                                }
                            }
                            return Boolean.valueOf(V(d030Var, i, pgVar));
                        }

                        public static final void q(qim0 qim0Var, b0k b0kVar, int i) {
                            int i2;
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-1476473490);
                            if ((i & 6) == 0) {
                                i2 = i | (x340Var.i(qim0Var) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
                                int iHashCode = Long.hashCode(x340Var.T);
                                xos0 xos0VarM = x340Var.m();
                                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
                                nim0 nim0Var = nim0.a;
                                qim0 qim0VarL0 = cwl1.l0(nim0Var, 0L, (hw61) null, 15);
                                String strV = nhc1.V(40, " ");
                                uwr uwrVar = cbx.a;
                                uwo1.e(strV, qim0VarL0, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1760);
                                uwo1.e(nhc1.V(30, " "), cwl1.l0(nim0Var, 0L, (hw61) null, 15), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1760);
                                x340Var.r(true);
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new mq2(qim0Var, i, (byte) 20);
                            }
                        }

                        public static final void r(qmo0 qmo0Var, b0k b0kVar, int i) {
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-64879108);
                            int i2 = (x340Var.i(qmo0Var) ? 4 : 2) | i;
                            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                                List<ybi1> list = qmo0Var.b;
                                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                                for (ybi1 ybi1Var : list) {
                                    String str = ybi1Var.a;
                                    if (str == null) {
                                        str = "";
                                    }
                                    arrayList.add(new phx(12, 0L, str, ybi1Var.b, (String) null));
                                }
                                shx.a(mqo1.A(arrayList), null, null, null, x340Var, 8, 62);
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fak1(qmo0Var, i, (byte) 28);
                            }
                        }

                        public static final void s(lvn0 lvn0Var, iu30 iu30Var, dfn0 dfn0Var, qim0 qim0Var, b0k b0kVar, int i) {
                            int i2;
                            long jB;
                            long jE;
                            long jE2;
                            m4c m4cVar = fkj0.X;
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-1911408337);
                            if ((i & 6) == 0) {
                                i2 = (x340Var.g(lvn0Var) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i & 48) == 0) {
                                i2 |= x340Var.i(iu30Var) ? 32 : 16;
                            }
                            if ((i & 384) == 0) {
                                i2 |= x340Var.i(dfn0Var) ? 256 : 128;
                            }
                            if ((i & 3072) == 0) {
                                i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
                            }
                            int i3 = i2;
                            if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                                ven0 ven0VarG = rwq.g(new r6k0(dfn0Var.e, (byte) 16), null, null, x340Var, 48, 2);
                                qim0 qim0VarB = u291.B(qim0Var, (gra) null, 3);
                                int i4 = i3 & 14;
                                boolean z = ((i3 & 112) == 32) | (i4 == 4);
                                Object objT = x340Var.T();
                                if (z || objT == m4cVar) {
                                    objT = new s2n0(iu30Var, lvn0Var, (byte) 14);
                                    x340Var.s0(objT);
                                }
                                qim0 qim0VarY = uyn1.y(bin.x(qim0VarB, false, null, null, null, (Function0) objT, 15), 16.0f, 12.0f);
                                if (ven0VarG.getValue() != null) {
                                    Object value = ven0VarG.getValue();
                                    if (value == null) {
                                        hhg1.n("Required value was null.");
                                        return;
                                    }
                                    jB = u7h.b(z4p1.e(((Number) value).intValue()), 0.1f, 0.0f, 0.0f, 0.0f, 14);
                                } else {
                                    jB = u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14);
                                }
                                qim0 qim0VarY2 = uyn1.y(dug.f(qim0VarY, jB, er31.b(20.0f)), 12.0f, 8.0f);
                                boolean z2 = i4 == 4;
                                Object objT2 = x340Var.T();
                                if (z2 || objT2 == m4cVar) {
                                    objT2 = new nvn0(lvn0Var, (byte) 1);
                                    x340Var.s0(objT2);
                                }
                                qim0 qim0VarB2 = s161.b(qim0VarY2, false, (iu30) objT2);
                                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 54);
                                int iHashCode = Long.hashCode(x340Var.T);
                                xos0 xos0VarM = x340Var.m();
                                qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
                                rmx rmxVarN = c0p1.n(lvn0Var.b);
                                if (rmxVarN == null) {
                                    rmxVarN = rmx.c;
                                }
                                rmx rmxVar = rmxVarN;
                                qim0 qim0VarR = u291.r(nim0.a, 16.0f);
                                if (ven0VarG.getValue() != null) {
                                    Object value2 = ven0VarG.getValue();
                                    if (value2 == null) {
                                        hhg1.n("Required value was null.");
                                        return;
                                    }
                                    jE = z4p1.e(((Number) value2).intValue());
                                } else {
                                    jE = u7h.k;
                                }
                                w0h1.a(rmxVar, isl.a, qim0VarR, jE, 0L, false, x340Var, 440, 48);
                                String str = lvn0Var.a;
                                if (ven0VarG.getValue() != null) {
                                    x340Var.i0(-2108991437);
                                    x340Var.r(false);
                                    Object value3 = ven0VarG.getValue();
                                    if (value3 == null) {
                                        hhg1.n("Required value was null.");
                                        return;
                                    }
                                    jE2 = z4p1.e(((Number) value3).intValue());
                                } else {
                                    x340Var.i0(-2108926368);
                                    uwr uwrVar = cbx.a;
                                    jE2 = cbx.a(x340Var).b.a;
                                    x340Var.r(false);
                                }
                                long j = jE2;
                                uwr uwrVar2 = cbx.a;
                                uwo1.e(str, null, cbx.d(x340Var).k, j, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
                                x340Var = x340Var;
                                x340Var.r(true);
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new etg0(lvn0Var, iu30Var, dfn0Var, qim0Var, i, (byte) 14);
                            }
                        }

                        public static final void t(kjo0 kjo0Var, b0k b0kVar, int i) {
                            re30 re30Var;
                            re30 re30Var2;
                            Calendar calendar;
                            Integer num;
                            String dateTime;
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-1647849012);
                            int i2 = (x340Var.i(kjo0Var) ? 4 : 2) | i;
                            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                                exe1 exe1Var = kjo0Var.b;
                                Resources resources = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getResources();
                                if (exe1Var.equals(ixe1.INSTANCE)) {
                                    String string = resources.getString(2131964230);
                                    re30Var = new re30(string, string);
                                } else {
                                    if (exe1Var instanceof exe1) {
                                        String str = exe1Var.b;
                                        int i3 = Integer.parseInt(str);
                                        re30Var2 = new re30(f4i1.e(str, resources.getString(2131964227)), resources.getQuantityString(2131820976, i3, Integer.valueOf(i3)));
                                    } else if (exe1Var instanceof bxe1) {
                                        String str2 = ((bxe1) exe1Var).b;
                                        int i4 = Integer.parseInt(str2);
                                        re30Var2 = new re30(f4i1.e(str2, resources.getString(2131964221)), resources.getQuantityString(2131820975, i4, Integer.valueOf(i4)));
                                    } else if (exe1Var instanceof ywe1) {
                                        ywe1 ywe1Var = (ywe1) exe1Var;
                                        int i5 = Integer.parseInt(ywe1Var.b);
                                        if (i5 == 1) {
                                            re30Var2 = new re30(l1d.m("1", resources.getString(2131964216)), l1d.m("1 ", resources.getString(2131964217)));
                                        } else {
                                            long j = ywe1Var.c;
                                            if (j > 0) {
                                                int i6 = ywe1Var.d;
                                                calendar = Calendar.getInstance();
                                                calendar.setTimeInMillis((j * 1000) + ((long) (i6 / 1000000)));
                                            } else {
                                                calendar = Calendar.getInstance();
                                                calendar.add(6, -i5);
                                            }
                                            String str3 = new SimpleDateFormat("EEE", new Locale(upn1.m())).format(calendar.getTime());
                                            switch (calendar.get(7)) {
                                                case 1:
                                                    num = 2131964234;
                                                    break;
                                                case 2:
                                                    num = 2131964228;
                                                    break;
                                                case 3:
                                                    num = 2131964236;
                                                    break;
                                                case 4:
                                                    num = 2131964237;
                                                    break;
                                                case 5:
                                                    num = 2131964235;
                                                    break;
                                                case 6:
                                                    num = 2131964220;
                                                    break;
                                                case 7:
                                                    num = 2131964232;
                                                    break;
                                                default:
                                                    num = null;
                                                    break;
                                            }
                                            if (num != null) {
                                                dateTime = resources.getString(num.intValue());
                                                dateTime.getClass();
                                            } else {
                                                dateTime = DateUtils.formatDateTime(null, calendar.getTimeInMillis(), 2);
                                                dateTime.getClass();
                                            }
                                            str3.getClass();
                                            re30Var2 = new re30(str3, dateTime);
                                        }
                                    } else if (exe1Var instanceof hxe1) {
                                        hxe1 hxe1Var = (hxe1) exe1Var;
                                        int i7 = hxe1Var.b;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.set(2, i7 - 1);
                                        String str4 = hxe1Var.c;
                                        calendar2.set(5, Integer.parseInt(str4));
                                        String str5 = new SimpleDateFormat("MMM d", new Locale(upn1.m())).format(calendar2.getTime());
                                        String strF = f4i1.f(mmo1.E(i7, resources), " ", str4);
                                        str5.getClass();
                                        re30Var2 = new re30(str5, strF);
                                    } else {
                                        if (!(exe1Var instanceof lxe1)) {
                                            eg.o();
                                            return;
                                        }
                                        lxe1 lxe1Var = (lxe1) exe1Var;
                                        int i8 = lxe1Var.b;
                                        Calendar calendar3 = Calendar.getInstance();
                                        calendar3.set(2, i8 - 1);
                                        String str6 = lxe1Var.c;
                                        calendar3.set(5, Integer.parseInt(str6));
                                        String str7 = lxe1Var.d;
                                        calendar3.set(1, Integer.parseInt(str7));
                                        String str8 = new SimpleDateFormat("MMM d, yyyy", new Locale(upn1.m())).format(calendar3.getTime());
                                        String strP = cy30.p(mmo1.E(i8, resources), " ", str6, ", ", str7);
                                        str8.getClass();
                                        re30Var = new re30(str8, strP);
                                    }
                                    re30Var = re30Var2;
                                }
                                ye5 ye5VarO = kk0.o(1260039445, x340Var);
                                ye5VarO.g(kjo0Var.c);
                                uwr uwrVar = cbx.a;
                                int iO = ye5VarO.o(new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                try {
                                    ye5VarO.g(" • ");
                                    ye5VarO.g(re30Var.a);
                                    ye5VarO.k(iO);
                                    af5 af5VarP = ye5VarO.p();
                                    x340Var.r(false);
                                    boolean zI = x340Var.i(kjo0Var) | x340Var.i(re30Var);
                                    Object objT = x340Var.T();
                                    if (zI || objT == fkj0.X) {
                                        objT = new f2m1(kjo0Var, re30Var, (byte) 20);
                                        x340Var.s0(objT);
                                    }
                                    uwo1.f(af5VarP, s161.b(nim0.a, false, (iu30) objT), cbx.d(x340Var).j, null, null, null, 2, false, new zic0(5), 0, null, null, x340Var, 0, 0, 3768);
                                } catch (Throwable th) {
                                    ye5VarO.k(iO);
                                    throw th;
                                }
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fak1(kjo0Var, i, (byte) 29);
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:26:0x004b  */
                        /* JADX WARN: Code duplicated, block: B:28:0x0050  */
                        /* JADX WARN: Code duplicated, block: B:30:0x0054  */
                        /* JADX WARN: Code duplicated, block: B:32:0x005c  */
                        /* JADX WARN: Code duplicated, block: B:33:0x005f  */
                        /* JADX WARN: Code duplicated, block: B:37:0x0066  */
                        /* JADX WARN: Code duplicated, block: B:39:0x006a  */
                        /* JADX WARN: Code duplicated, block: B:41:0x0072  */
                        /* JADX WARN: Code duplicated, block: B:42:0x0075  */
                        /* JADX WARN: Code duplicated, block: B:45:0x007b  */
                        /* JADX WARN: Code duplicated, block: B:48:0x0081  */
                        /* JADX WARN: Code duplicated, block: B:50:0x0087  */
                        /* JADX WARN: Code duplicated, block: B:51:0x008a  */
                        /* JADX WARN: Code duplicated, block: B:55:0x0094  */
                        /* JADX WARN: Code duplicated, block: B:56:0x0096  */
                        /* JADX WARN: Code duplicated, block: B:59:0x009f  */
                        /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
                        /* JADX WARN: Code duplicated, block: B:69:0x00bb A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
                        /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
                        /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
                        /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
                        /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
                        /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
                        /* JADX WARN: Code duplicated, block: B:81:0x00da  */
                        /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
                        /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
                        /* JADX WARN: Code duplicated, block: B:88:0x0134  */
                        /* JADX WARN: Code duplicated, block: B:91:0x0143  */
                        /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
                        public static final void u(qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, erl1 erl1Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
                            qim0 qim0Var2;
                            int i3;
                            vu30 vu30Var3;
                            int i4;
                            vu30 vu30Var4;
                            int i5;
                            erl1 erl1Var2;
                            boolean z;
                            b0k b0kVar2;
                            qim0 qim0Var3;
                            vu30 vu30Var5;
                            erl1 erl1Var3;
                            vu30 vu30Var6;
                            h311 h311VarV;
                            vu30 vu30Var7;
                            vu30 vu30Var8;
                            erl1 erl1Var4;
                            erl1 erl1Var5;
                            int i6;
                            b0k b0kVar3 = (x340) b0kVar;
                            b0kVar3.k0(187630438);
                            int i7 = i2 & 1;
                            if (i7 != 0) {
                                i3 = i | 6;
                                qim0Var2 = qim0Var;
                            } else if ((i & 6) == 0) {
                                qim0Var2 = qim0Var;
                                i3 = (b0kVar3.i(qim0Var2) ? 4 : 2) | i;
                            } else {
                                qim0Var2 = qim0Var;
                                i3 = i;
                            }
                            int i8 = i2 & 2;
                            if (i8 == 0) {
                                if ((i & 48) == 0) {
                                    vu30Var3 = vu30Var;
                                    i3 |= b0kVar3.i(vu30Var3) ? 32 : 16;
                                }
                                i4 = i2 & 4;
                                if (i4 != 0) {
                                    if ((i & 384) == 0) {
                                        vu30Var4 = vu30Var2;
                                        if (b0kVar3.i(vu30Var4)) {
                                            i5 = 256;
                                        } else {
                                            i5 = 128;
                                        }
                                        i3 |= i5;
                                    }
                                    if ((i & 3072) == 0) {
                                        if ((i2 & 8) == 0) {
                                            erl1Var2 = erl1Var;
                                            int i9 = b0kVar3.i(erl1Var2) ? 2048 : 1024;
                                            i3 |= i9;
                                        } else {
                                            erl1Var2 = erl1Var;
                                        }
                                        i3 |= i9;
                                    } else {
                                        erl1Var2 = erl1Var;
                                    }
                                    if ((i & 24576) == 0) {
                                        if (b0kVar3.i(j2iVar)) {
                                            i6 = 16384;
                                        } else {
                                            i6 = 8192;
                                        }
                                        i3 |= i6;
                                    }
                                    if ((i3 & 9363) != 9362) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (b0kVar3.Y(i3 & 1, z)) {
                                        b0kVar3.d0();
                                        if ((i & 1) != 0 || b0kVar3.E()) {
                                            if (i7 != 0) {
                                                qim0Var3 = nim0.a;
                                            } else {
                                                qim0Var3 = qim0Var2;
                                            }
                                            if (i8 != 0) {
                                                vu30Var7 = k5j.a;
                                            } else {
                                                vu30Var7 = vu30Var3;
                                            }
                                            if (i4 != 0) {
                                                vu30Var4 = k5j.b;
                                            }
                                            if ((i2 & 8) != 0) {
                                                erl1Var4 = (erl1) b0kVar3.k(szf0.b);
                                                if (erl1Var4 == null) {
                                                    b0kVar3.i0(-241884180);
                                                    WeakHashMap weakHashMap = osl1.x;
                                                    erl1Var4 = lhc.g(b0kVar3).g;
                                                } else {
                                                    b0kVar3.i0(-241885792);
                                                }
                                                b0kVar3.r(false);
                                                i3 &= -7169;
                                                vu30Var8 = vu30Var7;
                                                erl1Var5 = erl1Var4;
                                            } else {
                                                vu30Var8 = vu30Var7;
                                            }
                                            b0kVar3.s();
                                            b0kVar2 = b0kVar3;
                                            cgj1.n(u291.d(qim0Var3, 1.0f), vu30Var8, vu30Var4, (vu30) null, (vu30) null, 0, 0L, 0L, erl1Var5, apo.r(-1553544073, new rv71(j2iVar, (byte) 20), b0kVar3), b0kVar2, (i3 & 112) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
                                            vu30Var5 = vu30Var8;
                                            erl1Var3 = erl1Var5;
                                        } else {
                                            b0kVar3.b0();
                                            if ((i2 & 8) != 0) {
                                                i3 &= -7169;
                                            }
                                            qim0Var3 = qim0Var2;
                                            vu30Var8 = vu30Var3;
                                        }
                                        erl1Var5 = erl1Var2;
                                        b0kVar3.s();
                                        b0kVar2 = b0kVar3;
                                        cgj1.n(u291.d(qim0Var3, 1.0f), vu30Var8, vu30Var4, (vu30) null, (vu30) null, 0, 0L, 0L, erl1Var5, apo.r(-1553544073, new rv71(j2iVar, (byte) 20), b0kVar3), b0kVar2, (i3 & 112) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
                                        vu30Var5 = vu30Var8;
                                        erl1Var3 = erl1Var5;
                                    } else {
                                        b0kVar2 = b0kVar3;
                                        b0kVar2.b0();
                                        qim0Var3 = qim0Var2;
                                        vu30Var5 = vu30Var3;
                                        erl1Var3 = erl1Var2;
                                    }
                                    vu30Var6 = vu30Var4;
                                    h311VarV = b0kVar2.v();
                                    if (h311VarV != null) {
                                        h311VarV.d = new j90(qim0Var3, vu30Var5, vu30Var6, erl1Var3, j2iVar, i, i2, (byte) 15);
                                    }
                                }
                                i3 |= 384;
                                vu30Var4 = vu30Var2;
                                if ((i & 3072) == 0) {
                                    if ((i2 & 8) == 0) {
                                        erl1Var2 = erl1Var;
                                        if (b0kVar3.i(erl1Var2)) {
                                        }
                                        i3 |= i9;
                                    } else {
                                        erl1Var2 = erl1Var;
                                    }
                                    i3 |= i9;
                                } else {
                                    erl1Var2 = erl1Var;
                                }
                                if ((i & 24576) == 0) {
                                    if (b0kVar3.i(j2iVar)) {
                                        i6 = 16384;
                                    } else {
                                        i6 = 8192;
                                    }
                                    i3 |= i6;
                                }
                                if ((i3 & 9363) != 9362) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (b0kVar3.Y(i3 & 1, z)) {
                                    b0kVar3.d0();
                                    if ((i & 1) != 0) {
                                        if (i7 != 0) {
                                            qim0Var3 = nim0.a;
                                        } else {
                                            qim0Var3 = qim0Var2;
                                        }
                                        if (i8 != 0) {
                                            vu30Var7 = k5j.a;
                                        } else {
                                            vu30Var7 = vu30Var3;
                                        }
                                        if (i4 != 0) {
                                            vu30Var4 = k5j.b;
                                        }
                                        if ((i2 & 8) != 0) {
                                            erl1Var4 = (erl1) b0kVar3.k(szf0.b);
                                            if (erl1Var4 == null) {
                                                b0kVar3.i0(-241884180);
                                                WeakHashMap weakHashMap2 = osl1.x;
                                                erl1Var4 = lhc.g(b0kVar3).g;
                                            } else {
                                                b0kVar3.i0(-241885792);
                                            }
                                            b0kVar3.r(false);
                                            i3 &= -7169;
                                            vu30Var8 = vu30Var7;
                                            erl1Var5 = erl1Var4;
                                        } else {
                                            vu30Var8 = vu30Var7;
                                            erl1Var5 = erl1Var2;
                                        }
                                    } else {
                                        if (i7 != 0) {
                                            qim0Var3 = nim0.a;
                                        } else {
                                            qim0Var3 = qim0Var2;
                                        }
                                        if (i8 != 0) {
                                            vu30Var7 = k5j.a;
                                        } else {
                                            vu30Var7 = vu30Var3;
                                        }
                                        if (i4 != 0) {
                                            vu30Var4 = k5j.b;
                                        }
                                        if ((i2 & 8) != 0) {
                                            erl1Var4 = (erl1) b0kVar3.k(szf0.b);
                                            if (erl1Var4 == null) {
                                                b0kVar3.i0(-241884180);
                                                WeakHashMap weakHashMap3 = osl1.x;
                                                erl1Var4 = lhc.g(b0kVar3).g;
                                            } else {
                                                b0kVar3.i0(-241885792);
                                            }
                                            b0kVar3.r(false);
                                            i3 &= -7169;
                                            vu30Var8 = vu30Var7;
                                            erl1Var5 = erl1Var4;
                                        } else {
                                            vu30Var8 = vu30Var7;
                                            erl1Var5 = erl1Var2;
                                        }
                                    }
                                    b0kVar3.s();
                                    b0kVar2 = b0kVar3;
                                    cgj1.n(u291.d(qim0Var3, 1.0f), vu30Var8, vu30Var4, (vu30) null, (vu30) null, 0, 0L, 0L, erl1Var5, apo.r(-1553544073, new rv71(j2iVar, (byte) 20), b0kVar3), b0kVar2, (i3 & 112) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
                                    vu30Var5 = vu30Var8;
                                    erl1Var3 = erl1Var5;
                                } else {
                                    b0kVar2 = b0kVar3;
                                    b0kVar2.b0();
                                    qim0Var3 = qim0Var2;
                                    vu30Var5 = vu30Var3;
                                    erl1Var3 = erl1Var2;
                                }
                                vu30Var6 = vu30Var4;
                                h311VarV = b0kVar2.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new j90(qim0Var3, vu30Var5, vu30Var6, erl1Var3, j2iVar, i, i2, (byte) 15);
                                }
                            }
                            i3 |= 48;
                            vu30Var3 = vu30Var;
                            i4 = i2 & 4;
                            if (i4 != 0) {
                                if ((i & 384) == 0) {
                                    vu30Var4 = vu30Var2;
                                    if (b0kVar3.i(vu30Var4)) {
                                        i5 = 256;
                                    } else {
                                        i5 = 128;
                                    }
                                    i3 |= i5;
                                }
                                if ((i & 3072) == 0) {
                                    if ((i2 & 8) == 0) {
                                        erl1Var2 = erl1Var;
                                        if (b0kVar3.i(erl1Var2)) {
                                        }
                                        i3 |= i9;
                                    } else {
                                        erl1Var2 = erl1Var;
                                    }
                                    i3 |= i9;
                                } else {
                                    erl1Var2 = erl1Var;
                                }
                                if ((i & 24576) == 0) {
                                    if (b0kVar3.i(j2iVar)) {
                                        i6 = 16384;
                                    } else {
                                        i6 = 8192;
                                    }
                                    i3 |= i6;
                                }
                                if ((i3 & 9363) != 9362) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (b0kVar3.Y(i3 & 1, z)) {
                                    b0kVar3.d0();
                                    if ((i & 1) != 0) {
                                        if (i7 != 0) {
                                            qim0Var3 = nim0.a;
                                        } else {
                                            qim0Var3 = qim0Var2;
                                        }
                                        if (i8 != 0) {
                                            vu30Var7 = k5j.a;
                                        } else {
                                            vu30Var7 = vu30Var3;
                                        }
                                        if (i4 != 0) {
                                            vu30Var4 = k5j.b;
                                        }
                                        if ((i2 & 8) != 0) {
                                            erl1Var4 = (erl1) b0kVar3.k(szf0.b);
                                            if (erl1Var4 == null) {
                                                b0kVar3.i0(-241884180);
                                                WeakHashMap weakHashMap4 = osl1.x;
                                                erl1Var4 = lhc.g(b0kVar3).g;
                                            } else {
                                                b0kVar3.i0(-241885792);
                                            }
                                            b0kVar3.r(false);
                                            i3 &= -7169;
                                            vu30Var8 = vu30Var7;
                                            erl1Var5 = erl1Var4;
                                        } else {
                                            vu30Var8 = vu30Var7;
                                            erl1Var5 = erl1Var2;
                                        }
                                    } else {
                                        if (i7 != 0) {
                                            qim0Var3 = nim0.a;
                                        } else {
                                            qim0Var3 = qim0Var2;
                                        }
                                        if (i8 != 0) {
                                            vu30Var7 = k5j.a;
                                        } else {
                                            vu30Var7 = vu30Var3;
                                        }
                                        if (i4 != 0) {
                                            vu30Var4 = k5j.b;
                                        }
                                        if ((i2 & 8) != 0) {
                                            erl1Var4 = (erl1) b0kVar3.k(szf0.b);
                                            if (erl1Var4 == null) {
                                                b0kVar3.i0(-241884180);
                                                WeakHashMap weakHashMap5 = osl1.x;
                                                erl1Var4 = lhc.g(b0kVar3).g;
                                            } else {
                                                b0kVar3.i0(-241885792);
                                            }
                                            b0kVar3.r(false);
                                            i3 &= -7169;
                                            vu30Var8 = vu30Var7;
                                            erl1Var5 = erl1Var4;
                                        } else {
                                            vu30Var8 = vu30Var7;
                                            erl1Var5 = erl1Var2;
                                        }
                                    }
                                    b0kVar3.s();
                                    b0kVar2 = b0kVar3;
                                    cgj1.n(u291.d(qim0Var3, 1.0f), vu30Var8, vu30Var4, (vu30) null, (vu30) null, 0, 0L, 0L, erl1Var5, apo.r(-1553544073, new rv71(j2iVar, (byte) 20), b0kVar3), b0kVar2, (i3 & 112) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
                                    vu30Var5 = vu30Var8;
                                    erl1Var3 = erl1Var5;
                                } else {
                                    b0kVar2 = b0kVar3;
                                    b0kVar2.b0();
                                    qim0Var3 = qim0Var2;
                                    vu30Var5 = vu30Var3;
                                    erl1Var3 = erl1Var2;
                                }
                                vu30Var6 = vu30Var4;
                                h311VarV = b0kVar2.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new j90(qim0Var3, vu30Var5, vu30Var6, erl1Var3, j2iVar, i, i2, (byte) 15);
                                }
                            }
                            i3 |= 384;
                            vu30Var4 = vu30Var2;
                            if ((i & 3072) == 0) {
                                if ((i2 & 8) == 0) {
                                    erl1Var2 = erl1Var;
                                    if (b0kVar3.i(erl1Var2)) {
                                    }
                                    i3 |= i9;
                                } else {
                                    erl1Var2 = erl1Var;
                                }
                                i3 |= i9;
                            } else {
                                erl1Var2 = erl1Var;
                            }
                            if ((i & 24576) == 0) {
                                if (b0kVar3.i(j2iVar)) {
                                    i6 = 16384;
                                } else {
                                    i6 = 8192;
                                }
                                i3 |= i6;
                            }
                            if ((i3 & 9363) != 9362) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b0kVar3.Y(i3 & 1, z)) {
                                b0kVar3.d0();
                                if ((i & 1) != 0) {
                                    if (i7 != 0) {
                                        qim0Var3 = nim0.a;
                                    } else {
                                        qim0Var3 = qim0Var2;
                                    }
                                    if (i8 != 0) {
                                        vu30Var7 = k5j.a;
                                    } else {
                                        vu30Var7 = vu30Var3;
                                    }
                                    if (i4 != 0) {
                                        vu30Var4 = k5j.b;
                                    }
                                    if ((i2 & 8) != 0) {
                                        erl1Var4 = (erl1) b0kVar3.k(szf0.b);
                                        if (erl1Var4 == null) {
                                            b0kVar3.i0(-241884180);
                                            WeakHashMap weakHashMap6 = osl1.x;
                                            erl1Var4 = lhc.g(b0kVar3).g;
                                        } else {
                                            b0kVar3.i0(-241885792);
                                        }
                                        b0kVar3.r(false);
                                        i3 &= -7169;
                                        vu30Var8 = vu30Var7;
                                        erl1Var5 = erl1Var4;
                                    } else {
                                        vu30Var8 = vu30Var7;
                                        erl1Var5 = erl1Var2;
                                    }
                                } else {
                                    if (i7 != 0) {
                                        qim0Var3 = nim0.a;
                                    } else {
                                        qim0Var3 = qim0Var2;
                                    }
                                    if (i8 != 0) {
                                        vu30Var7 = k5j.a;
                                    } else {
                                        vu30Var7 = vu30Var3;
                                    }
                                    if (i4 != 0) {
                                        vu30Var4 = k5j.b;
                                    }
                                    if ((i2 & 8) != 0) {
                                        erl1Var4 = (erl1) b0kVar3.k(szf0.b);
                                        if (erl1Var4 == null) {
                                            b0kVar3.i0(-241884180);
                                            WeakHashMap weakHashMap7 = osl1.x;
                                            erl1Var4 = lhc.g(b0kVar3).g;
                                        } else {
                                            b0kVar3.i0(-241885792);
                                        }
                                        b0kVar3.r(false);
                                        i3 &= -7169;
                                        vu30Var8 = vu30Var7;
                                        erl1Var5 = erl1Var4;
                                    } else {
                                        vu30Var8 = vu30Var7;
                                        erl1Var5 = erl1Var2;
                                    }
                                }
                                b0kVar3.s();
                                b0kVar2 = b0kVar3;
                                cgj1.n(u291.d(qim0Var3, 1.0f), vu30Var8, vu30Var4, (vu30) null, (vu30) null, 0, 0L, 0L, erl1Var5, apo.r(-1553544073, new rv71(j2iVar, (byte) 20), b0kVar3), b0kVar2, (i3 & 112) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
                                vu30Var5 = vu30Var8;
                                erl1Var3 = erl1Var5;
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                                qim0Var3 = qim0Var2;
                                vu30Var5 = vu30Var3;
                                erl1Var3 = erl1Var2;
                            }
                            vu30Var6 = vu30Var4;
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new j90(qim0Var3, vu30Var5, vu30Var6, erl1Var3, j2iVar, i, i2, (byte) 15);
                            }
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public static final void v(bv40 bv40Var, mjm mjmVar, d0r d0rVar, plg0 plg0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                            int i2;
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-973308704);
                            if ((i & 6) == 0) {
                                i2 = (x340Var.i(bv40Var) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i & 48) == 0) {
                                i2 |= x340Var.i(mjmVar) ? 32 : 16;
                            }
                            if ((i & 384) == 0) {
                                i2 |= x340Var.i(d0rVar) ? 256 : 128;
                            }
                            if ((i & 3072) == 0) {
                                i2 |= (i & 4096) == 0 ? x340Var.g(plg0Var) : x340Var.i(plg0Var) ? 2048 : 1024;
                            }
                            if ((i & 24576) == 0) {
                                i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
                            }
                            if ((196608 & i) == 0) {
                                i2 |= x340Var.i(qim0Var) ? 131072 : 65536;
                            }
                            if (!x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
                                x340Var.b0();
                            } else if (plg0Var instanceof olg0) {
                                x340Var.i0(953213944);
                                q(qim0Var, x340Var, (i2 >> 15) & 14);
                                x340Var.r(false);
                            } else {
                                if (!(plg0Var instanceof nlg0)) {
                                    throw p3d1.k(x340Var, 953213005, false);
                                }
                                x340Var.i0(-515078666);
                                p(bv40Var, mjmVar, d0rVar, (nlg0) plg0Var, qim0Var, iu30Var, x340Var, (i2 & 8190) | ((i2 >> 3) & 57344) | ((i2 << 3) & 458752));
                                x340Var.r(false);
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new kqf0((byte) 3, i, bv40Var, mjmVar, d0rVar, plg0Var, iu30Var, qim0Var, false);
                            }
                        }

                        public static final void w(Function0 function0, zah1 zah1Var, b0k b0kVar, int i) {
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(1446014588);
                            int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(zah1Var) ? 32 : 16);
                            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                                scx scxVarM = pno1.m(x340Var);
                                x74.f(function0, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(785803643, new e6j(zah1Var, scxVarM, (byte) 27), x340Var), x340Var, (i2 & 14) | 12582912, 48, 1916);
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new o1t(function0, zah1Var, i, (byte) 18);
                            }
                        }

                        public static final void x(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
                            qim0 qim0Var2;
                            m4c m4cVar = fkj0.X;
                            b0k b0kVar2 = (x340) b0kVar;
                            b0kVar2.k0(672824202);
                            j06 j06Var = ((x340) b0kVar2).a;
                            int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | 384;
                            if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
                                Context context = (Context) b0kVar2.k(AndroidCompositionLocals_androidKt.b);
                                qim0 qim0Var3 = nim0.a;
                                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                                xos0 xos0VarM = b0kVar2.m();
                                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
                                hzj.A.getClass();
                                if (j06Var == null) {
                                    tgp1.p();
                                    throw null;
                                }
                                b0kVar2.m0();
                                boolean z = ((x340) b0kVar2).S;
                                n4k n4kVar = hmb0.t1;
                                if (z) {
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
                                uwr uwrVar = cbx.a;
                                lee1 lee1Var = cbx.d(b0kVar2).g;
                                long j = cbx.a(b0kVar2).b.a;
                                boolean zI = b0kVar2.i(context);
                                Object objT = b0kVar2.T();
                                if (zI || objT == m4cVar) {
                                    objT = new ork(context, (byte) 10);
                                    b0kVar2.s0(objT);
                                }
                                D(str, null, lee1Var, j, (iu30) objT, b0kVar2, i2 & 14);
                                cvx cvxVar = cbx.b(b0kVar2).b;
                                op71.g(b0kVar2, u291.h(qim0Var3, 16.0f));
                                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                                jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
                                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                                xos0 xos0VarM2 = b0kVar2.m();
                                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF2);
                                b0kVar2.m0();
                                if (((x340) b0kVar2).S) {
                                    b0kVar2.l(n4kVar);
                                } else {
                                    b0kVar2.v0();
                                }
                                nko1.H(jw31VarA, b0kVar2, lljVar);
                                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                                x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                                nko1.H(qim0VarE2, b0kVar2, lljVar4);
                                jdx jdxVar = jdx.c;
                                gdx gdxVarS = yla.s(b0kVar2);
                                boolean z2 = (i2 & 112) == 32;
                                Object objT2 = b0kVar2.T();
                                if (z2 || objT2 == m4cVar) {
                                    objT2 = new lpx0(function0, (byte) 3);
                                    b0kVar2.s0(objT2);
                                }
                                b0kVar2 = b0kVar2;
                                foo1.c(new gbx(z50.c, (Function0) objT2), jdxVar, null, null, gdxVarS, null, null, null, null, null, jaj.b, b0kVar2, 0, 48, 2012);
                                b0kVar2.r(true);
                                b0kVar2.r(true);
                                qim0Var2 = qim0Var3;
                            } else {
                                b0kVar2.b0();
                                qim0Var2 = qim0Var;
                            }
                            h311 h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 15);
                            }
                        }

                        public static final void y(y7e1 y7e1Var, List list, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
                            hax haxVar;
                            boolean z3;
                            Object obj;
                            boolean z4;
                            qim0 qim0VarA;
                            char c;
                            Object obj2;
                            hax haxVar2;
                            Object obj3;
                            iu30Var = iu30Var;
                            m4c m4cVar = fkj0.X;
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-729216485);
                            j06 j06Var = x340Var.a;
                            int i2 = i | (x340Var.i(y7e1Var) ? 4 : 2) | (x340Var.g(list) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
                            if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                                float f = z ? 0.0f : 1.0f;
                                uwr uwrVar = cbx.a;
                                xpv0 xpv0Var = cbx.c(x340Var).c;
                                tob1 tob1VarB = z95.b(f, l0(pto1.q(1600, 2, 240.0f), 1600.0f, null, 4), "Inline suggestions alpha", (iu30) null, x340Var, 3072, 20);
                                qim0 qim0Var = nim0.a;
                                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                                long jA = cbx.a(x340Var).a.b.a();
                                cua cuaVar = cbx.b(x340Var).f;
                                qim0 qim0VarF2 = dug.f(qim0VarF, jA, er31.b(8.0f));
                                era eraVar = een.P0;
                                mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
                                int iHashCode = Long.hashCode(x340Var.T);
                                xos0 xos0VarM = x340Var.m();
                                qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
                                hzj.A.getClass();
                                if (j06Var == null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                boolean z5 = x340Var.S;
                                n4k n4kVar = hmb0.t1;
                                if (z5) {
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
                                qim0 qim0VarF3 = u291.f(qim0Var, 1.0f);
                                hax haxVar3 = jax.a;
                                if (z2) {
                                    x340Var.i0(801482919);
                                    x340Var.r(false);
                                    haxVar = haxVar3;
                                } else {
                                    x340Var.i0(801533604);
                                    haxVar = new hax(cwl1.o0(x340Var, 2131955388));
                                    x340Var.r(false);
                                }
                                String strO0 = cwl1.o0(x340Var, 2131955389);
                                lee1 lee1Var = cbx.d(x340Var).g;
                                c6e1 c6e1Var = new c6e1(6, 0, 2);
                                zxx zxxVar = new zxx(cbx.a(x340Var).b.a, cbx.a(x340Var).b.a, cbx.a(x340Var).b.b, cbx.a(x340Var).b.d, cbx.a(x340Var).a.b.a(), cbx.a(x340Var).a.b.a(), cbx.a(x340Var).b.c, 0L, 896);
                                cvx cvxVar = cbx.b(x340Var).b;
                                cvx cvxVar2 = cbx.b(x340Var).b;
                                rwo1.b(y7e1Var, qim0VarF3, haxVar, strO0, null, null, false, false, null, lee1Var, null, null, c6e1Var, null, null, null, null, new zzq0(16.0f, 12.0f, 16.0f, 12.0f), 0.0f, false, zxxVar, x340Var, i2 & 14, 0, 912880);
                                x340Var = x340Var;
                                if (list.isEmpty()) {
                                    z3 = true;
                                    x340Var.i0(804244337);
                                    x340Var.r(false);
                                } else {
                                    x340Var.i0(802633701);
                                    String strO1 = cwl1.o0(x340Var, 2131955392);
                                    String strO2 = cwl1.o0(x340Var, 2131955388);
                                    cvx cvxVar3 = cbx.b(x340Var).b;
                                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var);
                                    cvx cvxVar4 = cbx.b(x340Var).b;
                                    qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                                    boolean zI = x340Var.i(tob1VarB);
                                    Object objT = x340Var.T();
                                    if (zI || objT == m4cVar) {
                                        obj = objT;
                                        pak pakVar = new pak(tob1VarB, (byte) 4);
                                        x340Var.s0(pakVar);
                                        obj = pakVar;
                                    }
                                    qim0 qim0VarC = i541.C(qim0VarB, (iu30) obj);
                                    if (z) {
                                        x340Var.i0(803035926);
                                        Object objT2 = x340Var.T();
                                        if (objT2 == m4cVar) {
                                            obj3 = objT2;
                                            a4w a4wVar = a4w.b;
                                            x340Var.s0(a4wVar);
                                            obj3 = a4wVar;
                                        }
                                        obj3 = objT2;
                                        qim0VarA = s161.a(qim0Var, (iu30) obj3);
                                        z4 = false;
                                        x340Var.r(false);
                                    } else {
                                        z4 = false;
                                        x340Var.i0(-666829255);
                                        x340Var.r(false);
                                        qim0VarA = qim0Var;
                                    }
                                    qim0 qim0VarThen = qim0VarC.then(qim0VarA);
                                    cvx cvxVar5 = cbx.b(x340Var).b;
                                    boolean z6 = true;
                                    mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(z4)), eraVar, x340Var, z4 ? 1 : 0);
                                    int iHashCode2 = Long.hashCode(x340Var.T);
                                    xos0 xos0VarM2 = x340Var.m();
                                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
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
                                    x340Var.i0(-2030941702);
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        String str = (String) it.next();
                                        String strN0 = cwl1.n0(2131955379, new Object[]{str}, x340Var);
                                        boolean z7 = ((i2 & 57344) == 16384 ? z6 : z4) | (x340Var.g(str) ? 1 : 0);
                                        Object objT3 = x340Var.T();
                                        if (z7 != 0 || objT3 == m4cVar) {
                                            c = 6;
                                            are areVar = new are(iu30Var, str, (byte) 6);
                                            x340Var.s0(areVar);
                                            obj2 = areVar;
                                        } else {
                                            c = 6;
                                            obj2 = objT3;
                                        }
                                        Function0 function0 = (Function0) obj2;
                                        if (ihc1.y0(strN0)) {
                                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                            return;
                                        }
                                        gbx gbxVar = new gbx(new y50(strN0), function0);
                                        mex mexVar = mex.b;
                                        boolean z8 = z4;
                                        lex lexVarZ = yoo1.z(x340Var);
                                        if (z2) {
                                            haxVar2 = z ? new hax(strO1) : haxVar3;
                                        } else {
                                            haxVar2 = new hax(strO2);
                                        }
                                        x340 x340Var2 = x340Var;
                                        poo1.e(gbxVar, mexVar, lexVarZ, null, 2, null, haxVar2, null, null, null, null, false, null, apo.r(-1626845897, new qeu(str, (byte) 13), x340Var), x340Var2, 24576, 3072, 8104);
                                        z4 = z8 ? 1 : 0;
                                        strO1 = strO1;
                                        z6 = z6;
                                        x340Var = x340Var2;
                                        m4cVar = m4cVar;
                                    }
                                    boolean z9 = z4;
                                    z3 = z6;
                                    us71.m(x340Var, z9, z3, z9);
                                }
                                x340Var.r(z3);
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new hy((Object) y7e1Var, (Object) list, z, z2, (Object) iu30Var, i, (byte) 7);
                            }
                        }

                        public static final void z(nue1 nue1Var, sm51 sm51Var, qim0 qim0Var, b0k b0kVar, int i) {
                            sm51 sm51Var2;
                            qim0 qim0Var2;
                            float f;
                            xtb0 xtb0Var;
                            ejk1 ejk1Var;
                            int i2;
                            m4c m4cVar = fkj0.X;
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-301653255);
                            int i3 = (x340Var.i(nue1Var) ? 4 : 2) | i | (x340Var.i(sm51Var) ? 32 : 16) | 384;
                            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                                ejk1 ejk1Var2 = nue1Var.a;
                                float f2 = ejk1Var2.b;
                                long j = ejk1Var2.a;
                                if (f2 <= 0.0f || ejk1Var2.b() <= 0.0f || j <= 0) {
                                    h311 h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        h311VarV.d = new tc11(nue1Var, sm51Var, i, (byte) 29);
                                        return;
                                    }
                                    return;
                                }
                                wat watVar = (wat) x340Var.k(t4k.h);
                                float fX0 = watVar.X0(46.0f) * 1.7777778f;
                                float fB = ejk1Var2.b() * j;
                                int iU = jch0.U(fB / fX0);
                                if (iU < 1) {
                                    iU = 1;
                                }
                                float f3 = fB / iU;
                                float fB2 = f3 / ejk1Var2.b();
                                float fN0 = watVar.N0(f3);
                                float f4 = ejk1Var2.b;
                                float fN1 = watVar.N0(f4);
                                boolean zE = x340Var.e(iU);
                                Object objT = x340Var.T();
                                if (zE || objT == m4cVar) {
                                    objT = A(ejk1Var2, f4, iU, f3);
                                    x340Var.s0(objT);
                                }
                                mmr0 mmr0Var = (mmr0) objT;
                                int iIntValue = ((Number) mmr0Var.a).intValue();
                                int iIntValue2 = ((Number) mmr0Var.b).intValue();
                                boolean zE2 = x340Var.e(iU);
                                Object objT2 = x340Var.T();
                                if (zE2 || objT2 == m4cVar) {
                                    objT2 = new xtb0(iIntValue, iIntValue2);
                                    x340Var.s0(objT2);
                                }
                                xtb0 xtb0Var2 = (xtb0) objT2;
                                boolean zG = x340Var.g(ejk1Var2) | x340Var.d(f4) | x340Var.e(iU) | x340Var.d(f3) | x340Var.i(xtb0Var2);
                                Object objT3 = x340Var.T();
                                if (zG || objT3 == m4cVar) {
                                    f = fB2;
                                    int i4 = iU;
                                    xtb0Var = xtb0Var2;
                                    et41 et41Var = new et41(xtb0Var, ejk1Var2, f4, i4, f3, (lnm) null);
                                    ejk1Var = ejk1Var2;
                                    i2 = i4;
                                    x340Var.s0(et41Var);
                                    objT3 = et41Var;
                                } else {
                                    i2 = iU;
                                    xtb0Var = xtb0Var2;
                                    ejk1Var = ejk1Var2;
                                    f = fB2;
                                }
                                qxd0.t(ejk1Var, x340Var, (vu30) objT3);
                                qim0 qim0Var3 = nim0.a;
                                qim0 qim0VarR = i1p1.r(u291.h(u291.f(qim0Var3, 1.0f), 46.0f));
                                gfh0 gfh0VarC = t1c.c(een.d, false);
                                int iHashCode = Long.hashCode(x340Var.T);
                                xos0 xos0VarM = x340Var.m();
                                qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
                                qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                                zzq0 zzq0VarH = uyn1.h(2, fN1, 0.0f);
                                boolean zE3 = x340Var.e(i2) | x340Var.d(f) | x340Var.g(ejk1Var) | x340Var.i(sm51Var) | x340Var.d(fN0);
                                Object objT4 = x340Var.T();
                                if (zE3 || objT4 == m4cVar) {
                                    gt41 gt41Var = new gt41(i2, f, ejk1Var, sm51Var, fN0);
                                    sm51Var2 = sm51Var;
                                    x340Var.s0(gt41Var);
                                    objT4 = gt41Var;
                                } else {
                                    sm51Var2 = sm51Var;
                                }
                                qim0Var2 = qim0Var3;
                                ujo1.e(qim0VarD, xtb0Var, zzq0VarH, null, null, null, false, null, (iu30) objT4, x340Var, 12582912, 376);
                                x340Var.r(true);
                            } else {
                                sm51Var2 = sm51Var;
                                x340Var.b0();
                                qim0Var2 = qim0Var;
                            }
                            h311 h311VarV2 = x340Var.v();
                            if (h311VarV2 != null) {
                                h311VarV2.d = new hl11(nue1Var, sm51Var2, qim0Var2, i, (byte) 18);
                            }
                        }
                    }
