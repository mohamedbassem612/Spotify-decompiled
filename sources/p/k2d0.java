package p;

import android.os.Bundle;
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
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k2d0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2d0(qj qjVar, kse0 kse0Var) {
        super(3);
        this.a = (byte) 21;
        this.b = qjVar;
    }

    public static final float a(tob1 tob1Var) {
        return ((Number) tob1Var.getValue()).floatValue();
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        af5 af5VarP;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar, ((o32) obj4).b), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2046);
                return rih1Var;
            case 1:
                sia1 sia1Var = (sia1) obj;
                ((Number) obj3).intValue();
                h3d0 h3d0Var = (h3d0) obj4;
                l141 l141Var = h3d0Var.g;
                qxc0 qxc0Var = sia1Var.b;
                ArrayList arrayListB = l141Var.b(qxc0Var);
                zsu0 zsu0Var = h3d0Var.a;
                r3d0 r3d0Var = sia1Var.a;
                String str = h3d0Var.e.a;
                x340 x340Var = (b0k) obj2;
                boolean zI = x340Var.i(h3d0Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new nzb0(h3d0Var, (byte) 19);
                    x340Var.s0(objT);
                }
                nyo1.f(str, zsu0Var, qxc0Var, arrayListB, r3d0Var, (Function0) objT, (qim0) null, x340Var, 0);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                jto1.b((qim0) null, (uvx) obj4, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, qvi.a, (b0k) obj2, 64, 196608, 32765);
                return rih1Var;
            case 3:
                int iOrdinal = ((z6d0) obj2).ordinal();
                if (iOrdinal == 0) {
                    ((svh0) ((ng20) obj4).b).i();
                } else if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                otw.c((gcd0) ((cac) obj4).b, new bcd0(2, Collections.singleton(ubd0.a)), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 5:
                fei1 fei1Var = (fei1) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var2.g(fei1Var) ? 4 : 2;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ((sdd0) ((vdd0) obj4).b.get()).a(new tdd0(fei1Var.a, fei1Var.b, fei1Var.d, fei1Var.c), x340Var3, 0);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 6:
                km61 km61Var = (km61) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                tv80 tv80Var = (tv80) obj3;
                s880 s880Var = (s880) obj4;
                dma1 dma1VarA = ((nu71) s880Var.g).a(km61Var.a.a);
                if (zBooleanValue) {
                    if (((hgd0) s880Var.b).r()) {
                        fn31.T(smo1.e(flo1.l(op71.f(), (q8n) s880Var.a)), (o8n) null, 0, new n0a0(s880Var, tv80Var, km61Var, (lnm) null, (byte) 21), 3);
                    } else {
                        bma1 bma1Var = rcd0.a;
                        if (!dma1VarA.h(bma1Var, false)) {
                            hma1 hma1VarEdit = dma1VarA.edit();
                            hma1VarEdit.a(bma1Var, true);
                            hma1VarEdit.g();
                            lzn0 lzn0Var = (lzn0) s880Var.f;
                            String str2 = nik1.v4.a;
                            tv80Var.getClass();
                            lzn0Var.a(str2, tv80Var, (Bundle) null);
                        }
                    }
                    return Boolean.valueOf(z);
                }
                hma1 hma1VarEdit2 = dma1VarA.edit();
                hma1VarEdit2.a(rcd0.a, true);
                hma1VarEdit2.g();
                z = true;
                return Boolean.valueOf(z);
            case 7:
                jhd0 jhd0Var = (jhd0) obj2;
                if (jhd0Var instanceof jhd0) {
                    ((lhd0) obj4).a.invoke(Boolean.valueOf(jhd0Var.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                gjd0 gjd0Var = (gjd0) obj2;
                tqw tqwVar = (tqw) obj3;
                lzn0 lzn0Var2 = ((na9) obj4).b;
                String str3 = ((ljd0) obj).a;
                if (tqwVar != null) {
                    tv80 tv80VarY = n3o1.y(tqwVar);
                    if (!gjd0Var.equals(ejd0.a) && !gjd0Var.equals(fjd0.a)) {
                        eg.o();
                        return null;
                    }
                    lzn0Var2.a(str3, tv80VarY, (Bundle) null);
                }
                return rih1Var;
            case 9:
                ojd0 ojd0Var = (ojd0) obj;
                tqw tqwVar2 = (tqw) obj3;
                if (!((njd0) obj2).equals(njd0.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar2 != null) {
                    ((lzn0) ((rwj) obj4).d).a(ojd0Var.a, n3o1.y(tqwVar2), (Bundle) null);
                }
                return rih1Var;
            case 10:
                ((Number) obj3).intValue();
                zzg zzgVar = (zzg) obj4;
                j1p1.h(zzgVar.a, zzgVar.b, zzgVar.c, zzgVar.d, zzgVar.e, zzgVar.f, zzgVar.g, zzgVar.j, zzgVar.h, zzgVar.i, zzgVar.l, (qim0) null, (b0k) obj2, 0);
                return rih1Var;
            case 11:
                ((cld0) obj4).a.a("spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties", cvl1.d((tqw) obj3), (Bundle) null);
                return rih1Var;
            case 12:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                xld0 xld0Var = (xld0) obj4;
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(x340Var4, nim0.a);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(hmb0.t1);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA, x340Var4, y580.O0);
                nko1.H(xos0VarM, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE, x340Var4, y580.Y);
                bxc bxcVarZ = qon1.z(xld0Var.d, (Locale) null, (TimeZone) null, x340Var4, 0, 6);
                o1p1.b(xld0Var.a, xld0Var.f, bxcVarZ.b, bxcVarZ.a, (qim0) null, x340Var4, 0);
                o1p1.a(xld0Var.b, xld0Var.c, bxcVarZ.e, xld0Var.e, (qim0) null, x340Var4, 0);
                x340Var6.r(true);
                return rih1Var;
            case 13:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    uwo1.e(((zzz0) obj4).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var8, 1572864, 0, 1726);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                et9 et9Var = (et9) obj4;
                s0s s0sVar = ((tso) et9Var.g).a;
                boe0 boe0Var = (boe0) et9Var.h;
                x340 x340Var9 = (b0k) obj2;
                boolean zI2 = x340Var9.i(et9Var);
                Object objT2 = x340Var9.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new pie0(et9Var, (byte) 0);
                    x340Var9.s0(objT2);
                }
                qxd0.h(s0sVar, boe0Var, (iu30) objT2, x340Var9);
                cir0 cir0Var = (cir0) x340Var9.k(k2r0.a);
                String strO0 = cwl1.o0(x340Var9, 2131952881);
                String strO1 = cwl1.o0(x340Var9, 2131952882);
                boolean zI3 = x340Var9.i(et9Var);
                Object objT3 = x340Var9.T();
                if (zI3 || objT3 == m4cVar) {
                    objT3 = new pie0(et9Var, (byte) 1);
                    x340Var9.s0(objT3);
                }
                dgo1.c(rih1Var, (iu30) objT3, apo.r(-1810440859, new cb60(et9Var, cir0Var, strO0, strO1, (byte) 26), x340Var9), x340Var9, 390);
                return rih1Var;
            case 15:
                ((jne0) obj4).a.invoke((hne0) obj2);
                return rih1Var;
            case 16:
                ((Number) obj3).intValue();
                uwo1.e(((ine0) obj4).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 17:
                l7h1 l7h1Var = (l7h1) obj;
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                i8h1 i8h1Var = (i8h1) obj4;
                if (l7h1Var != null) {
                    x340 x340Var11 = x340Var10;
                    x340Var11.i0(-1079890595);
                    boolean zI4 = x340Var11.i(i8h1Var) | x340Var11.i(l7h1Var);
                    Object objT4 = x340Var11.T();
                    if (zI4 || objT4 == fkj0.X) {
                        objT4 = new e9c0(i8h1Var, l7h1Var, (lnm) null, (byte) 18);
                        x340Var11.s0(objT4);
                    }
                    qxd0.t(rih1Var, x340Var11, (vu30) objT4);
                    x340Var11.r(false);
                } else {
                    x340 x340Var12 = x340Var10;
                    x340Var12.i0(-1079818520);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 18:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str4 = ((kbh) obj4).h.a;
                se11 se11Var = vqe0.a;
                x340 x340Var14 = x340Var13;
                x340Var14.i0(-485031500);
                uwr uwrVar = cbx.a;
                zma1 zma1Var = cbx.d(x340Var14).k.a;
                zma1 zma1Var2 = new zma1(cbx.a(x340Var14).b.c, 0L, zma1Var.c, (FontStyle) null, (FontSynthesis) null, zma1Var.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65498);
                List<mbh0> listK0 = z561.k0(se11.b(vqe0.a, str4));
                if (listK0.isEmpty()) {
                    af5VarP = new af5(str4);
                } else {
                    ye5 ye5Var = new ye5();
                    int i = 0;
                    for (mbh0 mbh0Var : listK0) {
                        ye5Var.g(str4.substring(i, ((rr80) mbh0Var.b()).a));
                        int iO = ye5Var.o(zma1Var2);
                        try {
                            ye5Var.g((String) mbh0Var.a().get(1));
                            ye5Var.k(iO);
                            i = ((rr80) mbh0Var.b()).b + 1;
                        } catch (Throwable th) {
                            ye5Var.k(iO);
                            throw th;
                        }
                    }
                    if (i < str4.length()) {
                        ye5Var.g(str4.substring(i));
                    }
                    af5VarP = ye5Var.p();
                }
                x340Var14.r(false);
                af5 af5Var = af5VarP;
                uwr uwrVar2 = cbx.a;
                uwo1.d(af5Var, cbx.a(x340Var13).b.b, (qim0) null, cbx.d(x340Var13).j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var13, 0, 0, 4068);
                return rih1Var;
            case 19:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                xqe0 xqe0Var = (pap1) obj4;
                ye5 ye5Var2 = new ye5();
                ye5Var2.g(xqe0Var.c);
                ye5Var2.g(" ");
                int iO2 = ye5Var2.o(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439));
                try {
                    ye5Var2.g(xqe0Var.d.a);
                    ye5Var2.k(iO2);
                    af5 af5VarP2 = ye5Var2.p();
                    uwr uwrVar3 = cbx.a;
                    uwo1.d(af5VarP2, cbx.a(b0kVar2).b.b, (qim0) null, cbx.d(b0kVar2).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4084);
                    return rih1Var;
                } catch (Throwable th2) {
                    ye5Var2.k(iO2);
                    throw th2;
                }
            case 20:
                xoe0 xoe0Var = (xoe0) obj;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                Object obj5 = fkj0.X;
                ire0 ire0Var = (ire0) obj4;
                fqe0 fqe0Var = ire0Var.d;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? x340Var15.g(xoe0Var) : x340Var15.i(xoe0Var) ? 4 : 2;
                }
                x340 x340Var16 = x340Var15;
                if (!x340Var16.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x340Var16.b0();
                } else if (xoe0Var != null) {
                    x340Var16.i0(235746669);
                    iac0 iac0Var = (iac0) x340Var16.k(jfe0.a);
                    j2e0 j2e0Var = ire0Var.e;
                    boolean zG = x340Var16.g(fqe0Var) | x340Var16.g(j2e0Var) | x340Var16.g(iac0Var);
                    Object objT5 = x340Var16.T();
                    if (zG || objT5 == obj5) {
                        objT5 = new gqe0(fqe0Var, j2e0Var, ire0Var.f, iac0Var);
                        x340Var16.s0(objT5);
                    }
                    otw.c((gqe0) objT5, xoe0Var, (qim0) null, (ipb1) null, x340Var16, (iIntValue3 << 3) & 112, 12);
                    x340Var16.r(false);
                } else {
                    x340Var16.i0(236088041);
                    boolean zI5 = x340Var16.i(ire0Var);
                    Object objT6 = x340Var16.T();
                    if (zI5 || objT6 == obj5) {
                        objT6 = new iyb0(ire0Var, null, (byte) 6);
                        x340Var16.s0(objT6);
                    }
                    qxd0.t(rih1Var, x340Var16, (vu30) objT6);
                    x340Var16.r(false);
                }
                return rih1Var;
            case 21:
                tqw tqwVar3 = (tqw) obj3;
                if (((ise0) obj2) instanceof ise0) {
                    ((qj) obj4).invoke(cvl1.d(tqwVar3).a.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                xxe0 xxe0Var = (xxe0) obj;
                tqw tqwVar4 = (tqw) obj3;
                if (!((wxe0) obj2).equals(wxe0.a)) {
                    eg.o();
                    return null;
                }
                zzy zzyVar = xxe0Var.d;
                lik1 lik1Var = xxe0Var.b;
                String strA = zzyVar != null ? zzyVar.a(lik1Var) : lik1Var.a;
                Bundle bundleG = mno1.g();
                Boolean bool = xxe0Var.e;
                if (bool != null) {
                    bundleG.putBoolean("is_free_override", bool.booleanValue());
                }
                ((na9) obj4).b.i(new dwn0(strA, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tqwVar4 != null ? new bwn0(n3o1.y(tqwVar4)) : null), bundleG);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                d2f0 d2f0Var = (d2f0) obj;
                tqw tqwVar5 = (tqw) obj3;
                f2f0 f2f0Var = (f2f0) obj4;
                lzn0 lzn0Var3 = f2f0Var.a;
                if (!((b2f0) obj2).equals(b2f0.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar5 != null) {
                    lzn0Var3.a(f2f0Var.e(d2f0Var), n3o1.y(tqwVar5), (Bundle) null);
                } else {
                    lzn0Var3.h(f2f0Var.e(d2f0Var));
                }
                return rih1Var;
            case 24:
                e2f0 e2f0Var = (e2f0) obj;
                tqw tqwVar6 = (tqw) obj3;
                g2f0 g2f0Var = (g2f0) obj4;
                lzn0 lzn0Var4 = g2f0Var.a;
                if (!((c2f0) obj2).equals(c2f0.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar6 != null) {
                    lzn0Var4.a(g2f0Var.e(e2f0Var), n3o1.y(tqwVar6), (Bundle) null);
                } else {
                    lzn0Var4.h(g2f0Var.e(e2f0Var));
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                tqw tqwVar7 = (tqw) obj3;
                if (i6f0.a[((h6f0) obj2).ordinal()] == 1) {
                    ((f330) obj4).b.a("spotify:genre:made-for-x-hub", cvl1.d(tqwVar7), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 26:
                p7f0 p7f0Var = (p7f0) obj;
                if (!((o7f0) obj2).equals(o7f0.a)) {
                    eg.o();
                    return null;
                }
                if (p7f0Var.h) {
                    ((zrg) ((et90) obj4).c).b(p7f0Var.b, p7f0Var.d);
                }
                return rih1Var;
            case 27:
                frf0 frf0Var = (frf0) obj;
                x340 x340Var17 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? x340Var17.g(frf0Var) : x340Var17.i(frf0Var) ? 4 : 2;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    otw.c((xpw) obj4, frf0Var, (qim0) null, wpb1.C("fullscreenLyricsTextElement", (xpw) obj4, frf0Var, x340Var18, 518 | ((iIntValue4 << 6) & 896), 8), x340Var18, 64 | ((iIntValue4 << 3) & 112), 4);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 28:
                tqw tqwVar8 = (tqw) obj3;
                if (((blf0) obj2) != blf0.a) {
                    eg.o();
                    return null;
                }
                qj0 qj0Var = (qj0) obj4;
                lzn0 lzn0Var5 = (lzn0) qj0Var.d;
                String str5 = (String) qj0Var.e;
                if (tqwVar8 != null) {
                    lzn0Var5.a(str5, n3o1.y(tqwVar8), (Bundle) null);
                    return rih1Var;
                }
                hhg1.n("Required value was null.");
                return null;
            default:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var19 = (b0k) obj2;
                x340Var19.i0(-837560132);
                cb80 cb80VarG = t5p1.g(t5p1.r("translationShimmer", x340Var19, 0), -2.0f, 2.0f, irn1.Y(irn1.o0(1000, 0, (dlv) null, 6), 1, 0L, 4), "shimmerProgress", x340Var19, 29064, 0);
                uwr uwrVar4 = cbx.a;
                long j = ((vex) zex.a.e).j;
                y9e1 y9e1Var = (y9e1) obj4;
                boolean zI6 = x340Var19.i(y9e1Var) | x340Var19.g(cb80VarG) | x340Var19.f(j);
                Object objT7 = x340Var19.T();
                if (zI6 || objT7 == fkj0.X) {
                    objT7 = new vlf0(y9e1Var, j, cb80VarG);
                    x340Var19.s0(objT7);
                }
                qim0 qim0VarQ = exd0.q(qim0Var, (iu30) objT7);
                x340Var19.r(false);
                return qim0VarQ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2d0(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }
}
