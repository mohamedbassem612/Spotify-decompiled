package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class swc extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swc(wre wreVar, kre kreVar, iu30 iu30Var, tob1 tob1Var) {
        super(2);
        this.a = (byte) 7;
        this.b = wreVar;
        this.c = iu30Var;
        this.d = tob1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        vu30 vu30Var;
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qgo1.f(omo1.q((vnr0) ((vu30) obj5).invoke(x340Var2, 0), (lee1) obj4, (lee1) obj3, x340Var2), null, null, 0, false, null, x340Var2, 8, 62);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVar = (x5d) obj5;
                    pt ptVar = (pt) obj4;
                    ayh ayhVar = (ayh) ptVar.i;
                    tym0 tym0Var = (tym0) ptVar.f;
                    lk31 lk31Var = (lk31) ptVar.g;
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new c5a(iu30Var, (byte) 14);
                        x340Var4.s0(objT);
                    }
                    irn1.f(x5dVar, ayhVar, tym0Var, lk31Var, null, (iu30) objT, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                j6d j6dVar = (j6d) obj5;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI = x340Var6.i(j6dVar);
                    Object objT2 = x340Var6.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new ptb(j6dVar, (byte) 12);
                        x340Var6.s0(objT2);
                    }
                    scx scxVar = (scx) obj4;
                    x74.f((Function0) objT2, scxVar, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(1042355979, new ef8((iu30) obj3, scxVar, (byte) 11), x340Var6), x340Var6, 12582912, 48, 1916);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    san0 san0Var = (san0) obj5;
                    i1o1.e(san0Var, new gey0((String) obj4), (d0r) obj3, null, null, apo.r(-1358136090, new b7e(san0Var), x340Var8), null, 0, abi.a, x340Var8, 100859904, 108);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                eio1.c((h7e) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ujo1.c((es41) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                rqe rqeVar = (rqe) obj5;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fq2 fq2Var = rqeVar.a;
                    mr4 mr4Var = rqeVar.Y;
                    ven0 ven0VarH = rwq.h(fq2Var.u, x340Var10, 0);
                    fq2 fq2Var2 = fq2Var;
                    ven0 ven0VarH2 = rwq.h(fq2Var2.w, x340Var10, 0);
                    ven0 ven0VarH3 = rwq.h(fq2Var2.A, x340Var10, 0);
                    ppe ppeVarA = (ppe) obj4;
                    boolean zBooleanValue = ((Boolean) ven0VarH2.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) ven0VarH3.getValue()).booleanValue();
                    jre jreVar = ppeVarA.a;
                    hre hreVar = jreVar instanceof hre ? (hre) jreVar : null;
                    if (zBooleanValue && hreVar != null && !zBooleanValue2 && !hreVar.d) {
                        ppeVarA = ppe.a(ppeVarA, new ire(null), 30);
                    }
                    ppe ppeVar = ppeVarA;
                    g9m g9mVar = rqeVar.d;
                    lz71 lz71Var = rqeVar.e;
                    nu nuVar = rqeVar.f;
                    String str = (String) ven0VarH.getValue();
                    yo2 yo2Var = rqeVar.a;
                    boolean zI2 = x340Var10.i(yo2Var);
                    Object objT3 = x340Var10.T();
                    if (zI2 || objT3 == fkj0.X) {
                        objT3 = new qka(1, yo2Var, yo2.class, "updateDraftText", "updateDraftText(Ljava/lang/String;)V", 0, (byte) 19);
                        x340Var10.s0(objT3);
                    }
                    boolean zBooleanValue3 = ((Boolean) ven0VarH3.getValue()).booleanValue();
                    kvp kvpVar = rqeVar.g;
                    w9u0 w9u0Var = rqeVar.h;
                    mpa1 mpa1Var = rqeVar.i;
                    g38 g38Var = rqeVar.t;
                    fq2Var2.n();
                    boolean zL = mr4Var.l();
                    boolean zB = rqeVar.Z.b(6);
                    boolean zO = mr4Var.o();
                    boolean zM = mr4Var.m();
                    boolean zX = mr4Var.x();
                    mv2 mv2Var = fq2Var2.p;
                    poo1.c(ppeVar, g9mVar, lz71Var, nuVar, (iu30) obj3, str, (nla0) objT3, zBooleanValue3, kvpVar, w9u0Var, mpa1Var, g38Var, zL, zB, zO, zM, zX, null, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                wre wreVar = (wre) obj5;
                m4c m4cVar = fkj0.X;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    d4f d4fVar = wreVar.e;
                    x340Var12.i0(-930828877);
                    iu30 iu30Var2 = (iu30) obj4;
                    tob1 tob1Var = (tob1) obj3;
                    boolean zE = kre.e(wreVar);
                    boolean zG2 = x340Var12.g(iu30Var2);
                    Object objT4 = x340Var12.T();
                    if (zG2 || objT4 == m4cVar) {
                        objT4 = new gob(iu30Var2, (byte) 15);
                        x340Var12.s0(objT4);
                    }
                    Function0 function0 = (Function0) objT4;
                    boolean zG3 = x340Var12.g(iu30Var2);
                    Object objT5 = x340Var12.T();
                    if (zG3 || objT5 == m4cVar) {
                        objT5 = new gob(iu30Var2, (byte) 16);
                        x340Var12.s0(objT5);
                    }
                    Function0 function1 = (Function0) objT5;
                    boolean zG4 = x340Var12.g(iu30Var2);
                    Object objT6 = x340Var12.T();
                    if (zG4 || objT6 == m4cVar) {
                        objT6 = new gob(iu30Var2, (byte) 17);
                        x340Var12.s0(objT6);
                    }
                    Function0 function2 = (Function0) objT6;
                    boolean zG5 = x340Var12.g(iu30Var2);
                    Object objT7 = x340Var12.T();
                    if (zG5 || objT7 == m4cVar) {
                        objT7 = new gob(iu30Var2, (byte) 18);
                        x340Var12.s0(objT7);
                    }
                    Function0 function3 = (Function0) objT7;
                    sno snoVar = (sno) tob1Var.getValue();
                    String str2 = snoVar != null ? snoVar.a : null;
                    sno snoVar2 = (sno) tob1Var.getValue();
                    fqo1.b(d4fVar, zE, function0, function1, function2, null, function3, str2, snoVar2 != null ? snoVar2.b : null, x340Var12, 0);
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                vzq0 vzq0Var = (vzq0) obj5;
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                boolean zY = x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                j06 j06Var = x340Var14.a;
                if (zY) {
                    float fD = vzq0Var.d();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, fD, 0.0f, 0.0f, 13);
                    epo1 epo1Var = (epo1) obj4;
                    cp31 cp31Var = (cp31) obj3;
                    rwj rwjVar = (rwj) cp31Var.f;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var14, 0);
                    int iHashCode = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM = x340Var14.m();
                    qim0 qim0VarE = zr7.E(x340Var14, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    boolean z2 = x340Var14.S;
                    n4k n4kVar = hmb0.t1;
                    if (z2) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var14, lljVar);
                    vu30 vu30Var2 = y580.N0;
                    nko1.H(xos0VarM, x340Var14, vu30Var2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar2 = y580.R0;
                    nko1.H(numValueOf, x340Var14, lljVar2);
                    nko1.F(x340Var14);
                    llj lljVar3 = y580.Y;
                    nko1.H(qim0VarE, x340Var14, lljVar3);
                    if (epo1Var instanceof ove) {
                        x340Var14.i0(-350049834);
                        ove oveVar = (ove) epo1Var;
                        vu30Var = vu30Var2;
                        otw.c((qj0) cp31Var.d, new bvo(oveVar.c, (String) cp31Var.b, (String) cp31Var.a, oveVar.g, oveVar.d), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                        z = false;
                        x340Var14.r(false);
                    } else {
                        vu30Var = vu30Var2;
                        if (!(epo1Var instanceof pve)) {
                            throw p3d1.k(x340Var14, -350051260, false);
                        }
                        x340Var14.i0(-350034685);
                        yxb0 yxb0Var = (yxb0) cp31Var.e;
                        pve pveVar = (pve) epo1Var;
                        otw.c(yxb0Var, new ti50(pveVar.c, pveVar.f, pveVar.d, pveVar.g, pveVar.e), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                        z = false;
                        x340Var14.r(false);
                    }
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var14).b;
                    qim0 qim0VarX = uyn1.x(nim0Var, 8.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, z);
                    int iHashCode2 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM2 = x340Var14.m();
                    qim0 qim0VarE2 = zr7.E(x340Var14, qim0VarX);
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(gfh0VarC, x340Var14, lljVar);
                    nko1.H(xos0VarM2, x340Var14, vu30Var);
                    x0d.q(iHashCode2, x340Var14, lljVar2, x340Var14);
                    nko1.H(qim0VarE2, x340Var14, lljVar3);
                    ypf ypfVar = new ypf(epo1Var.E(), epo1Var.F(), vzq0Var, epo1Var.G());
                    otw.c(rwjVar, ypfVar, (qim0) null, wpb1.C("ChatSharesPaginatedContainerElement", rwjVar, ypfVar, x340Var14, 6, 8), x340Var14, 0, 4);
                    x340Var14.r(true);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                upo1.b((dtf) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                mqo1.c((w4i1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                oto1.a((fjf) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                sto1.b((pto1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                yto1.m((tkf) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                uwo1.a((w4i1) obj5, (uu2) obj4, (l2a) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                wxo1.d((o220) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                gyo1.b((Function0) obj5, (y7e1) obj4, (y7e1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                nyo1.d((p220) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                w4g w4gVar = (w4g) obj5;
                iu30 iu30Var3 = (iu30) obj4;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ArrayList arrayList = w4gVar.a;
                    z4g z4gVar = w4gVar.c;
                    String str3 = w4gVar.b;
                    boolean z3 = !(z4gVar instanceof x4g);
                    boolean zG6 = x340Var16.g(iu30Var3);
                    Object objT8 = x340Var16.T();
                    if (zG6 || objT8 == m4cVar2) {
                        objT8 = new wqf(iu30Var3, (byte) 1);
                        x340Var16.s0(objT8);
                    }
                    iu30 iu30Var4 = (iu30) objT8;
                    boolean zG7 = x340Var16.g(iu30Var3);
                    Object objT9 = x340Var16.T();
                    if (zG7 || objT9 == m4cVar2) {
                        objT9 = new frf(iu30Var3, (byte) 17);
                        x340Var16.s0(objT9);
                    }
                    qyo1.f(arrayList, str3, z3, iu30Var4, (Function0) objT9, null, x340Var16, 0);
                    if (z4gVar instanceof z4g) {
                        x340Var16.i0(1990042261);
                        otw.c((u6x) ((br0) obj3).d, z4gVar.a, (qim0) null, (ipb1) null, x340Var16, 8, 12);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(1990135478);
                        x340Var16.r(false);
                    }
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                vyo1.t((String) obj5, (String) obj4, (sag) obj3, (b0k) obj, czo1.p(433));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                o1p1.g((y7e1) obj5, (pz20) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((jzg) obj5).a((t6p0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                c4p1.i((llw0) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 23:
                ((iu30) obj5).invoke(new nd11((List) obj, (String) obj2));
                ((tbr0) obj4).a(new y231(new q7d1(((od11) obj3).b)));
                return rih1Var;
            case 24:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    v3h1 v3h1Var = (v3h1) ((tob1) obj5).getValue();
                    if (v3h1Var == null) {
                        x340Var18.i0(2074116788);
                    } else {
                        x340Var18.i0(2074116789);
                        z0o1.d(v3h1Var, (qxl) obj4, (dp5) obj3, x340Var18, 0);
                    }
                    x340Var18.r(false);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                ((ttj) obj5).a((qxl) obj4, (dp5) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    Object value = ((tob1) obj5).getValue();
                    if (value == null) {
                        x340Var20.i0(246052353);
                    } else {
                        x340Var20.i0(246052354);
                        ((euj) obj4).y(value, (iu30) ((tob1) obj3).getValue(), x340Var20);
                    }
                    x340Var20.r(false);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                hvl1 hvl1Var = (hvl1) obj5;
                x340 x340Var22 = x340Var21;
                if (!x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x340Var22.b0();
                } else if (u890.j(hvl1Var.e, fvl1.a)) {
                    x340Var22.i0(248214034);
                    nyx.a(2, (wux) null, apo.r(-1322095723, new boj(hvl1Var, (byte) 7), x340Var22), x340Var22, 3078, 6);
                    x340Var22.r(false);
                } else {
                    x340Var22.i0(248504938);
                    luj lujVar = (luj) obj4;
                    lzn0 lzn0Var = (lzn0) obj3;
                    Object objT10 = x340Var22.T();
                    if (objT10 == fkj0.X) {
                        w460 w460Var = new w460(lzn0Var, lujVar.c, hvl1Var.f, false, (a1r0) null, 56);
                        x340Var22.s0(w460Var);
                        objT10 = w460Var;
                    }
                    otw.c((w460) objT10, tho1.v(hvl1Var), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                    x340Var22.r(false);
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ((txj) obj5).a(czo1.p(49), (j2i) obj3, (b0k) obj, (qim0) obj4);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                lzj.a((String) obj5, (rgn0) obj4, (sfn0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swc(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swc(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
