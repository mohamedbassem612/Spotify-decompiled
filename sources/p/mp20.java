package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mp20 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp20(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jA;
        float f;
        ou80 ou80Var;
        ou80 ou80Var2;
        byte b = this.a;
        byte b2 = 3;
        tv80 tv80Var = null;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                lp20 lp20Var = (lp20) obj;
                kp20 kp20Var = (kp20) obj2;
                if (kp20Var instanceof ip20) {
                    ug3 ug3Var = (ug3) obj4;
                    String strE = ug3Var.e(lp20Var);
                    if (strE != null) {
                        hp20 hp20Var = (hp20) ug3Var.b;
                        swv0.c(hp20Var.b, hp20Var.a, new rwv0(new ixf("flavor_page_pdp"), "", Uri.parse(strE)));
                        hp20Var.c.e();
                    }
                } else if (!(kp20Var instanceof jp20)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 1:
                e330 e330Var = (e330) obj;
                d330 d330Var = (d330) obj2;
                tqw tqwVar = (tqw) obj3;
                lzn0 lzn0Var = ((f330) obj4).b;
                if (d330Var.equals(b330.a)) {
                    lzn0Var.e();
                } else {
                    if (!d330Var.equals(c330.a)) {
                        eg.o();
                        return null;
                    }
                    lzn0Var.e();
                    String strG = e330Var.b;
                    if (strG == null) {
                        strG = pcf.g(e330Var.a);
                    }
                    lzn0Var.a(strG, cvl1.d(tqwVar), (Bundle) null);
                }
                return rih1Var;
            case 2:
                rwj rwjVar = (rwj) obj4;
                fn31.T((c9n) rwjVar.g, (o8n) null, 0, new f530(rwjVar, (u630) obj2, (v630) obj, (lnm) null, (byte) 2), 3);
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                anm1.c(((e730) obj4).c, (iu30) null, (qim0) null, (max) null, (idn0) null, (b0k) obj2, 48, 28);
                return rih1Var;
            case 4:
                if (((va30) obj2) == va30.a) {
                    ((y1c1) ((rt01) obj4).c).T(cb31.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                wa30 wa30Var = (wa30) obj;
                tqw tqwVar2 = (tqw) obj3;
                if (tqwVar2 != null) {
                    tv80 tv80VarY = n3o1.y(tqwVar2);
                    cb30 cb30Var = wa30Var.c.f;
                    f10 f10Var = cb30Var != null ? cb30Var.b : null;
                    if (f10Var != null) {
                        ur00 ur00Var = (ur00) obj4;
                        lzn0 lzn0Var2 = (lzn0) ur00Var.b;
                        String str = wa30Var.a;
                        ou80 ou80Var3 = tv80VarY.a;
                        fn31.T((llm) ur00Var.f, (o8n) null, 0, new xr00(str, ur00Var, (lnm) null, (byte) 9), 3);
                        if (f10Var instanceof vz) {
                            lzn0Var2.a(((vz) f10Var).a, tv80VarY, (Bundle) null);
                        } else if (f10Var instanceof iz) {
                            lzn0Var2.c();
                            e7p0.d((e7p0) ur00Var.c, ou80Var3);
                        } else if (f10Var instanceof m00) {
                            lzn0Var2.c();
                            g5p0.b((g5p0) ur00Var.d, ou80Var3, 2);
                        } else if (f10Var instanceof wz) {
                            lzn0Var2.c();
                        }
                    }
                }
                return rih1Var;
            case 6:
                z710.d(((gb30) obj4).a, ((eb30) obj2).a, false, 6);
                return rih1Var;
            case 7:
                zd30 zd30Var = (zd30) obj2;
                ae30 ae30Var = (ae30) obj4;
                z710 z710Var = ae30Var.a;
                if (zd30Var != zd30.a) {
                    eg.o();
                    return null;
                }
                if (z710Var.a()) {
                    z710.d(z710Var, "https://www.spotify.com/account/change-pin/?source=mobile", false, 2);
                } else {
                    i8h1 i8h1Var = ae30Var.b;
                    e9l0 e9l0Var = ae30Var.c;
                    e9l0Var.getClass();
                    x6h1 x6h1VarC = e9l0Var.b.c();
                    x6h1VarC.i.add(new a7h1("non_ephemeral_custom_tab", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = e9l0Var.a;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = e9l0Var.c;
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                    z710.d(z710Var, "https://www.spotify.com/account/change-pin/?source=mobile", true, 4);
                }
                return rih1Var;
            case 8:
                tqw tqwVar3 = (tqw) obj3;
                qj0 qj0Var = (qj0) obj4;
                int iOrdinal = ((ym30) obj2).ordinal();
                if (iOrdinal == 0) {
                    ((lzn0) qj0Var.d).a(sap1.s("inline_upsell:group_listening", nik1.b2), cvl1.d(tqwVar3), (Bundle) null);
                    ((svh0) qj0Var.e).i();
                } else if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 9:
                tqw tqwVar4 = (tqw) obj3;
                ldo ldoVar = (ldo) obj4;
                svh0 svh0Var = (svh0) ldoVar.d;
                int iOrdinal2 = ((in30) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    ((lzn0) ldoVar.c).a(sap1.s("inline_upsell:group_listening", nik1.b2), cvl1.d(tqwVar4), (Bundle) null);
                    svh0Var.i();
                } else if (iOrdinal2 == 1) {
                    svh0Var.i();
                } else if (iOrdinal2 != 2) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 10:
                ((os30) obj4).a.invoke();
                return rih1Var;
            case 11:
                tqw tqwVar5 = (tqw) obj3;
                sqa0 sqa0Var = ((ss30) obj4).a;
                if (tqwVar5 != null) {
                    sqa0Var.invoke(n3o1.y(tqwVar5));
                    return rih1Var;
                }
                hhg1.n("Required value was null.");
                return null;
            case 12:
                ((vs30) obj4).a.invoke(Boolean.valueOf(((xs30) obj).b));
                return rih1Var;
            case 13:
                ((ys30) obj4).a.invoke(((at30) obj).b);
                return rih1Var;
            case 14:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ((g340) obj4).c.b(70, apo.r(-1337605955, new dr0((byte) 28, zBooleanValue), x340Var2), x340Var2);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                eso1.e(Uri.parse(((zy9) obj4).a), isl.a, u291.d(nim0.a, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, false, false, (b0k) obj2, 221232, 0, 3464);
                return rih1Var;
            case 16:
                yyq yyqVar = (yyq) obj;
                ((Number) obj3).intValue();
                u540 u540Var = (u540) obj4;
                x340 x340Var3 = (b0k) obj2;
                boolean zI = x340Var3.i(u540Var);
                Object objT = x340Var3.T();
                if (zI || objT == fkj0.X) {
                    objT = new n3s(u540Var, (lnm) null, (byte) 19);
                    x340Var3.s0(objT);
                }
                qxd0.t(yyqVar, x340Var3, (vu30) objT);
                return rih1Var;
            case 17:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                r740 r740Var = (r740) obj4;
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                boolean z = x340Var6.S;
                n4k n4kVar = hmb0.t1;
                if (z) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var4, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var4, lljVar4);
                qim0 qim0VarR = u291.r(nim0Var, 20.0f);
                fra fraVar = een.N0;
                qim0 qim0VarThen = qim0VarR.then(new i5j1(fraVar));
                rtx rtxVar = rtx.c;
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var4).b.b;
                int i = rtx.d | 48;
                isl islVar = isl.a;
                w0h1.a(rtxVar, islVar, qim0VarThen, j, 0L, false, x340Var4, i, 48);
                qim0 qim0VarB = uyn1.B(nim0Var, 8.0f, 0.0f, 8.0f, 0.0f, 10);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                uwo1.e(r740Var.a, qim0VarB.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)).then(new i5j1(fraVar)), cbx.d(x340Var4).k, cbx.a(x340Var4).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2032);
                qim0 qim0VarThen2 = dug.f(i1p1.q(u291.r(nim0Var, 28.0f), er31.a), cbx.a(x340Var4).b.c, d4o1.a).then(new i5j1(fraVar));
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarThen2);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                i3a.l(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                w0h1.a(jkx.c, islVar, u291.r(nim0Var, 12.0f), cbx.a(x340Var4).a.c, 0L, false, x340Var4, jkx.d | 48, 48);
                x340Var6.r(true);
                x340Var6.r(true);
                return rih1Var;
            case 18:
                ((nf40) obj4).a.invoke();
                return rih1Var;
            case 19:
                yt40 yt40Var = (yt40) obj;
                xt40 xt40Var = (xt40) obj2;
                tm tmVar = (tm) obj4;
                paj0 paj0Var = (paj0) tmVar.c;
                pu40 pu40Var = (pu40) tmVar.d;
                if (xt40Var.equals(vt40.a)) {
                    MessageResponseToken messageResponseToken = (MessageResponseToken) pu40Var.invoke();
                    if (messageResponseToken != null) {
                        paj0.b(paj0Var, messageResponseToken, new Button("doneCta", new ButtonStyle("Done", (String) null, (String) null, (Icon) null, (ButtonType) null, (EncoreFont) null, (ButtonIconAlignment) null, 112, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) null, (Map) null, 4, (DefaultConstructorMarker) null)), (Bundle) null, 12);
                    }
                    yt40Var.c.invoke();
                } else {
                    if (!xt40Var.equals(wt40.a)) {
                        eg.o();
                        return null;
                    }
                    MessageResponseToken messageResponseToken2 = (MessageResponseToken) pu40Var.invoke();
                    if (messageResponseToken2 != null) {
                        paj0.b(paj0Var, messageResponseToken2, new Button("maybeLaterCta", new ButtonStyle("Maybe later", (String) null, (String) null, (Icon) null, (ButtonType) null, (EncoreFont) null, (ButtonIconAlignment) null, 112, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) null, (Map) null, 4, (DefaultConstructorMarker) null)), (Bundle) null, 12);
                    }
                    yt40Var.d.invoke();
                }
                return rih1Var;
            case 20:
                if (((ky40) obj2) != ky40.a) {
                    eg.o();
                    return null;
                }
                my40 my40Var = (my40) obj4;
                Activity activity = my40Var.a;
                activity.startActivity((Intent) my40Var.b.a(activity, my40.f).b);
                return rih1Var;
            case 21:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var7 = (b0k) obj2;
                x340Var7.i0(-152383117);
                uwr uwrVar2 = cbx.a;
                xex xexVar = (xex) ((gmt) zex.a.c).b;
                v850 v850Var = (v850) obj4;
                int iOrdinal3 = v850Var.ordinal();
                if (iOrdinal3 == 0) {
                    jA = xexVar.z;
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    jA = z4p1.A(0.2f, xexVar.D, u7h.b);
                }
                int iOrdinal4 = v850Var.ordinal();
                if (iOrdinal4 == 0) {
                    f = 0.5f;
                } else {
                    if (iOrdinal4 != 1) {
                        eg.o();
                        return null;
                    }
                    f = 0.59f;
                }
                qim0 qim0VarE3 = dug.e(qim0Var, v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(jA)), new mmr0(Float.valueOf(f), new u7h(cbx.a(x340Var7).a.c)), new mmr0(Float.valueOf(1.0f), new u7h(cbx.a(x340Var7).a.c))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
                x340Var7.r(false);
                return qim0VarE3;
            case 22:
                z950 z950Var = (z950) obj;
                tqw tqwVar6 = (tqw) obj3;
                if (!((x950) obj2).equals(x950.a)) {
                    eg.o();
                    return null;
                }
                ba50 ba50Var = (ba50) obj4;
                if (tqwVar6 != null) {
                    ba50Var.a.a(cfm0.i("spotify:graduation:view-request:", z950Var.a, nik1.j4).a, n3o1.y(tqwVar6), (Bundle) null);
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                aa50 aa50Var = (aa50) obj;
                tqw tqwVar7 = (tqw) obj3;
                if (!((y950) obj2).equals(y950.a)) {
                    eg.o();
                    return null;
                }
                vu30 vu30Var = ((ca50) obj4).a;
                String str2 = aa50Var.a;
                if (tqwVar7 != null && (ou80Var = n3o1.y(tqwVar7).a) != null) {
                    tv80Var = ou80Var.a;
                }
                vu30Var.invoke(str2, tv80Var);
                return rih1Var;
            case 24:
                ea50 ea50Var = (ea50) obj;
                tqw tqwVar8 = (tqw) obj3;
                if (!((da50) obj2).equals(da50.a)) {
                    eg.o();
                    return null;
                }
                vu30 vu30Var2 = ((fa50) obj4).a;
                gc50 gc50Var = ea50Var.a;
                if (tqwVar8 != null && (ou80Var2 = n3o1.y(tqwVar8).a) != null) {
                    tv80Var = ou80Var2.a;
                }
                vu30Var2.invoke(gc50Var, tv80Var);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                uc50 uc50Var = (uc50) obj;
                tqw tqwVar9 = (tqw) obj3;
                Integer num = ((tc50) obj2).a;
                Bundle bundleG = pzm.g("is_book", false);
                if (num != null) {
                    bundleG.putInt("preselected_rating", num.intValue());
                }
                if (tqwVar9 != null) {
                    ((na9) obj4).b.a(uc50Var.b, n3o1.y(tqwVar9), bundleG);
                }
                return rih1Var;
            case 26:
                tf50 tf50Var = (tf50) obj;
                tqw tqwVar10 = (tqw) obj3;
                if (tqwVar10 != null) {
                    ((uf50) obj4).a.z(tf50Var.j, n3o1.y(tqwVar10));
                }
                return rih1Var;
            case 27:
                ((yg50) ((bh50) obj4).c.get()).b((c380) obj, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1Var;
            case 28:
                si50 si50Var = (si50) obj;
                tqw tqwVar11 = (tqw) obj3;
                if (((ri50) obj2) == ri50.a) {
                    pcf.a(((na9) obj4).b, pcf.l(si50Var.a), tqwVar11 != null ? n3o1.y(tqwVar11) : null, mno1.h(new mmr0[]{new mmr0("groupName", si50Var.b)}));
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                zob1 zob1Var = (zob1) obj;
                int iIntValue2 = ((Number) obj3).intValue();
                dk50 dk50Var = (dk50) obj4;
                kj50 kj50Var = (kj50) dk50Var.c.get();
                x340 x340Var8 = (b0k) obj2;
                boolean zI2 = x340Var8.i(dk50Var);
                Object objT2 = x340Var8.T();
                if (zI2 || objT2 == fkj0.X) {
                    objT2 = new jb50(dk50Var, b2);
                    x340Var8.s0(objT2);
                }
                kj50Var.c(zob1Var, (vu30) objT2, x340Var8, iIntValue2 & 14);
                return rih1Var;
        }
    }
}
