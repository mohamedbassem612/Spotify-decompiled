package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xo7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo7(v370 v370Var, int i, wgh1 wgh1Var, ven0 ven0Var) {
        super(3);
        this.a = (byte) 6;
        this.c = v370Var;
        this.b = i;
        this.e = wgh1Var;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        w281 w281Var;
        u281 u281Var;
        Object obj4;
        byte b = this.a;
        String strA = null;
        int i = this.b;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.c;
        Object obj6 = this.d;
        Object obj7 = this.e;
        int i2 = 0;
        switch (b) {
            case 0:
                ew20 ew20Var = (ew20) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                xu30 xu30Var = (xu30) obj7;
                fra fraVar = een.N0;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(ew20Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if (i != 0) {
                        x340Var2.i0(982433296);
                        kqn1.d(i, 0, 0, x340Var2, ew20Var.e(nim0Var, fraVar));
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(982604354);
                        x340Var2.r(false);
                    }
                    if (((Float) obj5) != null) {
                        x340Var2.i0(982647537);
                        ysx ysxVar = ysx.c;
                        jsl jslVar = new jsl(cwl1.o0(x340Var2, 2131952611));
                        qim0 qim0VarE = ew20Var.e(anm1.N("audio_book_row_star_icon", u291.r(nim0Var, 10.0f)), fraVar);
                        uwr uwrVar = cbx.a;
                        w0h1.a(ysxVar, jslVar, qim0VarE, cbx.a(x340Var2).b.a, 0L, false, x340Var2, ysx.d, 48);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(983063650);
                        x340Var2.r(false);
                    }
                    String strY0 = o7h.y0((Iterable) ((ven0) obj6).getValue(), " • ", (String) null, (String) null, (iu30) null, 62);
                    qim0 qim0VarE2 = ew20Var.e(nim0Var, fraVar);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strY0, qim0VarE2, cbx.d(x340Var2).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2040);
                    if (xu30Var != null) {
                        x340Var2.i0(983310410);
                        qim0 qim0VarN = anm1.N("audio_book_row_play_progress", ew20Var.e(nim0Var, fraVar));
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarN);
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
                        nko1.H(gfh0VarC, x340Var2, y580.O0);
                        nko1.H(xos0VarM, x340Var2, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                        nko1.F(x340Var2);
                        nko1.H(qim0VarE3, x340Var2, y580.Y);
                        hrt.k(6, xu30Var, h2c.a, x340Var2, true);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(983487234);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qim0 qim0VarH = pqo.h(nim0Var, !(i == 1));
                    den denVar = (den) obj5;
                    if (denVar != null && (str = denVar.b) != null) {
                        strA = str;
                    } else if (denVar != null) {
                        strA = denVar.a;
                    } else {
                        va81 va81Var = (va81) obj6;
                        if (va81Var != null) {
                            strA = va81Var.g.a(zdn.b);
                        }
                    }
                    ((fp7) obj7).e(0, strA, x340Var4, qim0VarH);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qim0 qim0VarH2 = pqo.h(nim0Var, !(i == 1));
                    if (((va81) obj5) != null && (w281Var = (w281) obj7) != null && (u281Var = w281Var.g) != null) {
                        strA = u281Var.a;
                    }
                    ((fp7) obj6).f(0, strA, x340Var6, qim0VarH2);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    int i3 = ((dob1) obj5).d;
                    zc8 zc8Var = (zc8) obj6;
                    strA = zc8Var != null ? zc8Var.b : null;
                    if (strA == null) {
                        strA = "";
                    }
                    ((fp7) obj7).j(i3, 0, strA, x340Var8, pqo.h(nim0Var, !(i == 1)));
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                c380 c380Var = (c380) obj6;
                iu30 iu30Var = (iu30) obj7;
                for (Object obj8 : ((x5k) obj5).b) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    p5k p5kVar = (p5k) obj8;
                    sqe.a(p5kVar, i + i2, c380Var.contains(p5kVar), iu30Var, b0kVar, 0);
                    i2 = i4;
                }
                return rih1Var;
            case 5:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    suo1.l((w370) obj5, this.b, (wgh1) obj6, (dh30) obj7, j9k1.x(u291.f(nim0Var, 1.0f), new ac8(3, (byte) 15)), x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                ven0 ven0Var = (ven0) obj6;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    v370 v370Var = (v370) obj5;
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    wgh1 wgh1Var = (wgh1) obj7;
                    Object objT = x340Var12.T();
                    if (objT == fkj0.X) {
                        obj4 = objT;
                        c470 c470Var = new c470(ven0Var, (byte) 0);
                        x340Var12.s0(c470Var);
                        obj4 = c470Var;
                    }
                    obj4 = objT;
                    suo1.k(v370Var, this.b, zBooleanValue, wgh1Var, (Function0) obj4, (qim0) null, x340Var12, 24576);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            default:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                rwj rwjVar = (rwj) obj7;
                c380 c380Var2 = (c380) obj6;
                m4c m4cVar = fkj0.X;
                z4p1.k(2131961060, 0, x340Var13, anm1.N("listening-parties-section-title", nim0Var));
                ksk0 ksk0Var = (ksk0) obj5;
                x340 x340Var14 = x340Var13;
                boolean zI = x340Var14.i(ksk0Var) | x340Var14.e(i);
                Object objT2 = x340Var14.T();
                Object obj9 = objT2;
                if (zI || objT2 == m4cVar) {
                    ym ymVar = new ym(ksk0Var, i, (byte) 22);
                    x340Var14.s0(ymVar);
                    obj9 = ymVar;
                }
                h3h1 h3h1Var = new h3h1((iu30) obj9);
                qim0 qim0VarN2 = anm1.N("listening-parties-carousel", u291.f(nim0Var, 1.0f));
                uwr uwrVar3 = cbx.a;
                cvx cvxVar = cbx.b(x340Var14).b;
                qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarN2);
                boolean zI2 = x340Var14.i(c380Var2) | x340Var14.i(rwjVar);
                Object objT3 = x340Var14.T();
                Object obj10 = objT3;
                if (zI2 || objT3 == m4cVar) {
                    nt01 nt01Var = new nt01(c380Var2, rwjVar, (byte) 11);
                    x340Var14.s0(nt01Var);
                    obj10 = nt01Var;
                }
                s3o1.e(qim0VarZ, (xtb0) null, (vzq0) null, (c36) null, (pl3) null, (iq20) null, h3h1Var, (iu30) obj10, x340Var14, 0, 126);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xo7(Object obj, int i, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xo7(int i, Object obj, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo7(dob1 dob1Var, zc8 zc8Var, int i, fp7 fp7Var) {
        super(3);
        this.a = (byte) 3;
        this.c = dob1Var;
        this.d = zc8Var;
        this.b = i;
        this.e = fp7Var;
    }
}
