package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.widgets.widgetstate.WidgetState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o1t extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1t(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0556  */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        byte b = this.a;
        byte b2 = 14;
        nim0 nim0Var = nim0.a;
        xu30 xu30VarR = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarO = td6.o(lhc.g(x340Var2).g, 16, nim0Var);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarK = up30.k(((vex) zex.a.e).d, qim0VarO);
                    kns knsVar = (kns) obj4;
                    jwm1 jwm1Var = (jwm1) obj3;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarK);
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
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    otw.c(knsVar, new e451(jwm1Var.a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                s1t s1tVar = (s1t) obj4;
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jwm1 jwm1Var2 = (jwm1) f4p1.k(s1tVar.g, (iac0) null, x340Var4, 7).getValue();
                    if (jwm1Var2 != null) {
                        x340Var4.i0(-1116357657);
                        mxr mxrVar = s1tVar.c;
                        upb0 upb0Var = (upb0) obj3;
                        boolean zI = x340Var4.i(s1tVar);
                        Object objT = x340Var4.T();
                        if (zI || objT == fkj0.X) {
                            r1t r1tVar = new r1t(1, s1tVar, s1t.class, "onEvent", "onEvent(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;)V", 0, (byte) 0);
                            x340Var4.s0(r1tVar);
                            objT = r1tVar;
                        }
                        mxrVar.c(jwm1Var2, upb0Var, (iu30) objT, u291.d(nim0Var, 1.0f), x340Var4, 3072);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1116127141);
                        nyx.a(0, (wux) null, atj.a, x340Var4, 3072, 7);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                s1t s1tVar2 = (s1t) obj4;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mod.b(ef.a.a(s1tVar2.a), apo.r(-1958715144, new won(obj3, (Object) s1tVar2, (Object) wpb0.b(x340Var6), (byte) 18), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                return new m441(new og5((Set) obj4, (kb61) obj, (kly0) obj3, (dn41) obj2, (lnm) null, (byte) 11));
            case 4:
                return new m441(new hxn(obj4, (Object) new ssm((r2t) obj, (dn41) obj2, (kly0) obj3, b2), false, (lnm) null, (byte) 17));
            case 5:
                z3t z3tVar = (z3t) obj3;
                kb61 sessionContext = ((r2t) obj4).getSessionContext();
                klm klmVar = ((wn41) obj).a;
                kly0 kly0Var = z3tVar.a;
                fcp0 fcp0Var = new fcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17);
                fcp0 fcp0Var2 = new fcp0(0, z3tVar.c, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18);
                kly0 kly0Var2 = z3tVar.y;
                fcp0 fcp0Var3 = new fcp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19);
                fcp0 fcp0Var4 = new fcp0(0, z3tVar.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20);
                rbp0 rbp0Var = new rbp0(sessionContext, (byte) 14);
                fcp0 fcp0Var5 = new fcp0(0, z3tVar.q, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21);
                fcp0 fcp0Var6 = new fcp0(0, z3tVar.r, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22);
                fcp0 fcp0Var7 = new fcp0(0, z3tVar.u, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23);
                kly0 kly0Var3 = z3tVar.v;
                go80 go80VarA = klmVar.a("AppRaterDaemon", new ang(fcp0Var, fcp0Var2, fcp0Var3, fcp0Var4, rbp0Var, fcp0Var5, fcp0Var6, fcp0Var7, new fcp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24), (byte) 4));
                go80 go80VarA2 = klmVar.a("PassthroughPlaybackWarningDaemon", new iyo0(new gcp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16), new gcp0(0, z3tVar.p, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17), new gcp0(0, z3tVar.d, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18), (byte) 28));
                go80 go80VarA3 = klmVar.a("JamUiDaemon", new nbp0(new fcp0(0, z3tVar.z, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), (byte) 16));
                gcp0 gcp0Var = new gcp0(0, z3tVar.m, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3);
                kly0 kly0Var4 = z3tVar.s;
                return p7h.M(new go80[]{go80VarA, go80VarA2, go80VarA3, klmVar.a("MarqueeDaemon", new lcp0(gcp0Var, new gcp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), new gcp0(0, z3tVar.t, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), new gcp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), new gcp0(0, z3tVar.i, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7), new gcp0(0, z3tVar.g, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8), new gcp0(0, z3tVar.n, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9), new gcp0(0, z3tVar.o, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10), new gcp0(0, z3tVar.j, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11), new fcp0(0, z3tVar.q, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26), new fcp0(0, z3tVar.h, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), new fcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28), new fcp0(0, z3tVar.f, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29), new gcp0(0, z3tVar.k, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0), new gcp0(0, z3tVar.l, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), new gcp0(0, z3tVar.w, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2))), klmVar.a("MobileOnlyDisclaimerDaemon", new k7h0(new gcp0(0, z3tVar.x, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12), new gcp0(0, z3tVar.e, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), new gcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), new gcp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15), (byte) 17))});
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                ult ultVar = (wlt) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    cvx cvxVar2 = cbx.b(x340Var8).b;
                    cvx cvxVar3 = cbx.b(x340Var8).b;
                    cvx cvxVar4 = cbx.b(x340Var8).b;
                    if (!((12.0f >= 0.0f) & (12.0f >= 0.0f) & (12.0f >= 0.0f) & (12.0f >= 0.0f))) {
                        of80.a("Padding must be non-negative");
                    }
                    cvx cvxVar5 = cbx.b(x340Var8).b;
                    ydx ydxVar = new ydx(2.0f, 12.0f, 8.0f, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), vdx.a);
                    jtr jtrVar = jtr.f;
                    boolean zG = x340Var8.g(iu30Var);
                    Object objT2 = x340Var8.T();
                    if (zG || objT2 == fkj0.X) {
                        objT2 = new hbs(iu30Var, (byte) 21);
                        x340Var8.s0(objT2);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT2);
                    ult ultVar2 = ultVar instanceof ult ? ultVar : null;
                    if (ultVar2 != null) {
                        str = ultVar2.b;
                        if (str.length() <= 0) {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        x340Var8.i0(-809812358);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(-809812357);
                        xu30VarR = apo.r(1735714508, new kaf(str, (byte) 25), x340Var8);
                        x340Var8.r(false);
                    }
                    ioo1.c(qim0VarF, (pgx) null, ydxVar, (hw61) null, (max) null, (idn0) null, jtrVar, gbxVar, (gbx) null, apo.r(-1719710393, new amt(ultVar, (byte) 0), x340Var8), (xu30) null, (xu30) null, xu30VarR, (xu30) null, (xu30) null, (xu30) null, apo.r(-74612275, new amt(ultVar, (byte) 1), x340Var8), x340Var8, 805306880, 1572864, 60730);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                cwl1.h((List) obj4, (Collection) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                iac0 iac0Var = (iac0) obj2;
                qiu qiuVar = (qiu) obj4;
                xk00 xk00Var = (xk00) obj3;
                gdh1 gdh1Var = qiuVar.g;
                rzo0 rzo0Var = gdh1Var.d ? xk00Var.k : null;
                if (!gdh1Var.b) {
                    return new jpg0(new ygu(qiuVar.a, qiuVar.b, qiuVar.c, qiuVar.d, qiuVar.e, new ngu(gdh1Var.a), qiuVar.f, zso1.H(iac0Var.getLifecycle()), rzo0Var, new op0(qiuVar.h)), zlt.e1);
                }
                p290 p290Var = qiuVar.i;
                return new jpg0(f6o1.A(new tm(p290Var.d, p290Var.e, (i01) (p290Var.a.h() ? p290Var.b : p290Var.c).get(), p290Var.f, new iiu(new giu(), new hiu(new piu(qiuVar, rzo0Var, (lnm) null, (byte) 0), new z6n(2, qiuVar, qiu.class, "refreshPage", "refreshPage-ehl3_6g(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 23)), iac0Var)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new nit(qiuVar, (byte) 8));
            case 9:
                yiu yiuVar = (yiu) obj4;
                return new jpg0(f6o1.A(yiuVar.a.a(new aiu(new zhu(new piu(yiuVar, (rzo0) ((ajq0) obj3).d, (lnm) null, (byte) 1), new z6n(2, yiuVar, yiu.class, "refreshPage", "refreshPage-ehl3_6g(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 24)), (iac0) obj2, 1, false)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new nit(yiuVar, (byte) 9));
            case 10:
                xiu xiuVar = (xiu) obj4;
                Function0 function0 = (Function0) obj3;
                return new jpg0(f6o1.A(xiuVar.a.a(new aiu(function0 != null ? new zhu(1, new to1(function0, (lnm) null, (byte) 6)) : new zhu(3, (vu30) null), (iac0) obj2, 3, true)), (ViewGroup.LayoutParams) null, ScrollCardType.DISPLAY_AD, 1), new nit(xiuVar, (byte) 10));
            case 11:
                ((Number) obj2).intValue();
                ((hdv) obj4).e((iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    otw.c((mv51) obj4, new lv51((ycv) obj3), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    otw.b((xdv) obj4, new wdv((String) obj3), new joa0("dsl-selection"), (qim0) null, x340Var12, 8, 8);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    xdv xdvVar = (xdv) obj4;
                    otw.c(xdvVar.d, new aev(((wdv) obj3).a, xdvVar.a.a), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nmn1.b((WidgetState) obj4, (gt40) null, ((div) obj3).g, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                o2w.d((lrz0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                o2w.f((job1) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                irn1.w((Function0) obj4, (zah1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((nm1) obj4).g((List) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ((hw2) obj4).f((List) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                rrn1.j((d6w) obj4, (Function0) obj3, nim0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                f7w f7wVar = (f7w) obj4;
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x340Var18.b0();
                } else if (f7wVar instanceof d7w) {
                    x340Var18.i0(1236946042);
                    d7w d7wVar = (d7w) f7wVar;
                    boolean zG2 = x340Var18.g(iu30Var2);
                    Object objT3 = x340Var18.T();
                    if (zG2 || objT3 == fkj0.X) {
                        objT3 = new q7u(iu30Var2, (byte) 16);
                        x340Var18.s0(objT3);
                    }
                    nyn1.f(d7wVar, (Function0) objT3, (qim0) null, x340Var18, 0);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(-309216323);
                    x340Var18.r(false);
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                uyn1.b((bxn) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                iu30 iu30Var3 = (iu30) obj3;
                c8w c8wVar = (c8w) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    String strG = ydh.g(cbx.b(x340Var20).b.b, 2131957017, x340Var20, x340Var20, nim0Var);
                    boolean zI2 = x340Var20.i(c8wVar) | x340Var20.g(iu30Var3);
                    Object objT4 = x340Var20.T();
                    if (zI2 || objT4 == fkj0.X) {
                        objT4 = new d8w(c8wVar, iu30Var3, (byte) 0);
                        x340Var20.s0(objT4);
                    }
                    kuo1.f(strG, "https://support.spotify.com/article/managed-accounts-for-premium-family/plain/", (iu30) objT4, (qim0) null, 0L, x340Var20, 0, 24);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                ((w8w) obj4).n1((xtj) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                p2o1.b((k3h1) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                qsw.c((obk1) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 28:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    otw.c((xpw) obj4, (k331) obj3, (qim0) null, (ipb1) null, x340Var22, 0, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            default:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                ven0 ven0Var = (ven0) obj4;
                m4c m4cVar = fkj0.X;
                mxw mxwVar = (mxw) obj3;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zI3 = x340Var24.i(ven0Var) | x340Var24.i(mxwVar);
                    Object objT5 = x340Var24.T();
                    if (zI3 || objT5 == m4cVar) {
                        objT5 = new f2t(mxwVar, ven0Var, (byte) 29);
                        x340Var24.s0(objT5);
                    }
                    Function0 function1 = (Function0) objT5;
                    boolean zI4 = x340Var24.i(mxwVar);
                    Object objT6 = x340Var24.T();
                    if (zI4 || objT6 == m4cVar) {
                        objT6 = new lxw(mxwVar, (byte) 0);
                        x340Var24.s0(objT6);
                    }
                    Function0 function2 = (Function0) objT6;
                    boolean zI5 = x340Var24.i(mxwVar);
                    Object objT7 = x340Var24.T();
                    if (zI5 || objT7 == m4cVar) {
                        objT7 = new lxw(mxwVar, (byte) 1);
                        x340Var24.s0(objT7);
                    }
                    lgo1.g(function1, function2, (Function0) objT7, (qim0) null, x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1t(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
