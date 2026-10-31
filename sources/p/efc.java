package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class efc implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vzq0 b;
    public final /* synthetic */ j2i c;

    public /* synthetic */ efc(vzq0 vzq0Var, j2i j2iVar, byte b) {
        this.a = b;
        this.b = vzq0Var;
        this.c = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        vzq0 vzq0Var = this.b;
        byte b2 = 1;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s9e1.a(((m2h1) x340Var2.k(q2h1.b)).k, apo.r(165539859, new efc(vzq0Var, j2iVar, b2), x340Var2), x340Var2, 48);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = x340Var;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarW = uyn1.w(u291.a(nim0.a, tec.a, tec.b), vzq0Var);
                    jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var3, 54);
                    int iK = tgp1.k(x340Var3);
                    xos0 xos0VarM = x340Var3.m();
                    qim0 qim0VarE = zr7.E(x340Var3, qim0VarW);
                    hzj.A.getClass();
                    if (x340Var3.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(hmb0.t1);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(jw31VarA, x340Var3, y580.O0);
                    nko1.H(xos0VarM, x340Var3, y580.N0);
                    llj lljVar = y580.R0;
                    if (x340Var3.S || !u890.j(x340Var3.T(), Integer.valueOf(iK))) {
                        z5c.f(iK, x340Var3, iK, lljVar);
                    }
                    nko1.H(qim0VarE, x340Var3, y580.Y);
                    j2iVar.invoke(pw31.a, x340Var3, 6);
                    x340Var3.r(true);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
        }
    }
}
