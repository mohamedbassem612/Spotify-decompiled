package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(ArrayList arrayList, String str, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 23;
        this.c = arrayList;
        this.b = str;
        this.d = iu30Var;
        this.e = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:172:0x0701  */
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        u5j1 u5j1Var = d4o1.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarV = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qro1.a((String) obj6, (String) obj5, (b4v0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3 c3Var = (c3) obj6;
                    String str = c3Var.e;
                    String str2 = c3Var.f;
                    boolean z = c3Var.g instanceof fy50;
                    String str3 = c3Var.h;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new p1(iu30Var, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    tro1.a(str, str2, z, str3, null, (Function0) objT, apo.r(1732496419, new j3((p811) obj4, (byte) 0), x340Var2), apo.r(-2088492956, new j3((p811) obj3, (byte) 1), x340Var2), x340Var2, 14155776);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj6;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarF = dug.f(u291.d(qim0VarV, 1.0f), f5p1.k(x340Var4, 2131100256), u5j1Var);
                    boolean zG2 = x340Var4.g(iu30Var2);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new p1(iu30Var2, (byte) 4);
                        x340Var4.s0(objT2);
                    }
                    cwl1.b(bin.x(qim0VarF, false, null, null, null, (Function0) objT2, 15), een.X, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1731142242, new k8((mj) obj4, (iyb) obj5, iu30Var2, (gw70) obj3), x340Var4), x340Var4, 0, 48, 2028);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                d0p1.a((yap1) obj4, (String) obj6, (String) obj5, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                g0p1.a((r2p1) obj4, (String) obj6, (String) obj5, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                c380 c380Var = (c380) obj6;
                vzq0 vzq0Var = (vzq0) obj5;
                int i = ((hjl.i(j) - tlc1Var.i0(8.0f * (c380Var.size() - 1))) - tlc1Var.i0(uyn1.m(vzq0Var, tlc1Var.getLayoutDirection()) + uyn1.n(vzq0Var, tlc1Var.getLayoutDirection()))) / c380Var.size();
                int iOrdinal = ((l90) obj4).ordinal();
                if (iOrdinal == 0) {
                    qim0VarV = u291.v(qim0VarV, tlc1Var.M0(i));
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    List listP = tlc1Var.P("measure", new j2i(2111841248, new i90(c380Var, (byte) 0), true));
                    ArrayList arrayList = new ArrayList(q7h.U(listP, 10));
                    Iterator it = listP.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((afh0) it.next()).H(jjl.b(0, 0, 0, 0, 15)));
                    }
                    if (arrayList.isEmpty()) {
                        qim0VarV = u291.v(qim0VarV, tlc1Var.M0(i));
                    } else {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                qim0VarV = u291.v(qim0VarV, tlc1Var.M0(i));
                            }
                        } while (((q5t0) it2.next()).a <= i);
                    }
                }
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P("content", new j2i(1189752094, new h90(c380Var, (xtb0) obj3, vzq0Var, qim0VarV), true)))).H(jjl.b(0, hjl.i(j), 0, 0, 13));
                return tlc1Var.S(hjl.e(j) ? hjl.i(j) : q5t0VarH.a, q5t0VarH.b, b7x.a, new f2(q5t0VarH, (byte) 1));
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zc0 zc0Var = (zc0) obj5;
                    otw.c((maa) ((ynb0) ((res) obj6).h).get(), new ab0(zc0Var.d.size(), zc0Var.a.a, zc0Var.c, (Function0) obj3, !((eq50) obj4).equals(bq50.a)), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                u1p1.a((jk0) obj6, (iu30) obj5, (op0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0Var = (qim0) obj3;
                    Object objT3 = x340Var8.T();
                    if (objT3 == fkj0.X) {
                        objT3 = gx0.c;
                        x340Var8.s0(objT3);
                    }
                    qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT3);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var8).g;
                    qim0 qim0VarF2 = dug.f(i1p1.q(u291.j(24.0f, 0.0f, 2, qim0VarB), (cr31) obj4), cbx.a(x340Var8).a.c, u5j1Var);
                    String str4 = (String) obj6;
                    String str5 = (String) obj5;
                    gfh0 gfh0VarC = t1c.c(een.g, false);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, qim0VarF2);
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
                    i3p1.a(0, str4, str5, x340Var8, u291.B(qim0VarV, (gra) null, 3));
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                l4p1.a((spv) obj6, (t71) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                z4p1.b((bb1) obj6, (iu30) obj5, (em0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                e6p1.a((qw50) obj6, (qim0) obj3, (Function0) obj5, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                d7p1.a((ei1) obj6, (fi1) obj5, (los) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                mj1 mj1Var = (mj1) obj4;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    f7p1.a((gj1) ((ij1) obj6), (iu30) obj5, (q251) mj1Var.X.getValue(), mj1Var.a, mj1Var.f, (v361) mj1Var.Y.getValue(), (fm50) obj3, anm1.N("loaded_element", qim0VarV), x340Var10, 12582912);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                kbf0 kbf0Var = (kbf0) obj3;
                pk1 pk1Var = (pk1) obj4;
                ven0 ven0Var = (ven0) obj5;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fcf0 fcf0Var = (fcf0) obj6;
                    boolean zI = x340Var12.i(ven0Var) | x340Var12.g(pk1Var) | x340Var12.i(kbf0Var);
                    Object objT4 = x340Var12.T();
                    if (zI || objT4 == fkj0.X) {
                        objT4 = new hh(pk1Var, kbf0Var, ven0Var, (byte) 4);
                        x340Var12.s0(objT4);
                    }
                    mp10.e(fcf0Var, (Function0) objT4, (qim0) null, false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, (j6m) null, false, false, (Map) null, (jj7) null, false, x340Var12, 0, 0, 65532);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    mod.b(oi7.a.a((gw70) obj6), apo.r(-1470089792, new q1(obj5, obj4, obj3, (byte) 18), x340Var14), x340Var14, 56);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                n8p1.a((gn1) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                pap1.b((h52) obj6, (gw70) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                pdp1.a((mwq0) obj6, (bab1) obj5, (j2i) obj4, (j2i) obj3, (b0k) obj, czo1.p(3457));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                c8o.b((zxo) obj6, (pd2) obj5, (vu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                fq7.m((String) obj6, (t51) obj5, (t51) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                era eraVar = een.P0;
                iu30 iu30Var3 = (iu30) obj4;
                wm2 wm2Var = (wm2) obj5;
                x340 x340Var16 = x340Var15;
                boolean zY = x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2);
                j06 j06Var = x340Var16.a;
                rih1 rih1Var2 = rih1.a;
                if (!zY) {
                    x340Var16.b0();
                    return rih1Var2;
                }
                float fA = ((vzq0) obj6).a();
                t2j1 t2j1Var = wm2Var.g;
                int i2 = t2j1Var == null ? -1 : gk2.a[t2j1Var.ordinal()];
                if (i2 != -1) {
                    f36 f36Var = h36.c;
                    if (i2 == 1) {
                        x340Var16.i0(1167305684);
                        qim0 qim0VarF3 = u291.f(qim0VarV, 1.0f);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var16).b;
                        qim0 qim0VarB2 = uyn1.B(uyn1.x(qim0VarF3, 16.0f), 0.0f, 0.0f, 0.0f, fA, 7);
                        mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var16, 0);
                        int iHashCode2 = Long.hashCode(x340Var16.T);
                        xos0 xos0VarM2 = x340Var16.m();
                        qim0 qim0VarE2 = zr7.E(x340Var16, qim0VarB2);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var16.m0();
                        if (x340Var16.S) {
                            x340Var16.l(n4kVar);
                        } else {
                            x340Var16.v0();
                        }
                        nko1.H(mbhVarA, x340Var16, lljVar4);
                        nko1.H(xos0VarM2, x340Var16, lljVar3);
                        x0d.q(iHashCode2, x340Var16, lljVar2, x340Var16);
                        nko1.H(qim0VarE2, x340Var16, lljVar);
                        boolean zG3 = x340Var16.g(iu30Var3);
                        Object objT5 = x340Var16.T();
                        if (zG3 || objT5 == m4cVar) {
                            objT5 = new k52(iu30Var3, (byte) 23);
                            x340Var16.s0(objT5);
                        }
                        otw.c(new jn2((Function0) objT5, (byte) 1), rih1Var2, (qim0) null, (ipb1) null, x340Var16, 48, 12);
                        x340Var16.r(true);
                        x340Var16.r(false);
                        return rih1Var2;
                    }
                    if (i2 == 2) {
                        x340Var16.i0(1167321662);
                        qim0 qim0VarF4 = u291.f(qim0VarV, 1.0f);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar2 = cbx.b(x340Var16).b;
                        qim0 qim0VarB3 = uyn1.B(uyn1.x(qim0VarF4, 16.0f), 0.0f, 0.0f, 0.0f, fA, 7);
                        mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var16, 0);
                        int iHashCode3 = Long.hashCode(x340Var16.T);
                        xos0 xos0VarM3 = x340Var16.m();
                        qim0 qim0VarE3 = zr7.E(x340Var16, qim0VarB3);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var16.m0();
                        if (x340Var16.S) {
                            x340Var16.l(n4kVar);
                        } else {
                            x340Var16.v0();
                        }
                        nko1.H(mbhVarA2, x340Var16, lljVar4);
                        nko1.H(xos0VarM3, x340Var16, lljVar3);
                        x0d.q(iHashCode3, x340Var16, lljVar2, x340Var16);
                        nko1.H(qim0VarE3, x340Var16, lljVar);
                        boolean zG4 = x340Var16.g(iu30Var3);
                        Object objT6 = x340Var16.T();
                        if (zG4 || objT6 == m4cVar) {
                            objT6 = new k52(iu30Var3, (byte) 24);
                            x340Var16.s0(objT6);
                        }
                        otw.c(new jn2((Function0) objT6, (byte) 0), new in2(wm2Var.f), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                        x340Var16.r(true);
                        x340Var16.r(false);
                        return rih1Var2;
                    }
                    if (i2 != 3) {
                        throw p3d1.k(x340Var16, 1167304030, false);
                    }
                }
                x340Var16.i0(1167342276);
                aq8.s(wm2Var, iu30Var3, (lsr) obj3, fA, x340Var16, 0);
                x340Var16.r(false);
                return rih1Var2;
            case 22:
                ((Number) obj2).intValue();
                kbb.b((rk2) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                sbl.a((ArrayList) obj5, (String) obj6, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                kkn.a((fxl) obj6, (eyh0) obj5, (v1r0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                yto.a((hpf1) obj6, (u961) obj5, (ContextTrack) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                b2u.a((ArrayList) obj4, (String) obj6, (String) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                y7y0.b((String) obj6, (String) obj5, (iu30) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                poz0.b((i04) obj6, (Function0) obj5, (qim0) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                r4o1.a((fqh1) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj, String str, String str2, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = str;
        this.c = str2;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(mj mjVar, iyb iybVar, iu30 iu30Var, gw70 gw70Var) {
        super(2);
        this.a = (byte) 2;
        this.b = iu30Var;
        this.c = iybVar;
        this.d = mjVar;
        this.e = gw70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(i04 i04Var, Function0 function0, qim0 qim0Var, Function0 function1, int i) {
        super(2);
        this.a = (byte) 28;
        this.b = i04Var;
        this.c = function0;
        this.e = qim0Var;
        this.d = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(qw50 qw50Var, qim0 qim0Var, Function0 function0, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 11;
        this.b = qw50Var;
        this.e = qim0Var;
        this.c = function0;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(qim0 qim0Var, cr31 cr31Var, String str, String str2) {
        super(2);
        this.a = (byte) 8;
        this.e = qim0Var;
        this.d = cr31Var;
        this.b = str;
        this.c = str2;
    }
}
