package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ek01 extends hab0 implements zu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ i4m0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ hce0 e;
    public final /* synthetic */ rjz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek01(float f, i4m0 i4m0Var, iu30 iu30Var, vu30 vu30Var, hce0 hce0Var, rjz rjzVar) {
        super(4);
        this.a = f;
        this.b = i4m0Var;
        this.c = iu30Var;
        this.d = vu30Var;
        this.e = hce0Var;
        this.f = rjzVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        hl01 hl01Var = (hl01) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        gra graVar = een.h;
        boolean z = hl01Var instanceof gl01;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        float f = this.a;
        if (z) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(513190480);
            qim0 qim0VarJ = u291.j(f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarJ);
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
            nko1.H(gfh0VarC, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            otw.c(this.e, rih1Var, (qim0) null, (ipb1) null, x340Var2, 48, 12);
            x340Var2.r(true);
            x340Var2.r(false);
            return rih1Var;
        }
        if (hl01Var instanceof fl01) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(513200517);
            guo1.v((fl01) hl01Var, this.b, this.c, this.d, x340Var3, (iIntValue >> 3) & 14);
            x340Var3.r(false);
            return rih1Var;
        }
        if (!(hl01Var instanceof el01)) {
            throw p3d1.k(x340Var, 513188730, false);
        }
        x340 x340Var4 = x340Var;
        x340Var4.i0(513208370);
        qim0 qim0VarJ2 = u291.j(f, 0.0f, 2, u291.f(nim0Var, 1.0f));
        gfh0 gfh0VarC2 = t1c.c(graVar, false);
        int iHashCode2 = Long.hashCode(x340Var4.T);
        xos0 xos0VarM2 = x340Var4.m();
        qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarJ2);
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
        nko1.H(gfh0VarC2, x340Var4, lljVar4);
        nko1.H(xos0VarM2, x340Var4, lljVar3);
        x0d.q(iHashCode2, x340Var4, lljVar2, x340Var4);
        nko1.H(qim0VarE2, x340Var4, lljVar);
        otw.c(this.f, new pjz(((el01) hl01Var).c), (qim0) null, (ipb1) null, x340Var4, 0, 12);
        x340Var4.r(true);
        x340Var4.r(false);
        return rih1Var;
    }
}
