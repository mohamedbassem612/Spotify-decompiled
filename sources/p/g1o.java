package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g1o extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1o(kwr kwrVar, vu30 vu30Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 13;
        this.b = vu30Var;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x6e x6eVar = (x6e) obj4;
                return new sma1(new jpg0(((f1o) x6eVar.c).a((oqg) x6eVar.b, new epb1((zob1) obj), (kko) ((tcr0) obj3).a(kcr0.a)), rwn.W0), new rma1((Integer) null, 2131167025, (Integer) null, 13));
            case 1:
                ((Number) obj2).intValue();
                ((w2o) obj4).c((lzh) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x6o x6oVar = (x6o) obj4;
                z6o z6oVar = (z6o) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a7o a7oVar = (a7o) rwq.g(x6oVar.Y, null, null, x340Var2, 48, 2).getValue();
                    if (a7oVar == null) {
                        x340Var2.i0(-2053579882);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-2053579881);
                        String str = a7oVar.a;
                        String str2 = a7oVar.b;
                        c380 c380VarA = mqo1.A(a7oVar.c);
                        c380 c380VarA2 = mqo1.A(a7oVar.d);
                        dvp dvpVar = z6oVar.b;
                        mko mkoVar = x6oVar.Z;
                        oto1.b(str, str2, c380VarA, c380VarA2, dvpVar, mkoVar != null ? mkoVar.b() : null, z6oVar.c, z6oVar.h, nim0.a, x340Var2, 100663296);
                        x340Var2.r(false);
                    }
                    boolean zI = x340Var2.i(z6oVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new y6o(z6oVar, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    qxd0.i(z6oVar, (iu30) objT, x340Var2);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jto1.b(u291.f(nim0Var, 1.0f), null, null, false, null, null, null, null, null, null, null, ((if5) obj4).b((qim0) null, (lee1) null, (u7h) null, x340Var4, 4096, 7), null, null, null, apo.r(-1937296394, new kaf((String) obj3, (byte) 22), x340Var4), x340Var4, 0, 196608, 30718);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ifo ifoVar = (ifo) obj4;
                    xq41 xq41Var = new xq41(ifoVar.a, ifoVar.b, ifoVar.c, ifoVar.e);
                    boolean zG = x340Var6.g(iu30Var);
                    Object objT2 = x340Var6.T();
                    if (zG || objT2 == fkj0.X) {
                        objT2 = new qzn(iu30Var, (byte) 7);
                        x340Var6.s0(objT2);
                    }
                    t8p1.g(xq41Var, (Function0) objT2, null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                dgo dgoVar = (dgo) obj4;
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    if (dgoVar.g == null) {
                        throw p3d1.k(x340Var8, -154910208, false);
                    }
                    x340Var8.i0(-154908017);
                    hxo1.g(dgoVar.g, dgoVar.e instanceof klw0, apo.r(67650334, new bgo((xwa) obj3, (byte) 0), x340Var8), null, x340Var8, 384);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tpx tpxVar = ((puo) obj4).b ? tpx.c : ypx.c;
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var10).g;
                    w0h1.a(tpxVar, new jsl((String) obj3), u291.r(nim0Var, 24.0f), 0L, 0L, true, x340Var10, 196616, 24);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj4;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objT3 = x340Var12.T();
                    m4c m4cVar = fkj0.X;
                    if (objT3 == m4cVar) {
                        objT3 = ktd.n(x340Var12);
                    }
                    idn0 idn0Var = (idn0) objT3;
                    jtr jtrVar = jtr.f;
                    boolean zG2 = x340Var12.g(iu30Var2);
                    Object objT4 = x340Var12.T();
                    if (zG2 || objT4 == m4cVar) {
                        objT4 = new qzn(iu30Var2, (byte) 13);
                        x340Var12.s0(objT4);
                    }
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarV = bin.v(nim0Var2, idn0Var, jtrVar, false, null, null, (Function0) objT4, 28);
                    af5 af5Var = (af5) obj3;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var12, 0);
                    int iHashCode = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM = x340Var12.m();
                    qim0 qim0VarE = zr7.E(x340Var12, qim0VarV);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(hmb0.t1);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(mbhVarA, x340Var12, y580.O0);
                    nko1.H(xos0VarM, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE, x340Var12, y580.Y);
                    eox eoxVar = eox.c;
                    uwr uwrVar2 = cbx.a;
                    w0h1.a(eoxVar, isl.a, (qim0) null, cbx.a(x340Var12).b.b, 0L, false, x340Var12, eox.d | 48, 52);
                    uwo1.f(af5Var, uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var12).j, null, null, null, 0, false, null, 0, null, null, x340Var12, 0, 0, 4088);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                jh5 jh5Var = (jh5) obj;
                Object obj5 = jh5Var.b;
                String str3 = obj5 instanceof String ? (String) obj5 : null;
                if (u890.j(jh5Var.a, (wlu) obj4) && str3 != null && Boolean.TRUE.booleanValue() && ((tka0) obj3).n().isInstance(obj2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                ((Number) obj2).intValue();
                u4p1.N((o0g1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ((j2i) obj4).invoke((aqb0) obj3, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ((q3b1) obj4).b(70, apo.r(-464690512, new sjr((cxb) obj3, (byte) 0), x340Var16), x340Var16);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((aor) obj4).f((g3l) obj3, (qim0) null, x340Var18, 8, 2);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 13:
                op80 op80Var = q6x.b;
                op80 op80Var2 = (op80) ((vu30) obj4).invoke(((iu30) obj3).invoke(obj), j6p1.k((op80) obj2, op80Var));
                if (op80Var2 == null) {
                    op80Var2 = op80Var;
                }
                return j6p1.k(op80Var, op80Var2);
            case 14:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ulo1.a((r9x) ((tob1) obj4).getValue(), (iu30) ((tob1) obj3).getValue(), null, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                yyr yyrVar = (yyr) obj3;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    m920 m920Var = (m920) obj4;
                    boolean zI2 = x340Var22.i(yyrVar);
                    Object objT5 = x340Var22.T();
                    if (zI2 || objT5 == fkj0.X) {
                        objT5 = new m4r(yyrVar, (byte) 19);
                        x340Var22.s0(objT5);
                    }
                    o0p1.e(m920Var, (iu30) objT5, null, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 16:
                wzr wzrVar = (wzr) obj4;
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    h230 h230Var = (h230) f4p1.k(wzrVar.i, (iac0) null, x340Var24, 7).getValue();
                    if (h230Var != null) {
                        x340Var24.i0(-1734562723);
                        qzr qzrVar = wzrVar.d;
                        upb0 upb0Var = (upb0) obj3;
                        boolean zI3 = x340Var24.i(wzrVar);
                        Object objT6 = x340Var24.T();
                        if (zI3 || objT6 == fkj0.X) {
                            wsr wsrVar = new wsr(1, wzrVar, wzr.class, "onEvent", "onEvent(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;)V", 0, (byte) 3);
                            x340Var24.s0(wsrVar);
                            objT6 = wsrVar;
                        }
                        qzrVar.a(h230Var, upb0Var, (iu30) objT6, u291.d(nim0Var, 1.0f), x340Var24, 3072);
                        x340Var24.r(false);
                    } else {
                        x340Var24.i0(-1734359115);
                        nyx.a(0, (wux) null, dpi.a, x340Var24, 3072, 7);
                        x340Var24.r(false);
                    }
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                wzr wzrVar2 = (wzr) obj4;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    upb0 upb0VarB = wpb0.b(x340Var26);
                    boolean zI4 = x340Var26.i(wzrVar2) | x340Var26.g(upb0VarB);
                    Object objT7 = x340Var26.T();
                    if (zI4 || objT7 == fkj0.X) {
                        objT7 = new clo(wzrVar2, upb0VarB, (lnm) null, (byte) 24);
                        x340Var26.s0(objT7);
                    }
                    qxd0.t(rih1Var, x340Var26, (vu30) objT7);
                    mod.b(ef.a.a(wzrVar2.a), apo.r(2064528894, new won((obk1) obj3, wzrVar2, upb0VarB, (byte) 11), x340Var26), x340Var26, 56);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    String str4 = ((bk60) obj4).c;
                    too1.a(str4 == null ? "" : str4, ((c1s) obj3).a, null, x340Var28, 0, 4);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((ams) obj4).f((qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                s8p1.a((ak3) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((mxr) obj4).a((t681) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                f0u f0uVar = (f0u) obj4;
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                Context context = (Context) ((goq) obj3).g;
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    iho1.c(f0uVar, false, context.getString(a6o1.u(f0uVar)), context.getString(a6o1.u(f0uVar)), null, x340Var30, 48);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    String str5 = ((wlf1) obj4).d;
                    too1.a(str5 == null ? "" : str5, ((evs) obj3).b, null, x340Var32, 0, 4);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    String str6 = ((qzf1) obj4).d;
                    too1.a(str6 == null ? "" : str6, ((iws) obj3).a, null, x340Var34, 0, 4);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                jys jysVar = (jys) obj4;
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ryo1.m((wen0) jysVar.a.getValue(), (wen0) jysVar.b.getValue(), (ng20) obj3, null, x340Var36, 0);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                ((ldo) obj4).p((pwk1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ((ldo) obj4).p(((rwk1) obj3).c, x340Var38, 0);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 28:
                k1t k1tVar = (k1t) obj4;
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    qvm1 qvm1Var = (qvm1) f4p1.k(k1tVar.X, (iac0) null, x340Var40, 7).getValue();
                    if (qvm1Var != null) {
                        x340Var40.i0(1410478413);
                        g1t g1tVar = k1tVar.e;
                        upb0 upb0Var2 = (upb0) obj3;
                        boolean zI5 = x340Var40.i(k1tVar);
                        Object objT8 = x340Var40.T();
                        if (zI5 || objT8 == fkj0.X) {
                            wsr wsrVar2 = new wsr(1, k1tVar, k1t.class, "onEvent", "onEvent(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;)V", 0, (byte) 27);
                            x340Var40.s0(wsrVar2);
                            objT8 = wsrVar2;
                        }
                        g1tVar.a(qvm1Var, upb0Var2, (iu30) objT8, u291.d(nim0Var, 1.0f), x340Var40, 3072);
                        x340Var40.r(false);
                    } else {
                        x340Var40.i0(1410678177);
                        nyx.a(0, (wux) null, zsj.a, x340Var40, 3072, 7);
                        x340Var40.r(false);
                    }
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            default:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                k1t k1tVar2 = (k1t) obj4;
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    upb0 upb0VarB2 = wpb0.b(x340Var42);
                    boolean zI6 = x340Var42.i(k1tVar2) | x340Var42.g(upb0VarB2);
                    Object objT9 = x340Var42.T();
                    if (zI6 || objT9 == fkj0.X) {
                        objT9 = new n5s(k1tVar2, upb0VarB2, (lnm) null, (byte) 16);
                        x340Var42.s0(objT9);
                    }
                    qxd0.t(rih1Var, x340Var42, (vu30) objT9);
                    mod.b(ef.a.a(k1tVar2.a), apo.r(-88366862, new won((obk1) obj3, k1tVar2, upb0VarB2, (byte) 17), x340Var42), x340Var42, 56);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1o(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1o(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1o(iu30 iu30Var, af5 af5Var) {
        super(2);
        this.a = (byte) 7;
        this.b = iu30Var;
        this.c = af5Var;
    }
}
