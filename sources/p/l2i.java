package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l2i extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2i(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2) {
        long j;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        gdx gdxVar = (gdx) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            fsx fsxVar = fsx.c;
            qim0 qim0VarN = anm1.N("share_icon", eqr0.D(gdxVar.b, 0.0f, 2, u291.r(nim0.a, gdxVar.d)));
            u7h u7hVar = (u7h) this.c;
            if (u7hVar == null) {
                x340Var2.i0(-1048169148);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var2).b.a;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1048170047);
                x340Var2.r(false);
                j = u7hVar.a;
            }
            w0h1.a(fsxVar, isl.a, qim0VarN, j, 0L, false, x340Var2, fsx.d | 48, 48);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        long jA;
        byte b = this.a;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        bbo0 bbo0Var = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                ((m2i) obj4).a((qm70) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                m4c m4cVar = fkj0.X;
                ir irVar = (ir) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c380 c380Var = irVar.a;
                    boolean zG = x340Var2.g(c380Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = mqo1.F(o7h.T0(o7h.d1(c380Var, 2)));
                        x340Var2.s0(objT);
                    }
                    c9 c9Var = (c9) objT;
                    vq60 vq60Var = jw80.a;
                    tsj0 tsj0Var = tsj0.a;
                    hux huxVar = irVar.b ? hrx.c : null;
                    String strO0 = cwl1.o0(x340Var2, 2131951754);
                    boolean zG2 = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new yth(iu30Var, (byte) 7);
                        x340Var2.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    fc11.a(c9Var, tsj0Var, hcx.c, huxVar, false, 0, new gbx(new y50(strO0), function0), cwl1.U(2131820550, c380Var.size(), new Object[]{Integer.valueOf(c380Var.size())}, x340Var2), (idn0) null, x340Var2, 24968 | (hrx.d << 9), 288);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z = ((jw0) obj4).b;
                    String strO1 = cwl1.o0(x340Var4, 2131951862);
                    qim0 qim0VarN = anm1.N("ad_section", nim0Var);
                    boolean zG3 = x340Var4.g(iu30Var2);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new yth(iu30Var2, (byte) 15);
                        x340Var4.s0(objT3);
                    }
                    ucp1.c(0, strO1, x340Var4, bin.x(qim0VarN, false, null, null, null, (Function0) objT3, 15), z);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    cv3 cv3Var = (cv3) obj4;
                    String str = cv3Var.a;
                    String str2 = cv3Var.b;
                    String str3 = cv3Var.c;
                    String str4 = cv3Var.d;
                    boolean z2 = cv3Var.e;
                    boolean zG4 = x340Var6.g(iu30Var3);
                    Object objT4 = x340Var6.T();
                    if (zG4 || objT4 == m4cVar2) {
                        objT4 = new a6i(iu30Var3, (byte) 2);
                        x340Var6.s0(objT4);
                    }
                    Function0 function1 = (Function0) objT4;
                    boolean zG5 = x340Var6.g(iu30Var3);
                    Object objT5 = x340Var6.T();
                    if (zG5 || objT5 == m4cVar2) {
                        objT5 = new a6i(iu30Var3, (byte) 3);
                        x340Var6.s0(objT5);
                    }
                    lap1.e(str, str2, str3, str4, z2, function1, (Function0) objT5, null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj4;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    idx idxVar = new idx(9);
                    boolean zG6 = x340Var8.g(iu30Var4);
                    Object objT6 = x340Var8.T();
                    if (zG6 || objT6 == fkj0.X) {
                        objT6 = new tbi(iu30Var4, (byte) 26);
                        x340Var8.s0(objT6);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT6), idxVar, null, null, null, null, null, null, null, null, apo.r(-799056540, new fei((o9k) obj3, (byte) 2), x340Var8), x340Var8, 0, 48, 2044);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    if (((pln) obj4).a instanceof rln) {
                        x340Var10.i0(1485611909);
                        uwr uwrVar = cbx.a;
                        jA = cbx.a(x340Var10).a.a.a();
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(1485613413);
                        uwr uwrVar2 = cbx.a;
                        jA = cbx.a(x340Var10).a.c;
                        x340Var10.r(false);
                    }
                    w3d1.a(u291.f(nim0Var, 1.0f), (hw61) null, jA, 0L, 0.0f, 0.0f, (qqb) null, apo.r(1396617340, new sm((iu30) obj3, (byte) 27), x340Var10), x340Var10, 12582912, 122);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    a8x a8xVar = ((b8x) obj4).a;
                    boolean zG7 = x340Var12.g(iu30Var5);
                    Object objT7 = x340Var12.T();
                    if (zG7 || objT7 == fkj0.X) {
                        objT7 = new pki(iu30Var5, (byte) 10);
                        x340Var12.s0(objT7);
                    }
                    rjo1.c(a8xVar, (Function0) objT7, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dhz dhzVar = (dhz) obj4;
                    boolean zG8 = x340Var14.g(iu30Var6);
                    Object objT8 = x340Var14.T();
                    if (zG8 || objT8 == fkj0.X) {
                        objT8 = new pki(iu30Var6, (byte) 19);
                        x340Var14.s0(objT8);
                    }
                    prn1.c(dhzVar, (Function0) objT8, (qim0) null, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    irx irxVar = irx.c;
                    jsl jslVar = new jsl(cwl1.n0(2131964008, new Object[]{((y920) obj4).a.b}, x340Var16));
                    Object objT9 = x340Var16.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT9 == m4cVar3) {
                        objT9 = ktd.n(x340Var16);
                    }
                    idn0 idn0Var = (idn0) objT9;
                    pm31 pm31Var = new pm31(0);
                    boolean zG9 = x340Var16.g(iu30Var7);
                    Object objT10 = x340Var16.T();
                    if (zG9 || objT10 == m4cVar3) {
                        objT10 = new roi(iu30Var7, (byte) 0);
                        x340Var16.s0(objT10);
                    }
                    w0h1.a(irxVar, jslVar, bin.v(nim0.a, idn0Var, null, false, null, pm31Var, (Function0) objT10, 12), 0L, 0L, false, x340Var16, irx.d, 56);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                iu30 iu30Var8 = (iu30) obj3;
                aa50 aa50Var = (aa50) obj4;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String strN0 = cwl1.n0(2131958108, new Object[]{aa50Var.b}, x340Var18);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(strN0, null, cbx.d(x340Var18).h, cbx.a(x340Var18).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var18, 0, 0, 2018);
                    cvx cvxVar = cbx.b(x340Var18).b;
                    op71.g(x340Var18, u291.r(nim0Var, 8.0f));
                    uwo1.e(cwl1.n0(2131958107, new Object[]{Integer.valueOf(aa50Var.c)}, x340Var18), null, cbx.d(x340Var18).j, cbx.a(x340Var18).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var18, 0, 0, 2018);
                    cvx cvxVar2 = cbx.b(x340Var18).b;
                    op71.g(x340Var18, u291.r(nim0Var, 16.0f));
                    boolean zG10 = x340Var18.g(iu30Var8);
                    Object objT11 = x340Var18.T();
                    if (zG10 || objT11 == fkj0.X) {
                        objT11 = new roi(iu30Var8, (byte) 18);
                        x340Var18.s0(objT11);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT11), new idx(4), anm1.N("graduation_request_button_banner_test_tag", nim0Var), null, yla.s(x340Var18), null, null, null, null, null, qqi.a, x340Var18, 384, 48, 2008);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                iu30 iu30Var9 = (iu30) obj3;
                z950 z950Var = (z950) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    String strN1 = cwl1.n0(2131959698, new Object[]{z950Var.b}, x340Var20);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strN1, null, cbx.d(x340Var20).h, cbx.a(x340Var20).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var20, 0, 0, 2018);
                    cvx cvxVar3 = cbx.b(x340Var20).b;
                    op71.g(x340Var20, u291.r(nim0Var, 8.0f));
                    uwo1.e(cwl1.n0(2131959697, new Object[]{Integer.valueOf(z950Var.c)}, x340Var20), null, cbx.d(x340Var20).j, cbx.a(x340Var20).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var20, 0, 0, 2018);
                    cvx cvxVar4 = cbx.b(x340Var20).b;
                    op71.g(x340Var20, u291.r(nim0Var, 16.0f));
                    boolean zG11 = x340Var20.g(iu30Var9);
                    Object objT12 = x340Var20.T();
                    if (zG11 || objT12 == fkj0.X) {
                        objT12 = new roi(iu30Var9, (byte) 19);
                        x340Var20.s0(objT12);
                    }
                    foo1.f(new gbx(z50Var, (Function0) objT12), anm1.N("graduation_request_button_banner_test_tag", nim0Var), null, yla.s(x340Var20), null, null, null, pqi.a, x340Var20, 12582960, 116);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    rqg0.h((wr90) ((yr90) obj4), (iu30) obj3, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    rqt0.h((cz90) obj4, (iu30) obj3, x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                m4c m4cVar4 = fkj0.X;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var26 = x340Var25;
                if (!x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x340Var26.b0();
                } else if (((hej0) obj4).a) {
                    x340Var26.i0(-772523951);
                    idx idxVar2 = new idx(4);
                    boolean zG12 = x340Var26.g(iu30Var10);
                    Object objT13 = x340Var26.T();
                    if (zG12 || objT13 == m4cVar4) {
                        objT13 = new c1j(iu30Var10, (byte) 3);
                        x340Var26.s0(objT13);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT13), idxVar2, null, null, null, null, null, null, null, null, e1j.c, x340Var26, 0, 48, 2044);
                    x340Var26.r(false);
                } else {
                    x340Var26.i0(-772001229);
                    idx idxVar3 = new idx(4);
                    boolean zG13 = x340Var26.g(iu30Var10);
                    Object objT14 = x340Var26.T();
                    if (zG13 || objT14 == m4cVar4) {
                        objT14 = new c1j(iu30Var10, (byte) 4);
                        x340Var26.s0(objT14);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT14), idxVar3, null, null, null, null, null, null, null, null, e1j.d, x340Var26, 0, 48, 2044);
                    x340Var26.r(false);
                }
                return rih1Var;
            case 14:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    g2n0 g2n0Var = (g2n0) obj4;
                    boolean z3 = g2n0Var.a;
                    String strF = f4i1.f("♩ ", g2n0Var.b.d, " ♩");
                    qim0 qim0VarN2 = anm1.N("music-caption", nim0Var);
                    boolean zG14 = x340Var28.g(iu30Var11);
                    Object objT15 = x340Var28.T();
                    if (zG14 || objT15 == fkj0.X) {
                        objT15 = new c1j(iu30Var11, (byte) 13);
                        x340Var28.s0(objT15);
                    }
                    ucp1.c(0, strF, x340Var28, bin.x(qim0VarN2, false, null, null, null, (Function0) objT15, 15), z3);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                iu30 iu30Var12 = (iu30) obj3;
                k7s0 k7s0Var = (k7s0) obj4;
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    vnr0 vnr0VarG = k7s0Var.a.g((djc0) null, x340Var30, 1);
                    List list = k7s0Var.b;
                    boolean zG15 = x340Var30.g(iu30Var12);
                    Object objT16 = x340Var30.T();
                    if (zG15 || objT16 == fkj0.X) {
                        objT16 = new v0j(iu30Var12, (byte) 5);
                        x340Var30.s0(objT16);
                    }
                    kno1.m(vnr0VarG, list, (vu30) objT16, null, x340Var30, 8);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                iu30 iu30Var13 = (iu30) obj4;
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    gdx gdxVarS = yla.s(x340Var32);
                    idx idxVar4 = new idx();
                    boolean zG16 = x340Var32.g(iu30Var13);
                    Object objT17 = x340Var32.T();
                    if (zG16 || objT17 == fkj0.X) {
                        objT17 = new n9j(iu30Var13, (byte) 24);
                        x340Var32.s0(objT17);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT17), idxVar4, null, null, gdxVarS, null, null, null, null, null, apo.r(585078743, new l8i((ce11) obj3, (byte) 23), x340Var32), x340Var32, 0, 48, 2012);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                m4c m4cVar5 = fkj0.X;
                iu30 iu30Var14 = (iu30) obj3;
                qh71 qh71Var = (qh71) obj4;
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var34).g, 32, qim0VarF);
                    String str5 = qh71Var.a;
                    String str6 = qh71Var.b;
                    String strO2 = qh71Var.c;
                    if (strO2 == null) {
                        x340Var34.i0(429692934);
                        qh71Var.d.getClass();
                        strO2 = cwl1.o0(x340Var34, 2131962343);
                    } else {
                        x340Var34.i0(429692283);
                    }
                    x340Var34.r(false);
                    boolean zG17 = x340Var34.g(iu30Var14);
                    Object objT18 = x340Var34.T();
                    if (zG17 || objT18 == m4cVar5) {
                        objT18 = new ogj(iu30Var14, (byte) 6);
                        x340Var34.s0(objT18);
                    }
                    bbo0 bbo0Var2 = new bbo0(strO2, (Function0) objT18);
                    if (qh71Var.e == null) {
                        x340Var34.i0(435798175);
                        x340Var34.r(false);
                    } else {
                        x340Var34.i0(435798176);
                        String strO3 = cwl1.o0(x340Var34, 2131962343);
                        boolean zG18 = x340Var34.g(iu30Var14);
                        Object objT19 = x340Var34.T();
                        if (zG18 || objT19 == m4cVar5) {
                            objT19 = new ogj(iu30Var14, (byte) 7);
                            x340Var34.s0(objT19);
                        }
                        bbo0Var = new bbo0(strO3, (Function0) objT19);
                        x340Var34.r(false);
                    }
                    y3o1.d(new cbo0(str5, str6, bbo0Var2, bbo0Var), qim0VarP, x340Var34, 0);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                m4c m4cVar6 = fkj0.X;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    boolean z4 = ((a591) obj4).a;
                    boolean zG19 = x340Var36.g(iu30Var15);
                    Object objT20 = x340Var36.T();
                    if (zG19 || objT20 == m4cVar6) {
                        objT20 = new k4j(iu30Var15, (byte) 19);
                        x340Var36.s0(objT20);
                    }
                    iu30 iu30Var16 = (iu30) objT20;
                    boolean zG20 = x340Var36.g(iu30Var15);
                    Object objT21 = x340Var36.T();
                    if (zG20 || objT21 == m4cVar6) {
                        objT21 = new ogj(iu30Var15, (byte) 15);
                        x340Var36.s0(objT21);
                    }
                    dro.r(z4, iu30Var16, (Function0) objT21, x340Var36, 0);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                iu30 iu30Var17 = (iu30) obj3;
                c9d1 c9d1Var = (c9d1) obj4;
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    w8d1 w8d1Var = c9d1Var.a;
                    boolean zG21 = x340Var38.g(iu30Var17) | x340Var38.g(c9d1Var);
                    Object objT22 = x340Var38.T();
                    if (zG21 || objT22 == fkj0.X) {
                        objT22 = new gmj(iu30Var17, c9d1Var, (byte) 0);
                        x340Var38.s0(objT22);
                    }
                    o4p1.a(w8d1Var, null, (Function0) objT22, x340Var38, 0);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                dro.c((rzn1) obj4, (wim) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                dro.b((rzn1) obj4, (vim) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((auj) obj4).o1((qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((buj) obj4).a((qm70) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                fae1.e((ine0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                fae1.f((eov0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    c380 c380Var2 = (c380) obj4;
                    gg21 gg21Var = (gg21) obj3;
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var40, 0);
                    int iHashCode = Long.hashCode(x340Var40.T);
                    xos0 xos0VarM = x340Var40.m();
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var40, nim0Var2);
                    hzj.A.getClass();
                    if (x340Var40.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var40.m0();
                    if (x340Var40.S) {
                        x340Var40.l(hmb0.t1);
                    } else {
                        x340Var40.v0();
                    }
                    nko1.H(jw31VarA, x340Var40, y580.O0);
                    nko1.H(xos0VarM, x340Var40, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var40, y580.R0);
                    nko1.F(x340Var40);
                    nko1.H(qim0VarE, x340Var40, y580.Y);
                    uwr uwrVar5 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var40).b;
                    fc11.a(c380Var2, uyn1.B(nim0Var2, 0.0f, 0.0f, 6.0f, 0.0f, 11), (hcx) null, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var40, 8, 508);
                    int i = gg21Var.a;
                    uwo1.e(cwl1.U(2131820624, i, new Object[]{Integer.valueOf(i)}, x340Var40), anm1.N("reply_preview_row_text", uyn1.B(nim0Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11)), cbx.d(x340Var40).k, cbx.a(x340Var40).b.b, null, null, 0, false, null, 0, null, x340Var40, 0, 0, 2032);
                    mlx mlxVar = mlx.c;
                    long j = cbx.a(x340Var40).b.b;
                    zov0 zov0Var = cbx.b(x340Var40).g;
                    w0h1.a(mlxVar, isl.a, u291.r(nim0Var2, 16.0f), j, 0L, false, x340Var40, mlx.d | 48, 48);
                    x340Var40.r(true);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                nzj nzjVar = (nzj) obj4;
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(2002910593, new mzj(rwq.h(nzjVar.b, x340Var42, 0), (j2i) obj3, rwq.h(nzjVar.c, x340Var42, 0)), x340Var42), x340Var42, 3078, 6);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case 28:
                return a(obj, obj2);
            default:
                ((Number) obj2).intValue();
                ((xgc) obj4).i((qim0) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2i(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
