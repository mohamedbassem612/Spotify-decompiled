package p;

import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jjk extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjk(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x03aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Throwable] */
    public final Object invoke(Object obj, Object obj2) {
        s781 s781Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        Object obj3 = null;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                ljk ljkVar = (ljk) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qsw.c(new obk1(ljkVar.f.a), apo.r(711281059, new ijk((gw70) obj4, ljkVar, rwq.h((wen0) ljkVar.g.getValue(), x340Var2, 0), rwq.h((wen0) ljkVar.h.getValue(), x340Var2, 0), (byte) 1), x340Var2), x340Var2, 48);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    err0 err0Var = (hdn0) obj4;
                    int i = 0;
                    for (Object obj6 : ((lkk) obj5).a) {
                        int i2 = i + 1;
                        if (i < 0) {
                            ?? r29 = obj3;
                            p7h.T();
                            throw r29;
                        }
                        mkk mkkVar = (mkk) obj6;
                        boolean z = err0Var.s() == i;
                        uwr uwrVar = cbx.a;
                        Object obj7 = obj3;
                        qim0 qim0VarF = dug.f(nim0Var, cbx.a(x340Var4).a.c, d4o1.a);
                        boolean zI = x340Var4.i(err0Var) | x340Var4.e(i);
                        Object objT = x340Var4.T();
                        if (zI || objT == fkj0.X) {
                            objT = new ojk(i, err0Var, (byte) 0);
                            x340Var4.s0(objT);
                        }
                        m5n1.c(z, (Function0) objT, apo.r(-1479599923, new boj(mkkVar, (byte) 18), x340Var4), qim0VarF, (vu30) null, (idn0) null, (max) null, (vu30) null, (hw61) null, (ga80) null, 0, x340Var4, 384, 0, 2032);
                        i = i2;
                        obj3 = obj7;
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                hrk hrkVar = (hrk) obj5;
                sp00 sp00Var = (sp00) hrkVar.d;
                rgp rgpVar = (rgp) hrkVar.e;
                kko kkoVar = ((xk00) obj4).a;
                lbp lbpVar = rgpVar.a;
                gw70 gw70VarK = lbp.a(lbpVar).a.k();
                c8o.l(gw70VarK);
                return new jpg0(new aso(new grk(sp00Var, new v1k(gw70VarK, lbp.a(lbpVar).u(), kkoVar, b2), (zob1) obj, hrkVar.b), new rs7(hrkVar, (byte) 29)), tqk.Y);
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    View view = (View) obj5;
                    view.getClass();
                    qsw.c(new obk1(view), apo.r(945738766, new boj((jrk) obj4, (byte) 22), x340Var6), x340Var6, 48);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarD = o0c.d(nim0Var, (ni20) null, 3);
                    wtk wtkVar = (wtk) obj5;
                    String str = (String) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(gfh0VarC, x340Var8, y580.O0);
                    nko1.H(xos0VarM, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE, x340Var8, y580.Y);
                    if (wtkVar.b == xtk.b) {
                        x340Var8.i0(-514873677);
                        xto1.e((qim0) null, 2, 0L, 0L, x340Var8, 48, 13);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(-514778879);
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(str, (qim0) null, cbx.d(x340Var8).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2042);
                        x340Var8.r(false);
                    }
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                return tm80.D((laa) ((vjj0) obj5).a.invoke((y1c1) obj), (String) obj4);
            case 6:
                return tm80.D((laa) ((blj0) obj5).b.a.invoke((y1c1) obj), (String) obj4);
            case 7:
                nx9 nx9Var = (nx9) obj;
                return yoi1.g(nx9Var.t().g.map(new lag(nx9Var, (tif1) obj5, (dn41) obj2, (kly0) obj4, (byte) 15)));
            case 8:
                vuk vukVar = (vuk) obj2;
                nx9 nx9Var2 = (nx9) obj5;
                wuk wukVar = (wuk) obj4;
                klm klmVar = ((wn41) obj).a;
                go80 go80VarA = klmVar.a("OfflineStateDaemon", new rap0(new yap0(vukVar, (byte) 7), new gbp0(wukVar, (byte) 1), (byte) 25));
                go80 go80VarA2 = klmVar.a("EventSenderUnAuthDaemon", new kbp0(new vap0(nx9Var2, (byte) 5), new cbp0(0, wukVar.h, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16), new vap0(nx9Var2, (byte) 6), new cbp0(0, wukVar.m, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17), new cbp0(0, wukVar.g, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18), (byte) 3));
                yap0 yap0Var = new yap0(vukVar, (byte) 3);
                kly0 kly0Var = wukVar.e;
                go80 go80VarA3 = klmVar.a("ConnectionTypeFlagsDaemon", new rap0(yap0Var, new cbp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), (byte) 12));
                go80 go80VarA4 = klmVar.a("UbiFocusDaemon", new pcp0(new gbp0(wukVar, (byte) 2), new cbp0(0, wukVar.j, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26), new cbp0(0, wukVar.k, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), (byte) 4));
                go80 go80VarA5 = klmVar.a("EncoreFeatureFlagDaemon", new nbp0(new yap0(vukVar, (byte) 4), (byte) 7));
                go80 go80VarA6 = klmVar.a("EngageSignInRequestDaemon", new k7h0(new cbp0(0, wukVar.o, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), new yap0(vukVar, (byte) 5), new cbp0(0, wukVar.p, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15), new gbp0(wukVar, (byte) 0), (byte) 9));
                go80 go80VarA7 = klmVar.a("CdnAllowlistDaemon", new rap0(new yap0(vukVar, (byte) 2), new cbp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12), (byte) 8));
                kly0 kly0Var2 = wukVar.a;
                go80 go80VarA8 = klmVar.a("SpotifyWidgetComponentToggleDaemon", new ocp0(new cbp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22), new yap0(vukVar, (byte) 8), (byte) 15));
                cbp0 cbp0Var = new cbp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23);
                cbp0 cbp0Var2 = new cbp0(0, wukVar.r, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24);
                yap0 yap0Var2 = new yap0(vukVar, (byte) 9);
                kly0 kly0Var3 = wukVar.t;
                return p7h.M(new go80[]{go80VarA, go80VarA2, go80VarA3, go80VarA4, go80VarA5, go80VarA6, go80VarA7, go80VarA8, klmVar.a("TranssionCardWidgetEnablerDaemon", new k7h0(cbp0Var, cbp0Var2, yap0Var2, new cbp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), (byte) 26)), klmVar.a("MiuiDynamicNpvWidgetStateUpdaterDaemon", new k7h0(new cbp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19), new cbp0(0, wukVar.s, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20), new yap0(vukVar, (byte) 6), new cbp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21), (byte) 16))});
            case 9:
                ((Number) obj2).intValue();
                x2g0.c((mrn) obj5, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                m881 m881Var = (m881) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                for (Object obj8 : ((oxk) obj5).c) {
                    if (u890.j(((s781) obj8).a, m881Var.a)) {
                        obj3 = obj8;
                        s781Var = (s781) obj3;
                        if (s781Var != null) {
                            ((iu30) obj4).invoke(new zwk(s781Var, iIntValue5));
                        }
                        return rih1Var;
                    }
                }
                s781Var = (s781) obj3;
                if (s781Var != null) {
                    ((iu30) obj4).invoke(new zwk(s781Var, iIntValue5));
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                j1e1.c((vex0) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                mue1.b((bix0) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((knl) obj5).c((lzh) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    cx0 cx0Var = (cx0) obj5;
                    boolean zG = x340Var10.g(iu30Var);
                    Object objT2 = x340Var10.T();
                    if (zG || objT2 == fkj0.X) {
                        objT2 = new jzk(iu30Var, (byte) 10);
                        x340Var10.s0(objT2);
                    }
                    otw.c(cx0Var, new agg((Function0) objT2), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 15:
                String str2 = (String) obj2;
                qpl qplVar = ((h951) obj).b;
                if (qplVar instanceof qpl) {
                    ((s3m) obj5).c.a(new qzl(new gxs0(str2, 0, qplVar, false, qplVar.d, 64)));
                }
                ((Function0) obj4).invoke();
                return rih1Var;
            case 16:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ef31 ef31Var = new ef31((String) o7h.q0(((j8m) obj5).b.c));
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var12).b;
                    qim0 qim0VarN = anm1.N("ContentStoryElement.RichContentContainer", uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 8.0f, 7));
                    n8m n8mVar = (n8m) obj4;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM2 = x340Var12.m();
                    qim0 qim0VarE2 = zr7.E(x340Var12, qim0VarN);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var12, y580.O0);
                    nko1.H(xos0VarM2, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE2, x340Var12, y580.Y);
                    i1o1.e((jf31) n8mVar.X.getValue(), ef31Var, n8mVar.g, (qim0) null, (ipb1) null, pfi.a, (xu30) null, 0, (xu30) null, x340Var12, 196608, 236);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                ezn1.b((xcm) obj5, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                jzn1.b((zv31) obj5, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                ((cfm) obj5).h((pem) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                ((cfm) obj5).j((qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    qsw.c(new obk1((View) obj5), apo.r(529380259, new h1m((rfm) obj4, (byte) 6), x340Var14), x340Var14, 48);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((rfm) obj5).n1((xtj) obj4, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((hz5) obj5).e((String) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj2).intValue();
                ago1.b((op80) obj5, (j2i) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                qgo1.e((som) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    epo1.e((zkn) obj5, (iu30) obj4, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ann annVar = (ann) obj4;
                    Integer num = annVar.b;
                    String str3 = annVar.c;
                    ((ldo) obj5).getClass();
                    String strW = ldo.w(num, str3, x340Var18);
                    if (strW == null) {
                        strW = "";
                    }
                    String str4 = strW;
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(str4, (qim0) null, cbx.d(x340Var18).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var18, 0, 0, 2042);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                bro1.b((ohm0) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    n0o n0oVar = (n0o) obj5;
                    i1o1.e((m4o) n0oVar.t, new b4o(((h0o) obj4).a), n0oVar.b, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var20, 0, 252);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjk(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
