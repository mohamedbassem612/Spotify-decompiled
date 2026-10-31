package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ql50 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql50(c380 c380Var, byte b) {
        super(3);
        this.a = b;
        this.b = c380Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strU;
        b0k b0kVar;
        x340 x340Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        c380 c380Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                shx.a(this.b, (qim0) null, hcx.d, (idn0) null, (b0k) obj2, 392, 58);
                return rih1Var;
            case 1:
                nw31 nw31Var = (nw31) obj;
                ((Number) obj3).intValue();
                qim0 qim0VarR = u291.r(nim0Var, 12.0f);
                x340 x340Var2 = (b0k) obj2;
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = r850.d1;
                    x340Var2.s0(objT);
                }
                c0p1.b(nw31Var.d(qim0VarR, (iu30) objT), x340Var2, 0);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.v(nim0Var, 2.0f));
                if (c380Var.size() == 1) {
                    x340Var2.i0(-1316518971);
                    x340Var2.r(false);
                    strU = ((jl50) o7h.q0(c380Var)).b;
                } else {
                    x340Var2.i0(-1316517855);
                    strU = cwl1.U(2131820728, c380Var.size(), new Object[]{Integer.valueOf(c380Var.size())}, x340Var2);
                    x340Var2.r(false);
                }
                uwo1.e(strU, nw31Var.c(nim0Var), cbx.d(x340Var2).j, cbx.a(x340Var2).c.c, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                shx.a(this.b, (qim0) null, hcx.d, (idn0) null, (b0k) obj2, 392, 58);
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qxy0.l(c380Var, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
                x340 x340Var5 = (x340) b0kVar2;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = (x340) b0kVar2;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                x340Var6.i0(674419998);
                int i = 0;
                for (Object obj4 : c380Var) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str = (String) obj4;
                    if (i > 0) {
                        x340Var6.i0(-2105712239);
                        uwr uwrVar2 = cbx.a;
                        b0kVar = b0kVar2;
                        x340Var = x340Var6;
                        uwo1.e(" · ", (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, b0kVar, 6, 0, 1778);
                        x340Var.r(false);
                    } else {
                        b0kVar = b0kVar2;
                        x340Var = x340Var6;
                        x340Var.i0(-2105500819);
                        x340Var.r(false);
                    }
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1714);
                    x340Var6 = x340Var;
                    i = i2;
                    b0kVar2 = b0kVar;
                }
                x340 x340Var7 = x340Var6;
                x340Var7.r(false);
                x340Var7.r(true);
                return rih1Var;
            case 5:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var8, 0);
                x340 x340Var9 = x340Var8;
                int iHashCode2 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM2 = x340Var9.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarF);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(mbhVarA, x340Var8, y580.O0);
                nko1.H(xos0VarM2, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE2, x340Var8, y580.Y);
                lgo1.m(c380Var, x340Var8, 0);
                x340Var10.i0(-169779933);
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    lgo1.l((m0c1) it.next(), x340Var8, 0);
                }
                x340Var10.r(false);
                x340Var10.r(true);
                return rih1Var;
            default:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                Iterator it2 = c380Var.iterator();
                while (it2.hasNext()) {
                    u1p1.c((txd1) it2.next(), (qim0) null, b0kVar3, 0, 2);
                }
                return rih1Var;
        }
    }
}
