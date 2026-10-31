package p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rij extends hab0 implements bv30 {
    public static final rij N0;
    public static final rij O0;
    public static final rij P0;
    public static final rij Q0;
    public static final rij R0;
    public static final rij S0;
    public static final rij T0;
    public static final rij U0;
    public static final rij V0;
    public static final rij W0;
    public static final rij X;
    public static final rij X0;
    public static final rij Y;
    public static final rij Y0;
    public static final rij Z;
    public static final rij Z0;
    public static final rij a1;
    public static final rij b;
    public static final rij b1;
    public static final rij c;
    public static final rij c1;
    public static final rij d;
    public static final rij d1;
    public static final rij e;
    public static final rij e1;
    public static final rij f;
    public static final rij g;
    public static final rij h;
    public static final rij i;
    public static final rij t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new rij(i2, (byte) 0);
        c = new rij(i2, (byte) 1);
        d = new rij(i2, (byte) 2);
        e = new rij(i2, (byte) 3);
        f = new rij(i2, (byte) 4);
        g = new rij(i2, (byte) 5);
        h = new rij(i2, (byte) 6);
        i = new rij(i2, (byte) 7);
        t = new rij(i2, (byte) 8);
        X = new rij(i2, (byte) 9);
        Y = new rij(i2, (byte) 10);
        Z = new rij(i2, (byte) 11);
        N0 = new rij(i2, (byte) 12);
        O0 = new rij(i2, (byte) 13);
        P0 = new rij(i2, (byte) 14);
        Q0 = new rij(i2, (byte) 15);
        R0 = new rij(i2, (byte) 16);
        S0 = new rij(i2, (byte) 17);
        T0 = new rij(i2, (byte) 18);
        U0 = new rij(i2, (byte) 19);
        V0 = new rij(i2, (byte) 20);
        W0 = new rij(i2, (byte) 21);
        X0 = new rij(i2, (byte) 22);
        Y0 = new rij(i2, (byte) 23);
        Z0 = new rij(i2, (byte) 24);
        a1 = new rij(i2, (byte) 25);
        b1 = new rij(i2, (byte) 26);
        c1 = new rij(i2, (byte) 27);
        d1 = new rij(i2, (byte) 28);
        e1 = new rij(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rij(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01c4 A[PHI: r10
      0x01c4: PHI (r10v9 p.iu30) = (r10v7 p.iu30), (r10v10 p.iu30) binds: [B:49:0x01c2, B:45:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01d3  */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m4c m4cVar;
        boolean z;
        ven0 ven0Var;
        b0k b0kVar;
        iu30 iu30Var;
        boolean z2;
        boolean z3;
        Object objT;
        dwa1 dwa1Var = (dwa1) obj2;
        iu30 iu30Var2 = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        Float f2 = dwa1Var.d;
        b0k b0kVar2 = (x340) ((b0k) obj4);
        Object objT2 = b0kVar2.T();
        m4c m4cVar2 = fkj0.X;
        if (objT2 == m4cVar2) {
            objT2 = v8r.q((Object) null);
            b0kVar2.s0(objT2);
        }
        ven0 ven0Var2 = (ven0) objT2;
        Object objT3 = b0kVar2.T();
        if (objT3 == m4cVar2) {
            objT3 = v8r.q(0);
            b0kVar2.s0(objT3);
        }
        ven0 ven0Var3 = (ven0) objT3;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
        int iHashCode = Long.hashCode(((x340) b0kVar2).T);
        xos0 xos0VarM = b0kVar2.m();
        qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
        hzj.A.getClass();
        if (((x340) b0kVar2).a == null) {
            tgp1.p();
            throw null;
        }
        b0kVar2.m0();
        if (((x340) b0kVar2).S) {
            b0kVar2.l(hmb0.t1);
        } else {
            b0kVar2.v0();
        }
        nko1.H(mbhVarA, b0kVar2, y580.O0);
        nko1.H(xos0VarM, b0kVar2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
        nko1.F(b0kVar2);
        nko1.H(qim0VarE, b0kVar2, y580.Y);
        gwa1.a(f2, dwa1Var.b, b0kVar2, 0);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar2).b;
        op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
        Float f3 = dwa1Var.c;
        if (f3 == null) {
            b0kVar2.i0(1076257196);
            b0kVar2.r(false);
            ven0Var = ven0Var2;
            m4cVar = m4cVar2;
            b0kVar = b0kVar2;
            z = false;
        } else {
            b0kVar2.i0(1076257197);
            float fFloatValue = f3.floatValue();
            int iU = jch0.U(0.7f * fFloatValue);
            tr80 tr80Var = new tr80(iU, jch0.U(1.3f * fFloatValue), 1);
            int iP = yoi1.p(f2 != null ? jch0.U(f2.floatValue()) : jch0.U(fFloatValue), iU, ((rr80) tr80Var).b);
            long j = cbx.a(b0kVar2).b.c;
            long j2 = cbx.a(b0kVar2).b.b;
            long j3 = cbx.a(b0kVar2).b.b;
            boolean z4 = (((iIntValue & 896) ^ 384) > 256 && b0kVar2.g(iu30Var2)) || (iIntValue & 384) == 256;
            Object objT4 = b0kVar2.T();
            if (z4 || objT4 == m4cVar2) {
                objT4 = new k4j(iu30Var2, (byte) 21);
                b0kVar2.s0(objT4);
            }
            m4cVar = m4cVar2;
            z = false;
            ven0Var = ven0Var2;
            g3c.a(iP, iU, ((rr80) tr80Var).b, j, j2, j3, (iu30) objT4, null, (Integer) ven0Var2.getValue(), ((Number) ven0Var3.getValue()).intValue(), b0kVar2, 0);
            b0kVar = b0kVar2;
            b0kVar.r(false);
        }
        op71.g(b0kVar, u291.h(nim0Var, cbx.b(b0kVar).b.b));
        float f4 = dwa1Var.b;
        Float f5 = dwa1Var.c;
        boolean z5 = dwa1Var.e;
        boolean zI = b0kVar.i(ven0Var) | (((((iIntValue & 112) ^ 48) <= 32 || !b0kVar.g(dwa1Var)) && (iIntValue & 48) != 32) ? z : true) | b0kVar.i(ven0Var3);
        if (((iIntValue & 896) ^ 384) > 256) {
            iu30Var = iu30Var2;
            if (b0kVar.g(iu30Var)) {
                z2 = true;
            }
            z3 = zI | z2;
            objT = b0kVar.T();
            if (z3 || objT == m4cVar) {
                objT = new ggh(dwa1Var, iu30Var, ven0Var, ven0Var3);
                b0kVar.s0(objT);
            }
            gwa1.c(f4, f5, z5, (iu30) objT, b0kVar, 0);
            b0kVar.r(true);
            return rih1.a;
        }
        iu30Var = iu30Var2;
        if ((iIntValue & 384) == 256) {
            z2 = true;
        } else {
            z2 = z;
        }
        z3 = zI | z2;
        objT = b0kVar.T();
        if (z3) {
            objT = new ggh(dwa1Var, iu30Var, ven0Var, ven0Var3);
            b0kVar.s0(objT);
        } else {
            objT = new ggh(dwa1Var, iu30Var, ven0Var, ven0Var3);
            b0kVar.s0(objT);
        }
        gwa1.c(f4, f5, z5, (iu30) objT, b0kVar, 0);
        b0kVar.r(true);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l0b1 l0b1Var = (l0b1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ldx ldxVar = ldx.c;
        boolean z = ((((iIntValue & 112) ^ 48) > 32 && x340Var.g(l0b1Var)) || (iIntValue & 48) == 32) | ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new dfi((byte) 27, l0b1Var, iu30Var);
            x340Var2.s0(objT);
        }
        wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(648448170, new l8i(l0b1Var, (byte) 29), x340Var2), x340Var2, 0, 6, 1020);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        y0b1 y0b1Var = (y0b1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = y0b1Var.b.b;
        int i2 = y0b1Var.a;
        boolean z = true;
        boolean z2 = (((iIntValue & 112) ^ 48) > 32 && x340Var.g(y0b1Var)) || (iIntValue & 48) == 32;
        if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z3 || objT == fkj0.X) {
            objT = new dfi((byte) 28, y0b1Var, iu30Var);
            x340Var2.s0(objT);
        }
        kln1.n(i2, 0, str, x340Var2, new f5q0((Function0) objT));
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        idx idxVar = new idx(4);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new qkj(iu30Var, (byte) 3);
            x340Var2.s0(objT);
        }
        foo1.c(new gbx(z50.c, (Function0) objT), idxVar, anm1.N("start_scanning_button_test_tag", nim0.a), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, alj.a, x340Var2, 0, 48, 2040);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        swb1 swb1Var = (swb1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        if (swb1Var.a == null) {
            x340Var.i0(1542082539);
            x340Var.r(false);
        } else {
            x340Var.i0(1542082540);
            boolean z = swb1Var.b;
            boolean z2 = true;
            boolean z3 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
            if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var.g(swb1Var)) && (iIntValue & 48) != 32) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objT = x340Var.T();
            if (z4 || objT == fkj0.X) {
                objT = new dfi(iu30Var, swb1Var, (byte) 29);
                x340Var.s0(objT);
            }
            n1p1.f(0, (Function0) objT, x340Var, (qim0) null, z);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        vyb1 vyb1Var = (vyb1) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        List<gd80> list = vyb1Var.a;
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(vyb1Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            float f2 = 1.0f;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            if (list.isEmpty()) {
                x340Var2.i0(2009180299);
                x340Var2.r(false);
            } else {
                x340Var2.i0(2008401889);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                qim0 qim0VarY = uyn1.y(qim0VarF2, 16.0f, 4.0f);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarY);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar4);
                nko1.H(xos0VarM2, x340Var2, lljVar3);
                x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar);
                x340Var2.i0(347968315);
                for (gd80 gd80Var : list) {
                    wnb0 wnb0Var = new wnb0(f2, true);
                    uwr uwrVar2 = cbx.a;
                    long j = cbx.a(x340Var2).a.c;
                    cua cuaVar = cbx.b(x340Var2).f;
                    qim0 qim0VarF3 = dug.f(wnb0Var, j, er31.b(4.0f));
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode3 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM3 = x340Var2.m();
                    qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF3);
                    hzj.A.getClass();
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, lljVar4);
                    nko1.H(xos0VarM3, x340Var2, lljVar3);
                    x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                    nko1.H(qim0VarE3, x340Var2, lljVar);
                    j6p1.c(gd80Var, x340Var2, 0);
                    x340Var2.r(true);
                    f2 = 1.0f;
                }
                us71.m(x340Var2, false, true, false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        int i2;
        long jB;
        int i3;
        byte b2 = this.a;
        max haxVar = jax.a;
        z50 z50Var = z50.c;
        float f2 = 16.0f;
        nim0 nim0Var = nim0.a;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b991 b991Var = (b991) obj2;
                iu30 iu30Var = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                x340 x340Var = (b0k) obj4;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = oqi.d1;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
                if (b991Var.a) {
                    x340Var.i0(185819280);
                    z = false;
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(185821383);
                    haxVar = new hax(cwl1.o0(x340Var, 2131954446));
                    x340Var.r(false);
                }
                max maxVar = haxVar;
                if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
                    z2 = z;
                }
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new ogj(iu30Var, (byte) 17);
                    x340Var.s0(objT2);
                }
                jto1.b(qim0VarB, (uvx) null, maxVar, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) objT2), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, sij.a, x340Var, 0, 196608, 32698);
                return rih1Var;
            case 1:
                ((Number) obj5).intValue();
                zr7.g(((ue91) obj2).a, (b0k) obj4, 0);
                return rih1Var;
            case 2:
                kka kkaVar = (kka) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                boolean z3 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var2.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                if ((((iIntValue2 & 112) ^ 48) <= 32 || !x340Var2.i(kkaVar)) && (iIntValue2 & 48) != 32) {
                    z2 = false;
                }
                boolean z4 = z2 | z3;
                x340 x340Var3 = x340Var2;
                Object objT3 = x340Var3.T();
                if (z4 || objT3 == fkj0.X) {
                    objT3 = new xui(iu30Var2, kkaVar, (byte) 2);
                    x340Var3.s0(objT3);
                }
                aq8.o(kkaVar, (qim0) null, (Function0) objT3, x340Var3, (iIntValue2 >> 3) & 14);
                return rih1Var;
            case 3:
                kka kkaVar2 = (kka) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                boolean z5 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var4.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                if ((((iIntValue3 & 112) ^ 48) <= 32 || !x340Var4.g(kkaVar2)) && (iIntValue3 & 48) != 32) {
                    z2 = false;
                }
                boolean z6 = z5 | z2;
                x340 x340Var5 = x340Var4;
                Object objT4 = x340Var5.T();
                if (z6 || objT4 == fkj0.X) {
                    objT4 = new xui(iu30Var3, kkaVar2, (byte) 3);
                    x340Var5.s0(objT4);
                }
                aq8.o(kkaVar2, (qim0) null, (Function0) objT4, x340Var5, (iIntValue3 >> 3) & 14);
                return rih1Var;
            case 4:
                th91 th91Var = (th91) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                c380 c380Var = th91Var.a;
                boolean z7 = th91Var.b;
                int i4 = th91Var.c;
                int i5 = (iIntValue4 & 896) ^ 384;
                boolean z8 = (i5 > 256 && x340Var6.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                x340 x340Var7 = x340Var6;
                Object objT5 = x340Var7.T();
                if (z8 || objT5 == m4cVar2) {
                    objT5 = new k4j(iu30Var4, (byte) 20);
                    x340Var7.s0(objT5);
                }
                iu30 iu30Var5 = (iu30) objT5;
                if ((i5 <= 256 || !x340Var7.g(iu30Var4)) && (iIntValue4 & 384) != 256) {
                    z2 = false;
                }
                Object objT6 = x340Var7.T();
                if (z2 || objT6 == m4cVar2) {
                    objT6 = new ogj(iu30Var4, (byte) 18);
                    x340Var7.s0(objT6);
                }
                kbb.l(c380Var, z7, i4, iu30Var5, (Function0) objT6, (qim0) null, x340Var7, 0);
                return rih1Var;
            case 5:
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var8.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var9 = x340Var8;
                Object objT7 = x340Var9.T();
                if (z2 || objT7 == fkj0.X) {
                    objT7 = new ogj(iu30Var6, (byte) 19);
                    x340Var9.s0(objT7);
                }
                cx91.a((Function0) objT7, x340Var9, 0);
                return rih1Var;
            case 6:
                tm80.q((g8a1) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 7:
                hr80.f((o8a1) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 8:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                String strO0 = cwl1.o0(b0kVar, 2131962778);
                uwr uwrVar = cbx.a;
                uwo1.e(strO0, (qim0) null, cbx.d(b0kVar).k, cbx.a(b0kVar).b.f, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1714);
                return rih1Var;
            case 9:
                zaa1 zaa1Var = (zaa1) obj2;
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                hqq0.z(zaa1Var.b, apo.r(-1510252941, new ip0((byte) 18, zaa1Var, (iu30) obj3), b0kVar2), b0kVar2, 48);
                return rih1Var;
            case 10:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                qim0 qim0VarN = anm1.N("song-dna-search-button", nim0Var);
                if ((((iIntValue6 & 896) ^ 384) <= 256 || !x340Var10.g(iu30Var7)) && (iIntValue6 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var11 = x340Var10;
                Object objT8 = x340Var11.T();
                if (z2 || objT8 == fkj0.X) {
                    objT8 = new ogj(iu30Var7, (byte) 21);
                    x340Var11.s0(objT8);
                }
                wro1.h(new gbx(z50Var, (Function0) objT8), ldx.c, qim0VarN, (max) null, yla.r(x340Var11), (vzq0) null, false, (idn0) null, (ga80) null, sjj.a, x340Var11, 0, 6, 984);
                return rih1Var;
            case 11:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                String str = ((uba1) obj2).d;
                if ((((iIntValue7 & 896) ^ 384) <= 256 || !x340Var12.g(iu30Var8)) && (iIntValue7 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var13 = x340Var12;
                Object objT9 = x340Var13.T();
                if (z2 || objT9 == fkj0.X) {
                    objT9 = new ogj(iu30Var8, (byte) 22);
                    x340Var13.s0(objT9);
                }
                rqt0.l(0, 2, str, (Function0) objT9, x340Var13, (qim0) null);
                return rih1Var;
            case 12:
                ((Number) obj5).intValue();
                sca1.a.e(((rca1) obj2).b, (b0k) obj4, 0);
                return rih1Var;
            case 13:
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                qim0 qim0VarN2 = anm1.N("song-dna-share-button", nim0Var);
                if ((((iIntValue8 & 896) ^ 384) <= 256 || !x340Var14.g(iu30Var9)) && (iIntValue8 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var15 = x340Var14;
                Object objT10 = x340Var15.T();
                if (z2 || objT10 == fkj0.X) {
                    objT10 = new ogj(iu30Var9, (byte) 23);
                    x340Var15.s0(objT10);
                }
                wro1.h(new gbx(z50Var, (Function0) objT10), ldx.c, qim0VarN2, (max) null, yla.r(x340Var15), (vzq0) null, false, (idn0) null, (ga80) null, bkj.a, x340Var15, 0, 6, 984);
                return rih1Var;
            case 14:
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                gdx gdxVarS = yla.s(x340Var16);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var16).b;
                cvx cvxVar2 = cbx.b(x340Var16).b;
                zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
                qim0 qim0VarN3 = anm1.N("dsl_sort_button", nim0Var);
                String strO1 = cwl1.o0(x340Var16, 2131955159);
                if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var16.g(iu30Var10)) && (iIntValue9 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var17 = x340Var16;
                Object objT11 = x340Var17.T();
                if (z2 || objT11 == m4cVar3) {
                    objT11 = new ogj(iu30Var10, (byte) 24);
                    x340Var17.s0(objT11);
                }
                Function0 function0 = (Function0) objT11;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(strO1), function0);
                cr31 cr31VarB = er31.b(4.0f);
                Object objT12 = x340Var17.T();
                if (objT12 == m4cVar3) {
                    objT12 = oij.a1;
                    x340Var17.s0(objT12);
                }
                vu30 vu30Var = (vu30) objT12;
                Object objT13 = x340Var17.T();
                if (objT13 == m4cVar3) {
                    objT13 = oij.b1;
                    x340Var17.s0(objT13);
                }
                foo1.c(gbxVar, new hdx(0, vu30Var, (vu30) objT13, (vu30) null, cr31VarB, 9), qim0VarN3, (max) null, gdxVarS, zzq0Var, (idn0) null, (ga80) null, (vu30) null, (vu30) null, ekj.a, x340Var17, 0, 48, 1944);
                return rih1Var;
            case 15:
                zia1 zia1Var = (zia1) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                if ((iIntValue10 & 48) == 0) {
                    i2 = (x340Var18.g(zia1Var) ? 32 : 16) | iIntValue10;
                } else {
                    i2 = iIntValue10;
                }
                if ((iIntValue10 & 384) == 0) {
                    i2 |= x340Var18.i(iu30Var11) ? 256 : 128;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    xia1.a(zia1Var.a, zia1Var.b, zia1Var.c, iu30Var11, u291.f(nim0Var, 1.0f), zia1Var.e, zia1Var.d, x340Var19, ((i2 << 3) & 7168) | 24576);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 16:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                c380 c380Var2 = ((kka1) obj2).a;
                if ((((iIntValue11 & 896) ^ 384) <= 256 || !x340Var20.g(iu30Var12)) && (iIntValue11 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var21 = x340Var20;
                Object objT14 = x340Var21.T();
                if (z2 || objT14 == fkj0.X) {
                    objT14 = new v0j(iu30Var12, (byte) 10);
                    x340Var21.s0(objT14);
                }
                i541.h(c380Var2, (vu30) objT14, (qim0) null, "SourceChips.Row", x340Var21, 3072);
                return rih1Var;
            case 17:
                x340 x340Var22 = (b0k) obj4;
                ((Number) obj5).intValue();
                int iOrdinal = ((pma1) obj2).ordinal();
                if (iOrdinal == 0) {
                    x340 x340Var23 = x340Var22;
                    x340Var23.i0(148925775);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var23).b;
                    x340Var23.r(false);
                } else {
                    if (iOrdinal != 1) {
                        throw p3d1.k(x340Var22, 148923767, false);
                    }
                    x340 x340Var24 = x340Var22;
                    x340Var24.i0(148927570);
                    uwr uwrVar4 = cbx.a;
                    f2 = cbx.b(x340Var24).b.b;
                    x340Var24.r(false);
                }
                op71.g(x340Var22, u291.h(nim0Var, f2));
                return rih1Var;
            case 18:
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                int i6 = (iIntValue12 & 896) ^ 384;
                boolean z9 = (i6 > 256 && x340Var25.g(iu30Var13)) || (iIntValue12 & 384) == 256;
                x340 x340Var26 = x340Var25;
                Object objT15 = x340Var26.T();
                if (z9 || objT15 == m4cVar4) {
                    objT15 = new ogj(iu30Var13, (byte) 25);
                    x340Var26.s0(objT15);
                }
                Function0 function1 = (Function0) objT15;
                boolean z10 = (i6 > 256 && x340Var26.g(iu30Var13)) || (iIntValue12 & 384) == 256;
                Object objT16 = x340Var26.T();
                if (z10 || objT16 == m4cVar4) {
                    objT16 = new ogj(iu30Var13, (byte) 26);
                    x340Var26.s0(objT16);
                }
                Function0 function2 = (Function0) objT16;
                if ((i6 <= 256 || !x340Var26.g(iu30Var13)) && (iIntValue12 & 384) != 256) {
                    z2 = false;
                }
                Object objT17 = x340Var26.T();
                if (z2 || objT17 == m4cVar4) {
                    objT17 = new ogj(iu30Var13, (byte) 27);
                    x340Var26.s0(objT17);
                }
                jyo1.b(2131962825, function1, function2, (Function0) objT17, x340Var26, 0);
                return rih1Var;
            case 19:
                hta1 hta1Var = (hta1) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var27, 0);
                x340 x340Var28 = x340Var27;
                int iHashCode = Long.hashCode(x340Var28.T);
                xos0 xos0VarM = x340Var28.m();
                qim0 qim0VarE = zr7.E(x340Var27, qim0VarF);
                hzj.A.getClass();
                x340 x340Var29 = x340Var27;
                if (x340Var29.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var29.m0();
                if (x340Var29.S) {
                    x340Var29.l(hmb0.t1);
                } else {
                    x340Var29.v0();
                }
                nko1.H(jw31VarA, x340Var27, y580.O0);
                nko1.H(xos0VarM, x340Var27, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var27, y580.R0);
                nko1.F(x340Var27);
                nko1.H(qim0VarE, x340Var27, y580.Y);
                String strO2 = cwl1.o0(x340Var27, 2131962824);
                uwr uwrVar5 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var27).g;
                long j = cbx.a(x340Var27).b.a;
                int i7 = (iIntValue13 & 896) ^ 384;
                boolean z11 = (i7 > 256 && x340Var29.g(iu30Var14)) || (iIntValue13 & 384) == 256;
                Object objT18 = x340Var29.T();
                if (z11 || objT18 == m4cVar5) {
                    objT18 = new ogj(iu30Var14, (byte) 28);
                    x340Var29.s0(objT18);
                }
                cgj1.h(strO2, lee1Var, j, true, (Function0) objT18, x340Var27, 3072);
                uwo1.e(cwl1.o0(x340Var27, 2131962844), (qim0) null, cbx.d(x340Var27).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var27, 0, 0, 2042);
                String strO3 = cwl1.o0(x340Var27, 2131962839);
                lee1 lee1Var2 = cbx.d(x340Var27).h;
                long j2 = cbx.a(x340Var27).b.c;
                boolean z12 = hta1Var.b;
                boolean z13 = (i7 > 256 && x340Var29.g(iu30Var14)) || (iIntValue13 & 384) == 256;
                Object objT19 = x340Var29.T();
                if (z13 || objT19 == m4cVar5) {
                    objT19 = new ogj(iu30Var14, (byte) 29);
                    x340Var29.s0(objT19);
                }
                cgj1.h(strO3, lee1Var2, j2, z12, (Function0) objT19, x340Var27, 0);
                x340Var29.r(true);
                return rih1Var;
            case 20:
                kva1 kva1Var = (kva1) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var30 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                boolean z14 = kva1Var.b;
                boolean z15 = kva1Var.c;
                uwr uwrVar6 = cbx.a;
                cua cuaVar = cbx.b(x340Var30).f;
                cr31 cr31VarB2 = er31.b(6.0f);
                x340 x340Var31 = x340Var30;
                Object objT20 = x340Var31.T();
                m4c m4cVar6 = fkj0.X;
                if (objT20 == m4cVar6) {
                    objT20 = ktd.n(x340Var31);
                }
                idn0 idn0Var = (idn0) objT20;
                ven0 ven0VarM = k1u.m(idn0Var, x340Var31, 0);
                float f3 = z15 ? 0.4f : 1.0f;
                qim0 qim0VarF2 = dug.f(i1p1.q(u291.f(nim0Var, 1.0f), cr31VarB2), (!((Boolean) ven0VarM.getValue()).booleanValue() || z15) ? u7h.b(u7h.f, 0.07f, 0.0f, 0.0f, 0.0f, 14) : u7h.b(u7h.f, 0.12f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                boolean z16 = ((((iIntValue14 & 896) ^ 384) > 256 && x340Var31.g(iu30Var15)) || (iIntValue14 & 384) == 256) | ((((iIntValue14 & 112) ^ 48) > 32 && x340Var31.g(kva1Var)) || (iIntValue14 & 48) == 32);
                Object objT21 = x340Var31.T();
                if (z16 || objT21 == m4cVar6) {
                    objT21 = new dfi((byte) 26, kva1Var, iu30Var15);
                    x340Var31.s0(objT21);
                }
                qim0 qim0VarV = bin.v(qim0VarF2, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT21, 28);
                cvx cvxVar4 = cbx.b(x340Var31).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarV);
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var31, 0);
                int iHashCode2 = Long.hashCode(x340Var31.T);
                xos0 xos0VarM2 = x340Var31.m();
                qim0 qim0VarE2 = zr7.E(x340Var31, qim0VarZ);
                hzj.A.getClass();
                if (x340Var31.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var31.m0();
                if (x340Var31.S) {
                    x340Var31.l(hmb0.t1);
                } else {
                    x340Var31.v0();
                }
                nko1.H(mbhVarA, x340Var31, y580.O0);
                nko1.H(xos0VarM2, x340Var31, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var31, y580.R0);
                nko1.F(x340Var31);
                nko1.H(qim0VarE2, x340Var31, y580.Y);
                if (!z14 || z15) {
                    x340Var31.i0(-767660267);
                    jB = u7h.b(cbx.a(x340Var31).b.a, f3, 0.0f, 0.0f, 0.0f, 14);
                    x340Var31.r(false);
                } else {
                    x340Var31.i0(-767721368);
                    jB = cbx.a(x340Var31).b.c;
                    x340Var31.r(false);
                }
                long j3 = jB;
                w0h1.a(z14 ? spx.c : xpx.c, new jsl(cwl1.o0(x340Var31, z14 ? 2131962836 : 2131962837)), u291.r(nim0Var, cbx.b(x340Var31).b.b), j3, 0L, false, x340Var31, 8, 48);
                cvx cvxVar5 = cbx.b(x340Var31).b;
                uwo1.e(ydh.g(4.0f, 2131962835, x340Var31, x340Var31, nim0Var), (qim0) null, cbx.d(x340Var31).j, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var31, 0, 0, 2034);
                x340Var31.r(true);
                return rih1Var;
            case 21:
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var32 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                m4c m4cVar7 = fkj0.X;
                int i8 = (iIntValue15 & 896) ^ 384;
                boolean z17 = (i8 > 256 && x340Var32.g(iu30Var16)) || (iIntValue15 & 384) == 256;
                x340 x340Var33 = x340Var32;
                Object objT22 = x340Var33.T();
                if (z17 || objT22 == m4cVar7) {
                    objT22 = new qkj(iu30Var16, (byte) 0);
                    x340Var33.s0(objT22);
                }
                Function0 function3 = (Function0) objT22;
                boolean z18 = (i8 > 256 && x340Var33.g(iu30Var16)) || (iIntValue15 & 384) == 256;
                Object objT23 = x340Var33.T();
                if (z18 || objT23 == m4cVar7) {
                    objT23 = new qkj(iu30Var16, (byte) 1);
                    x340Var33.s0(objT23);
                }
                Function0 function4 = (Function0) objT23;
                if ((i8 <= 256 || !x340Var33.g(iu30Var16)) && (iIntValue15 & 384) != 256) {
                    z2 = false;
                }
                Object objT24 = x340Var33.T();
                if (z2 || objT24 == m4cVar7) {
                    objT24 = new qkj(iu30Var16, (byte) 2);
                    x340Var33.s0(objT24);
                }
                jyo1.b(2131962840, function3, function4, (Function0) objT24, x340Var33, 0);
                return rih1Var;
            case 22:
                return a(obj, obj2, obj3, obj4, obj5);
            case 23:
                return d(obj, obj2, obj3, obj4, obj5);
            case 24:
                return e(obj, obj2, obj3, obj4, obj5);
            case 25:
                int iIntValue16 = ((Number) obj5).intValue() >> 3;
                xzn1.f((rib1) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (iIntValue16 & 112) | (iIntValue16 & 14) | 8);
                return rih1Var;
            case 26:
                return f(obj, obj2, obj3, obj4, obj5);
            case 27:
                return g(obj, obj2, obj3, obj4, obj5);
            case 28:
                return h(obj, obj2, obj3, obj4, obj5);
            default:
                b0c1 b0c1Var = (b0c1) obj2;
                iu30 iu30Var17 = (iu30) obj3;
                x340 x340Var34 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                if ((iIntValue17 & 48) == 0) {
                    i3 = iIntValue17 | (x340Var34.g(b0c1Var) ? 32 : 16);
                } else {
                    i3 = iIntValue17;
                }
                if ((iIntValue17 & 384) == 0) {
                    i3 |= x340Var34.i(iu30Var17) ? 256 : 128;
                }
                x340 x340Var35 = x340Var34;
                if (x340Var35.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    String strO4 = cwl1.o0(x340Var35, 2131958135);
                    String str2 = b0c1Var.c;
                    String strO5 = cwl1.o0(x340Var35, 2131958132);
                    if (!b0c1Var.b) {
                        haxVar = new hax(b0c1Var.c);
                    }
                    max maxVar2 = haxVar;
                    z2 = (i3 & 896) == 256;
                    Object objT25 = x340Var35.T();
                    if (z2 || objT25 == fkj0.X) {
                        objT25 = new qkj(iu30Var17, (byte) 4);
                        x340Var35.s0(objT25);
                    }
                    gxo1.a(strO4, strO5, (qim0) null, str2, maxVar2, (Function0) objT25, x340Var35, 0, 4);
                } else {
                    x340Var35.b0();
                }
                return rih1Var;
        }
    }
}
