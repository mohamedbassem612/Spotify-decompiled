package p;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Notification;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(ly2 ly2Var, jy2 jy2Var) {
        super(2);
        this.a = (byte) 24;
        this.b = ly2Var;
        this.c = jy2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        hoj0 hoj0VarC;
        goj0 goj0VarA;
        z1g1 z1g1Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        byte b2 = 7;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q2 q2Var = (q2) rwq.g(((m2) obj8).i, null, null, x340Var2, 48, 2).getValue();
                    if (q2Var == null) {
                        x340Var2.i0(-1687155893);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1687155892);
                        qro1.a(q2Var.a, q2Var.b, ((p2) obj7).c, null, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                gto1.e((p041) obj8, (n041) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    eyo1.a((mp) obj8, (iu30) obj7, null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                zob1 zob1Var = (zob1) obj;
                w30 w30Var = (w30) obj8;
                xk00 xk00Var = (xk00) obj7;
                gw70 gw70Var = w30Var.a;
                kko kkoVar = xk00Var.a;
                bpb1 bpb1Var = xk00Var.b;
                myq0 myq0Var = w30Var.b;
                htr htrVar = w30Var.c;
                ggv ggvVar = w30Var.d;
                ahr ahrVar = w30Var.e;
                Context context = w30Var.f;
                kly0 kly0Var = w30Var.g;
                vgm vgmVar = w30Var.h;
                lo60 lo60Var = w30Var.i;
                zr00 zr00Var = w30Var.j;
                yh2 yh2Var = xk00Var.g;
                ms00 ms00Var = w30Var.l;
                return new jpg0(f6o1.A(new r30(gw70Var, kkoVar, bpb1Var, myq0Var, htrVar, ggvVar, ahrVar, context, vgmVar, lo60Var, kly0Var, zr00Var, yh2Var, ms00Var.b(), ms00Var.b() ? w30Var.m : null, zob1Var), null, null, 3), ft.g);
            case 4:
                ((Number) obj2).intValue();
                vyo1.c((y30) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                h0p1.k((Integer) obj8, (Function0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                t90 t90Var = (t90) obj8;
                return new jpg0(cso1.y(f6o1.A(new ldo(t90Var.g, new dgy(1, (Integer) null, 48)), null, null, 3), (xe01) t90Var.h.c, new nl((String) obj7, b2)), ft.R0);
            case 7:
                ((Number) obj2).intValue();
                j1p1.i((yv31) obj8, (vu30) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    otw.c((maa) ((ynb0) ((res) obj8).g).get(), new xp50(((zc0) obj7).d), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j0f0 j0f0Var = (j0f0) obj8;
                    v51 v51Var = (v51) obj7;
                    boolean zI = x340Var8.i(v51Var);
                    Object objT = x340Var8.T();
                    if (zI || objT == fkj0.X) {
                        q01 q01Var = new q01(0, v51Var, v51.class, "dismissComposeDialog", "dismissComposeDialog()V", 0, (byte) 1);
                        x340Var8.s0(q01Var);
                        objT = q01Var;
                    }
                    yoi1.e(j0f0Var, (Function0) objT, 0, x340Var8, 8);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((bc1) obj8).i((iu30) obj7, (b0k) obj, czo1.p(7));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                wc1 wc1Var = (wc1) obj7;
                iu30 iu30Var = (iu30) obj8;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zG = x340Var10.g(iu30Var) | x340Var10.i(wc1Var);
                    Object objT2 = x340Var10.T();
                    if (zG || objT2 == fkj0.X) {
                        obj3 = objT2;
                        ad1 ad1Var = new ad1(iu30Var, wc1Var, (byte) 0);
                        x340Var10.s0(ad1Var);
                        obj3 = ad1Var;
                    }
                    obj3 = objT2;
                    foo1.c(new gbx(z50.c, (Function0) obj3), new idx(4), nim0.a, null, yla.p(x340Var10), null, null, null, null, null, y3i.e, x340Var10, 0, 48, 2008);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                g6p1.a((avc0) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    uwo1.e(((lf1) obj8).a.a, d9y0.k(nim0Var, ((Number) ((tob1) obj7).getValue()).floatValue()), null, 0L, null, null, 0, false, null, 0, null, x340Var12, 0, 0, 2044);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                op80 op80Var = (op80) obj7;
                m4c m4cVar = fkj0.X;
                jt1 jt1Var = (jt1) obj8;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zI2 = x340Var14.i(jt1Var);
                    Object objT3 = x340Var14.T();
                    if (zI2 || objT3 == m4cVar) {
                        obj4 = objT3;
                        qm qmVar = new qm(jt1Var, (lnm) null, (byte) 7);
                        x340Var14.s0(qmVar);
                        obj4 = qmVar;
                    }
                    qxd0.t(rih1Var, x340Var14, (vu30) obj4);
                    kiv kivVar = oi7.a;
                    gw70 gw70Var2 = jt1Var.J1;
                    if (gw70Var2 == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    ely0 ely0VarA = kivVar.a(gw70Var2);
                    kiv kivVar2 = gfe0.a;
                    boolean zI3 = x340Var14.i(op80Var);
                    Object objT4 = x340Var14.T();
                    if (zI3 || objT4 == m4cVar) {
                        obj5 = objT4;
                        gt1 gt1Var = new gt1(op80Var, (byte) 0);
                        x340Var14.s0(gt1Var);
                        obj5 = gt1Var;
                    }
                    mod.c(new ely0[]{ely0VarA, gfe0.d((Function0) obj5, x340Var14)}, apo.r(1236665039, new ht1(jt1Var, true ? 1 : 0), x340Var14), x340Var14, 56);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                g9p1.b((xt1) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((iu30) obj8).invoke(((ow1) obj7).f28p.invoke(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue())));
                return rih1Var;
            case 17:
                int iIntValue8 = ((Number) obj).intValue();
                nt1 nt1Var = (nt1) obj2;
                wt1 wt1Var = (wt1) obj8;
                String str = nt1Var.a;
                i8h1 i8h1Var = wt1Var.a;
                gpk0 gpk0Var = wt1Var.b;
                Integer numValueOf = Integer.valueOf(iIntValue8);
                String str2 = wt1Var.c;
                x6h1 x6h1VarC = gpk0Var.a.c();
                x6h1VarC.i.add(new a7h1("item", (String) null, numValueOf, str, str2));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((ju1) obj7).a.l(new hu1(new p030(new yv51(str, nt1Var.b))));
                return rih1Var;
            case 18:
                cx1 cx1Var = (cx1) obj8;
                hcv hcvVar = cx1Var.k;
                av1 av1Var = cx1Var.m;
                g431 g431Var = cx1Var.a;
                q01 q01Var2 = new q01(0, (ju1) obj7, ju1.class, "back", "back()V", 0, (byte) 6);
                ak3 ak3Var = ((rms) obj).a;
                vdv vdvVar = new vdv(ak3Var, av1Var.c, av1Var.e, "");
                d4 d4Var = new d4((Object) q01Var2, obj2, (byte) 21);
                bpb1 bpb1VarB = gio1.b(null);
                bbc bbcVarA = mno1.a(Integer.MAX_VALUE, 0, 6);
                qao0 qao0VarA = hcvVar.b.a(new utt(bbcVarA, (byte) 10));
                zcv zcvVar = hcvVar.a;
                mfe mfeVarB = k4p1.B(bbcVarA);
                jut jutVar = hcvVar.c;
                return new ecv(zcvVar.a(g431Var, vdvVar, new ydv(((acp) jutVar.b).a(ak3Var), (bev) ((kly0) jutVar.c).get()), new adv(new fcv(d4Var, (byte) 0), new fcv(d4Var, (byte) 1), new gcv(bpb1VarB, (byte) 0)), mfeVarB), new cx0(qao0VarA, vdvVar), d5p1.h(bpb1VarB), new v7v(bbcVarA, (byte) 1));
            case 19:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    qng qngVar = (qng) obj8;
                    mng mngVar = new mng((String) obj7);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var16).b;
                    otw.c(qngVar, mngVar, uyn1.z(12.0f, 0.0f, 2, nim0Var), (ipb1) null, x340Var16, 8, 8);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    w9b1.a((bab1) obj8, u291.d(nim0Var, 1.0f), (j2i) obj7, x340Var18, 0, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tg2 tg2Var = (tg2) obj8;
                    j82.m(tg2Var, ((tg2) obj7).b == tg2Var.b, (qim0) null, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                vbe.b((x0j0) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((qu2) obj8).b(czo1.p(7), (j2i) obj7, (b0k) obj);
                return rih1Var;
            case 24:
                x340 x340Var21 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                jy2 jy2Var = (jy2) obj7;
                ly2 ly2Var = (ly2) obj8;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    vy71 vy71VarF = dem0.f(6, 2, x340Var22, (iu30) null, true);
                    Object objT5 = x340Var22.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT5 == m4cVar2) {
                        obj6 = objT5;
                        c9n c9nVarM = qxd0.M(o6x.a, x340Var22);
                        x340Var22.s0(c9nVarM);
                        obj6 = c9nVarM;
                    }
                    obj6 = objT5;
                    c9n c9nVar = (c9n) obj6;
                    boolean zI4 = x340Var22.i(ly2Var) | x340Var22.i(jy2Var);
                    Object objT6 = x340Var22.T();
                    Object obj9 = objT6;
                    if (zI4 || objT6 == m4cVar2) {
                        nx2 nx2Var = new nx2(ly2Var, jy2Var, (byte) 1);
                        x340Var22.s0(nx2Var);
                        obj9 = nx2Var;
                    }
                    dem0.a((Function0) obj9, (qim0) null, vy71VarF, 0.0f, false, (hw61) null, 0L, 0L, 0.0f, 0L, r5i.a, ah1.Y0, (eem0) null, apo.r(1569978656, new k8(jy2Var, ly2Var, c9nVar, vy71VarF), x340Var22), x340Var22, 0, 3078, 5114);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var23 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    mod.b(jxq0.a.a((ixq0) obj8), (vu30) obj7, x340Var24, 8);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 26:
                wcm wcmVar = (wcm) obj;
                nfm nfmVar = (nfm) obj2;
                Map map = nfmVar.a;
                bbz0 bbz0Var = nfmVar.b;
                x83 x83Var = (x83) obj8;
                boolean zB = x83Var.k.b();
                String str3 = wcmVar.a;
                ioj0 ioj0Var = (ioj0) ((ymd0) obj7).e();
                waz0 waz0Var = x83Var.m;
                if (x83Var.c.c().b && ioj0Var != null && (hoj0VarC = ioj0Var.c(z1g1.class, str3)) != null && (goj0VarA = hoj0VarC.a()) != null && (z1g1Var = (z1g1) goj0VarA.a) != null && poz0.D(z1g1Var)) {
                    z = true;
                }
                return gm50.C(wcmVar, map, bbz0Var, zB, dko1.o(waz0Var, str3, z));
            case 27:
                x83 x83Var2 = (x83) obj8;
                g23 g23Var = (g23) x83Var2.b.Q0;
                epb1 epb1Var = new epb1((zob1) obj);
                return new jpg0(new jb3(((omr) g23Var.b).a(epb1Var), ((bvs) g23Var.c).a(epb1Var), f6o1.A(new cx0((byte) 28), new ViewGroup.LayoutParams(-2, -2), null, 2), epb1Var, (c460) ((kly0) g23Var.d).get()), new cc2(x83Var2, (uto) obj7, (byte) 6));
            case 28:
                zob1 zob1Var2 = (zob1) obj;
                f34 f34Var = (f34) obj8;
                sp00 sp00Var = f34Var.c;
                p5x0 p5x0Var = f34Var.d;
                bpb1 bpb1Var2 = ((xk00) obj7).b;
                gw70 gw70Var3 = f34Var.a;
                lo60 lo60Var2 = f34Var.b;
                vgm vgmVar2 = f34Var.f;
                qkg qkgVarA = f34Var.i.a();
                c35 c35Var = f34Var.h;
                return new jpg0(new e34(zob1Var2, sp00Var, p5x0Var, bpb1Var2, gw70Var3, lo60Var2, vgmVar2, ujo1.p(qkgVarA, c35Var.d(), c35Var.b(), c35Var.a(), c35Var.e()) ? f34Var.g : null), dt3.h);
            default:
                Notification notification = (Notification) obj2;
                if (((Number) obj).intValue() == 0) {
                    ((z1) obj8).invoke(notification);
                } else {
                    ((cc2) obj7).invoke(notification);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(iu30 iu30Var, wc1 wc1Var) {
        super(2);
        this.a = (byte) 11;
        this.b = iu30Var;
        this.c = wc1Var;
    }
}
