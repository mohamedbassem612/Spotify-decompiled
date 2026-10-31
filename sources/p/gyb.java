package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gyb implements vu30 {
    public final /* synthetic */ vy71 a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ boolean e;

    public gyb(vy71 vy71Var, vu30 vu30Var, j2i j2iVar, c9n c9nVar, boolean z) {
        this.a = vy71Var;
        this.b = vu30Var;
        this.c = j2iVar;
        this.d = c9nVar;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0VarC = i541.C(u291.f(nim0.a, 1.0f), new vxb(this.a, (byte) 0));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iK = tgp1.k(x340Var2);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarC);
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
            llj lljVar = y580.R0;
            if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var2, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var2, y580.Y);
            vu30 vu30Var = this.b;
            if (vu30Var != null) {
                x340Var2.i0(-1044068159);
                ly71.b(54, apo.r(-511691176, new fyb(this.a, this.d, this.e, bno1.q(x340Var2, 2131957934), bno1.q(x340Var2, 2131957931), bno1.q(x340Var2, 2131957932), vu30Var), x340Var2), x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1040260677);
                x340Var2.r(false);
            }
            this.c.invoke(pbh.a, x340Var2, 6);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
