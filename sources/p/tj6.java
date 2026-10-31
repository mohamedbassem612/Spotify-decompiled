package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tj6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj6(ziu ziuVar, int i, xb10 xb10Var, iu30 iu30Var, ecx ecxVar, afx afxVar) {
        super(3);
        this.a = (byte) 1;
        this.c = ziuVar;
        this.b = i;
        this.d = xb10Var;
        this.e = iu30Var;
        this.f = ecxVar;
        this.g = afxVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        List listSingletonList;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        int i = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.f;
        Object obj8 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i2c i2cVar = (i2c) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                gj6 gj6Var = (gj6) obj6;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    float fD = i2cVar.d();
                    float fC = i2cVar.c();
                    float f5 = 0.18333334f * fD;
                    float f6 = 0.12083333f * fD;
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        f = fD - f6;
                        f2 = fD - f5;
                        f3 = 211.0f;
                        f4 = 0.0f;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        f = fD - f5;
                        f4 = f5;
                        f3 = 196.0f;
                        f2 = 0.0f;
                    }
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    boolean zD = x340Var2.d(fD) | x340Var2.e(l1d.C(i));
                    Object objT = x340Var2.T();
                    if (zD || objT == fkj0.X) {
                        objT = new sj6(fD, i);
                        x340Var2.s0(objT);
                    }
                    y3g1 y3g1Var = (y3g1) obj8;
                    qim0 qim0VarR = exd0.r(i541.C(qim0VarD, (iu30) objT), new gu2(i, (Object) gj6Var, (Object) (y3g1Var != null ? y3g1Var.a : null), (byte) 2));
                    y3g1 y3g1Var2 = (y3g1) obj8;
                    xd6 xd6Var = (xd6) obj5;
                    Function0 function0 = (Function0) obj7;
                    b4g1 b4g1Var = (b4g1) obj4;
                    gra graVar = een.d;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarR);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    boolean z4 = x340Var2.S;
                    n4k n4kVar = hmb0.t1;
                    if (z4) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    qim0 qim0VarF = vi6.f(u291.h(u291.v(eqr0.D(f4, 0.0f, 2, nim0Var), f), fC), (i != 2 || y3g1Var2 == null) ? null : y3g1Var2.d);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    yux yuxVar = new yux(f, fC, f3);
                    zi6 zi6Var = gj6Var.j;
                    if (zi6Var instanceof aj6) {
                        x340Var2.i0(-1524241734);
                        int iC2 = l1d.C(i);
                        if (iC2 == 0) {
                            z2 = false;
                            x340Var2.i0(227927729);
                            sio1.m(gj6Var, (aj6) zi6Var, yuxVar, y3g1Var2, x340Var2, 0);
                            x340Var2.r(false);
                        } else {
                            if (iC2 != 1) {
                                throw p3d1.k(x340Var2, 227925576, false);
                            }
                            x340Var2.i0(227931266);
                            z2 = false;
                            eio1.m(gj6Var, (aj6) zi6Var, yuxVar, x340Var2, 0);
                            x340Var2.r(false);
                        }
                        x340Var2.r(z2);
                    } else {
                        if (!(zi6Var instanceof zi6)) {
                            throw p3d1.k(x340Var2, 227922485, false);
                        }
                        x340Var2.i0(-1523924635);
                        int iC3 = l1d.C(i);
                        if (iC3 == 0) {
                            z = false;
                            x340Var2.i0(227937464);
                            pd6.a(gj6Var, yuxVar, x340Var2, 0);
                            x340Var2.r(false);
                        } else {
                            if (iC3 != 1) {
                                throw p3d1.k(x340Var2, 227935805, false);
                            }
                            x340Var2.i0(227940224);
                            z = false;
                            od6.a(gj6Var, zi6Var, yuxVar, x340Var2, 0);
                            x340Var2.r(false);
                        }
                        x340Var2.r(z);
                    }
                    x340Var2.r(true);
                    rk6.a(gj6Var.q, i == 2, u291.h(u291.v(eqr0.D(f2, 0.0f, 2, nim0Var), f5), fC), (gj6Var.o.size() != 1 || y3g1Var2 == null) ? null : y3g1Var2.a, x340Var2, 0);
                    yj41 yj41Var = gj6Var.n;
                    if (yj41Var != null) {
                        x340Var2.i0(-1125588264);
                        oi6.a(yj41Var.a, xd6Var, vi6.f(u291.d(nim0Var, 1.0f), y3g1Var2 != null ? y3g1Var2.e : null), function0, b4g1Var, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1125308613);
                        x340Var2.r(false);
                    }
                    uj6.a(gj6Var.m, u291.d(nim0Var, 1.0f), x340Var2, 56);
                    x340Var2.r(true);
                } else {
                    rih1Var = rih1Var;
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                ziu ziuVar = (ziu) obj6;
                iu30 iu30Var = (iu30) obj5;
                fq7.g(ziuVar.a, (qim0) null, xay.e(2, irn1.o0(i, 0, null, 6)), xay.f(2, irn1.o0(i, 0, null, 6)), (String) null, apo.r(1899495336, new k8(obj7, (Object) ziuVar, obj4, (Object) iu30Var, (byte) 15), b0kVar), b0kVar, 196608, 18);
                g2p1.b(ziuVar, (xb10) obj8, iu30Var, b0kVar, 0);
                return rih1Var;
            case 2:
                cd5 cd5Var = (cd5) obj;
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                vyo0 vyo0Var = (vyo0) obj8;
                ven0 ven0Var = (ven0) obj7;
                zyo0 zyo0Var = (zyo0) obj6;
                float f7 = ((yyo0) obj5).b;
                if (!zyo0Var.b.a()) {
                    z3 = false;
                } else if (i != p7h.L((List) ven0Var.getValue())) {
                    uyo0 uyo0Var = vyo0Var.c;
                    z3 = false;
                } else {
                    z3 = true;
                }
                zyo0Var.e(vyo0Var, f7, z3, x340Var3, 8);
                if (((Boolean) ((ven0) obj4).getValue()).booleanValue() || cd5Var.a().a.P0() != cd5Var.a().d.getValue()) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(627757391);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(627686277);
                    boolean zI = x340Var5.i(ven0Var) | x340Var5.i(vyo0Var);
                    Object objT2 = x340Var5.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new hyg0(vyo0Var, ven0Var, (lnm) null, (byte) 29);
                        x340Var5.s0(objT2);
                    }
                    qxd0.t(rih1Var, x340Var5, (vu30) objT2);
                    x340Var5.r(false);
                }
                return rih1Var;
            case 3:
                cm0 cm0Var = (cm0) obj4;
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = (String) obj8;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var6).b;
                qim0 qim0VarB = uyn1.B((qim0) obj6, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                if (i != 2131961062) {
                    if (i == 2131961059) {
                        str = "for-you-section-title";
                    } else {
                        nkx0.e(i);
                    }
                    return null;
                }
                str = "top-10-countdowns-section-title";
                z4p1.k(i, 0, x340Var6, anm1.N(str, qim0VarB));
                String strConcat = str3.concat("-padding-start");
                String strConcat2 = str3.concat("-padding-end");
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                if (i == 2131961062) {
                    str2 = "top-10-countdowns-carousel";
                } else {
                    if (i != 2131961059) {
                        nkx0.e(i);
                        return null;
                    }
                    str2 = "for-you-carousel";
                }
                qim0 qim0VarN = anm1.N(str2, qim0VarF2);
                h3h1 h3h1Var = (h3h1) obj5;
                x340 x340Var7 = x340Var6;
                boolean zG = x340Var7.g(strConcat) | x340Var7.i((c380) obj7) | x340Var7.g(str3) | x340Var7.i(cm0Var) | x340Var7.g(strConcat2);
                c380 c380Var = (c380) obj7;
                Object objT3 = x340Var7.T();
                if (zG || objT3 == fkj0.X) {
                    tjf0 tjf0Var = new tjf0(strConcat, c380Var, strConcat2, str3, cm0Var, (byte) 12);
                    x340Var7.s0(tjf0Var);
                    objT3 = tjf0Var;
                }
                s3o1.e(qim0VarN, null, null, null, null, null, h3h1Var, (iu30) objT3, x340Var7, 0, 126);
                op71.g(x340Var7, u291.h(nim0Var, cbx.b(x340Var7).b.a));
                return rih1Var;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                yp71 yp71Var = (yp71) obj6;
                d6q0 d6q0Var = (b6q0) obj8;
                t7q0 t7q0Var = ((dp71) obj5).b;
                ke71 ke71Var = new ke71((ven0) obj7, (ven0) obj4, (byte) 2);
                if (d6q0Var instanceof d6q0) {
                    listSingletonList = d6q0Var.a;
                } else {
                    if (!(d6q0Var instanceof h6q0)) {
                        eg.o();
                        return null;
                    }
                    listSingletonList = Collections.singletonList(((h6q0) d6q0Var).a);
                }
                List list = listSingletonList;
                otw.c(yp71Var, new vp71(this.b, list, d6q0Var.h(), d6q0Var.j(), t7q0Var, d6q0Var.a(), ke71Var), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj6(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(3);
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj6(zyo0 zyo0Var, vyo0 vyo0Var, yyo0 yyo0Var, int i, ven0 ven0Var, ven0 ven0Var2) {
        super(3);
        this.a = (byte) 2;
        this.c = zyo0Var;
        this.d = vyo0Var;
        this.e = yyo0Var;
        this.b = i;
        this.f = ven0Var;
        this.g = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj6(yp71 yp71Var, b6q0 b6q0Var, int i, dp71 dp71Var, ven0 ven0Var, ven0 ven0Var2) {
        super(3);
        this.a = (byte) 4;
        this.c = yp71Var;
        this.d = b6q0Var;
        this.b = i;
        this.e = dp71Var;
        this.f = ven0Var;
        this.g = ven0Var2;
    }
}
