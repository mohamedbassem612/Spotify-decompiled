package p;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wf(byte b, Object obj, iu30 iu30Var) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = iu30Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        i87 i87Var = (i87) this.c;
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            d87 d87Var = (d87) ((ArrayList) this.b).get(iIntValue);
            x340Var2.i0(805842490);
            boolean zI = x340Var2.i(i87Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new rr6(i87Var, (byte) 9);
                x340Var2.s0(objT);
            }
            p2o1.a(iIntValue, new h3h1((iu30) objT), apo.r(1437325791, new pp5(i87Var, d87Var, (byte) 15), x340Var2), x340Var2, (iIntValue2 & 14) | 384);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        q87 q87Var = (q87) this.c;
        x340 x340Var = (b0k) obj2;
        boolean zI = x340Var.i(q87Var);
        iu30 iu30Var = (iu30) this.b;
        boolean zG = zI | x340Var.g(iu30Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new o87(q87Var, iu30Var, (byte) 1);
            x340Var.s0(objT);
        }
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
        cvx cvxVar2 = cbx.b(x340Var).b;
        cvx cvxVar3 = cbx.b(x340Var).b;
        qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 8.0f, 5);
        WeakHashMap weakHashMap = osl1.x;
        qim0 qim0VarN = anm1.N("assisted_curation_search", too1.y(qim0VarB, new bgc0(lhc.g(x340Var).g, 32)));
        ceo ceoVar = q87.f;
        q87Var.e(0, (Function0) objT, x340Var, qim0VarN);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((maa) this.b, this.c, (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        o88 o88Var = (o88) this.c;
        pw50 pw50Var = o88Var.a;
        qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(o88Var);
        iu30 iu30Var = (iu30) this.b;
        boolean zG2 = zG | x340Var.g(iu30Var);
        Object objT = x340Var.T();
        if (zG2 || objT == fkj0.X) {
            objT = new z77(o88Var, iu30Var, (byte) 13);
            x340Var.s0(objT);
        }
        puo1.a(pw50Var, qim0VarZ, (Function0) objT, x340Var, 0);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ec8 ec8Var = (ec8) this.b;
        ub8 ub8Var = (ub8) this.c;
        ec8Var.o(ub8Var.e, ub8Var.d, ub8Var.c, (b0k) obj2, 0);
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        xe xeVar;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Class<pmm> cls;
        Object obj9;
        xf6 xf6Var;
        y3m0 y3m0VarC;
        w7h1 w7h1Var;
        int i;
        float fX0;
        float fX1;
        float fX2;
        hkx hkxVar;
        Object obj10;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        gex0 gex0Var = h36.a;
        b7x b7xVar = b7x.a;
        nim0 nim0Var = nim0.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj11 = this.c;
        Object obj12 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(1897346896);
                String strO0 = cwl1.o0(x340Var, 2131951775);
                String strO1 = cwl1.o0(x340Var, 2131951787);
                iu30 iu30Var = (iu30) obj12;
                j171 j171Var = (j171) obj11;
                boolean zG = x340Var.g(strO0) | x340Var.g(iu30Var) | x340Var.g(j171Var) | x340Var.g(strO1);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    obj4 = objT;
                    db dbVar = new db(strO0, j171Var, strO1, iu30Var);
                    x340Var.s0(dbVar);
                    obj4 = dbVar;
                }
                obj4 = objT;
                qim0 qim0VarB = s161.b(qim0Var, false, (iu30) obj4);
                x340Var.r(false);
                return qim0VarB;
            case 1:
                View view = (View) obj;
                uh uhVar = (uh) obj11;
                if (((vtw) obj12).b != null) {
                    xeVar = new xe(view.getContentDescription().toString(), new fl1(new th(view, z ? (byte) 1 : (byte) 0), (byte) 1));
                } else {
                    xeVar = null;
                }
                uhVar.a.invoke(xeVar);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                ((pt) obj12).j((ev) obj11, (qim0) null, (b0k) obj2, 0);
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                otw.c((maa) ((ynb0) ((pt) obj12).g).get(), new gs(((vs) ((xs) obj11)).a.size()), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 4:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj12;
                n20 n20Var = (n20) obj11;
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String str = n20Var.a;
                    boolean zG2 = x340Var3.g(iu30Var2) | x340Var3.i(n20Var);
                    Object objT2 = x340Var3.T();
                    if (zG2 || objT2 == fkj0.X) {
                        obj5 = objT2;
                        y4 y4Var = new y4(iu30Var2, n20Var, (byte) 7);
                        x340Var3.s0(y4Var);
                        obj5 = y4Var;
                    }
                    obj5 = objT2;
                    Function0 function0 = (Function0) obj5;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str), function0), jdx.c, anm1.N("action_chip_make-playlist", nim0Var), n20Var.c, yla.s(x340Var3), null, null, null, apo.r(2114752424, new t40(n20Var, (byte) 0), x340Var3), null, apo.r(1918035257, new t40(n20Var, (byte) 1), x340Var3), x340Var3, 805306416, 48, 1480);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 5:
                int iIntValue2 = ((Number) obj).intValue();
                x340 x340Var4 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var4.e(iIntValue2) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    c90 c90Var = (c90) ((List) obj12).get(iIntValue2);
                    x340Var5.i0(-303564614);
                    m0p1.f(c90Var, (qim0) obj11, x340Var5, 0, 0);
                    x340Var5.r(false);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                otw.c((oa0) obj12, new ha0((c380) obj11), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                lf1 lf1Var = (lf1) obj11;
                qw50 qw50Var = lf1Var.a;
                qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                iu30 iu30Var3 = (iu30) obj12;
                x340 x340Var6 = (b0k) obj2;
                boolean zG3 = x340Var6.g(iu30Var3) | x340Var6.g(lf1Var);
                Object objT3 = x340Var6.T();
                Object obj13 = objT3;
                if (zG3 || objT3 == m4cVar) {
                    y4 y4Var2 = new y4(iu30Var3, lf1Var, (byte) 17);
                    x340Var6.s0(y4Var2);
                    obj13 = y4Var2;
                }
                Function0 function1 = (Function0) obj13;
                boolean zG4 = x340Var6.g(iu30Var3) | x340Var6.g(lf1Var);
                Object objT4 = x340Var6.T();
                Object obj14 = objT4;
                if (zG4 || objT4 == m4cVar) {
                    of1 of1Var = new of1(iu30Var3, lf1Var, (byte) 0);
                    x340Var6.s0(of1Var);
                    obj14 = of1Var;
                }
                e6p1.a(qw50Var, qim0VarZ, function1, (iu30) obj14, x340Var6, 0);
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                iu30 iu30Var4 = (iu30) obj12;
                x340 x340Var7 = (b0k) obj2;
                fi1 fi1Var = (fi1) obj11;
                boolean zG5 = x340Var7.g(iu30Var4) | x340Var7.i(fi1Var);
                Object objT5 = x340Var7.T();
                if (zG5 || objT5 == fkj0.X) {
                    obj6 = objT5;
                    k2 k2Var = new k2(iu30Var4, fi1Var, null, (byte) 7);
                    x340Var7.s0(k2Var);
                    obj6 = k2Var;
                }
                obj6 = objT5;
                qxd0.t(rih1Var, x340Var7, (vu30) obj6);
                return rih1Var;
            case 9:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                gj1 gj1Var = (gj1) obj11;
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strD = pcf.d(6, gj1Var.a, null);
                    String strO2 = cwl1.o0(x340Var9, 2131961616);
                    String strO3 = cwl1.o0(x340Var9, 2131961613);
                    String strN0 = cwl1.n0(2131953659, new Object[]{gj1Var.d.b}, x340Var9);
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    otw.c((v361) obj12, new r361(strD, strO2, strO3, 1, new s361("spotify:chat-invite:", strN0, yon1.C0().a, gj1Var.c, "android-libs-inappmessaging", Collections.singletonMap("feature", "campfire_invite")), gj1Var.h.isEmpty()), (qim0) null, (ipb1) null, x340Var9, 0, 12);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var10 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    jmr0 jmr0Var = (jmr0) obj11;
                    eso1.h(oi7.a(Uri.parse(((ot1) obj12).f), (gw70) null, (xb10) null, (yqi1) null, jmr0Var, jmr0Var, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var11, 2359296, 0, 130974), new jsl(cwl1.o0(x340Var11, 2131951943)), (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var11, 0, 508);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((j2i) obj12).J(((tu1) obj11).a(), (vzq0) obj, (b0k) obj2, Integer.valueOf((((Number) obj3).intValue() << 3) & 112));
                return rih1Var;
            case grn1.d /* 12 */:
                cqs0 cqs0Var = (cqs0) obj;
                x340 x340Var12 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                String str2 = (String) obj12;
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= x340Var12.g(cqs0Var) ? 4 : 2;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    boolean zG6 = x340Var13.g(str2);
                    Object objT6 = x340Var13.T();
                    if (zG6 || objT6 == fkj0.X) {
                        obj7 = objT6;
                        v1 v1Var = new v1(str2, (byte) 26);
                        x340Var13.s0(v1Var);
                        obj7 = v1Var;
                    }
                    obj7 = objT6;
                    qim0 qim0VarA = s161.a(nim0Var, (iu30) obj7);
                    uwr uwrVar = cbx.a;
                    uwo1.f((af5) obj11, qim0VarA, lee1.a(cbx.d(x340Var13).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, x340Var13.k(t4k.n) == flb0.b ? 2 : 1, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), null, null, null, 2, false, new cjc0(1), 0, null, cqs0Var, x340Var13, 1572864, (iIntValue6 << 3) & 112, 1720);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var14 = (b0k) obj2;
                ((Number) obj3).intValue();
                i73 i73Var = (i73) obj11;
                iu30 iu30Var5 = (iu30) obj12;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var14, 0);
                x340 x340Var15 = x340Var14;
                int iHashCode = Long.hashCode(x340Var15.T);
                xos0 xos0VarM = x340Var15.m();
                qim0 qim0VarE = zr7.E(x340Var14, nim0Var);
                hzj.A.getClass();
                x340 x340Var16 = x340Var14;
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var14, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var14, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var14, lljVar3);
                nko1.F(x340Var14);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var14, lljVar4);
                jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var14, 0);
                int iHashCode2 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM2 = x340Var16.m();
                qim0 qim0VarE2 = zr7.E(x340Var14, nim0Var);
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(jw31VarA, x340Var14, lljVar);
                nko1.H(xos0VarM2, x340Var14, lljVar2);
                i3a.l(iHashCode2, x340Var14, lljVar3, x340Var14);
                nko1.H(qim0VarE2, x340Var14, lljVar4);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(x340Var14).g;
                w0h1.a(wsx.c, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var14).b.c, 0L, false, x340Var14, wsx.d | 48, 48);
                cvx cvxVar = cbx.b(x340Var14).b;
                op71.g(x340Var14, u291.v(nim0Var, 4.0f));
                uwo1.e(i73Var.a, null, cbx.d(x340Var14).k, cbx.a(x340Var14).b.c, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2034);
                x340Var16.r(true);
                cvx cvxVar2 = cbx.b(x340Var14).b;
                op71.g(x340Var14, u291.h(nim0Var, 8.0f));
                uwo1.e(i73Var.b, null, cbx.d(x340Var14).h, cbx.a(x340Var14).b.a, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2034);
                cvx cvxVar3 = cbx.b(x340Var14).b;
                op71.g(x340Var14, u291.h(nim0Var, 4.0f));
                uwo1.e(i73Var.c, null, cbx.d(x340Var14).j, cbx.a(x340Var14).b.b, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2034);
                cvx cvxVar4 = cbx.b(x340Var14).b;
                op71.g(x340Var14, u291.h(nim0Var, 16.0f));
                String str3 = i73Var.d;
                boolean zG7 = x340Var16.g(iu30Var5);
                Object objT7 = x340Var16.T();
                if (zG7 || objT7 == fkj0.X) {
                    obj8 = objT7;
                    k52 k52Var = new k52(iu30Var5, (byte) 28);
                    x340Var16.s0(k52Var);
                    obj8 = k52Var;
                }
                obj8 = objT7;
                Function0 function2 = (Function0) obj8;
                if (ihc1.y0(str3)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(str3), function2), new idx(4), null, null, yla.s(x340Var14), null, null, null, null, null, apo.r(546101564, new xb2(i73Var, (byte) 10), x340Var14), x340Var14, 0, 48, 2012);
                x340Var16.r(true);
                return rih1Var;
            case 14:
                r6h1 r6h1Var = (r6h1) obj12;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-album-entity-unlock-card-section";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "album");
                x6h1VarR.i.add(new a7h1("unlock_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = true;
                y6h1 y6h1VarA = x6h1VarR.a();
                String str4 = (String) ((idd1) ((rt01) obj11).d).getValue();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str4 == null) {
                    str4 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), y6h1VarA, r6h1Var, System.currentTimeMillis());
            case 15:
                gu3 gu3Var = (gu3) obj;
                x340 x340Var17 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                ps3 ps3Var = (ps3) obj11;
                String str5 = gu3Var.b;
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= x340Var17.g(gu3Var) ? 4 : 2;
                }
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x340Var18.b0();
                } else if (gu3Var.equals((gu3) obj12)) {
                    x340Var18.i0(1836783258);
                    x340Var18.r(false);
                    boolean zG8 = x340Var18.g(str5);
                    Object objT8 = x340Var18.T();
                    if (zG8 || objT8 == m4cVar2) {
                        obj9 = objT8;
                        if (u890.j(str5, so41.class.getSimpleName())) {
                            cls = pmm.class;
                        } else if (u890.j(str5, wo41.class.getSimpleName())) {
                            cls = yso0.class;
                        } else if (u890.j(str5, po41.class.getSimpleName())) {
                            cls = o0e.class;
                        } else if (u890.j(str5, ro41.class.getSimpleName())) {
                            cls = s3m.class;
                        } else if (u890.j(str5, xo41.class.getSimpleName())) {
                            cls = vyc1.class;
                        } else {
                            u890.j(str5, to41.class.getSimpleName());
                            cls = vjz.class;
                        }
                        ebr0 ebr0Var = (ebr0) sqg0.G(cls, ps3Var.g);
                        x340Var18.s0(ebr0Var);
                        obj9 = ebr0Var;
                    }
                    ebr0 ebr0Var2 = (ebr0) obj9;
                    em3 em3Var = ps3Var.h;
                    o7r0 o7r0Var = ps3Var.i;
                    dg0 dg0Var = ps3Var.j;
                    kly0 kly0Var = ps3Var.k;
                    dg30 dg30Var = (dg30) x340Var18.k(mce0.a);
                    cir0 cir0Var = (cir0) x340Var18.k(k2r0.a);
                    q7r0 q7r0VarG = cir0Var.g();
                    boolean zG9 = x340Var18.g(em3Var) | x340Var18.g(o7r0Var) | x340Var18.g(dg0Var) | x340Var18.g(dg30Var) | x340Var18.g(cir0Var) | x340Var18.g(q7r0VarG) | x340Var18.g(kly0Var);
                    Object objT9 = x340Var18.T();
                    if (zG9 || objT9 == m4cVar2) {
                        objT9 = new b6r0(dg30Var, cir0Var.d(), o7r0Var, new mr30(dg30Var, false), (wbr0) null, (sbr0) null, new qa2(q7r0VarG, (byte) 2), s5o0.a, dg0Var.a(dg30Var), Observable.just(Boolean.TRUE), new pa2((byte) 1), em3Var, new q01(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), 240);
                        x340Var18.s0(objT9);
                    }
                    b6r0 b6r0Var = (b6r0) objT9;
                    fu3 fu3Var = new fu3(gu3Var.a);
                    ecr0 ecr0VarE = b6r0Var.e((xnn0) x340Var18.k(aon0.a));
                    phi0 phi0Var = b6r0Var.l;
                    ezc ezcVar = b6r0Var.m;
                    Function0 function3 = b6r0Var.e;
                    boolean zI = x340Var18.i(ps3Var);
                    Object objT10 = x340Var18.T();
                    Object obj15 = objT10;
                    if (zI || objT10 == m4cVar2) {
                        os3 os3Var = new os3(ps3Var);
                        x340Var18.s0(os3Var);
                        obj15 = os3Var;
                    }
                    fc11.d(ebr0Var2, fu3Var, ecr0VarE, phi0Var, ezcVar, function3, (qim0) null, (vu30) obj15, x340Var18, 1572864);
                } else {
                    x340Var18.i0(1836722715);
                    rqg0.i(x340Var18, 0);
                    x340Var18.r(false);
                }
                return rih1Var;
            case 16:
                ifh0 ifh0Var = (ifh0) obj;
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                long j = (!ifh0Var.W() || ((Boolean) ((iu30) obj12).invoke(((mhg1) obj11).d.getValue())).booleanValue()) ? (((long) q5t0VarH.a) << 32) | (((long) q5t0VarH.b) & 4294967295L) : 0L;
                return ifh0Var.S((int) (j >> 32), (int) (4294967295L & j), b7xVar, new f2(q5t0VarH, (byte) 6));
            case 17:
                fz5 fz5Var = (fz5) obj;
                x340 x340Var19 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= x340Var19.e(fz5Var.ordinal()) ? 4 : 2;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    otw.c((hz5) ((pt) obj12).g, new gz5(l1d.m("spotify:atv-pin-entry:", ((ez5) obj11).a), fz5Var), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 18:
                int iIntValue9 = ((Number) obj).intValue();
                vf6 vf6Var = (vf6) obj3;
                ji6 ji6Var = (ji6) obj12;
                wh6 wh6Var = (wh6) ji6Var.b;
                a4g1 a4g1VarC = dio1.C((gj6) wh6Var.i.get(iIntValue9), p7h.L(wh6Var.i) - iIntValue9, (tf6) obj2);
                ((ven0) obj11).setValue((Object) null);
                if (a4g1VarC != null && (y3m0VarC = (xf6Var = (xf6) ji6Var.c).c(wh6Var.l, a4g1VarC.a, a4g1VarC.b, a4g1VarC.c, a4g1VarC.d)) != null) {
                    y6h1 y6h1Var2 = y3m0VarC.b;
                    r6h1 r6h1Var2 = y3m0VarC.c.b;
                    int iOrdinal = vf6Var.ordinal();
                    if (iOrdinal == 0) {
                        w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var2, r6h1Var2, System.currentTimeMillis());
                    } else if (iOrdinal == 1) {
                        w7h1Var = new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var2, r6h1Var2, System.currentTimeMillis());
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        w7h1Var = new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var2, r6h1Var2, System.currentTimeMillis());
                    }
                    xf6Var.c.m(w7h1Var, (xj61) null);
                }
                return rih1Var;
            case 19:
                ifh0 ifh0Var2 = (ifh0) obj;
                long j2 = ((hjl) obj3).a;
                yux yuxVar = (yux) obj11;
                q5t0 q5t0VarH2 = ((afh0) obj2).H(hjl.b(j2, 0, 0, 0, Integer.MAX_VALUE, 3));
                int iH = hjl.h(j2);
                int iU = q5t0VarH2.U(xl3.b);
                boolean z2 = iU != q5t0VarH2.U(xl3.a);
                z3g1 z3g1Var = (z3g1) obj12;
                Float f = z3g1Var.b;
                if (!z3g1Var.d) {
                    if (z2) {
                        fX2 = iH - ifh0Var2.X0(yuxVar.c(1.0f));
                    } else {
                        if (f != null) {
                            fX0 = (iH - ifh0Var2.X0(yuxVar.c(f.floatValue()))) / 2.0f;
                            fX1 = ifh0Var2.X0(yuxVar.c(f.floatValue() - 5.0f));
                        } else {
                            i = q5t0VarH2.b;
                        }
                        fX2 = fX1 + fX0;
                    }
                    return ifh0Var2.S(hjl.i(j2), iH, b7xVar, new ri6(q5t0VarH2, fX2, iU));
                }
                i = q5t0VarH2.b;
                fX1 = (iH - i) / 2.0f;
                fX0 = iU;
                fX2 = fX1 + fX0;
                return ifh0Var2.S(hjl.i(j2), iH, b7xVar, new ri6(q5t0VarH2, fX2, iU));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar).e;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                float f2 = ((cvx) obj12).a;
                uwo1.e((String) obj11, anm1.N("artist_list_sheet_title", uyn1.A(qim0VarF, f2, 16.0f, f2, 4.0f)), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar, 0, 0, 2024);
                return rih1Var;
            case 21:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                rha1 rha1Var = ((cia1) obj12).d ? (rha1) obj11 : null;
                int i2 = rha1Var == null ? -1 : pw6.a[rha1Var.ordinal()];
                if (i2 == -1) {
                    hkxVar = ilx.c;
                } else if (i2 == 1) {
                    hkxVar = mkx.c;
                } else {
                    if (i2 != 2) {
                        eg.o();
                        return null;
                    }
                    hkxVar = hkx.c;
                }
                hkx hkxVar2 = hkxVar;
                uwr uwrVar4 = cbx.a;
                w0h1.a(hkxVar2, isl.a, (qim0) null, cbx.a(b0kVar2).c.c, 0L, false, b0kVar2, 56, 52);
                return rih1Var;
            case 22:
                x340 x340Var21 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarF2 = u291.f(nim0Var2, 1.0f);
                String str6 = (String) obj12;
                yud yudVar = (yud) obj11;
                jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var21, 0);
                x340 x340Var22 = x340Var21;
                int iHashCode3 = Long.hashCode(x340Var22.T);
                xos0 xos0VarM3 = x340Var22.m();
                qim0 qim0VarE3 = zr7.E(x340Var21, qim0VarF2);
                hzj.A.getClass();
                x340 x340Var23 = x340Var21;
                if (x340Var23.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var23.m0();
                if (x340Var23.S) {
                    x340Var23.l(n4kVar);
                } else {
                    x340Var23.v0();
                }
                nko1.H(jw31VarA2, x340Var21, y580.O0);
                nko1.H(xos0VarM3, x340Var21, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var21, y580.R0);
                nko1.F(x340Var21);
                nko1.H(qim0VarE3, x340Var21, y580.Y);
                uwr uwrVar5 = cbx.a;
                uwo1.e(str6, new wnb0(1.0f, true), cbx.d(x340Var21).h, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var21, 0, 0, 1720);
                if (yudVar == null) {
                    x340Var23.i0(1649193103);
                    x340Var23.r(false);
                } else {
                    x340Var23.i0(1649193104);
                    String str7 = yudVar.a;
                    lee1 lee1Var2 = cbx.d(x340Var21).j;
                    long j3 = cbx.a(x340Var21).b.c;
                    boolean zI2 = x340Var23.i(yudVar);
                    Object objT11 = x340Var23.T();
                    if (zI2 || objT11 == fkj0.X) {
                        obj10 = objT11;
                        i26 i26Var = new i26(yudVar, (byte) 11);
                        x340Var23.s0(i26Var);
                        obj10 = i26Var;
                    }
                    obj10 = objT11;
                    uwo1.e(str7, bin.x(nim0Var2, false, null, null, null, (Function0) obj10, 15), lee1Var2, j3, null, null, 0, false, null, 0, null, x340Var21, 0, 0, 2032);
                    x340Var23.r(false);
                }
                x340Var23.r(true);
                return rih1Var;
            case 23:
                return a(obj, obj2, obj3);
            case 24:
                return d(obj, obj2, obj3);
            case 25:
                return e(obj, obj2, obj3);
            case 26:
                return f(obj, obj2, obj3);
            case 27:
                ((Number) obj3).intValue();
                otw.c((xvu) ((h72) obj12).e, (fvu) obj11, (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 28:
                return g(obj, obj2, obj3);
            default:
                cf8 cf8Var = (cf8) obj;
                if (!((af8) obj2).equals(af8.a)) {
                    eg.o();
                    return null;
                }
                Uri uri = Uri.parse(cf8Var.a);
                xxf xxfVar = jxf.b;
                xxf xxfVar2 = xxf.b;
                if (xxfVar == xxfVar2) {
                    n57.e("CheckoutSource must not be " + xxfVar2);
                }
                zhh1 zhh1Var = (zhh1) ((br0) obj12).c;
                Activity activity = (Activity) obj11;
                x8g x8gVar = zhh1Var.a;
                v5g v5gVarB = x8gVar.c(uri) ? x8gVar.b(xxfVar, uri) : null;
                activity.startActivity(v5gVarB != null ? x8g.a(activity, v5gVarB) : zhh1Var.b.a(activity, new lyf(xxfVar, new jyf(activity.getString(2131953829)), uri)));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wf(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
