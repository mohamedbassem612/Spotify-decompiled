package p;

import com.spotify.scrollsita.v1.Section;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vfj extends hab0 implements bv30 {
    public static final vfj N0;
    public static final vfj O0;
    public static final vfj P0;
    public static final vfj Q0;
    public static final vfj R0;
    public static final vfj S0;
    public static final vfj T0;
    public static final vfj U0;
    public static final vfj V0;
    public static final vfj W0;
    public static final vfj X;
    public static final vfj X0;
    public static final vfj Y;
    public static final vfj Y0;
    public static final vfj Z;
    public static final vfj Z0;
    public static final vfj a1;
    public static final vfj b;
    public static final vfj b1;
    public static final vfj c;
    public static final vfj c1;
    public static final vfj d;
    public static final vfj d1;
    public static final vfj e;
    public static final vfj e1;
    public static final vfj f;
    public static final vfj g;
    public static final vfj h;
    public static final vfj i;
    public static final vfj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new vfj(i2, (byte) 0);
        c = new vfj(i2, (byte) 1);
        d = new vfj(i2, (byte) 2);
        e = new vfj(i2, (byte) 3);
        f = new vfj(i2, (byte) 4);
        g = new vfj(i2, (byte) 5);
        h = new vfj(i2, (byte) 6);
        i = new vfj(i2, (byte) 7);
        t = new vfj(i2, (byte) 8);
        X = new vfj(i2, (byte) 9);
        Y = new vfj(i2, (byte) 10);
        Z = new vfj(i2, (byte) 11);
        N0 = new vfj(i2, (byte) 12);
        O0 = new vfj(i2, (byte) 13);
        P0 = new vfj(i2, (byte) 14);
        Q0 = new vfj(i2, (byte) 15);
        R0 = new vfj(i2, (byte) 16);
        S0 = new vfj(i2, (byte) 17);
        T0 = new vfj(i2, (byte) 18);
        U0 = new vfj(i2, (byte) 19);
        V0 = new vfj(i2, (byte) 20);
        W0 = new vfj(i2, (byte) 21);
        X0 = new vfj(i2, (byte) 22);
        Y0 = new vfj(i2, (byte) 23);
        Z0 = new vfj(i2, (byte) 24);
        a1 = new vfj(i2, (byte) 25);
        b1 = new vfj(i2, (byte) 26);
        c1 = new vfj(i2, (byte) 27);
        d1 = new vfj(i2, (byte) 28);
        e1 = new vfj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vfj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String strO0 = cwl1.o0(x340Var, 2131957809);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new ogj(iu30Var, (byte) 12);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        foo1.c(new gbx(new y50(strO0), function0), new idx(8), (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, rhj.a, x340Var2, 0, 48, 2012);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        tk81 tk81Var = (tk81) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(tk81Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            Integer num = tk81Var.a;
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new ogj(iu30Var, (byte) 13);
                x340Var2.s0(objT);
            }
            h0p1.k(num, (Function0) objT, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wv81 wv81Var = (wv81) obj2;
        ((Number) obj5).intValue();
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = oqi.c1;
            x340Var.s0(objT);
        }
        jto1.b(s161.b(qim0VarF, true, (iu30) objT), (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-1012334932, new bij(wv81Var, (byte) 0), x340Var), (xu30) null, (xu30) null, (xu30) null, apo.r(926212392, new bij(wv81Var, (byte) 1), x340Var), x340Var, 0, 196656, 30718);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3;
        tw81 tw81Var = (tw81) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        s6l s6lVar = tw81Var.a;
        ke71 ke71Var = tw81Var.c;
        b0k b0kVar = (x340) ((b0k) obj4);
        int i4 = (iIntValue & 896) ^ 384;
        boolean zI = b0kVar.i(tw81Var) | ((i4 > 256 && b0kVar.g(iu30Var)) || (iIntValue & 384) == 256);
        Object objT = b0kVar.T();
        if (zI || objT == m4cVar) {
            objT = new bag(tw81Var, iu30Var, (lnm) null, (byte) 18);
            b0kVar.s0(objT);
        }
        qxd0.t(ke71Var, b0kVar, (vu30) objT);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarH = sgc1.H(2, nim0Var);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        jw31 jw31VarA = ew31.a(new d36(12.0f, true, new g21(een.P0, (byte) 29)), een.N0, b0kVar, 0);
        int iHashCode = Long.hashCode(((x340) b0kVar).T);
        xos0 xos0VarM = b0kVar.m();
        qim0 qim0VarE = zr7.E(b0kVar, qim0VarH);
        hzj.A.getClass();
        if (((x340) b0kVar).a == null) {
            tgp1.p();
            throw null;
        }
        b0kVar.m0();
        if (((x340) b0kVar).S) {
            b0kVar.l(hmb0.t1);
        } else {
            b0kVar.v0();
        }
        nko1.H(jw31VarA, b0kVar, y580.O0);
        nko1.H(xos0VarM, b0kVar, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
        nko1.F(b0kVar);
        nko1.H(qim0VarE, b0kVar, y580.Y);
        q6l q6lVar = s6lVar.a;
        if (q6lVar == null) {
            b0kVar.i0(1709895977);
            b0kVar.r(false);
            tw81Var = tw81Var;
            i2 = i4;
            z = false;
            i3 = 256;
        } else {
            b0kVar.i0(1709895978);
            if (q6lVar instanceof q6l) {
                b0kVar.i0(-2071063112);
                hux huxVar = q6lVar.a;
                cvx cvxVar2 = cbx.b(b0kVar).b;
                qim0 qim0VarD = eqr0.D(4.0f, 0.0f, 2, nim0Var);
                zov0 zov0Var = cbx.b(b0kVar).g;
                z = false;
                i2 = i4;
                i3 = 256;
                w0h1.a(huxVar, isl.a, u291.m(qim0VarD, 24.0f), 0L, 0L, false, b0kVar, 56, 56);
                b0kVar.r(false);
            } else {
                i2 = i4;
                z = false;
                i3 = 256;
                if (!(q6lVar instanceof p6l)) {
                    throw p3d1.k(b0kVar, -2071073757, false);
                }
                b0kVar.i0(221876145);
                dv20.l(0, ((p6l) q6lVar).a, b0kVar, false);
            }
            b0kVar.r(z);
        }
        String str = s6lVar.b;
        if (str == null) {
            b0kVar.i0(1710662793);
            b0kVar.r(z);
        } else {
            b0kVar.i0(1710662794);
            uwo1.e(str, new wnb0(1.0f, z), cbx.d(b0kVar).k, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, new zic0(2), 0, (qx8) null, b0kVar, 0, 0, 1712);
            b0kVar = b0kVar;
            b0kVar.r(z);
        }
        b0kVar.i0(1711036777);
        b0kVar.r(z);
        kdx kdxVar = kdx.c;
        gdx gdxVarS = yla.s(b0kVar);
        String str2 = s6lVar.c.a;
        if ((i2 > i3 && b0kVar.g(iu30Var)) || (iIntValue & 384) == i3) {
            z = true;
        }
        Object objT2 = b0kVar.T();
        if (z || objT2 == m4cVar) {
            objT2 = new ogj(iu30Var, (byte) 14);
            b0kVar.s0(objT2);
        }
        Function0 function0 = (Function0) objT2;
        if (ihc1.y0(str2)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        b0k b0kVar2 = b0kVar;
        foo1.c(new gbx(new y50(str2), function0), kdxVar, u291.x(0.0f, 200.0f, 1, u291.D(nim0Var, (era) null, 3)), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1538520127, new l8i(tw81Var, (byte) 28), b0kVar), b0kVar2, 0, 48, 2008);
        b0kVar2.r(true);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xq11 xq11Var = (xq11) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(xq11Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            c8o.e(xq11Var.b, u291.f(nim0.a, 1.0f), x340Var2, 48);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        nyx.a(2, (wux) null, apo.r(985264603, new l2i((a591) obj2, (iu30) obj3, (byte) 18), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        gdx gdxVarR = yla.r(x340Var);
        jdx jdxVar = jdx.c;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new ogj(iu30Var, (byte) 16);
            x340Var2.s0(objT);
        }
        foo1.c(new gbx(z50.c, (Function0) objT), jdxVar, anm1.N("skip_button", nim0.a), (max) null, gdxVarR, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, jij.a, x340Var2, 0, 48, 2008);
        return rih1.a;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        int i3;
        vu30 vu30Var;
        vu30 vu30Var2;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        String strN0;
        max maxVar;
        Object obj15;
        Object obj16;
        byte b2 = this.a;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        boolean z = true;
        z = true;
        boolean z2 = true;
        z = true;
        boolean z3 = true;
        z = true;
        boolean z4 = true;
        z = true;
        boolean z5 = true;
        z = true;
        boolean z6 = true;
        z = true;
        boolean z7 = true;
        z = true;
        boolean z8 = true;
        c = 1;
        char c2 = 1;
        z = true;
        boolean z9 = true;
        z = true;
        boolean z10 = true;
        z = true;
        boolean z11 = true;
        z = true;
        boolean z12 = true;
        rih1 rih1Var = rih1.a;
        byte b3 = 0;
        switch (b2) {
            case 0:
                gx51 gx51Var = (gx51) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 48) == 0) {
                    i2 = iIntValue | (x340Var.g(gx51Var) ? 32 : 16);
                } else {
                    i2 = iIntValue;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    if (gx51Var.a != null) {
                        x340Var2.i0(1395570349);
                        zho1.v(gx51Var, iu30Var, x340Var2, (i2 >> 3) & 126);
                    } else {
                        x340Var2.i0(313067443);
                    }
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                gz51 gz51Var = (gz51) obj2;
                x340 x340Var3 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (gz51Var.a) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-669813457);
                    int size = gz51Var.b.size();
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    xio1.h(size, 0, x340Var4, uyn1.B(qim0VarF, 0.0f, 12.0f, 0.0f, 0.0f, 13));
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-669632789);
                    x340Var5.r(false);
                }
                return rih1Var;
            case 2:
                ulo1.e((((Number) obj5).intValue() >> 6) & 14, (b0k) obj4, (iu30) obj3, (qim0) null);
                return rih1Var;
            case 3:
                t361 t361Var = (t361) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if (t361Var.e) {
                    x340 x340Var7 = x340Var6;
                    x340Var7.i0(650844369);
                    sy4.b(een.h, 0L, (Function0) null, new nfv0(24, true, true, false), dgj.a, x340Var7, 27654, 6);
                    x340Var7.r(false);
                } else {
                    x340 x340Var8 = x340Var6;
                    x340Var8.i0(651542055);
                    x340Var8.r(false);
                }
                String str = t361Var.b;
                String str2 = t361Var.c;
                boolean z13 = t361Var.g;
                String strO0 = cwl1.o0(x340Var6, 2131961614);
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var6.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    z12 = false;
                }
                x340 x340Var9 = x340Var6;
                Object objT = x340Var9.T();
                if (z12 || objT == fkj0.X) {
                    obj6 = objT;
                    hdj hdjVar = new hdj(iu30Var2, (byte) 21);
                    x340Var9.s0(hdjVar);
                    obj6 = hdjVar;
                }
                obj6 = objT;
                v8r.e(str, z13, strO0, (Function0) obj6, (qim0) null, str2, x340Var9, 0, 16);
                return rih1Var;
            case 4:
                qb61 qb61Var = (qb61) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                vb61 vb61Var = qb61Var.a;
                String str3 = vb61Var.b;
                rb61 rb61Var = vb61Var.c;
                boolean z14 = qb61Var.b;
                hux huxVar = vb61Var.h;
                if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var10.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                    z11 = false;
                }
                x340 x340Var11 = x340Var10;
                Object objT2 = x340Var11.T();
                if (z11 || objT2 == fkj0.X) {
                    obj7 = objT2;
                    hdj hdjVar2 = new hdj(iu30Var3, (byte) 23);
                    x340Var11.s0(hdjVar2);
                    obj7 = hdjVar2;
                }
                obj7 = objT2;
                vno1.e(str3, rb61Var, (qim0) null, z14, huxVar, (Function0) obj7, x340Var11, 32768);
                return rih1Var;
            case 5:
                hc61 hc61Var = (hc61) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                crb crbVar = hc61Var.b;
                boolean z15 = hc61Var.a;
                if ((((iIntValue4 & 896) ^ 384) <= 256 || !x340Var12.g(iu30Var4)) && (iIntValue4 & 384) != 256) {
                    z10 = false;
                }
                x340 x340Var13 = x340Var12;
                Object objT3 = x340Var13.T();
                if (z10 || objT3 == fkj0.X) {
                    obj8 = objT3;
                    hdj hdjVar3 = new hdj(iu30Var4, (byte) 24);
                    x340Var13.s0(hdjVar3);
                    obj8 = hdjVar3;
                }
                obj8 = objT3;
                vqb.a(crbVar, (qim0) null, z15, (Function0) null, (Function0) obj8, x340Var13, 0, 5);
                return rih1Var;
            case 6:
                vc61 vc61Var = (vc61) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                crb crbVar2 = vc61Var.b;
                boolean z16 = vc61Var.a;
                int i4 = (iIntValue5 & 896) ^ 384;
                boolean z17 = (i4 > 256 && x340Var14.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                x340 x340Var15 = x340Var14;
                Object objT4 = x340Var15.T();
                Object obj17 = objT4;
                if (z17 || objT4 == m4cVar) {
                    hdj hdjVar4 = new hdj(iu30Var5, (byte) 25);
                    x340Var15.s0(hdjVar4);
                    obj17 = hdjVar4;
                }
                Function0 function0 = (Function0) obj17;
                if ((i4 <= 256 || !x340Var15.g(iu30Var5)) && (iIntValue5 & 384) != 256) {
                    z9 = false;
                }
                Object objT5 = x340Var15.T();
                Object obj18 = objT5;
                if (z9 || objT5 == m4cVar) {
                    hdj hdjVar5 = new hdj(iu30Var5, (byte) 26);
                    x340Var15.s0(hdjVar5);
                    obj18 = hdjVar5;
                }
                vqb.a(crbVar2, (qim0) null, z16, function0, (Function0) obj18, x340Var15, 0, 1);
                return rih1Var;
            case 7:
                bd61 bd61Var = (bd61) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                String str4 = bd61Var.a;
                xtx xtxVar = xtx.c;
                t2g t2gVar = new t2g(bd61Var.e, bd61Var.f, (qex) null, 4);
                char c3 = ((((iIntValue6 & 896) ^ 384) <= 256 || !x340Var16.g(iu30Var6)) && (iIntValue6 & 384) != 256) ? (char) 0 : (char) 1;
                if ((((iIntValue6 & 112) ^ 48) <= 32 || !x340Var16.g(bd61Var)) && (iIntValue6 & 48) != 32) {
                    c2 = 0;
                }
                int i5 = c3 | c2;
                x340 x340Var17 = x340Var16;
                Object objT6 = x340Var17.T();
                if (i5 != 0 || objT6 == fkj0.X) {
                    obj9 = objT6;
                    dfi dfiVar = new dfi(iu30Var6, bd61Var, (byte) 24);
                    x340Var17.s0(dfiVar);
                    obj9 = dfiVar;
                }
                obj9 = objT6;
                kyo1.c(str4, xtxVar, (Function0) obj9, (qim0) null, false, (String) null, t2gVar, (vu30) null, x340Var17, xtx.d << 3, 184);
                return rih1Var;
            case 8:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                xmx xmxVar = xmx.c;
                qim0 qim0VarN = anm1.N("SETTINGS_CURATION_ACTION_BUTTON", nim0Var);
                String strO1 = cwl1.o0(x340Var18, 2131954738);
                String strO2 = cwl1.o0(x340Var18, 2131954737);
                if ((((iIntValue7 & 896) ^ 384) <= 256 || !x340Var18.g(iu30Var7)) && (iIntValue7 & 384) != 256) {
                    z8 = false;
                }
                x340 x340Var19 = x340Var18;
                Object objT7 = x340Var19.T();
                if (z8 || objT7 == fkj0.X) {
                    obj10 = objT7;
                    hdj hdjVar6 = new hdj(iu30Var7, (byte) 27);
                    x340Var19.s0(hdjVar6);
                    obj10 = hdjVar6;
                }
                obj10 = objT7;
                kyo1.c(strO1, xmxVar, (Function0) obj10, qim0VarN, false, strO2, (v2g) null, (vu30) null, x340Var19, xmx.d << 3, 208);
                return rih1Var;
            case 9:
                hn61 hn61Var = (hn61) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                if ((iIntValue8 & 48) == 0) {
                    i3 = iIntValue8 | (x340Var20.g(hn61Var) ? 32 : 16);
                } else {
                    i3 = iIntValue8;
                }
                if ((iIntValue8 & 384) == 0) {
                    i3 |= x340Var20.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    if (hn61Var.a != null) {
                        x340Var21.i0(-941548209);
                        vu30 vu30VarR = apo.r(1362978644, new lgj(hn61Var, (byte) 0), x340Var21);
                        x340Var21.r(false);
                        vu30Var = vu30VarR;
                    } else {
                        x340Var21.i0(-941163500);
                        x340Var21.r(false);
                        vu30Var = null;
                    }
                    j2i j2iVarR = apo.r(1889622446, new lgj(hn61Var, (byte) 1), x340Var21);
                    j2i j2iVarR2 = apo.r(-1920708019, new mgj(hn61Var, iu30Var8, b3), x340Var21);
                    j2i j2iVarR3 = apo.r(-1436071188, new mgj(hn61Var, iu30Var8, z ? (byte) 1 : (byte) 0), x340Var21);
                    if (hn61Var.f != null) {
                        x340Var21.i0(-939944765);
                        vu30 vu30VarR2 = apo.r(-993441328, new mgj(hn61Var, iu30Var8, (byte) 2), x340Var21);
                        x340Var21.r(false);
                        vu30Var2 = vu30VarR2;
                    } else {
                        x340Var21.i0(-939487020);
                        x340Var21.r(false);
                        vu30Var2 = null;
                    }
                    ila0.d(vu30Var, j2iVarR, j2iVarR2, j2iVarR3, vu30Var2, x340Var21, 3504, 0);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 10:
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                ldx ldxVar = ldx.c;
                String strO3 = cwl1.o0(x340Var22, 2131961705);
                if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var22.g(iu30Var9)) && (iIntValue9 & 384) != 256) {
                    z7 = false;
                }
                x340 x340Var23 = x340Var22;
                Object objT8 = x340Var23.T();
                if (z7 || objT8 == fkj0.X) {
                    obj11 = objT8;
                    ogj ogjVar = new ogj(iu30Var9, (byte) 0);
                    x340Var23.s0(ogjVar);
                    obj11 = ogjVar;
                }
                obj11 = objT8;
                Function0 function1 = (Function0) obj11;
                if (ihc1.y0(strO3)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.h(new gbx(new y50(strO3), function1), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, pgj.a, x340Var23, 0, 6, 1020);
                return rih1Var;
            case 11:
                xto1.q((iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 6) & 14);
                return rih1Var;
            case 12:
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                if (((ty61) obj2) instanceof ry61) {
                    era eraVar = een.Q0;
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var24).b;
                    qim0 qim0VarX = uyn1.x(nim0Var, 12.0f);
                    pm31 pm31Var = new pm31(0);
                    boolean z18 = (((iIntValue10 & 896) ^ 384) > 256 && x340Var24.g(iu30Var10)) || (iIntValue10 & 384) == 256;
                    x340 x340Var25 = x340Var24;
                    Object objT9 = x340Var25.T();
                    if (z18 || objT9 == fkj0.X) {
                        obj12 = objT9;
                        ogj ogjVar2 = new ogj(iu30Var10, (byte) 1);
                        x340Var25.s0(ogjVar2);
                        obj12 = ogjVar2;
                    }
                    obj12 = objT9;
                    qim0 qim0VarX2 = bin.x(qim0VarX, false, (String) null, pm31Var, (idn0) null, (Function0) obj12, 11);
                    mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var25, 0);
                    int iHashCode = Long.hashCode(x340Var25.T);
                    xos0 xos0VarM = x340Var25.m();
                    qim0 qim0VarE = zr7.E(x340Var25, qim0VarX2);
                    hzj.A.getClass();
                    if (x340Var25.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var25.m0();
                    if (x340Var25.S) {
                        x340Var25.l(hmb0.t1);
                    } else {
                        x340Var25.v0();
                    }
                    nko1.H(mbhVarA, x340Var25, y580.O0);
                    nko1.H(xos0VarM, x340Var25, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var25, y580.R0);
                    nko1.F(x340Var25);
                    nko1.H(qim0VarE, x340Var25, y580.Y);
                    fsx fsxVar = fsx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var25, 2131955569));
                    zov0 zov0Var = cbx.b(x340Var25).g;
                    w0h1.a(fsxVar, jslVar, u291.r(nim0Var, 24.0f), cbx.a(x340Var25).b.b, 0L, false, x340Var25, fsx.d, 48);
                    x340Var25.r(true);
                }
                return rih1Var;
            case 13:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (((sy61) obj2).a) {
                    x340 x340Var27 = x340Var26;
                    x340Var27.i0(1128731358);
                    Object objT10 = x340Var27.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT10 == m4cVar2) {
                        obj13 = objT10;
                        ogj ogjVar3 = new ogj(iu30Var11, (byte) 2);
                        x340Var27.s0(ogjVar3);
                        obj13 = ogjVar3;
                    }
                    obj13 = objT10;
                    Function0 function2 = (Function0) obj13;
                    qim0 qim0VarX3 = uyn1.x(nim0Var, 8.0f);
                    Object objT11 = x340Var27.T();
                    Object obj19 = objT11;
                    if (objT11 == m4cVar2) {
                        ugj ugjVar = new ugj(function2, (byte) 0);
                        x340Var27.s0(ugjVar);
                        obj19 = ugjVar;
                    }
                    w0h1.a(fsx.c, isl.a, anm1.N("ShareButton", bin.x(qim0VarX3, false, (String) null, (pm31) null, (idn0) null, (Function0) obj19, 15)), u7h.f, 0L, false, x340Var27, fsx.d | 48, 48);
                    x340Var27.r(false);
                } else {
                    x340 x340Var28 = x340Var26;
                    x340Var28.i0(1129040800);
                    x340Var28.r(false);
                }
                return rih1Var;
            case 14:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (((b371) obj2).a) {
                    x340 x340Var30 = x340Var29;
                    x340Var30.i0(-908954610);
                    Object objT12 = x340Var30.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT12 == m4cVar3) {
                        obj14 = objT12;
                        ogj ogjVar4 = new ogj(iu30Var12, (byte) 3);
                        x340Var30.s0(ogjVar4);
                        obj14 = ogjVar4;
                    }
                    obj14 = objT12;
                    uwr uwrVar3 = cbx.a;
                    long j = ((vex) zex.a.e).b;
                    gbx gbxVar = new gbx(z50Var, (Function0) obj14);
                    Object objT13 = x340Var30.T();
                    Object obj20 = objT13;
                    if (objT13 == m4cVar3) {
                        xgj xgjVar = xgj.c;
                        x340Var30.s0(xgjVar);
                        obj20 = xgjVar;
                    }
                    vu30 vu30Var3 = (vu30) obj20;
                    boolean zF = x340Var30.f(j);
                    Object objT14 = x340Var30.T();
                    Object obj21 = objT14;
                    if (zF || objT14 == m4cVar3) {
                        sre sreVar = new sre((byte) 4, j);
                        x340Var30.s0(sreVar);
                        obj21 = sreVar;
                    }
                    poo1.e(gbxVar, new oex(18, vu30Var3, (vu30) obj21, (vu30) null, 8), yoo1.z(x340Var30), anm1.N("ShareButton", nim0Var), 0, (String) null, (max) null, ygj.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, ygj.b, x340Var30, 12582912, 3072, 8048);
                    x340Var30.r(false);
                } else {
                    x340 x340Var31 = x340Var29;
                    x340Var31.i0(-908137760);
                    x340Var31.r(false);
                }
                return rih1Var;
            case 15:
                t371 t371Var = (t371) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var32 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                if (t371Var.c) {
                    String str5 = t371Var.b;
                    if (str5 == null) {
                        x340 x340Var33 = x340Var32;
                        x340Var33.i0(-719035498);
                        x340Var33.r(false);
                        strN0 = null;
                    } else {
                        x340 x340Var34 = x340Var32;
                        x340Var34.i0(-719035497);
                        strN0 = cwl1.n0(2131962278, new Object[]{str5}, x340Var34);
                        x340Var34.r(false);
                    }
                    if (strN0 == null) {
                        x340 x340Var35 = x340Var32;
                        strN0 = x0d.k(x340Var35, 530997208, 2131962270, x340Var35, false);
                    } else {
                        x340 x340Var36 = x340Var32;
                        x340Var36.i0(530994139);
                        x340Var36.r(false);
                    }
                    gdx gdxVarR = yla.r(x340Var32);
                    ldx ldxVar2 = ldx.c;
                    if (t371Var.d) {
                        x340 x340Var37 = x340Var32;
                        x340Var37.i0(531004090);
                        x340Var37.r(false);
                        maxVar = jax.a;
                    } else {
                        x340 x340Var38 = x340Var32;
                        x340Var38.i0(531006130);
                        max haxVar = new hax(cwl1.o0(x340Var38, t371Var.e ? 2131962244 : 2131962245));
                        x340Var38.r(false);
                        maxVar = haxVar;
                    }
                    if ((((iIntValue11 & 896) ^ 384) <= 256 || !x340Var32.g(iu30Var13)) && (iIntValue11 & 384) != 256) {
                        z6 = false;
                    }
                    x340 x340Var39 = x340Var32;
                    Object objT15 = x340Var39.T();
                    if (z6 || objT15 == fkj0.X) {
                        obj15 = objT15;
                        ogj ogjVar5 = new ogj(iu30Var13, (byte) 4);
                        x340Var39.s0(ogjVar5);
                        obj15 = ogjVar5;
                    }
                    obj15 = objT15;
                    wro1.h(new gbx(z50Var, (Function0) obj15), ldxVar2, (qim0) null, maxVar, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-1894135107, new pji(strN0, (byte) 8), x340Var39), x340Var39, 0, 6, 972);
                }
                return rih1Var;
            case 16:
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var40 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                qim0 qim0VarN2 = anm1.N("share.header.action.element.share.button", nim0Var);
                String strO4 = cwl1.o0(x340Var40, 2131962353);
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var40.g(iu30Var14)) && (iIntValue12 & 384) != 256) {
                    z5 = false;
                }
                x340 x340Var41 = x340Var40;
                Object objT16 = x340Var41.T();
                if (z5 || objT16 == fkj0.X) {
                    obj16 = objT16;
                    ogj ogjVar6 = new ogj(iu30Var14, (byte) 5);
                    x340Var41.s0(ogjVar6);
                    obj16 = ogjVar6;
                }
                obj16 = objT16;
                Function0 function3 = (Function0) obj16;
                if (ihc1.y0(strO4)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.h(new gbx(new y50(strO4), function3), ldx.c, qim0VarN2, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, ahj.a, x340Var41, 0, 6, 1016);
                return rih1Var;
            case 17:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-1621897450, new l2i((qh71) obj2, (iu30) obj3, (byte) 17), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 18:
                kz71 kz71Var = (kz71) obj2;
                x340 x340Var42 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (kz71Var.d) {
                    x340 x340Var43 = x340Var42;
                    x340Var43.i0(1086050912);
                    d5p1.e((qim0) null, x340Var43, 0);
                    x340Var43.r(false);
                } else {
                    x340 x340Var44 = x340Var42;
                    x340Var44.i0(1086097474);
                    d5p1.d(kz71Var.a, kz71Var.b, ef.a(x340Var44).b(6), kz71Var.c, (qim0) null, x340Var44, 0);
                    x340Var44.r(false);
                }
                return rih1Var;
            case 19:
                oz71 oz71Var = (oz71) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var45 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                boolean z19 = ef.a(x340Var45).b(5) && oz71Var.b;
                boolean z20 = oz71Var.c;
                String str6 = oz71Var.a;
                Function0 function4 = oz71Var.e;
                Function0 function5 = oz71Var.f;
                String str7 = oz71Var.g;
                x340 x340Var46 = x340Var45;
                boolean zI = x340Var46.i(oz71Var);
                Object objT17 = x340Var46.T();
                Object obj22 = objT17;
                if (zI || objT17 == m4cVar4) {
                    lhj lhjVar = new lhj(oz71Var, (byte) 0);
                    x340Var46.s0(lhjVar);
                    obj22 = lhjVar;
                }
                qim0 qim0VarA = s161.a(nim0Var, (iu30) obj22);
                boolean zI2 = x340Var46.i(oz71Var);
                Object objT18 = x340Var46.T();
                Object obj23 = objT18;
                if (zI2 || objT18 == m4cVar4) {
                    lhj lhjVar2 = new lhj(oz71Var, (byte) 1);
                    x340Var46.s0(lhjVar2);
                    obj23 = lhjVar2;
                }
                iu30 iu30Var16 = (iu30) obj23;
                if ((((iIntValue13 & 896) ^ 384) <= 256 || !x340Var46.g(iu30Var15)) && (iIntValue13 & 384) != 256) {
                    z4 = false;
                }
                Object objT19 = x340Var46.T();
                Object obj24 = objT19;
                if (z4 || objT19 == m4cVar4) {
                    k4j k4jVar = new k4j(iu30Var15, (byte) 18);
                    x340Var46.s0(k4jVar);
                    obj24 = k4jVar;
                }
                f5p1.f(0, str6, str7, function4, function5, x340Var46, iu30Var16, (iu30) obj24, qim0VarA, z19, z20);
                return rih1Var;
            case 20:
                iu30 iu30Var17 = (iu30) obj3;
                x340 x340Var47 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                x581 x581Var = ((m581) obj2).a;
                int i6 = (iIntValue14 & 896) ^ 384;
                boolean z21 = (i6 > 256 && x340Var47.g(iu30Var17)) || (iIntValue14 & 384) == 256;
                x340 x340Var48 = x340Var47;
                Object objT20 = x340Var48.T();
                Object obj25 = objT20;
                if (z21 || objT20 == m4cVar5) {
                    ogj ogjVar7 = new ogj(iu30Var17, (byte) 8);
                    x340Var48.s0(ogjVar7);
                    obj25 = ogjVar7;
                }
                Function0 function6 = (Function0) obj25;
                if ((i6 <= 256 || !x340Var48.g(iu30Var17)) && (iIntValue14 & 384) != 256) {
                    z3 = false;
                }
                Object objT21 = x340Var48.T();
                Object obj26 = objT21;
                if (z3 || objT21 == m4cVar5) {
                    ogj ogjVar8 = new ogj(iu30Var17, (byte) 9);
                    x340Var48.s0(ogjVar8);
                    obj26 = ogjVar8;
                }
                m6p1.i(x581Var, function6, (Function0) obj26, (qim0) null, x340Var48, 0);
                return rih1Var;
            case 21:
                j681 j681Var = (j681) obj2;
                iu30 iu30Var18 = (iu30) obj3;
                x340 x340Var49 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                m4c m4cVar6 = fkj0.X;
                int i7 = (iIntValue15 & 896) ^ 384;
                boolean z22 = (i7 > 256 && x340Var49.g(iu30Var18)) || (iIntValue15 & 384) == 256;
                x340 x340Var50 = x340Var49;
                Object objT22 = x340Var50.T();
                Object obj27 = objT22;
                if (z22 || objT22 == m4cVar6) {
                    ogj ogjVar9 = new ogj(iu30Var18, (byte) 10);
                    x340Var50.s0(ogjVar9);
                    obj27 = ogjVar9;
                }
                Function0 function7 = (Function0) obj27;
                if ((i7 <= 256 || !x340Var50.g(iu30Var18)) && (iIntValue15 & 384) != 256) {
                    z2 = false;
                }
                Object objT23 = x340Var50.T();
                Object obj28 = objT23;
                if (z2 || objT23 == m4cVar6) {
                    ogj ogjVar10 = new ogj(iu30Var18, (byte) 11);
                    x340Var50.s0(ogjVar10);
                    obj28 = ogjVar10;
                }
                r6p1.m(j681Var, function7, (Function0) obj28, (qim0) null, (i681) null, x340Var50, (iIntValue15 >> 3) & 14);
                return rih1Var;
            case 22:
                return a(obj, obj2, obj3, obj4, obj5);
            case 23:
                return d(obj, obj2, obj3, obj4, obj5);
            case 24:
                return e(obj, obj2, obj3, obj4, obj5);
            case 25:
                return f(obj, obj2, obj3, obj4, obj5);
            case 26:
                return g(obj, obj2, obj3, obj4, obj5);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return h(obj, obj2, obj3, obj4, obj5);
            case 28:
                return i(obj, obj2, obj3, obj4, obj5);
            default:
                t591 t591Var = (t591) obj2;
                iu30 iu30Var19 = (iu30) obj3;
                x340 x340Var51 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                m4c m4cVar7 = fkj0.X;
                int i8 = (iIntValue16 & 112) ^ 48;
                boolean z23 = (i8 > 32 && x340Var51.i(t591Var)) || (iIntValue16 & 48) == 32;
                x340 x340Var52 = x340Var51;
                Object objT24 = x340Var52.T();
                Object obj29 = objT24;
                if (z23 || objT24 == m4cVar7) {
                    mwh mwhVar = new mwh(t591Var, (byte) 6);
                    x340Var52.s0(mwhVar);
                    obj29 = mwhVar;
                }
                qim0 qim0VarB = s161.b(nim0Var, true, (iu30) obj29);
                boolean z24 = ((i8 > 32 && x340Var52.i(t591Var)) || (iIntValue16 & 48) == 32) | ((((iIntValue16 & 896) ^ 384) > 256 && x340Var52.g(iu30Var19)) || (iIntValue16 & 384) == 256);
                Object objT25 = x340Var52.T();
                Object obj30 = objT25;
                if (z24 || objT25 == m4cVar7) {
                    dfi dfiVar2 = new dfi(iu30Var19, t591Var, (byte) 25);
                    x340Var52.s0(dfiVar2);
                    obj30 = dfiVar2;
                }
                jto1.b(qim0VarB, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) obj30), (gbx) null, (xu30) null, apo.r(-1193120534, new kij(t591Var, (byte) 0), x340Var52), (xu30) null, apo.r(727213001, new kij(t591Var, (byte) 1), x340Var52), t591Var.e ? lij.a : null, (xu30) null, (xu30) null, apo.r(1470030149, new kij(t591Var, (byte) 2), x340Var52), x340Var52, 805306368, 196656, 26046);
                return rih1Var;
        }
    }
}
