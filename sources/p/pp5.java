package p;

import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.Next;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pp5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp5(boolean z, boolean z2, Function0 function0, Function0 function1, psk pskVar, String str) {
        super(2);
        this.a = (byte) 3;
        this.b = pskVar;
        this.c = str;
    }

    private final Object a(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        lc7 lc7Var = (lc7) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            ub8 ub8Var = (ub8) lc7Var.i;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            ec8 ec8Var = (ec8) this.c;
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
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
            if (ub8Var.b != null) {
                x340Var2.i0(830209747);
                uwo1.e(ub8Var.b, (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var2, 0, 0, 1714);
                x340Var2.r(false);
            } else {
                x340Var2.i0(830452167);
                x340Var2.r(false);
            }
            if (ub8Var.e == null && ub8Var.d == null && ub8Var.c == null) {
                x340Var2.i0(830811271);
                x340Var2.r(false);
            } else {
                x340Var2.i0(830546035);
                aqo1.c(((d) lc7Var.a).g, lc7Var.g, apo.r(-247560364, new wf(ec8Var, ub8Var, (byte) 28), x340Var2), x340Var2, 384);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        String strK;
        xu30 xu30Var;
        xd7 vd7Var;
        xd7 vd7Var2;
        gs7 gs7Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        b7x b7xVar = b7x.a;
        pcr0 pcr0Var = pcr0.a;
        ocr0 ocr0Var = ocr0.a;
        jcr0 jcr0Var = jcr0.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                d1o1.a((qp5) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fra fraVar = een.N0;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    rz5 rz5Var = (rz5) obj3;
                    j2i j2iVar = (j2i) obj4;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    boolean z = rz5Var.b;
                    boolean z2 = rz5Var.g;
                    if (z) {
                        x340Var2.i0(-1681962333);
                        j2iVar.invoke(x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1681919088);
                        x340Var2.r(false);
                    }
                    if (z2) {
                        x340Var2.i0(-1681878571);
                        b3o1.a(x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1681821872);
                        x340Var2.r(false);
                    }
                    if (z2) {
                        i = 2131952389;
                    } else {
                        i = rz5Var.b() ? 2131952388 : 2131952382;
                    }
                    uwo1.e(cwl1.o0(x340Var2, i), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2046);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    cvx cvxVar3 = cbx.b(x340Var4).b;
                    cvx cvxVar4 = cbx.b(x340Var4).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                    l96 l96Var = (l96) obj3;
                    fa6 fa6Var = (fa6) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    jd6 jd6Var = l96Var.q;
                    Set set = s4b1.f;
                    String strS = uic.x(fa6Var.a.f).s();
                    i1o1.e(jd6Var, new l3o(strS != null ? strS : "", 1, true), (d0r) l96Var.p.getValue(), (qim0) null, (ipb1) null, s6i.a, (xu30) null, 0, (xu30) null, x340Var4, 196616, 236);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.i0(1718297579);
                    if (((psk) obj3) == psk.b) {
                        x340Var6.i0(1025261949);
                        x340Var6.r(false);
                        strK = (String) obj4;
                    } else {
                        strK = x0d.k(x340Var6, 1025262980, 2131952428, x340Var6, false);
                    }
                    String str = strK;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var6).h, cbx.a(x340Var6).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var6, 0, 0, 1698);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                o86 o86Var = (o86) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ldx ldxVar = ldx.c;
                    gdx gdxVarS = yla.s(x340Var8);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var8).b;
                    zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                    String strO0 = cwl1.o0(x340Var8, 2131952414);
                    boolean zI = x340Var8.i(o86Var) | x340Var8.g(iu30Var);
                    Object objT = x340Var8.T();
                    if (zI || objT == fkj0.X) {
                        objT = new nx2(o86Var, iu30Var);
                        x340Var8.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(strO0), function0), ldxVar, (qim0) null, (max) null, gdxVarS, zzq0Var, (idn0) null, (ga80) null, (vu30) null, (vu30) null, s6i.d, x340Var8, 0, 48, 1948);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                lb6 lb6Var = (lb6) obj3;
                return new sma1(new jpg0(lb6Var.b.a(new hyn(1, 1, 8, lb6Var.d.B(), false), (kko) ((tcr0) obj4).a(kcr0.a), new epb1((zob1) obj)), new tsm1(lb6Var, (byte) 24)), new rma1(2131165600, (Integer) null, 2131165600, 10));
            case 6:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ic6 ic6Var = (ic6) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ac6 ac6Var = (ac6) rwq.g(ic6Var.i, (Object) null, (o8n) null, x340Var10, 48, 2).getValue();
                    if (ac6Var == null) {
                        x340Var10.i0(-493054341);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-493054340);
                        yb6 yb6Var = (yb6) obj4;
                        kko kkoVarB = ic6Var.t.b();
                        rzo rzoVar = yb6Var.c;
                        gw70 gw70Var = yb6Var.d;
                        boolean zI2 = x340Var10.i(yb6Var);
                        Object objT2 = x340Var10.T();
                        if (zI2 || objT2 == fkj0.X) {
                            objT2 = new ve3((Object) yb6Var, (byte) 17);
                            x340Var10.s0(objT2);
                        }
                        l6o1.b(ac6Var, kkoVarB, rzoVar, gw70Var, (iu30) objT2, (qim0) null, x340Var10, 8);
                        x340Var10.r(false);
                    }
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                pd6.a((gj6) obj3, (yux) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zyq0 zyq0Var = (zyq0) obj3;
                    fho1.g(zyq0Var.a, zyq0Var.b, zyq0Var.c, (bhv) obj4, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                zm6.a((xm6) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                eko1.a((io6) obj3, (iu30) obj4, nim0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ilo1.b((kb6) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    otw.c(((sr6) obj3).c.a(), ((pr6) ((qr6) obj4)).a, (qim0) null, (ipb1) null, x340Var14, 0, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                qmo1.c((te6) obj3, (qim0) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 14:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                mx6 mx6Var = (mx6) obj4;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uvx uvxVar = new uvx(1, (pgx) null, 3, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
                    boolean zG = x340Var16.g(iu30Var2);
                    Object objT3 = x340Var16.T();
                    if (zG || objT3 == fkj0.X) {
                        objT3 = new ge3(iu30Var2, (byte) 19);
                        x340Var16.s0(objT3);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT3);
                    String str2 = mx6Var.d;
                    if (str2 == null) {
                        x340Var16.i0(1889265182);
                        x340Var16.r(false);
                        xu30Var = null;
                    } else {
                        x340Var16.i0(1889265183);
                        xu30 xu30VarR = apo.r(-150935399, new p3(str2, (byte) 19), x340Var16);
                        x340Var16.r(false);
                        xu30Var = xu30VarR;
                    }
                    jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, apo.r(333371197, new ox6(mx6Var, (byte) 0), x340Var16), (xu30) null, xu30Var, (xu30) null, (xu30) null, (xu30) null, apo.r(-1246837438, new ox6(mx6Var, (byte) 1), x340Var16), x340Var16, 805306432, 196608, 30140);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 15:
                d87 d87Var = (d87) obj4;
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                f87 f87Var = ((i87) obj3).a;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    otw.c(f87Var, d87Var, (qim0) null, wpb1.D(l1d.m("chip_", d87Var.a.e), f87Var, d87Var, x340Var18, 0), x340Var18, 0, 4);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 16:
                uc7 uc7Var = (uc7) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                Consumer consumer = (Consumer) obj4;
                he7 he7Var = (he7) obj3;
                em3 em3Var = (em3) he7Var.d;
                if (uc7Var instanceof qc7) {
                    hi90 hi90Var = ((qc7) uc7Var).a;
                    if (hi90Var instanceof vh90) {
                        vd7Var = new xd7((vh90) hi90Var);
                    } else if (hi90Var instanceof bh90) {
                        vd7Var = new td7((bh90) hi90Var);
                    } else if (hi90Var instanceof ch90) {
                        vd7Var = new ud7((ch90) hi90Var);
                    } else {
                        if (!(hi90Var instanceof oh90)) {
                            hhg1.g(hi90Var, "Assisted Curation Search Entity not found for item ");
                            return null;
                        }
                        vd7Var = new vd7((oh90) hi90Var);
                    }
                    consumer.accept(new rf7(em3Var.t(iIntValue10, hi90Var.getUri(), vd7Var.U0()), vd7Var));
                    return rih1Var;
                }
                if (uc7Var instanceof nc7) {
                    String str3 = (String) he7Var.f;
                    hi90 hi90Var2 = ((nc7) uc7Var).a;
                    consumer.accept(new jf7(hi90Var2, em3Var.q(iIntValue10, str3, hi90Var2.getUri())));
                } else if (uc7Var instanceof sc7) {
                    sc7 sc7Var = (sc7) uc7Var;
                    consumer.accept(new tf7(sc7Var.a, sc7Var.b, sc7Var.c, sc7Var.d, sc7Var.e, sc7Var.f, em3Var.v(iIntValue10, sc7Var.a)));
                } else if (uc7Var instanceof oc7) {
                    String str4 = ((oc7) uc7Var).a;
                    consumer.accept(new kf7(str4, em3Var.v(iIntValue10, str4)));
                } else if (uc7Var instanceof rc7) {
                    rc7 rc7Var = (rc7) uc7Var;
                    em3Var.u(iIntValue10, rc7Var.a);
                    consumer.accept(new sf7(rc7Var.b));
                } else if (uc7Var instanceof tc7) {
                    wd7 wd7Var = ((tc7) uc7Var).a;
                    i8h1 i8h1Var = (i8h1) em3Var.b;
                    x6h1 x6h1VarC = ((bqk0) em3Var.c).b.c();
                    x6h1VarC.i.add(new a7h1("result", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    Integer numValueOf = Integer.valueOf(iIntValue10);
                    String strH = td6.h(wd7Var.b);
                    x6h1 x6h1VarC2 = y6h1VarA.c();
                    x6h1VarC2.i.add(new a7h1("see_all_button", (String) null, numValueOf, (String) null, strH));
                    x6h1VarC2.j = false;
                    consumer.accept(new rf7(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", wd7Var.c)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a, wd7Var));
                } else if (!(uc7Var instanceof pc7)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 17:
                uc7 uc7Var2 = (uc7) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                Consumer consumer2 = (Consumer) obj4;
                mg7 mg7Var = (mg7) obj3;
                em3 em3Var2 = mg7Var.c;
                if (uc7Var2 instanceof qc7) {
                    hi90 hi90Var3 = ((qc7) uc7Var2).a;
                    if (hi90Var3 instanceof vh90) {
                        vd7Var2 = new xd7((vh90) hi90Var3);
                    } else if (hi90Var3 instanceof bh90) {
                        vd7Var2 = new td7((bh90) hi90Var3);
                    } else if (hi90Var3 instanceof ch90) {
                        vd7Var2 = new ud7((ch90) hi90Var3);
                    } else {
                        if (!(hi90Var3 instanceof oh90)) {
                            hhg1.g(hi90Var3, "Assisted Curation Search Entity not found for item ");
                            return null;
                        }
                        vd7Var2 = new vd7((oh90) hi90Var3);
                    }
                    consumer2.accept(new rf7(em3Var2.t(iIntValue11, hi90Var3.getUri(), vd7Var2.U0()), vd7Var2));
                    return rih1Var;
                }
                if (uc7Var2 instanceof nc7) {
                    String str5 = mg7Var.e;
                    hi90 hi90Var4 = ((nc7) uc7Var2).a;
                    consumer2.accept(new jf7(hi90Var4, em3Var2.q(iIntValue11, str5, hi90Var4.getUri())));
                } else if (uc7Var2 instanceof sc7) {
                    sc7 sc7Var2 = (sc7) uc7Var2;
                    consumer2.accept(new tf7(sc7Var2.a, sc7Var2.b, sc7Var2.c, sc7Var2.d, sc7Var2.e, sc7Var2.f, em3Var2.v(iIntValue11, sc7Var2.a)));
                } else if (uc7Var2 instanceof oc7) {
                    String str6 = ((oc7) uc7Var2).a;
                    consumer2.accept(new kf7(str6, em3Var2.v(iIntValue11, str6)));
                } else if (uc7Var2 instanceof rc7) {
                    rc7 rc7Var2 = (rc7) uc7Var2;
                    em3Var2.u(iIntValue11, rc7Var2.a);
                    consumer2.accept(new sf7(rc7Var2.b));
                } else if (uc7Var2 instanceof pc7) {
                    i8h1 i8h1Var2 = (i8h1) em3Var2.b;
                    x6h1 x6h1VarC3 = ((bqk0) em3Var2.c).b.c();
                    x6h1VarC3.i.add(new a7h1("result", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    Integer numValueOf2 = Integer.valueOf(iIntValue11);
                    x6h1 x6h1VarC4 = y6h1VarA2.c();
                    x6h1VarC4.i.add(new a7h1("clear_search_history_button", (String) null, numValueOf2, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_recent_searches", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    consumer2.accept(mf7.a);
                } else if (!(uc7Var2 instanceof tc7)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                vl7.a((ul7) obj3, (j2i) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ks7 ks7Var = (ks7) obj;
                cs7 cs7Var = (es7) obj2;
                String str7 = ks7Var.a;
                Long l = ks7Var.b;
                if (!(cs7Var instanceof cs7)) {
                    if (cs7Var.equals(bs7.a)) {
                        return Next.h(new ks7(str7, l, fs7.a));
                    }
                    if (cs7Var.equals(ds7.a)) {
                        return Next.i(new ks7(str7, l, hs7.a), Collections.singleton(new as7(new sr7(l, str7))));
                    }
                    eg.o();
                    return null;
                }
                cs7 cs7Var2 = cs7Var;
                js7 js7Var = cs7Var2.a;
                llg llgVar = cs7Var2.b;
                xid xidVar = (xid) obj3;
                vr51 vr51Var = (vr51) obj4;
                jo70 jo70Var = js7Var.a;
                io70 io70Var = jo70Var.e;
                xkk1 xkk1Var = js7Var.b;
                if (llgVar != null) {
                    long jLongValue = l != null ? l.longValue() : llgVar.d;
                    wkk1 wkk1VarP = ucp1.p(xkk1Var);
                    String str8 = io70Var != null ? io70Var.a : null;
                    String str9 = str8 == null ? "" : str8;
                    String str10 = wkk1VarP.b;
                    gs7Var = new gs7(new jlw0(str10 != null ? str10 : "", str9), wkk1VarP.d, llgVar.b, str9, xidVar.n(llgVar, jLongValue, false, jo70Var.b));
                } else {
                    Set set2 = s4b1.f;
                    if (uic.g(str7, blc0.fh)) {
                        wkk1 wkk1VarP2 = ucp1.p(xkk1Var);
                        String str11 = jo70Var.a;
                        String str12 = wkk1VarP2.b;
                        jlw0 jlw0Var = new jlw0(str12 != null ? str12 : "", str11);
                        int i2 = wkk1VarP2.d;
                        String strA = m0p1.A(jo70Var);
                        String str13 = jo70Var.b;
                        gs7Var = new gs7(jlw0Var, i2, str11, strA, l != null ? xidVar.n(null, l.longValue(), false, str13) : zr7.l(str13, zr7.m(js7Var), vr51Var));
                    } else {
                        wkk1 wkk1VarP3 = ucp1.p(xkk1Var);
                        String str14 = io70Var != null ? io70Var.a : null;
                        String str15 = str14 == null ? "" : str14;
                        String str16 = wkk1VarP3.b;
                        jlw0 jlw0Var2 = new jlw0(str16 != null ? str16 : "", str15);
                        int i3 = wkk1VarP3.d;
                        String str17 = jo70Var.a;
                        String str18 = jo70Var.b;
                        gs7Var = new gs7(jlw0Var2, i3, str17, str15, l != null ? xidVar.n(null, l.longValue(), false, str18) : zr7.l(str18, zr7.m(js7Var), vr51Var));
                    }
                }
                return Next.h(new ks7(str7, l, gs7Var));
            case 20:
                ((Number) obj2).intValue();
                pto1.c((tx7) obj3, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ouo1.a((ija) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                x340 x340Var19 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwo1.e(((o88) obj3).a.a, d9y0.k(nim0Var, ((Number) ((tob1) obj4).getValue()).floatValue()), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var20, 0, 0, 2044);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 23:
                return new jpg0((rt01) ((uu0) obj3).h, new wk3((String) obj4, (byte) 20));
            case 24:
                ra8 ra8Var = (ra8) obj3;
                tcr0 tcr0Var = (tcr0) obj4;
                return new jpg0(ra8Var.a.a(new epb1((zob1) obj), ra8Var.e, (zob1) tcr0Var.a(jcr0Var), (zrt0) tcr0Var.a(ocr0Var), (btt0) tcr0Var.a(pcr0Var), new oa8(tcr0Var, (byte) 0), new pa8(ra8Var, tcr0Var, (byte) 0), new pa8(ra8Var, tcr0Var, (byte) 1)), w08.X0);
            case 25:
                lb8 lb8Var = (lb8) obj3;
                tcr0 tcr0Var2 = (tcr0) obj4;
                return new jpg0(f6o1.A(new qj0(lb8Var.a.a(new epb1((zob1) obj), lb8Var.e, (zob1) tcr0Var2.a(jcr0Var), (zrt0) tcr0Var2.a(ocr0Var), (btt0) tcr0Var2.a(pcr0Var), new oa8(tcr0Var2, (byte) 1), new kb8(lb8Var, tcr0Var2, (byte) 0), new kb8(lb8Var, tcr0Var2, (byte) 1)), lb8Var.g), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new wk3(lb8Var.h.getString(2131954712), (byte) 21));
            case 26:
                x340 x340Var21 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    otw.c((fqg0) obj3, new sa8(((ib8) obj4).a), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 27:
                return a(obj, obj2);
            case 28:
                return new jpg0(f6o1.A(new ldo((kc8) ((pc8) obj3).b, (ve51) obj4), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), db8.e1);
            default:
                x340 x340Var23 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                String str19 = (String) obj4;
                x340 x340Var24 = x340Var23;
                if (!x340Var24.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x340Var24.b0();
                } else if (str19 != null) {
                    x340Var24.i0(1863065110);
                    otw.c((maa) obj3, new j861(str19), (qim0) null, (ipb1) null, x340Var24, 0, 12);
                    x340Var24.r(false);
                } else {
                    x340Var24.i0(1863202533);
                    x340Var24.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp5(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp5(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
