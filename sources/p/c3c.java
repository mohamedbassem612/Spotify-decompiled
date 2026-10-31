package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c3c extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3c(float f, ven0 ven0Var, vu30 vu30Var, float f2) {
        super(2);
        this.a = (byte) 6;
        this.b = f;
        this.d = ven0Var;
        this.e = vu30Var;
        this.c = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                hav0 hav0Var = (hav0) obj;
                float fFloatValue = ((Number) obj2).floatValue();
                hav0Var.a();
                ((tui1) obj4).a(hav0Var.b, hav0Var.c);
                drr0 drr0Var = (drr0) obj3;
                lee1 lee1Var = g3c.a;
                drr0Var.t(yoi1.o(drr0Var.s() - (fFloatValue * f2), 0.0f, f));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                g3p1.c((l0e0) obj4, this.b, this.c, (qim0) obj3, (b0k) obj, iP);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                cuo1.a((s8a) obj4, this.b, this.c, (qim0) obj3, (b0k) obj, iP2);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                r4o1.D((c380) obj4, this.b, this.c, (qim0) obj3, (b0k) obj, iP3);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(1);
                kto1.o(this.b, this.c, (jxc1) obj4, (qim0) obj3, (b0k) obj, iP4);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(3457);
                smo1.h(this.b, this.c, (qim0) obj4, (j2i) obj3, (b0k) obj, iP5);
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                nim0 nim0Var = nim0.a;
                qim0 qim0VarX = u291.x(0.0f, 500.0f, 1, nim0Var);
                tob1 tob1Var = (tob1) obj4;
                vu30 vu30Var = (vu30) obj3;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                qim0 qim0VarN = fc11.n(h2c.a.b(nim0Var), 2.0f, 2.0f, (hw61) null);
                uwr uwrVar = cbx.a;
                long jB = u7h.b(cbx.a(x340Var2).a.c, 0.55f, 0.0f, 0.0f, 0.0f, 14);
                cua cuaVar = cbx.b(x340Var2).f;
                t1c.a(dug.f(qim0VarN, jB, er31.b(8.0f)), x340Var2, 0);
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 8.0f);
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = gbm1.i;
                    x340Var2.s0(objT);
                }
                qim0 qim0VarA = s161.a(qim0VarY, (iu30) objT);
                cvx cvxVar3 = cbx.b(x340Var2).b;
                jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var2, 48);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                ikx ikxVar = ikx.c;
                long j = cbx.a(x340Var2).b.a;
                boolean zD = x340Var2.d(f2) | x340Var2.g(tob1Var);
                Object objT2 = x340Var2.T();
                if (zD || objT2 == m4cVar) {
                    objT2 = new b0e0(f2, tob1Var, (byte) 3);
                    x340Var2.s0(objT2);
                }
                oon1.g(ikxVar, j, (Function0) objT2, x340Var2, ikx.d);
                qgo1.f((vnr0) vu30Var.invoke(x340Var2, 0), new wnb0(1.0f, false), (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 60);
                jkx jkxVar = jkx.c;
                long j2 = cbx.a(x340Var2).b.a;
                boolean zD2 = x340Var2.d(f) | x340Var2.g(tob1Var);
                Object objT3 = x340Var2.T();
                if (zD2 || objT3 == m4cVar) {
                    objT3 = new b0e0(f, tob1Var, (byte) 4);
                    x340Var2.s0(objT3);
                }
                oon1.g(jkxVar, j2, (Function0) objT3, x340Var2, jkx.d);
                x340Var2.r(true);
                x340Var2.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3c(byte b, float f, float f2, int i, Object obj, Object obj2) {
        super(2);
        this.a = b;
        this.b = f;
        this.c = f2;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3c(Object obj, float f, float f2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3c(tui1 tui1Var, float f, float f2, drr0 drr0Var) {
        super(2);
        this.a = (byte) 0;
        this.d = tui1Var;
        this.b = f;
        this.c = f2;
        this.e = drr0Var;
    }
}
