package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xh00 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh00(iu30 iu30Var, ro30 ro30Var) {
        super(2);
        this.a = (byte) 26;
        this.c = iu30Var;
        this.b = ro30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        z6x z6xVarSingletonList;
        boolean z;
        int i;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                ((i7d) obj4).a(null, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((zx00) obj4).g((String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((zx00) obj4).g(((tx00) obj3).b, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj;
                x340Var3.i0(1657896549);
                vy00 vy00Var = (vy00) obj4;
                jge jgeVar = vy00Var.c;
                ntc1 ntc1Var = ntc1.a;
                ptc1 ptc1Var = (qtc1) rwq.g(jgeVar, ntc1Var, null, x340Var3, 0, 2).getValue();
                ymc0 ymc0Var = (ymc0) rwq.h(((bct) obj3).a, x340Var3, 0).getValue();
                boolean z2 = ptc1Var instanceof ptc1;
                ptc1 ptc1Var2 = z2 ? ptc1Var : null;
                String str = ptc1Var2 != null ? ptc1Var2.a : null;
                if (u890.j(ptc1Var, ntc1Var)) {
                    x340Var3.i0(-1727244540);
                    x340Var3.r(false);
                    z6xVarSingletonList = z6x.a;
                    z = false;
                } else {
                    x340Var3.i0(-1727170233);
                    z6xVarSingletonList = Collections.singletonList(new ky00(apo.r(-1371068760, new xx00(vy00Var, ptc1Var, ymc0Var, (byte) 1), x340Var3)));
                    z = false;
                    x340Var3.r(false);
                }
                iy00 iy00Var = new iy00(str, z6xVarSingletonList, z2);
                x340Var3.r(z);
                return iy00Var;
            case 4:
                ((Number) obj2).intValue();
                cuo1.q((jj10) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var4 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uk10 uk10Var = (vk10) obj4;
                    String str2 = uk10Var.a;
                    String str3 = uk10Var.c;
                    boolean zG = x340Var5.g(iu30Var);
                    Object objT = x340Var5.T();
                    if (zG || objT == fkj0.X) {
                        objT = new yx00(iu30Var, (byte) 11);
                        x340Var5.s0(objT);
                    }
                    luo1.g(0, str2, str3, (Function0) objT, x340Var5, null);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                wxo1.k((ep10) obj4, (String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ((uny) obj4).f(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                h0p1.b((gbx) obj4, (qim0) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                o0p1.b((jsl) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                o0p1.c((e920) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                o0p1.d((f920) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                o0p1.g((k920) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                m1p1.i((List) obj4, (br0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var6 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                lzn0 lzn0Var = (lzn0) obj3;
                m4c m4cVar = fkj0.X;
                sp00 sp00Var = (sp00) obj4;
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI = x340Var7.i(sp00Var);
                    Object objT2 = x340Var7.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new gi00(sp00Var, (byte) 18);
                        x340Var7.s0(objT2);
                    }
                    iu30 iu30Var2 = (iu30) objT2;
                    boolean zI2 = x340Var7.i(lzn0Var);
                    Object objT3 = x340Var7.T();
                    if (zI2 || objT3 == m4cVar) {
                        i = 0;
                        objT3 = new xg20(lzn0Var, (byte) 0);
                        x340Var7.s0(objT3);
                    } else {
                        i = 0;
                    }
                    b2p1.o(i, (Function0) objT3, x340Var7, iu30Var2);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                j2p1.e((sk20) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var8 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    r830 r830Var = (r830) obj4;
                    iu30 iu30Var3 = (iu30) obj3;
                    for (r830 r830Var2 : r830.e) {
                        boolean z3 = r830Var2 == r830Var;
                        boolean zG2 = x340Var9.g(iu30Var3) | x340Var9.e(r830Var2.ordinal());
                        Object objT4 = x340Var9.T();
                        if (zG2 || objT4 == fkj0.X) {
                            objT4 = new hs20(iu30Var3, r830Var2, (byte) 1);
                            x340Var9.s0(objT4);
                        }
                        m5n1.b(z3, (Function0) objT4, cwl1.o0(x340Var9, r830Var2.b), (qim0) null, (idn0) null, (max) null, (vu30) null, (hw61) null, (ga80) null, 0, x340Var9, 0, 0, 2040);
                    }
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var10 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    si1.f((zm30) obj4, (iu30) obj3, (qim0) null, x340Var11, 8);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                rc2.e((tn30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var12 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                ven0 ven0Var = (ven0) obj3;
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ap30 ap30Var = (ap30) obj4;
                    String str4 = ap30Var.b;
                    String str5 = ap30Var.c;
                    boolean zI3 = x340Var13.i(ven0Var);
                    Object objT5 = x340Var13.T();
                    if (zI3 || objT5 == fkj0.X) {
                        objT5 = new iwr(ven0Var, (byte) 26);
                        x340Var13.s0(objT5);
                    }
                    wm5.j(0, str4, str5, (Function0) objT5, x340Var13);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var14 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    yq30 yq30Var = (yq30) obj4;
                    String str6 = yq30Var.b;
                    boolean z4 = yq30Var.c;
                    String str7 = yq30Var.d;
                    boolean zG3 = x340Var15.g(iu30Var4);
                    Object objT6 = x340Var15.T();
                    if (zG3 || objT6 == fkj0.X) {
                        objT6 = new bb30(iu30Var4, (byte) 9);
                        x340Var15.s0(objT6);
                    }
                    m87.g(24576, str6, str7, (Function0) objT6, x340Var15, nim0.a, z4);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var16 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    otw.c((g140) obj4, (f140) obj3, (qim0) null, (ipb1) null, x340Var17, 0, 12);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                d1u.l((t8b) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                x340 x340Var18 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((ng20) obj4).h((uf40) obj3, x340Var19, 0);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var20 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    yt40 yt40Var = (yt40) obj4;
                    boolean z5 = yt40Var.a;
                    boolean z6 = yt40Var.b == zt40.a;
                    boolean zG4 = x340Var21.g(iu30Var5);
                    Object objT7 = x340Var21.T();
                    if (zG4 || objT7 == m4cVar2) {
                        objT7 = new bb30(iu30Var5, (byte) 23);
                        x340Var21.s0(objT7);
                    }
                    Function0 function0 = (Function0) objT7;
                    boolean zG5 = x340Var21.g(iu30Var5);
                    Object objT8 = x340Var21.T();
                    if (zG5 || objT8 == m4cVar2) {
                        objT8 = new bb30(iu30Var5, (byte) 24);
                        x340Var21.s0(objT8);
                    }
                    vby0.d(0, function0, (Function0) objT8, x340Var21, z5, z6);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var22 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    gbx gbxVar = (gbx) obj4;
                    String str8 = (String) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var23.T);
                    xos0 xos0VarM = x340Var23.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var23, nim0Var);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC, x340Var23, y580.O0);
                    nko1.H(xos0VarM, x340Var23, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var23, y580.R0);
                    nko1.F(x340Var23);
                    nko1.H(qim0VarE, x340Var23, y580.Y);
                    t1c.a(dug.f(k1o1.n(h2c.a.b(nim0Var)), u7h.b, er31.a), x340Var23, 0);
                    foo1.c(gbxVar, new hdx(4, (vu30) null, (vu30) null, (vu30) null, (hw61) null, 30), null, null, yla.s(x340Var23), null, null, null, null, null, apo.r(1773084689, new ps00(str8, (byte) 29), x340Var23), x340Var23, 0, 48, 2012);
                    x340Var23.r(true);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var24 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var25 = x340Var24;
                boolean zY = x340Var25.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2);
                j06 j06Var = x340Var25.a;
                if (!zY) {
                    x340Var25.b0();
                    return rih1Var;
                }
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarY = voo1.y(u291.f(nim0Var2, 1.0f), voo1.b);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var25).b;
                cvx cvxVar2 = cbx.b(x340Var25).b;
                cvx cvxVar3 = cbx.b(x340Var25).b;
                qim0 qim0VarN = anm1.N("graduation_supervision_test_tag", uyn1.B(qim0VarY, 16.0f, 0.0f, 16.0f, 16.0f, 2));
                era eraVar = een.P0;
                iu30 iu30Var6 = (iu30) obj3;
                ro30 ro30Var = (ro30) obj4;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var25, 0);
                int iHashCode2 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM2 = x340Var25.m();
                qim0 qim0VarE2 = zr7.E(x340Var25, qim0VarN);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var25, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var25, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var25, lljVar3);
                nko1.F(x340Var25);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var25, lljVar4);
                boolean zG6 = x340Var25.g(iu30Var6);
                Object objT9 = x340Var25.T();
                if (zG6 || objT9 == m4cVar3) {
                    objT9 = new g850(iu30Var6, (byte) 4);
                    x340Var25.s0(objT9);
                }
                q3p1.b(6, 0, (Function0) objT9, x340Var25, true);
                men1.e(cwl1.o0(x340Var25, 2131956405), (qim0) null, 0.0f, x340Var25, 0, 6);
                qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                Object objT10 = x340Var25.T();
                if (objT10 == m4cVar3) {
                    objT10 = r850.g;
                    x340Var25.s0(objT10);
                }
                qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT10);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var25, 0);
                int iHashCode3 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM3 = x340Var25.m();
                qim0 qim0VarE3 = zr7.E(x340Var25, qim0VarB);
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(mbhVarA2, x340Var25, lljVar);
                nko1.H(xos0VarM3, x340Var25, lljVar2);
                x0d.q(iHashCode3, x340Var25, lljVar3, x340Var25);
                nko1.H(qim0VarE3, x340Var25, lljVar4);
                vvm1.f(cwl1.o0(x340Var25, 2131956401), (qim0) null, cbx.d(x340Var25).h, 0.0f, x340Var25, 0, 10);
                c9 c9VarS = mqo1.s(cwl1.o0(x340Var25, 2131956404), cwl1.o0(x340Var25, 2131956403), cwl1.o0(x340Var25, 2131956406));
                cvx cvxVar4 = cbx.b(x340Var25).b;
                op71.a(c9VarS, uyn1.B(nim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), (lee1) null, 0L, 0.0f, x340Var25, 0, 28);
                x340Var25.r(true);
                op71.g(x340Var25, new wnb0(0.75f, true));
                tq60 tq60Var = new tq60(een.Q0);
                boolean zI4 = x340Var25.i(ro30Var) | x340Var25.g(iu30Var6);
                Object objT11 = x340Var25.T();
                if (zI4 || objT11 == m4cVar3) {
                    objT11 = new hs20(ro30Var, iu30Var6, (byte) 13);
                    x340Var25.s0(objT11);
                }
                lnn1.c(0, (Function0) objT11, x340Var25, tq60Var);
                x340Var25.r(true);
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                xpn1.d((yqg) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                if50.a((jf50) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var26 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    uwo1.e((String) obj3, nim0.a, vgo1.q(cbx.d(x340Var27).h, ((jg50) obj4).d, x340Var27), 0L, null, null, 0, false, null, 0, null, x340Var27, 48, 0, 2040);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh00(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh00(i7d i7dVar, if00 if00Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = i7dVar;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh00(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
