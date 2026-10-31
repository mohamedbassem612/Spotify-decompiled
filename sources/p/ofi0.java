package p;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ofi0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(String str, z0e1 z0e1Var, q061 q061Var, boolean z, Function0 function0, int i) {
        super(2);
        this.a = (byte) 17;
        this.c = str;
        this.e = z0e1Var;
        this.f = q061Var;
        this.b = z;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        qim0 qim0Var;
        fim0 fim0Var;
        int i;
        boolean z;
        boolean z2;
        Object objN;
        Object obj3;
        Object obj4;
        b0k b0kVar;
        ti81 ti81Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z3 = this.b;
        Object obj5 = this.f;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.c;
        Object obj7 = this.d;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                vu30 vu30Var = (vu30) obj6;
                Function0 function0 = (Function0) obj7;
                Function0 function1 = (Function0) obj8;
                lfi0 lfi0Var = (lfi0) obj5;
                era eraVar = een.P0;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarY = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                float f = vu30Var == null ? 0.0f : 36.0f;
                int i2 = vu30Var == null ? 0 : 12;
                if (function0 != null) {
                    x340Var2.i0(-222350097);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objN = objT;
                        objN = ktd.n(x340Var2);
                    }
                    objN = objT;
                    qim0VarY = bin.y(qim0VarY, (idn0) objN, jtr.c, false, (String) null, new pm31(0), (String) null, function1, function0, 428);
                    qim0Var = qim0VarY;
                    x340Var2.r(false);
                } else {
                    qim0Var = qim0VarY;
                    x340Var2.i0(-222076708);
                    x340Var2.r(false);
                }
                qim0 qim0VarN = anm1.N("MDCMetadataArea", qim0VarY);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarN);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                fra fraVar = een.Z;
                d36 d36Var = new d36(8.0f, true, new g21(eraVar, (byte) 29));
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                boolean z4 = lfi0Var.r;
                String str = lfi0Var.h;
                qim0 qim0VarB = uyn1.B(uyn1.y(qim0VarF, 0.0f, (z4 || lfi0Var.o) ? 0.0f : 8.0f), 0.0f, 0.0f, f, 0.0f, 11);
                jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarB);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                String str2 = lfi0Var.a;
                if (str == null || ihc1.y0(str) || str2 == null || ihc1.y0(str2)) {
                    fim0Var = null;
                } else {
                    Set set = s4b1.f;
                    fim0Var = new fim0(str, uic.h(str2, new blc0[]{blc0.u1, blc0.A1, blc0.M1}) ? y37.c : a47.c);
                }
                if (fim0Var == null) {
                    x340Var2.i0(1671050506);
                    i = 0;
                    x340Var2.r(false);
                } else {
                    i = 0;
                    x340Var2.i0(1671050507);
                    fqo1.x(fim0Var, lfi0Var.c, lfi0Var.v, x340Var2, 0);
                    x340Var2.r(false);
                }
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, i);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, qim0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM4, x340Var2, lljVar2);
                x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE4, x340Var2, lljVar4);
                if (lfi0Var.s) {
                    x340Var2.i0(923455077);
                    z = false;
                    fqo1.o(x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    z = false;
                    x340Var2.i0(923506010);
                    x340Var2.r(false);
                }
                fqo1.r(lfi0Var, z3, x340Var2, z ? 1 : 0);
                if (lfi0Var.q) {
                    x340Var2.i0(923642007);
                    fqo1.p(lfi0Var, z3, x340Var2, z ? 1 : 0);
                    x340Var2.r(z);
                } else {
                    x340Var2.i0(923737146);
                    x340Var2.r(z);
                }
                boolean z5 = true;
                x340Var2.r(true);
                x340Var2.r(true);
                if (lfi0Var.l) {
                    x340Var2.i0(-92318498);
                    boolean z6 = !upo1.A(x340Var2);
                    x340Var2.r(z);
                    z5 = z6;
                } else {
                    x340Var2.i0(1433065267);
                    x340Var2.r(z);
                }
                if (z5) {
                    x340Var2.i0(-92316293);
                    if (vu30Var == null) {
                        x340Var2.i0(1433162214);
                        x340Var2.r(z);
                        z2 = true;
                    } else {
                        x340Var2.i0(1433162215);
                        d36 d36Var2 = new d36(0.0f, true, new um5((byte) 17));
                        int i3 = i2;
                        qim0 qim0VarC = eqr0.C(u291.A(h2c.a.b(qim0Var), een.f, true), i3, 10 - i3);
                        jw31 jw31VarA2 = ew31.a(d36Var2, fraVar, x340Var2, 0);
                        int iHashCode5 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM5 = x340Var2.m();
                        qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarC);
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(jw31VarA2, x340Var2, lljVar);
                        nko1.H(xos0VarM5, x340Var2, lljVar2);
                        x0d.q(iHashCode5, x340Var2, lljVar3, x340Var2);
                        nko1.H(qim0VarE5, x340Var2, lljVar4);
                        z = false;
                        z2 = true;
                        us71.k(0, vu30Var, x340Var2, true, false);
                    }
                    x340Var2.r(z);
                } else {
                    z2 = true;
                    x340Var2.i0(1433595936);
                    x340Var2.r(z);
                }
                x340Var2.r(z2);
                x340Var2.r(z2);
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    xpv0 xpv0Var = cbx.c(x340Var4).c;
                    bby bbyVarE = xay.e(2, xpv0.k());
                    xpv0 xpv0Var2 = cbx.c(x340Var4).c;
                    fq7.g(this.b, null, bbyVarE, xay.f(2, irn1.l0(pto1.q(1200, 2, 160.0f), 1200.0f, (Object) null, 4)), null, apo.r(1551718718, new c9y((dmk0) obj6, (fcf0) obj7, (kbf0) obj8, (ven0) obj5, (byte) 16), x340Var4), x340Var4, 196608, 18);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                t3k1.h((gin0) obj6, this.b, (d0r) obj7, (poj0) obj8, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ccs0 ccs0Var = (ccs0) obj8;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str3 = (String) obj6;
                    if (str3 == null) {
                        str3 = ccs0Var.a.c.b;
                    }
                    String str4 = str3;
                    String str5 = (String) obj5;
                    xbs0 xbs0VarH = ccs0Var.h();
                    c380 c380Var = xbs0VarH != null ? xbs0VarH.g : null;
                    Function0 function2 = (Function0) obj7;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    suo1.c(str4, this.b, str5, c380Var, function2, uyn1.B(qim0VarF2, 0.0f, 16.0f, 0.0f, 0.0f, 13), x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                xbs0 xbs0Var = (xbs0) obj8;
                String str6 = xbs0Var.a;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str7 = (String) obj7;
                    boolean zEquals = str7 != null ? str7.equals(str6) : false;
                    String str8 = xbs0Var.c;
                    String str9 = xbs0Var.d;
                    vu30 vu30Var2 = (vu30) ((dw91) obj5).get(new zbs0(str6));
                    vu30 vu30Var3 = (vu30) obj6;
                    qim0 qim0VarD = nim0.a;
                    if (z3) {
                        qim0VarD = i541.D(qim0VarD, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571);
                    }
                    bpo1.h(zEquals, str8, str9, vu30Var2, vu30Var3, qim0VarD, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                xk xkVar = (xk) obj8;
                m4c m4cVar = fkj0.X;
                v1t0 v1t0Var = (v1t0) obj7;
                z1t0 z1t0Var = (z1t0) obj6;
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else if (z3) {
                    x340Var10.i0(965098175);
                    int i4 = z1t0Var.b;
                    int i5 = z1t0Var.c;
                    boolean zI = x340Var10.i(v1t0Var);
                    Object objT2 = x340Var10.T();
                    if (zI || objT2 == m4cVar) {
                        obj3 = objT2;
                        s1t0 s1t0Var = new s1t0(v1t0Var, (byte) 0);
                        x340Var10.s0(s1t0Var);
                        obj3 = s1t0Var;
                    }
                    Function0 function3 = (Function0) obj3;
                    boolean zI2 = x340Var10.i(xkVar);
                    Object objT3 = x340Var10.T();
                    Object obj9 = objT3;
                    if (zI2 || objT3 == m4cVar) {
                        rwr0 rwr0Var = new rwr0(xkVar, (byte) 2);
                        x340Var10.s0(rwr0Var);
                        obj9 = rwr0Var;
                    }
                    eko1.m(i4, i5, (qim0) null, (sgr0) null, 0L, function3, (Function0) obj9, x340Var10, 0, 28);
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(965380616);
                    uwr uwrVar3 = cbx.a;
                    bzn1.e((qim0) null, (vu30) null, false, apo.r(808718518, new t1t0(z1t0Var, (byte) 0), x340Var10), new qgr0(((vex) zex.a.e).c), (ngr0) null, ezn1.n((es41) obj5, new tr80(0, 1, 1), x340Var10, 24576), (Function0) null, x340Var10, 2100224, 167);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                j6p1.f((kvu0) obj6, (String) obj7, this.b, (g6p1) obj8, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                String str10 = (String) obj6;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Function0 function4 = (Function0) obj7;
                    if (ihc1.y0(str10)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50(str10), function4);
                    boolean zH = x340Var12.h(z3);
                    Object objT4 = x340Var12.T();
                    if (zH || objT4 == m4cVar2) {
                        obj4 = objT4;
                        k750 k750Var = new k750((byte) 20, z3);
                        x340Var12.s0(k750Var);
                        obj4 = k750Var;
                    }
                    vu30 vu30Var4 = (vu30) obj4;
                    Object objT5 = x340Var12.T();
                    Object obj10 = objT5;
                    if (objT5 == m4cVar2) {
                        vbv0 vbv0Var = vbv0.d1;
                        x340Var12.s0(vbv0Var);
                        obj10 = vbv0Var;
                    }
                    hdx hdxVar = new hdx(0, vu30Var4, (vu30) obj10, (vu30) null, (hw61) null, 25);
                    qim0 qim0VarN2 = anm1.N("PersonalizedEpisodes.PresetPreviewButtonElement", nim0Var);
                    boolean zG = x340Var12.g(str10);
                    Object objT6 = x340Var12.T();
                    Object obj11 = objT6;
                    if (zG || objT6 == m4cVar2) {
                        zqu0 zqu0Var = new zqu0(str10, (byte) 12);
                        x340Var12.s0(zqu0Var);
                        obj11 = zqu0Var;
                    }
                    foo1.c(gbxVar, hdxVar, s161.b(qim0VarN2, false, (iu30) obj11), (max) null, (gdx) obj8, (vzq0) null, (idn0) null, (ga80) null, apo.r(1284887730, new k750((byte) 21, z3), x340Var12), (vu30) null, apo.r(49852289, new psr0((String) obj5, (byte) 22), x340Var12), x340Var12, 805306368, 48, 1496);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((phi0) obj6).f((lfi1) obj7, this.b, (iu30) obj8, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                bo01.b((co01) obj6, this.b, (yqg) obj7, (mmw0) obj8, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                z1p1.e((String) obj6, this.b, (Function0) obj7, (lex) obj8, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                eqr0.i((za51) obj6, this.b, (qim0) obj5, (Function0) obj7, (Function0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                iro1.i((List) obj6, (ws61) obj7, (iu30) obj8, (qim0) obj5, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                pt ptVar = (pt) obj5;
                b0k b0kVar2 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                ti81 ti81Var2 = (ti81) obj6;
                b0k b0kVar3 = (x340) b0kVar2;
                if (b0kVar3.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    if (ti81Var2.f && ti81Var2.j) {
                        b0kVar3.i0(823563349);
                        b0kVar = b0kVar3;
                        ti81Var = ti81Var2;
                        ptVar.l(ti81Var, (Function0) obj7, (Function0) obj8, b0kVar, 8);
                        b0kVar.r(false);
                    } else {
                        b0kVar = b0kVar3;
                        b0kVar.i0(823789029);
                        ti81Var = ti81Var2;
                        ptVar.r(ti81Var, (Function0) obj7, (Function0) obj8, b0kVar, 8);
                        b0kVar.r(false);
                    }
                    uwr uwrVar4 = cbx.a;
                    int iH = (int) jfv.h(cbx.c(b0kVar).b.b);
                    fq7.b(pbh.a, this.b, null, xay.d(irn1.o0(iH, 0, (dlv) null, 6), een.Z, 12), xay.l(12, irn1.o0(iH, 0, (dlv) null, 6)), null, apo.r(-346431145, new rt11((Object) ti81Var, (Object) ptVar, (byte) 26), b0kVar), b0kVar, 1572864, 18);
                } else {
                    b0kVar3.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                d1u.s((String) obj6, this.b, (qim0) obj8, (unb0) obj5, (Function0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                up30.f((atb1) obj6, (iu30) obj7, (qim0) obj8, this.b, (Integer) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwr uwrVar5 = cbx.a;
                    gfx.b(1, apo.r(999601536, new sr21(cbx.a(x340Var14).a.c, (az20) obj6, (sud1) obj7, (xud1) obj8, this.b, (iu30) obj5), x340Var14), x340Var14, 54);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                m6p1.m((String) obj6, (z0e1) obj8, (q061) obj5, this.b, (Function0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                lcc.v((dxo1) obj6, this.b, (Function0) obj7, (Function0) obj8, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                acf1.a((tnu0) obj6, (Function0) obj7, this.b, (lz20) obj8, this.f, (b0k) obj, czo1.p(3081));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                x760.n((yff1) obj6, (iu30) obj7, (qim0) obj8, (iu30) obj5, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                two1.d((Function0) obj7, (String) obj6, (qim0) obj8, this.b, (max) obj5, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                u0p1.h(this.b, (Function0) obj7, (Function0) obj8, (Function0) obj6, (qim0) obj5, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 23:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                boolean zY2 = x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2);
                j06 j06Var2 = x340Var16.a;
                if (zY2) {
                    qim0 qim0VarX = uyn1.x(u291.f((qim0) obj6, 1.0f), 8.0f);
                    Function0 function5 = (Function0) obj7;
                    Function0 function6 = (Function0) obj8;
                    j2i j2iVar = (j2i) obj5;
                    jw31 jw31VarA3 = ew31.a(h36.g, een.Z, x340Var16, 0);
                    int iHashCode6 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM6 = x340Var16.m();
                    qim0 qim0VarE6 = zr7.E(x340Var16, qim0VarX);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(jw31VarA3, x340Var16, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM6, x340Var16, lljVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf2, x340Var16, lljVar7);
                    nko1.F(x340Var16);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE6, x340Var16, lljVar8);
                    nim0 nim0Var2 = nim0.a;
                    o1p1.j(uyn1.B(nim0Var2, 4.0f, 8.0f, 0.0f, 0.0f, 12), x340Var16, 0);
                    jw31 jw31VarA4 = ew31.a(h36.a, een.N0, x340Var16, 0);
                    int iHashCode7 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM7 = x340Var16.m();
                    qim0 qim0VarE7 = zr7.E(x340Var16, nim0Var2);
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(jw31VarA4, x340Var16, lljVar5);
                    nko1.H(xos0VarM7, x340Var16, lljVar6);
                    x0d.q(iHashCode7, x340Var16, lljVar7, x340Var16);
                    nko1.H(qim0VarE7, x340Var16, lljVar8);
                    o1p1.m(0, function5, function6, x340Var16, (qim0) null, this.b);
                    uwr uwrVar6 = cbx.a;
                    mta mtaVar = cbx.b(x340Var16).d;
                    qim0 qim0VarR = u291.r(nim0Var2, 48.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode8 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM8 = x340Var16.m();
                    qim0 qim0VarE8 = zr7.E(x340Var16, qim0VarR);
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var16, lljVar5);
                    nko1.H(xos0VarM8, x340Var16, lljVar6);
                    x0d.q(iHashCode8, x340Var16, lljVar7, x340Var16);
                    nko1.H(qim0VarE8, x340Var16, lljVar8);
                    mta mtaVar2 = cbx.b(x340Var16).d;
                    t1c.a(dug.f(u291.r(nim0Var2, 32.0f), ((vex) zex.a.e).d, er31.a), x340Var16, 0);
                    k4s0.i(0, j2iVar, x340Var16, true, true);
                    x340Var16.r(true);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                qej1.e((zej1) obj7, this.b, (vu30) obj6, (iu30) obj8, (iu30) obj5, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 25:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    if (!((Boolean) ((ven0) obj6).getValue()).booleanValue()) {
                        qim0VarD2 = anm1.N("videoplayer_highlighted_foreground", zr7.i(qim0VarD2, rre1.R0));
                    }
                    uwr uwrVar7 = cbx.a;
                    qim0 qim0VarF3 = dug.f(qim0VarD2, cbx.a(x340Var18).a.c, d4o1.a);
                    uoa uoaVar = (uoa) obj7;
                    taj1 taj1Var = (taj1) obj8;
                    czs czsVar = (czs) obj5;
                    gfh0 gfh0VarC3 = t1c.c(een.h, false);
                    int iHashCode9 = Long.hashCode(x340Var18.T);
                    xos0 xos0VarM9 = x340Var18.m();
                    qim0 qim0VarE9 = zr7.E(x340Var18, qim0VarF3);
                    hzj.A.getClass();
                    if (x340Var18.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var18.m0();
                    if (x340Var18.S) {
                        x340Var18.l(n4kVar);
                    } else {
                        x340Var18.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var18, y580.O0);
                    nko1.H(xos0VarM9, x340Var18, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode9), x340Var18, y580.R0);
                    nko1.F(x340Var18);
                    nko1.H(qim0VarE9, x340Var18, y580.Y);
                    x3p1.i(uoaVar, lrj1.a[0] == 1 ? b3k1.d : b3k1.b, a4p1.k(taj1Var.e), this.b, czsVar, u291.d(nim0Var, 1.0f), x340Var18, 0);
                    x340Var18.r(true);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                zod.f((hqk1) obj6, this.b, (Function0) obj7, (Function0) obj8, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                mue1.r((b5m1) obj6, this.b, (quc0) obj8, (Function0) obj7, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofi0(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofi0(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(String str, Function0 function0, boolean z, gdx gdxVar, String str2) {
        super(2);
        this.a = (byte) 7;
        this.c = str;
        this.d = function0;
        this.b = z;
        this.e = gdxVar;
        this.f = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(String str, xbs0 xbs0Var, dw91 dw91Var, vu30 vu30Var, boolean z) {
        super(2);
        this.a = (byte) 4;
        this.d = str;
        this.e = xbs0Var;
        this.f = dw91Var;
        this.c = vu30Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(String str, ccs0 ccs0Var, boolean z, String str2, Function0 function0) {
        super(2);
        this.a = (byte) 3;
        this.c = str;
        this.e = ccs0Var;
        this.b = z;
        this.f = str2;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofi0(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(String str, boolean z, qim0 qim0Var, unb0 unb0Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 14;
        this.c = str;
        this.b = z;
        this.e = qim0Var;
        this.f = unb0Var;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(Function0 function0, String str, qim0 qim0Var, boolean z, max maxVar, int i) {
        super(2);
        this.a = (byte) 21;
        this.d = function0;
        this.c = str;
        this.e = qim0Var;
        this.b = z;
        this.f = maxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(az20 az20Var, sud1 sud1Var, xud1 xud1Var, boolean z, iu30 iu30Var) {
        super(2);
        this.a = (byte) 16;
        this.c = az20Var;
        this.d = sud1Var;
        this.e = xud1Var;
        this.b = z;
        this.f = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(vu30 vu30Var, Function0 function0, Function0 function1, lfi0 lfi0Var, boolean z) {
        super(2);
        this.a = (byte) 0;
        this.c = vu30Var;
        this.d = function0;
        this.e = function1;
        this.f = lfi0Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(qim0 qim0Var, cvx cvxVar, boolean z, Function0 function0, Function0 function1, j2i j2iVar) {
        super(2);
        this.a = (byte) 23;
        this.c = qim0Var;
        this.b = z;
        this.d = function0;
        this.e = function1;
        this.f = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(za51 za51Var, boolean z, qim0 qim0Var, Function0 function0, Function0 function1, int i) {
        super(2);
        this.a = (byte) 11;
        this.c = za51Var;
        this.b = z;
        this.f = qim0Var;
        this.d = function0;
        this.e = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(ti81 ti81Var, pt ptVar, Function0 function0, Function0 function1, boolean z) {
        super(2);
        this.a = (byte) 13;
        this.c = ti81Var;
        this.f = ptVar;
        this.d = function0;
        this.e = function1;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(atb1 atb1Var, iu30 iu30Var, qim0 qim0Var, boolean z, Integer num, int i) {
        super(2);
        this.a = (byte) 15;
        this.c = atb1Var;
        this.d = iu30Var;
        this.e = qim0Var;
        this.b = z;
        this.f = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(adj1 adj1Var, ven0 ven0Var, uoa uoaVar, taj1 taj1Var, boolean z, czs czsVar) {
        super(2);
        this.a = (byte) 25;
        this.c = ven0Var;
        this.d = uoaVar;
        this.e = taj1Var;
        this.b = z;
        this.f = czsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(zej1 zej1Var, boolean z, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, int i) {
        super(2);
        this.a = (byte) 24;
        this.d = zej1Var;
        this.b = z;
        this.c = vu30Var;
        this.e = iu30Var;
        this.f = iu30Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(b5m1 b5m1Var, boolean z, quc0 quc0Var, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 27;
        this.c = b5m1Var;
        this.b = z;
        this.e = quc0Var;
        this.d = function0;
        this.f = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofi0(boolean z, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofi0(boolean z, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 22;
        this.b = z;
        this.d = function0;
        this.e = function1;
        this.c = function2;
        this.f = qim0Var;
    }
}
