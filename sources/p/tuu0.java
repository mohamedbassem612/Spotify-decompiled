package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tuu0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ puu0 b;
    public final /* synthetic */ uuu0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tom f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tuu0(puu0 puu0Var, uuu0 uuu0Var, iu30 iu30Var, boolean z, tom tomVar) {
        super(3);
        this.b = puu0Var;
        this.c = uuu0Var;
        this.d = iu30Var;
        this.e = z;
        this.f = tomVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        float f2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        boolean z = this.e;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (z) {
                    x340Var2.i0(951548123);
                    x340Var2.r(false);
                    f = 0.0f;
                } else {
                    x340Var2.i0(951549245);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    x340Var2.r(false);
                    f = 16.0f;
                }
                if (z) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(951551741);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var3).b;
                    x340Var3.r(false);
                    f2 = 16.0f;
                } else {
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(951552123);
                    x340Var4.r(false);
                    f2 = 0.0f;
                }
                qim0 qim0VarB = uyn1.B(nim0.a, f, 0.0f, f2, 0.0f, 10);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var5 = x340Var;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                x340 x340Var6 = x340Var;
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                c101 c101Var = (c101) this.c.i.getValue();
                String str = this.f.a;
                List list = this.b.f;
                iu30 iu30Var = this.d;
                boolean zG = x340Var6.g(iu30Var);
                Object objT = x340Var6.T();
                if (zG || objT == fkj0.X) {
                    objT = new azr0(iu30Var, (byte) 25);
                    x340Var6.s0(objT);
                }
                otw.c(c101Var, new a101(str, 4, list, this.e, (iu30) objT), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var6.r(true);
                return rih1Var;
            default:
                g2c g2cVar = (g2c) obj;
                ((Number) obj3).intValue();
                puu0 puu0Var = this.b;
                boolean z2 = !puu0Var.f.isEmpty();
                uuu0 uuu0Var = this.c;
                tvu0 tvu0Var = (tvu0) uuu0Var.t.getValue();
                zuu0 zuu0Var = puu0Var.a;
                boolean z3 = puu0Var.c;
                x340 x340Var7 = (b0k) obj2;
                iu30 iu30Var2 = this.d;
                boolean zG2 = x340Var7.g(iu30Var2);
                Object objT2 = x340Var7.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new azr0(iu30Var2, (byte) 24);
                    x340Var7.s0(objT2);
                }
                otw.c(tvu0Var, new dvu0(zuu0Var, z3, (iu30) objT2), (qim0) null, (ipb1) null, x340Var7, 0, 12);
                qim0 qim0VarA = g2cVar.a(nim0.a, z ? een.Y : een.t);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var7.T);
                xos0 xos0VarM2 = x340Var7.m();
                qim0 qim0VarE2 = zr7.E(x340Var7, qim0VarA);
                hzj.A.getClass();
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(gfh0VarC2, x340Var7, y580.O0);
                nko1.H(xos0VarM2, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE2, x340Var7, y580.Y);
                fq7.g(z2, (qim0) null, (bby) null, xay.l(15, (ni20) null), (String) null, apo.r(1221100537, new tuu0(this.e, uuu0Var, this.f, puu0Var, iu30Var2), x340Var7), x340Var7, 196608, 22);
                x340Var7.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tuu0(boolean z, uuu0 uuu0Var, tom tomVar, puu0 puu0Var, iu30 iu30Var) {
        super(3);
        this.e = z;
        this.c = uuu0Var;
        this.f = tomVar;
        this.b = puu0Var;
        this.d = iu30Var;
    }
}
