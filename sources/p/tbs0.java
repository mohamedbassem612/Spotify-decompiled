package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tbs0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbs0(Function0 function0, u7h u7hVar, u7h u7hVar2) {
        super(2);
        this.a = (byte) 9;
        this.b = function0;
        this.c = u7hVar;
        this.d = u7hVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        phw0 phw0Var;
        int i;
        int iH;
        int iIntValue;
        zrm0 zrm0Var;
        int i2;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        Integer num = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                vu30 vu30Var = (vu30) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c380 c380VarA = mqo1.A((c380) obj4);
                    t2c0 t2c0Var = (t2c0) obj3;
                    cqs0 cqs0Var = t2c0Var.b;
                    boolean z = t2c0Var.a;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    boolean zG = x340Var2.g(vu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new k7f((byte) 27, vu30Var, false);
                        x340Var2.s0(objT);
                    }
                    oqo1.d(c380VarA, (vu30) objT, cqs0Var, z, qim0VarB, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                String str = (String) obj3;
                vng vngVar = (vng) obj4;
                ven0 ven0Var = (ven0) obj5;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI = x340Var4.i(vngVar) | x340Var4.g(str) | x340Var4.i(ven0Var);
                    Object objT2 = x340Var4.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new pcp0(vngVar, str, ven0Var, (byte) 19);
                        x340Var4.s0(objT2);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT2), ldx.c, (qim0) null, (max) null, yla.s(x340Var4), (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-686313396, new xd2(ven0Var, (byte) 17), x340Var4), x340Var4, 0, 6, 988);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                zqo1.g((dis0) obj4, (iu30) obj3, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                pt ptVar = (pt) obj5;
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nis0 nis0Var = (nis0) obj4;
                    lis0 lis0Var = nis0Var.a;
                    boolean z2 = nis0Var.c;
                    boolean zG2 = x340Var6.g(iu30Var);
                    Object objT3 = x340Var6.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = new azr0(iu30Var, (byte) 4);
                        x340Var6.s0(objT3);
                    }
                    iu30 iu30Var2 = (iu30) objT3;
                    boolean zG3 = x340Var6.g(iu30Var);
                    Object objT4 = x340Var6.T();
                    if (zG3 || objT4 == m4cVar) {
                        objT4 = new g0s0(iu30Var, (byte) 9);
                        x340Var6.s0(objT4);
                    }
                    Function0 function0 = (Function0) objT4;
                    boolean zG4 = x340Var6.g(iu30Var);
                    Object objT5 = x340Var6.T();
                    if (zG4 || objT5 == m4cVar) {
                        objT5 = new k2g0(iu30Var, (byte) 28);
                        x340Var6.s0(objT5);
                    }
                    vu30 vu30Var2 = (vu30) objT5;
                    boolean zG5 = x340Var6.g(iu30Var);
                    Object objT6 = x340Var6.T();
                    if (zG5 || objT6 == m4cVar) {
                        objT6 = new g0s0(iu30Var, (byte) 10);
                        x340Var6.s0(objT6);
                    }
                    Function0 function1 = (Function0) objT6;
                    boolean zG6 = x340Var6.g(iu30Var) | x340Var6.i(ptVar);
                    Object objT7 = x340Var6.T();
                    if (zG6 || objT7 == m4cVar) {
                        objT7 = new shq0((byte) 19, ptVar, iu30Var);
                        x340Var6.s0(objT7);
                    }
                    zqo1.h(lis0Var, z2, iu30Var2, function0, vu30Var2, function1, (Function0) objT7, (qim0) null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    otw.c((p40) obj4, new prs0((vcl) obj3, (iu30) obj5), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    rus0 rus0Var = (rus0) obj4;
                    String str2 = rus0Var.b;
                    String str3 = rus0Var.c;
                    String str4 = rus0Var.d;
                    String str5 = rus0Var.e;
                    String str6 = rus0Var.f;
                    boolean z3 = rus0Var.i;
                    String str7 = rus0Var.g;
                    boolean z4 = rus0Var.j;
                    boolean zG7 = x340Var10.g(iu30Var3);
                    Object objT8 = x340Var10.T();
                    if (zG7 || objT8 == m4cVar2) {
                        objT8 = new g0s0(iu30Var3, (byte) 14);
                        x340Var10.s0(objT8);
                    }
                    Function0 function2 = (Function0) objT8;
                    boolean zG8 = x340Var10.g(iu30Var3);
                    Object objT9 = x340Var10.T();
                    if (zG8 || objT9 == m4cVar2) {
                        objT9 = new g0s0(iu30Var3, (byte) 15);
                        x340Var10.s0(objT9);
                    }
                    pto1.i(str2, str3, str4, str5, str6, z3, str7, z4, function2, (Function0) objT9, ((uus0) obj5).g, (qim0) null, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                cuo1.t((fws0) obj4, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                mzs0.a((b1t0) obj4, (iu30) obj3, (q8n) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((yup0) obj4).e(czo1.p(1), (Function0) obj5, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Function0 function3 = (Function0) obj4;
                    if (ihc1.y0("CTA Arrow Click")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.h(new gbx(new y50("CTA Arrow Click"), function3), i0p1.t((u7h) obj3, (u7h) obj5), nim0.a, (max) null, yla.s(x340Var12), (vzq0) null, false, (idn0) null, (ga80) null, i8j.a, x340Var12, 0, 6, 984);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                i0p1.k((vdo) obj4, (Function0) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                iu30 iu30Var4 = (iu30) obj5;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    dm5 dm5Var = ((nnt0) obj4).e;
                    if (dm5Var instanceof ydo) {
                        x340Var14.i0(1128117121);
                        String str8 = ((ydo) dm5Var).k;
                        boolean zG9 = x340Var14.g(str8);
                        Object objT10 = x340Var14.T();
                        if (zG9 || objT10 == m4cVar3) {
                            objT10 = new set0(str8, true, "play_link_card", "play_link_card", new smt0(iu30Var4, (byte) 3), false, false, (Function0) null, (String) null, (String) null, false, 2016);
                            x340Var14.s0(objT10);
                        }
                        otw.c((hft0) obj3, (set0) objT10, (qim0) null, (ipb1) null, x340Var14, 0, 12);
                        x340Var14.r(false);
                    } else if (dm5Var instanceof vdo) {
                        x340Var14.i0(-1903254671);
                        vdo vdoVar = (vdo) dm5Var;
                        boolean zG10 = x340Var14.g(iu30Var4);
                        Object objT11 = x340Var14.T();
                        if (zG10 || objT11 == m4cVar3) {
                            objT11 = new smt0(iu30Var4, (byte) 2);
                            x340Var14.s0(objT11);
                        }
                        i0p1.k(vdoVar, (Function0) objT11, (qim0) null, x340Var14, 0);
                        x340Var14.r(false);
                    } else {
                        if (dm5Var != null) {
                            throw p3d1.k(x340Var14, -1903273612, false);
                        }
                        x340Var14.i0(1128796951);
                        x340Var14.r(false);
                    }
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                mpt0 mpt0Var = (mpt0) obj5;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    dfm dfmVar = (dfm) obj4;
                    boolean zG11 = x340Var16.g(iu30Var5) | x340Var16.i(mpt0Var);
                    Object objT12 = x340Var16.T();
                    if (zG11 || objT12 == fkj0.X) {
                        objT12 = new shq0((byte) 28, mpt0Var, iu30Var5);
                        x340Var16.s0(objT12);
                    }
                    dfmVar.e(2, 54, (Function0) objT12, x340Var16, false);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ((dfm) obj3).e(((mpt0) obj4).g ? 1 : 2, 48, (pcp0) obj5, x340Var18, true);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                u1p1.n((mvt0) obj4, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                giu0.a((yj41) obj4, (Function0) obj3, (qim0) obj5, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((hou0) obj4).h((aou0) obj3, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                ((hou0) obj4).k((af5) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                ((ulc) obj4).a(czo1.p(1), (Function0) obj3, (b0k) obj, (qim0) obj5);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    w6p1.c((v2v0) obj4, (iu30) obj3, (qim0) null, (yqg) obj5, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(2047642878, new gm10((hrr0) obj4, (dx0) obj3, (iu30) obj5), x340Var22), x340Var22, 3078, 6);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                k4k.k((syv0) obj4, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 22:
                x340 x340Var23 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    sok.h((iu30) obj4, (gzv0) ((hzv0) obj3), (e9k) ((cm0) obj5).t, null, x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                mym.e((xky0) obj4, obj3, (Function0) obj5, (b0k) obj, czo1.p(7));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var25 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e9w0 e9w0Var = (e9w0) obj3;
                    otw.c((smp0) obj4, new v6w0(e9w0Var, new hzu0((vu30) obj5, e9w0Var, (byte) 20)), (qim0) null, (ipb1) null, x340Var26, 0, 12);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var27 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                m4c m4cVar4 = fkj0.X;
                rt01 rt01Var = (rt01) obj4;
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    mhw0 mhw0Var = (mhw0) obj3;
                    ihw0 ihw0Var = mhw0Var.e;
                    if (ihw0Var instanceof jhw0) {
                        phw0Var = new phw0("", (String) null, 3, 2, "", false, 0.0f, false);
                    } else if (ihw0Var instanceof ihw0) {
                        ihw0 ihw0Var2 = ihw0Var;
                        long j = ihw0Var2.e;
                        String str9 = ihw0Var2.a;
                        String str10 = ihw0Var2.c;
                        int iC = l1d.C(ihw0Var2.d);
                        if (iC == 0) {
                            i = 1;
                        } else if (iC == 1) {
                            i = 2;
                        } else {
                            if (iC != 2) {
                                eg.o();
                                return null;
                            }
                            i = 3;
                        }
                        int i3 = mhw0Var.c;
                        ggv ggvVar = (ggv) rt01Var.c;
                        ytw0 ytw0Var = jfv.b;
                        String strA = ggvVar.a((int) jfv.u(fdg1.l0(j, ngv.d), ngv.e), new fgv(3, 2));
                        lhw0 lhw0Var = mhw0Var.d;
                        phw0Var = new phw0(str9, str10, i, i3, strA, lhw0Var.a, lhw0Var.c / j, mhw0Var.f == PlayabilityRestriction.NO_RESTRICTION);
                    } else {
                        if (!(ihw0Var instanceof hhw0)) {
                            eg.o();
                            return null;
                        }
                        phw0Var = null;
                    }
                    if (phw0Var == null) {
                        x340Var28.i0(397850767);
                        x340Var28.r(false);
                    } else {
                        x340Var28.i0(397850768);
                        iu30 iu30Var6 = (iu30) obj5;
                        boolean zG12 = x340Var28.g(iu30Var6);
                        Object objT13 = x340Var28.T();
                        if (zG12 || objT13 == m4cVar4) {
                            objT13 = new h7w0(iu30Var6, (byte) 2);
                            x340Var28.s0(objT13);
                        }
                        Function0 function4 = (Function0) objT13;
                        boolean zG13 = x340Var28.g(iu30Var6);
                        Object objT14 = x340Var28.T();
                        if (zG13 || objT14 == m4cVar4) {
                            objT14 = new h7w0(iu30Var6, (byte) 3);
                            x340Var28.s0(objT14);
                        }
                        gm50.g(phw0Var, function4, (Function0) objT14, uyn1.z(0.0f, 0.0f, 2, nim0Var), (idn0) null, x340Var28, 0, 16);
                        x340Var28.r(false);
                    }
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                gm50.b((Function0) obj4, (phw0) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                hr80.e((i091) obj4, (yqg) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                x340 x340Var29 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                String str11 = (String) obj4;
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    Function0 function5 = (Function0) obj3;
                    if (ihc1.y0(str11)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str11), function5), new idx(13), (qim0) null, (max) obj5, yla.r(x340Var30), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1917849430, new psr0(str11, (byte) 23), x340Var30), x340Var30, 0, 48, 1996);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            default:
                tlc1 tlc1Var = (tlc1) obj;
                long j2 = ((hjl) obj2).a;
                vnr0 vnr0Var = (vnr0) obj5;
                long jB = hjl.b(j2, 0, 0, 0, Integer.MAX_VALUE, 2);
                int iI0 = tlc1Var.i0(8.0f);
                int iI1 = tlc1Var.i0(16.0f);
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P(cow0.a, (j2i) obj4))).H(jB);
                if (hjl.d(j2)) {
                    iH = (hjl.h(j2) - q5t0VarH.b) - iI1;
                    if (iH < 0) {
                        iH = 0;
                    }
                } else {
                    iH = Integer.MAX_VALUE;
                }
                q5t0 q5t0VarH2 = ((afh0) o7h.q0(tlc1Var.P(fow0.a, new j2i(1714476897, new vka((vnr0) obj3, (byte) 3), true)))).H(hjl.b(jB, 0, 0, 0, iH, 7));
                p811 p811Var = new p811();
                int i4 = ((afh0) o7h.q0(tlc1Var.P(eow0.a, new j2i(-776483508, new hws0(vnr0Var, p811Var, (byte) 29), true)))).H(jB).b;
                int iH2 = (((hjl.h(j2) - q5t0VarH2.b) - iI0) - iI1) - q5t0VarH.b;
                if (iH2 < 0) {
                    iH2 = 0;
                }
                y9e1 y9e1Var = (y9e1) p811Var.a;
                if (y9e1Var == null || (i2 = (zrm0Var = y9e1Var.b).f) == 0) {
                    Integer numValueOf = Integer.valueOf(i4);
                    if (1 <= i4 && i4 <= iH2) {
                        num = numValueOf;
                    }
                    iIntValue = num != null ? num.intValue() : 0;
                } else {
                    int i5 = i4 - ((int) (y9e1Var.c & 4294967295L));
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < i2) {
                        int iCeil = ((int) Math.ceil(zrm0Var.b(i6))) + i5;
                        if (iCeil <= iH2) {
                            i6++;
                            i7 = iCeil;
                        } else {
                            iIntValue = i7;
                        }
                    }
                    iIntValue = i7;
                }
                q5t0 q5t0VarH3 = ((afh0) o7h.q0(tlc1Var.P(dow0.a, new j2i(-1812039865, new vka(vnr0Var, (byte) 2), true)))).H(hjl.b(jB, 0, 0, 0, iIntValue, 7));
                boolean z5 = iIntValue > 0;
                return tlc1Var.S(hjl.i(j2), q5t0VarH2.b + (z5 ? iI0 + q5t0VarH3.b : 0) + iI1 + q5t0VarH.b, b7x.a, new ynw0(q5t0VarH2, z5, iI0, q5t0VarH3, iI1, q5t0VarH, j2, tlc1Var));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tbs0(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tbs0(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
