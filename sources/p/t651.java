package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t651 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ u651 b;
    public final /* synthetic */ od51 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t651(qim0 qim0Var, u651 u651Var, od51 od51Var) {
        super(2);
        this.d = qim0Var;
        this.b = u651Var;
        this.c = od51Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object d351Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        od51 od51Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                qim0 qim0VarD = u291.d(qim0Var, 1.0f);
                ue20 ue20Var = od51Var.d;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                u651 u651Var = this.b;
                z72 z72Var = u651Var.h;
                bpb1 bpb1Var = u651Var.l;
                otw.c(z72Var, u651Var.i, (qim0) null, (ipb1) null, x340Var2, 8, 12);
                boolean zG = x340Var2.g(ue20Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    bpb1Var.l(ue20Var);
                    x340Var2.s0(rih1Var);
                }
                rwq.h(bpb1Var, x340Var2, 0).getValue();
                ue20 ue20Var2 = (ue20) bpb1Var.getValue();
                if (ue20Var2 instanceof te20) {
                    d351Var = new e351(fqo1.J((te20) ue20Var2));
                } else {
                    if (!(ue20Var2 instanceof re20) && !ue20Var2.equals(se20.a)) {
                        eg.o();
                        return null;
                    }
                    d351Var = new d351(fqo1.I(ue20Var2));
                }
                if (d351Var instanceof e351) {
                    x340Var2.i0(-496501732);
                    otw.c((uh91) u651Var.k.getValue(), ((e351) d351Var).a, (qim0) null, (ipb1) null, x340Var2, 8, 12);
                    x340Var2.r(false);
                } else {
                    if (!(d351Var instanceof d351)) {
                        throw p3d1.k(x340Var2, -496505225, false);
                    }
                    x340Var2.i0(-496497609);
                    otw.c(u651Var.j, ((d351) d351Var).a, (qim0) null, (ipb1) null, x340Var2, 72, 12);
                    x340Var2.r(false);
                }
                lw41 lw41Var = od51Var.a;
                if (lw41Var instanceof lw41) {
                    x340Var2.i0(1788634980);
                    u651Var.a(lw41Var, od51Var.e, od51Var.f, od51Var.h, null, x340Var2, 0);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1788887723);
                    x340Var2.r(false);
                }
                x340Var2.r(true);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                this.b.b(od51Var, qim0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t651(u651 u651Var, od51 od51Var, qim0 qim0Var, int i) {
        super(2);
        this.b = u651Var;
        this.c = od51Var;
        this.d = qim0Var;
    }
}
