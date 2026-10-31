package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uc60 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc60(hd60 hd60Var, byte b) {
        super(3);
        this.a = b;
        this.b = hd60Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        k960 k960Var;
        qim0 qim0VarA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hd60 hd60Var = this.b;
        qim0 qim0Var = nim0.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i2c i2cVar = (i2c) obj;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                v960.a(z4p1.e(hd60Var.e), z4p1.e(hd60Var.h), z4p1.e(hd60Var.g), hd60Var.d, i2cVar.b(qim0Var), x340Var, 0);
                float fD = i2cVar.d();
                float fC = i2cVar.c() * 0.45f;
                qim0 qim0VarB = i2cVar.b(qim0Var);
                uwr uwrVar = cbx.a;
                qim0 qim0VarB2 = uyn1.B(qim0VarB, 0.0f, cbx.b(x340Var).e.a, 0.0f, 0.0f, 13);
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                boolean z = x340Var3.S;
                n4k n4kVar = hmb0.t1;
                if (z) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                qim0 qim0VarH = u291.h(u291.f(qim0Var, 1.0f), fC);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                boo1.r(hd60Var, fD, fC, x340Var, 6);
                x340Var3.r(true);
                qim0 qim0VarA2 = uyn1.A(kx40.h(1.0f, u291.f(qim0Var, 1.0f), true), cbx.b(x340Var).e.a, cbx.b(x340Var).e.b, cbx.b(x340Var).e.a, cbx.b(x340Var).e.b);
                gfh0 gfh0VarC2 = t1c.c(een.e, false);
                int iHashCode3 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM3 = x340Var3.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA2);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                i3a.l(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                String str = hd60Var.b;
                ibx ibxVarP = bno1.p(x340Var);
                long jE = z4p1.e(hd60Var.f);
                int i = mhc0.b;
                int iC = ila0.C(3, 3, 1);
                long j = cbx.d(x340Var).g.a.b;
                long j2 = cbx.d(x340Var).d.a.b;
                Object obj4 = ajx.a.b;
                zmo1.e(str, u291.f(qim0Var, 1.0f), ibxVarP, jE, new a0e1(3), new mhc0(iC), 2, false, 6, new s61(j, j2, 150.0f, 50.0f, mqo1.A(p7h.M(new Integer[]{50, 60, 75, 85, 96, 110, 125, 150}))), null, x340Var, 100663808, 1152);
                x340Var3.r(true);
                x340Var3.r(true);
                return rih1Var;
            default:
                i2c i2cVar2 = (i2c) obj;
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                float fD2 = i2cVar2.d();
                gd60 gd60Var = hd60Var.c;
                if (gd60Var instanceof ad60) {
                    k960Var = if50.a;
                } else if (gd60Var instanceof cd60) {
                    k960Var = fy81.a;
                } else if (gd60Var instanceof bd60) {
                    k960Var = quq0.a;
                } else if (gd60Var instanceof ed60) {
                    k960Var = gke1.a;
                } else if (gd60Var instanceof fd60) {
                    k960Var = hke1.a;
                } else if (gd60Var instanceof dd60) {
                    k960Var = b8b1.a;
                } else {
                    if (!(gd60Var instanceof zc60)) {
                        eg.o();
                        return null;
                    }
                    k960Var = i2u.a;
                }
                float f = k960Var.b;
                float f2 = fD2 / k960Var.a;
                hcx hcxVar = hcx.b;
                float fA = (fD2 - (hcxVar.a(b0kVar) + 4.0f)) + 4.0f;
                if (p3v.b(f2 * f, fA) <= 0) {
                    qim0VarA = qim0Var;
                } else {
                    f2 = fA / f;
                    qim0VarA = i2cVar2.a(qim0Var, een.e);
                }
                boo1.q(gd60Var, f2, fD2, qim0VarA, b0kVar, 0, 0);
                voo1.a(hd60Var.l, hcxVar, 2.0f, 4.0f, z4p1.e(hd60Var.e), i2cVar2.a(qim0Var, een.X), b0kVar, 3504);
                return rih1Var;
        }
    }
}
