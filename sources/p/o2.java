package p;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o2 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(qj qjVar, pd1 pd1Var) {
        super(3);
        this.a = (byte) 16;
        this.b = qjVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        int i;
        xpw xpwVar;
        mr20 mr20Var;
        x340 x340Var;
        Long l;
        String str;
        ou80 ou80Var;
        Object value;
        byte b = this.a;
        ixb ixbVar = ixb.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        String str2 = null;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                nyx.a(2, (wux) null, apo.r(-1705443101, new n2((m2) obj, (p2) obj4, (byte) 0), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 1:
                vm vmVar = (vm) obj;
                tm tmVar = (tm) obj4;
                if (!((um) obj2).equals(um.a)) {
                    eg.o();
                    return null;
                }
                MessageResponseToken messageResponseToken = (MessageResponseToken) ((pu40) tmVar.d).invoke();
                if (messageResponseToken != null) {
                    paj0.b((paj0) tmVar.c, messageResponseToken, new Button("connectCta", new ButtonStyle("Connect to Gemini", (String) null, (String) null, (Icon) null, (ButtonType) null, (EncoreFont) null, (ButtonIconAlignment) null, 112, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) null, (Map) null, 4, (DefaultConstructorMarker) null)), (Bundle) null, 12);
                }
                vmVar.a.invoke();
                return rih1Var;
            case 2:
                tqw tqwVar = (tqw) obj3;
                if (((yt) obj2).equals(yt.a)) {
                    ((lzn0) ((ldo) obj4).c).a(nik1.Z0.a, cvl1.d(tqwVar), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                wzg wzgVar = (wzg) obj4;
                d9p1.f(384, wzgVar.b(), apo.r(1798630083, new ab(wzgVar, (byte) 3), b0kVar2), b0kVar2, uyn1.x(nim0Var, 4.0f));
                return rih1Var;
            case 4:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                cy cyVar = (cy) obj4;
                eso1.e(Uri.parse(cyVar.e), isl.a, anm1.N("backgroundImage", ((g2c) obj).b(nim0Var)), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4024);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                nyo1.b(cyVar.a, cyVar.b, cyVar.f, cyVar.g, uyn1.x(new wnb0(1.0f, true), 16.0f), x340Var2, 0);
                nyo1.c(cyVar.c, cyVar.d, cyVar.i, cyVar.h, null, x340Var2, 0);
                x340Var4.r(true);
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                d0p1.b((yap1) obj4, (b0k) obj2, 0);
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                g0p1.b((r2p1) obj4, (b0k) obj2, 0);
                return rih1Var;
            case 7:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = ((rk0) obj4).b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str3, null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2034);
                return rih1Var;
            case 8:
                kp0 kp0Var = (kp0) obj;
                aq0 aq0Var = ((op0) obj4).a;
                cs10 cs10Var = kp0Var.a;
                String str4 = kp0Var.b;
                fq0 fq0Var = kp0Var.d;
                zp0 zp0Var = new zp0(cs10Var, str4, fq0Var.k(), kp0Var.e, fq0Var.h(), fq0Var.a(), kp0Var.c, kp0Var.f, kp0Var.g, kp0Var.h, (Long) null, (Double) null, kp0Var.i);
                aq0Var.getClass();
                a1r0.j(aq0Var.b, nik1.h2.a, (String) null, mno1.h(new mmr0[]{new mmr0("thumbs_feedback_page_parameters", zp0Var)}), false, 10);
                return rih1Var;
            case 9:
                xx10 xx10Var = (xx10) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                wp0 wp0Var = (wp0) obj4;
                los losVar = wp0Var.c;
                if (zBooleanValue) {
                    hs10 hs10Var = wp0Var.e.a;
                    if ((hs10Var instanceof cs10) || u890.j(hs10Var, es10.a) || (hs10Var instanceof ds10)) {
                        i = 2131951847;
                    } else {
                        if (!u890.j(hs10Var, gs10.a) && !u890.j(hs10Var, fs10.a)) {
                            eg.o();
                            return null;
                        }
                        i = 2131951846;
                    }
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    losVar.c(new d4((Object) wp0Var, (Object) new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false), (byte) 6));
                }
                if (xx10Var != null) {
                    wp0Var.g.a.a(xx10Var);
                }
                if (zBooleanValue2) {
                    losVar.a(ixbVar);
                }
                return rih1Var;
            case 10:
                ji0 ji0Var = (ji0) obj;
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                nt0 nt0Var = (nt0) obj4;
                q7r0 q7r0Var = nt0Var.k;
                if (ji0Var == null) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(238393646);
                    boolean zI = x340Var6.i(nt0Var);
                    Object objT = x340Var6.T();
                    if (zI || objT == m4cVar) {
                        objT = new et0(nt0Var, null, (byte) 0);
                        x340Var6.s0(objT);
                    }
                    qxd0.t(rih1Var, x340Var6, (vu30) objT);
                    x340Var6.r(false);
                } else {
                    fgh0 fgh0Var = ji0Var.g;
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(238598339);
                    x340Var7.r(false);
                    a44 a44Var = nt0Var.n;
                    u70 u70Var = nt0Var.s;
                    mr20 mr20Var2 = nt0Var.r;
                    iac0 iac0Var = q7r0Var.d.c;
                    boolean zI2 = x340Var7.i(nt0Var);
                    Object objT2 = x340Var7.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new ct0(nt0Var, (byte) 1);
                        x340Var7.s0(objT2);
                    }
                    qxd0.i(iac0Var, (iu30) objT2, x340Var7);
                    boolean zI3 = x340Var7.i(nt0Var);
                    Object objT3 = x340Var7.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new bu(nt0Var, (lnm) null, (byte) 1);
                        x340Var7.s0(objT3);
                    }
                    qxd0.t(ji0Var, x340Var7, (vu30) objT3);
                    Object objT4 = x340Var7.T();
                    if (objT4 == m4cVar) {
                        objT4 = qxd0.M(o6x.a, x340Var7);
                        x340Var7.s0(objT4);
                    }
                    c9n c9nVar = (c9n) objT4;
                    Object objT5 = x340Var7.T();
                    if (objT5 == m4cVar) {
                        List list = fgh0Var.b;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            str = "progressive";
                        } else {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    r57 r57Var = ((a7j1) it.next()).e;
                                    if ((r57Var instanceof o57 ? ((o57) r57Var).a : null) != null) {
                                        str = "adaptive";
                                    }
                                } else {
                                    str = "progressive";
                                }
                            }
                        }
                        String str5 = str;
                        kwo kwoVar = nt0Var.e;
                        String str6 = ji0Var.a;
                        String str7 = ji0Var.t;
                        g3 g3Var = new g3(nt0Var, (byte) 13);
                        gt0 gt0Var = new gt0(c9nVar, nt0Var, (byte) 0);
                        gt0 gt0Var2 = new gt0(c9nVar, nt0Var, (byte) 1);
                        wzn wznVar = (wzn) kwoVar.a.c;
                        bt0 bt0Var = (bt0) ((ot0) wznVar.a).n.get();
                        c8o.l(bt0Var);
                        zt0 zt0Var = (zt0) ((ot0) wznVar.a).o.get();
                        c8o.l(zt0Var);
                        objT5 = woa.a(nt0Var.q, "ad-on-app-open", (o2u0) null, (w2k1) null, (kma) null, p7h.M(new d0u0[]{nt0Var.f, new gu0(str6, str7, str5, g3Var, gt0Var, gt0Var2, bt0Var, zt0Var, (byte) 0)}), false, (bas) null, (sn10) null, 1006);
                        x340Var7.s0(objT5);
                    }
                    uoa uoaVar = (uoa) objT5;
                    Object[] objArr = new Object[0];
                    Object objT6 = x340Var7.T();
                    if (objT6 == m4cVar) {
                        objT6 = p4.Q0;
                        x340Var7.s0(objT6);
                    }
                    ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT6, x340Var7, 48);
                    Boolean bool = (Boolean) ven0Var.getValue();
                    bool.getClass();
                    boolean zI4 = x340Var7.i(uoaVar) | x340Var7.i(ven0Var);
                    Object objT7 = x340Var7.T();
                    if (zI4 || objT7 == m4cVar) {
                        objT7 = new y4(uoaVar, ven0Var, (byte) 11);
                        x340Var7.s0(objT7);
                    }
                    Function0 function0 = (Function0) objT7;
                    if (x340Var7.g(bool) | x340Var7.g(uoaVar)) {
                        qxd0.S(function0, x340Var7);
                    }
                    Object objT8 = x340Var7.T();
                    if (objT8 == m4cVar) {
                        objT8 = nt0Var.g.a(new uq0(new sq0(ji0Var, mr20Var2, ((Boolean) ven0Var.getValue()).booleanValue(), new xj0(ven0Var, (byte) 2))));
                        x340Var7.s0(objT8);
                    }
                    xpw xpwVar2 = (xpw) objT8;
                    Object objT9 = x340Var7.T();
                    if (objT9 == m4cVar) {
                        objT9 = nt0Var.h.a(new ry0(new py0(ji0Var, mr20Var2, u70Var)));
                        x340Var7.s0(objT9);
                    }
                    xpw xpwVar3 = (xpw) objT9;
                    if (a44Var.d()) {
                        x340Var7.i0(241081594);
                        Object objT10 = x340Var7.T();
                        if (objT10 == m4cVar) {
                            objT10 = nt0Var.i.a(new ado(new yco(ji0Var, mr20Var2), (pxc) null));
                            x340Var7.s0(objT10);
                        }
                        x340Var7.r(false);
                        xpwVar = (xpw) objT10;
                    } else {
                        x340Var7.i0(241321502);
                        x340Var7.r(false);
                        xpwVar = null;
                    }
                    Object objT11 = x340Var7.T();
                    if (objT11 == m4cVar) {
                        w791 w791Var = nt0Var.j;
                        a7j1 a7j1Var = (a7j1) o7h.s0(fgh0Var.b);
                        ji0Var = ji0Var;
                        x340Var = x340Var7;
                        mr20Var = mr20Var2;
                        objT11 = w791Var.a(new q791(2, new t791(ji0Var, u70Var, mr20Var2, new huz(Long.valueOf(!a44Var.i() ? ((a7j1Var == null || (l = a7j1Var.f) == null) ? 0L : l.longValue()) * 1000 : a44Var.j()), (byte) 10), new q4(nt0Var, (lnm) null, (byte) 14), a44Var.i())));
                        x340Var.s0(objT11);
                    } else {
                        mr20Var = mr20Var2;
                        x340Var = x340Var7;
                    }
                    xpw xpwVar4 = (xpw) objT11;
                    Object objT12 = x340Var.T();
                    if (objT12 == m4cVar) {
                        objT12 = nt0Var.d.b(ji0Var, fgh0Var.b);
                        x340Var.s0(objT12);
                    }
                    o2u0 o2u0Var = (o2u0) objT12;
                    Object[] objArr2 = new Object[0];
                    Object objT13 = x340Var.T();
                    if (objT13 == m4cVar) {
                        objT13 = new wam1(0, (byte) 23);
                        x340Var.s0(objT13);
                    }
                    frr0 frr0Var = (frr0) k5p1.s(objArr2, (Function0) objT13, x340Var, 48);
                    iac0 iac0Var2 = q7r0Var.d.c;
                    ven0 ven0VarJ = f4p1.j(mr20Var, Long.valueOf(frr0Var.s()), iac0Var2, x340Var, 0, 12);
                    ven0 ven0VarS = v8r.s(Long.valueOf(((Number) ven0VarJ.getValue()).longValue()), x340Var);
                    boolean zI5 = x340Var.i(frr0Var) | x340Var.i(ven0VarS) | x340Var.i(iac0Var2);
                    Object objT14 = x340Var.T();
                    if (zI5 || objT14 == m4cVar) {
                        objT14 = new t6(iac0Var2, ven0VarS, frr0Var, (byte) 3);
                        x340Var.s0(objT14);
                    }
                    qxd0.i(iac0Var2, (iu30) objT14, x340Var);
                    long jLongValue = ((Number) ven0VarJ.getValue()).longValue();
                    boolean zI6 = x340Var.i(nt0Var) | x340Var.i(ji0Var);
                    Object objT15 = x340Var.T();
                    if (zI6 || objT15 == m4cVar) {
                        objT15 = new ft0(nt0Var, ji0Var, (byte) 0);
                        x340Var.s0(objT15);
                    }
                    eu0.a(uoaVar, o2u0Var, xpwVar2, xpwVar3, xpwVar, xpwVar4, jLongValue, (Function0) objT15, null, x340Var, 0);
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                z71 z71Var = (z71) obj;
                tqw tqwVar2 = (tqw) obj3;
                if (!(((y71) obj2) instanceof y71)) {
                    eg.o();
                    return null;
                }
                lzn0 lzn0Var = ((a81) obj4).a;
                String str8 = nik1.c6.b("spotify:internal:add-child-plan-member:".concat(z71Var.a)).a;
                tv80 tv80VarY = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                dwn0 dwn0Var = new dwn0(str8, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null);
                Bundle bundle = new Bundle();
                bundle.putSerializable("navigation_source", wxn0.a);
                lzn0Var.i(dwn0Var, bundle);
                return rih1Var;
            case grn1.d /* 12 */:
                ub1 ub1Var = (ub1) obj;
                if (((tb1) obj2).equals(tb1.a)) {
                    ((vb1) obj4).a.invoke(ub1Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 13:
                ac1 ac1Var = (ac1) obj2;
                tqw tqwVar3 = (tqw) obj3;
                bc1 bc1Var = (bc1) obj4;
                if (ac1Var instanceof zb1) {
                    bc1Var.a.a(bc1.f, cvl1.d(tqwVar3), (Bundle) null);
                } else {
                    if (!(ac1Var instanceof yb1)) {
                        eg.o();
                        return null;
                    }
                    bc1Var.b.a(ixbVar);
                }
                return rih1Var;
            case 14:
                tqw tqwVar4 = (tqw) obj3;
                if (!((fd1) obj2).equals(fd1.a)) {
                    eg.o();
                    return null;
                }
                ldo ldoVar = (ldo) obj4;
                ((sb7) ldoVar.d).a((String) ldoVar.c, cvl1.d(tqwVar4));
                return rih1Var;
            case 15:
                ld1 ld1Var = (ld1) obj;
                tqw tqwVar5 = (tqw) obj3;
                lzn0 lzn0Var2 = ((md1) obj4).b;
                if (!((kd1) obj2).equals(kd1.a)) {
                    eg.o();
                    return null;
                }
                String strE = md1.e(ld1Var);
                if (tqwVar5 != null) {
                    lzn0Var2.a(strE, n3o1.y(tqwVar5), (Bundle) null);
                } else {
                    lzn0Var2.h(strE);
                }
                return rih1Var;
            case 16:
                tqw tqwVar6 = (tqw) obj3;
                if (((nd1) obj2) instanceof nd1) {
                    ((qj) obj4).invoke(cvl1.d(tqwVar6).a.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 17:
                le1 le1Var = (le1) obj;
                tqw tqwVar7 = (tqw) obj3;
                if (((ke1) obj2).equals(ke1.a)) {
                    ((sb7) ((br0) obj4).c).a(le1Var.a, cvl1.d(tqwVar7));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 18:
                yh1 yh1Var = (yh1) obj;
                tqw tqwVar8 = (tqw) obj3;
                if (((xh1) obj2).equals(xh1.a)) {
                    ((zh1) obj4).b.d(dj20.c(yh1Var.e, 1, yh1Var.a, yh1Var.b, Long.valueOf(yh1Var.c), Long.valueOf(yh1Var.d)), tqwVar8 != null ? n3o1.y(tqwVar8) : null, (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 19:
                tqw tqwVar9 = (tqw) obj3;
                ybr0 ybr0Var = (ybr0) ((tm) obj4).e;
                if (tqwVar9 != null && (ou80Var = n3o1.y(tqwVar9).a) != null) {
                    str2 = ou80Var.a;
                }
                ybr0Var.a(rih1Var, str2);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    g9p1.b((xt1) obj4, null, x340Var9, 0);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var10 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    g9p1.l(((nt1) obj4).b, x340Var11, 0);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var12 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    g9p1.l(((ot1) obj4).b, x340Var13, 0);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 23:
                if (((hn2) obj2).equals(hn2.a)) {
                    ((jn2) obj4).b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 24:
                if (((kn2) obj2).equals(kn2.a)) {
                    ((jn2) obj4).b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 25:
                String str9 = (String) obj;
                x340 x340Var14 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var14.g(str9) ? 4 : 2;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    jw2 jw2Var = (jw2) obj4;
                    sok.d(str9, jw2Var.d.a, jw2Var.c, x340Var15, 14 & iIntValue4);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var16).b;
                kx2 kx2Var = (kx2) obj4;
                jw31 jw31VarA2 = ew31.a(new d36(4.0f, true, new um5(false)), een.Z, x340Var16, 0);
                x340 x340Var17 = x340Var16;
                int iHashCode2 = Long.hashCode(x340Var17.T);
                xos0 xos0VarM2 = x340Var17.m();
                qim0 qim0VarE2 = zr7.E(x340Var16, nim0Var);
                hzj.A.getClass();
                x340 x340Var18 = x340Var16;
                if (x340Var18.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var18.m0();
                if (x340Var18.S) {
                    x340Var18.l(n4kVar);
                } else {
                    x340Var18.v0();
                }
                nko1.H(jw31VarA2, x340Var16, y580.O0);
                nko1.H(xos0VarM2, x340Var16, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var16, y580.R0);
                nko1.F(x340Var16);
                nko1.H(qim0VarE2, x340Var16, y580.Y);
                String str10 = kx2Var.b;
                String str11 = kx2Var.c;
                uwo1.e(str10, null, null, 0L, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2046);
                if (ihc1.y0(str11)) {
                    x340Var18.i0(926996330);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(926902152);
                    uwo1.e("(" + str11 + ")", null, null, cbx.a(x340Var16).b.b, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2038);
                    x340Var18.r(false);
                }
                x340Var18.r(true);
                return rih1Var;
            case 27:
                g43 g43Var = (g43) obj;
                d43 d43Var = (f43) obj2;
                tqw tqwVar10 = (tqw) obj3;
                tm tmVar2 = (tm) obj4;
                u961 u961Var = (u961) tmVar2.c;
                if (d43Var instanceof d43) {
                    u9c0 u9c0Var = (u9c0) u961Var.a;
                    String str12 = d43Var.a;
                    vxx0 vxx0Var = g43Var.a;
                    int iC = l1d.C(vxx0Var.d);
                    if (iC == 0) {
                        String str13 = vxx0Var.c;
                        xab1 xab1Var = (xab1) u961Var.c;
                        if (xab1Var != null) {
                            xab1Var.d((CancellationException) null);
                        }
                        u961Var.c = fn31.T(u9c0Var, (o8n) null, 0, new w33(u961Var, str12, str13, (lnm) null), 3);
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        xab1 xab1Var2 = (xab1) u961Var.c;
                        if (xab1Var2 != null) {
                            xab1Var2.d((CancellationException) null);
                        }
                        u961Var.c = fn31.T(u9c0Var, (o8n) null, 0, new x33(u961Var, str12, (lnm) null), 3);
                    }
                } else if (d43Var instanceof e43) {
                    tv80 tv80VarY2 = tqwVar10 != null ? n3o1.y(tqwVar10) : null;
                    if (tv80VarY2 != null) {
                        e43 e43Var = (e43) d43Var;
                        String str14 = e43Var.a;
                        String str15 = e43Var.c;
                        lzn0 lzn0Var3 = (lzn0) tmVar2.d;
                        if (str15 != null) {
                            lzn0Var3.a(cy30.p(str14, "?session=", e43Var.b, "&message=", str15), tv80VarY2, (Bundle) null);
                        } else {
                            lzn0Var3.a(str14, tv80VarY2, (Bundle) null);
                        }
                    }
                } else {
                    if (!d43Var.equals(c43.a)) {
                        eg.o();
                        return null;
                    }
                    xab1 xab1Var3 = (xab1) u961Var.c;
                    if (xab1Var3 != null) {
                        xab1Var3.d((CancellationException) null);
                    }
                    bpb1 bpb1Var = (bpb1) u961Var.d;
                    do {
                        value = bpb1Var.getValue();
                    } while (!bpb1Var.k(value, xyx0.a));
                }
                return rih1Var;
            case 28:
                tqw tqwVar11 = (tqw) obj3;
                if (tqwVar11 != null) {
                    ((bbm) ((rt01) obj4).d).a.a(bbm.a(2), n3o1.y(tqwVar11), (Bundle) null);
                }
                return rih1Var;
            default:
                if (((rzv0) obj2).equals(qzv0.a)) {
                    ((q01) obj4).invoke();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }
}
