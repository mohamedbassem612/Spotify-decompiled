package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l5e1 implements vu30 {
    public final /* synthetic */ tob1 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ vu30 d;

    public l5e1(fhg1 fhg1Var, long j, lee1 lee1Var, vu30 vu30Var) {
        this.a = fhg1Var;
        this.b = j;
        this.c = lee1Var;
        this.d = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            tob1 tob1Var = this.a;
            boolean zG = x340Var2.g(tob1Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new ups(tob1Var, (byte) 2);
                x340Var2.s0(objT);
            }
            qim0 qim0VarC = i541.C(nim0.a, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            llj lljVar = y580.R0;
            if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var2, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var2, y580.Y);
            i3p1.g(this.b, this.c, this.d, x340Var2, 0);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
