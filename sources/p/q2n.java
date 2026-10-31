package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q2n implements vu30 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ q2n(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        int i = 2;
        int i2 = 0;
        switch (b) {
            case 0:
                ClassLoader classLoader = (ClassLoader) obj6;
                c1h1 c1h1Var = (c1h1) obj5;
                b4b0 b4b0Var = (b4b0) obj2;
                r2n r2nVar = ((Function0) obj4) == null ? null : new r2n(new ka((p811) obj3, (byte) 16), ((Number) obj).intValue(), (byte) 0);
                if (b4b0Var.equals(b4b0.c)) {
                    return tma0.c;
                }
                int i3 = b4b0Var.a;
                if (i3 != 0) {
                    int iC = l1d.C(i3);
                    if (iC == 0) {
                        i = 1;
                    } else if (iC != 1) {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i = 3;
                    }
                    i2 = i;
                }
                y3b0 y3b0Var = b4b0Var.b;
                return new tma0(i2, y3b0Var != null ? ajo1.B(y3b0Var, classLoader, c1h1Var, r2nVar) : null);
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarX = t3k1.x(nim0.a, "Container");
                    on5 on5Var = new on5((ven0) obj6, ven0.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 7);
                    i3p1.y((w5e1) obj5);
                    qim0 qim0VarS = exd0.s(qim0VarX, new pg(on5Var, (vzq0) obj4, een.P0, (byte) 24));
                    vu30 vu30Var = (vu30) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, true);
                    int iK = tgp1.k(x340Var2);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarS);
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
                    us71.j(0, vu30Var, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
        }
    }
}
