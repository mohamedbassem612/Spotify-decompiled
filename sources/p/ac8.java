package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ac8 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac8() {
        super(3);
        this.a = (byte) 14;
    }

    /* JADX WARN: Code duplicated, block: B:200:0x05a0  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w281 w281Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    w0h1.a(ysx.c, isl.a, u291.r(uyn1.B(nim0.a, 0.0f, 0.0f, 4.0f, 0.0f, 11), 12.0f), 0L, 0L, false, x340Var2, ysx.d | 48, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ifh0 ifh0Var = (ifh0) obj;
                q5t0 q5t0VarH = ((afh0) obj2).H(hjl.b(((hjl) obj3).a, 0, 0, 0, Integer.MAX_VALUE, 3));
                int iMin = Math.min(q5t0VarH.b, ifh0Var.i0(32.0f));
                return ifh0Var.S(q5t0VarH.a, iMin, b7xVar, new wb5(q5t0VarH, iMin, (byte) 4));
            case 2:
                ((Number) obj3).intValue();
                ijo1.m(new p3v(24.0f), 24.0f, 0.0f, (b0k) obj2, 0, 4);
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                ijo1.m(new p3v(24.0f), 24.0f, 0.0f, (b0k) obj2, 0, 4);
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                ijo1.m(new p3v(24.0f), 24.0f, 0.0f, (b0k) obj2, 0, 4);
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.i0(1379238378);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, nim0Var);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(hmb0.t1);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    t1c.a(dug.f(qim0VarD, cbx.a(x340Var6).a.b.a(), er31.a), x340Var6, 0);
                    w0h1.a(rnx.c, isl.a, (qim0) null, cbx.a(x340Var6).b.b, 0L, false, x340Var6, rnx.d | 48, 52);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                b7w b7wVar = (b7w) obj;
                d7w d7wVar = (f7w) obj2;
                d7w d7wVar2 = d7wVar instanceof d7w ? d7wVar : null;
                if (d7wVar2 != null) {
                    return hw2.i(d7wVar2, b7wVar).a(d7wVar2.a);
                }
                return null;
            case 8:
                ifh0 ifh0Var2 = (ifh0) obj;
                long j = ((hjl) obj3).a;
                int iI0 = ifh0Var2.i0(16.0f);
                q5t0 q5t0VarH2 = ((afh0) obj2).H(hjl.b(j, 0, (iI0 * 2) + hjl.i(j), 0, 0, 13));
                return ifh0Var2.S(hjl.i(j), q5t0VarH2.b, b7xVar, new wb5(q5t0VarH2, iI0, (byte) 8));
            case 9:
                ifh0 ifh0Var3 = (ifh0) obj;
                long j2 = ((hjl) obj3).a;
                int iI1 = ifh0Var3.i0(16.0f);
                q5t0 q5t0VarH3 = ((afh0) obj2).H(hjl.b(j2, 0, (iI1 * 2) + hjl.i(j2), 0, 0, 13));
                return ifh0Var3.S(hjl.i(j2), q5t0VarH3.b, b7xVar, new wb5(q5t0VarH3, iI1, (byte) 9));
            case 10:
                a210 a210Var = (a210) obj;
                u110 u110Var = (u110) obj2;
                v110 v110Var = (v110) obj3;
                k1r k1rVar = u110Var.c;
                k1r k1rVar2 = u110Var.a;
                yst0 yst0Var = yst0.d;
                k1r k1rVar3 = a210Var.b;
                k1r k1rVar4 = a210Var.a;
                k1r k1rVar5 = a210Var.e;
                if (!(k1rVar3 instanceof j1r)) {
                    iam iamVar = (iam) u890.G(k1rVar3);
                    if (iamVar == null) {
                        return new w110(zy00.t);
                    }
                    if (iamVar.a == 8) {
                        k1r k1rVar6 = a210Var.c;
                        k1r k1rVar7 = a210Var.d;
                        if (!(k1rVar6 instanceof j1r) && !(k1rVar7 instanceof j1r)) {
                            zoy0 zoy0Var = (zoy0) u890.G(k1rVar6);
                            if (zoy0Var == null || !l4o1.R(zoy0Var) || ((w281Var = (w281) u890.G(k1rVar7)) != null && w281Var.c)) {
                                if (!(k1rVar2 instanceof j1r) && !(k1rVar instanceof j1r)) {
                                    k1r k1rVar8 = a210Var.f;
                                    zoy0 zoy0Var2 = (zoy0) u890.G(k1rVar6);
                                    if (zoy0Var2 != null && l4o1.R(zoy0Var2)) {
                                        if (u890.G(k1rVar2) == null) {
                                        }
                                        if (zoy0Var2 == null) {
                                        }
                                    }
                                    if (!(k1rVar5 instanceof j1r)) {
                                        att0 att0Var = (att0) u890.G(k1rVar5);
                                        if (u890.j(att0Var != null ? att0Var.b : null, yst0Var)) {
                                            if (!(k1rVar8 instanceof j1r)) {
                                                ma8 ma8Var = (ma8) u890.G(k1rVar8);
                                                return u890.j(ma8Var != null ? ma8Var.b : null, la8.b) ? new w110(new gi00(ma8Var, (byte) 5)) : new w110(zy00.Y);
                                            }
                                        } else if (u890.G(k1rVar2) == null || !(k1rVar4 instanceof j1r)) {
                                            return (zoy0Var2 == null && l4o1.R(zoy0Var2)) ? f210.b(new s481(zoy0Var2, (va81) u890.G(k1rVar4)), iamVar, a210Var, u110Var, v110Var) : f210.c(iamVar, a210Var, u110Var, v110Var);
                                        }
                                    }
                                }
                            } else if (!(k1rVar2 instanceof j1r) && !(k1rVar instanceof j1r) && !(u110Var.d instanceof j1r)) {
                                return f210.b(new s481(zoy0Var, (va81) u890.G(k1rVar4)), iamVar, a210Var, u110Var, v110Var);
                            }
                        }
                    } else if (!(k1rVar5 instanceof j1r) && !(k1rVar2 instanceof j1r) && !(u110Var.b instanceof j1r)) {
                        att0 att0Var2 = (att0) u890.G(k1rVar5);
                        if (u890.j(att0Var2 != null ? att0Var2.b : null, yst0Var)) {
                            return new w110(zy00.X);
                        }
                        if (!(k1rVar4 instanceof j1r)) {
                            return f210.c(iamVar, a210Var, u110Var, v110Var);
                        }
                    }
                }
                return y110.a;
            case 11:
                ifh0 ifh0Var4 = (ifh0) obj;
                q5t0 q5t0VarH4 = ((afh0) obj2).H(((hjl) obj3).a);
                int iP = yoi1.p(ifh0Var4.i0(24.0f), 0, q5t0VarH4.a);
                return ifh0Var4.S(q5t0VarH4.a - iP, q5t0VarH4.b, b7xVar, new wb5(q5t0VarH4, iP, (byte) 10));
            case 12:
                ifh0 ifh0Var5 = (ifh0) obj;
                afh0 afh0Var = (afh0) obj2;
                long j3 = ((hjl) obj3).a;
                int iI2 = ifh0Var5.i0(12.0f);
                int iK = hjl.k(j3);
                int i = hjl.i(j3);
                int iJ = hjl.j(j3);
                if (iJ != Integer.MAX_VALUE && (iJ = iJ - iI2) < 0) {
                    iJ = 0;
                }
                int iH = hjl.h(j3);
                if (iH != Integer.MAX_VALUE && (iH = iH - iI2) < 0) {
                    iH = 0;
                }
                q5t0 q5t0VarH5 = afh0Var.H(jjl.a(iK, i, iJ, iH));
                return q5t0VarH5.b == 0 ? ifh0Var5.S(0, 0, b7xVar, vc40.d) : ifh0Var5.S(yoi1.p(q5t0VarH5.a, hjl.k(j3), hjl.i(j3)), yoi1.p(q5t0VarH5.b + iI2, hjl.j(j3), hjl.h(j3)), b7xVar, new wb5(q5t0VarH5, iI2, (byte) 11));
            case 13:
                ((Number) obj3).intValue();
                x340 x340Var7 = (b0k) obj2;
                qf4 qf4Var = ((add) x340Var7.k(ade0.c)).a;
                if (qf4Var.h() && qf4Var.v()) {
                    x340Var7.i0(623350525);
                    x340Var7.i0(623648838);
                    gra graVar = een.h;
                    qim0 qim0VarQ = i1p1.q(nim0Var, er31.a);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var7).a.a.a(), d4o1.a);
                    float f = cbx.b(x340Var7).b.a;
                    cwl1.b(qim0VarF, graVar, (hw61) null, (pgx) null, new zzq0(f, f, f, f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, bri.b, x340Var7, 0, 48, 2028);
                    x340Var7.r(false);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(624214464);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 14:
                ifh0 ifh0Var6 = (ifh0) obj;
                long j4 = ((hjl) obj3).a;
                int iX0 = (int) ifh0Var6.X0(-20.0f);
                int iX1 = (int) ifh0Var6.X0(0.0f);
                q5t0 q5t0VarH6 = ((afh0) obj2).H(j4);
                return ifh0Var6.S(Math.max(q5t0VarH6.a + iX0, 0), q5t0VarH6.b + iX1, b7xVar, new ro60(q5t0VarH6, iX0, iX1, (byte) 0));
            case 15:
                ifh0 ifh0Var7 = (ifh0) obj;
                long j5 = ((hjl) obj3).a;
                q5t0 q5t0VarH7 = ((afh0) obj2).H(hjl.b(j5, 0, (ifh0Var7.i0(16.0f) * 2) + hjl.i(j5), 0, 0, 13));
                return ifh0Var7.S(q5t0VarH7.a, q5t0VarH7.b, b7xVar, new f2(q5t0VarH7, (byte) 20));
            case 16:
                ifh0 ifh0Var8 = (ifh0) obj;
                afh0 afh0Var2 = (afh0) obj2;
                long j6 = ((hjl) obj3).a;
                int iI3 = ifh0Var8.i0(16.0f);
                int iI4 = ifh0Var8.i0(12.0f);
                int iI5 = ifh0Var8.i0(16.0f);
                int iI6 = ifh0Var8.i0(0.0f);
                q5t0 q5t0VarH8 = afh0Var2.H(hjl.a(0, hjl.e(j6) ? hjl.i(j6) + iI3 + iI5 : hjl.i(j6), 0, hjl.d(j6) ? hjl.h(j6) + iI4 + iI6 : hjl.h(j6)));
                int i2 = (q5t0VarH8.a - iI3) - iI5;
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (q5t0VarH8.b - iI4) - iI6;
                return ifh0Var8.S(i2, i3 >= 0 ? i3 : 0, b7xVar, new ro60(q5t0VarH8, iI3, iI4, (byte) 1));
            case 17:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                kno1.e(er31.b(4.0f), rwi.a, (qim0) null, apo.r(185719979, new ry90((byte) 6, 2, false), b0kVar), b0kVar, 25008, 8);
                return rih1Var;
            case 18:
                n8h1 n8h1Var = (n8h1) obj;
                cym0 cym0Var = (cym0) obj3;
                pxm0 pxm0Var = ((xxm0) obj2).c;
                if (cym0Var instanceof bym0) {
                    qxm0 qxm0Var = ((bym0) cym0Var).a;
                    if (pxm0Var instanceof oxm0) {
                        rwl0 rwl0Var = (rwl0) n8h1Var;
                        String strValueOf = String.valueOf(qxm0Var.a);
                        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                        return new w7h1("", "", z7h1Var, new x7h1("set_multiple_choice_value", 1, Collections.singletonMap("option_selected", strValueOf)), rwl0Var.a, rwl0Var.b.b, System.currentTimeMillis());
                    }
                    if (pxm0Var instanceof nxm0) {
                        return (w7h1) ((nxm0) pxm0Var).b.invoke(n8h1Var, qxm0Var);
                    }
                    eg.o();
                } else if (!(cym0Var instanceof aym0)) {
                    eg.o();
                }
                return null;
            case 19:
                z8l0 z8l0Var = (n8h1) obj;
                qxn0 qxn0Var = (qxn0) obj2;
                sxn0 sxn0Var = (uxn0) obj3;
                lxn0 lxn0Var = qxn0Var.a;
                pxn0 pxn0Var = qxn0Var.b;
                if (sxn0Var instanceof sxn0) {
                    String str = sxn0Var.a;
                    if (lxn0Var instanceof jxn0) {
                        swl0 swl0Var = (swl0) z8l0Var;
                        if (!(pxn0Var instanceof nxn0)) {
                            if (pxn0Var instanceof oxn0) {
                                z = true;
                            } else if (pxn0Var instanceof mxn0) {
                                z = ((mxn0) pxn0Var).a;
                            } else {
                                eg.o();
                            }
                        }
                        return z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str)), swl0Var.a, swl0Var.b.b, System.currentTimeMillis()) : swl0Var.a(str);
                    }
                    if (lxn0Var instanceof ixn0) {
                        return z8l0Var.a(str);
                    }
                    if (!(lxn0Var instanceof kxn0)) {
                        eg.o();
                    }
                } else if (!(sxn0Var instanceof txn0)) {
                    eg.o();
                }
                return null;
            case 20:
                return null;
            case 21:
                return rih1Var;
            case 22:
                g7w0 g7w0Var = (g7w0) obj;
                f7w0 f7w0Var = (f7w0) obj2;
                tv80 tv80VarD = cvl1.d((tqw) obj3);
                if (f7w0Var.equals(e7w0.a)) {
                    g7w0Var.b.invoke(tv80VarD);
                } else {
                    if (!f7w0Var.equals(d7w0.a)) {
                        eg.o();
                        return null;
                    }
                    g7w0Var.c.invoke(tv80VarD);
                }
                return rih1Var;
            case 23:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    uwo1.e("", (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(2), 0, (qx8) null, x340Var9, 1572864, 0, 1726);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var10 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    uwo1.e("", (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var11, 1572864, 0, 1726);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 25:
                ((Number) obj3).intValue();
                upo1.n(0.0f, 0, 2, (b0k) obj2, u291.r(nim0Var, 48.0f));
                return rih1Var;
            case 26:
                ifh0 ifh0Var9 = (ifh0) obj;
                long j7 = ((hjl) obj3).a;
                int iI7 = ifh0Var9.i0(16.0f);
                q5t0 q5t0VarH9 = ((afh0) obj2).H(hjl.b(j7, 0, (iI7 * 2) + hjl.i(j7), 0, 0, 13));
                return ifh0Var9.S(hjl.i(j7), q5t0VarH9.b, b7xVar, new wb5(q5t0VarH9, iI7, (byte) 18));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return rih1Var;
            case 28:
                ((Number) obj3).intValue();
                kw7.d(4.0f, 0, (b0k) obj2, u291.r(nim0Var, 48.0f));
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                kw7.d(4.0f, 0, (b0k) obj2, u291.h(u291.f(nim0Var, 1.0f), 14.0f));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac8(int i, byte b) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac8(Object obj, byte b) {
        super(3);
        this.a = b;
    }
}
