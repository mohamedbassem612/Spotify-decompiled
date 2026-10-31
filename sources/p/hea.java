package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class hea implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hea(xah xahVar, l2h1 l2h1Var, l1i l1iVar, j2i j2iVar, int i) {
        this.c = xahVar;
        this.d = l2h1Var;
        this.e = l1iVar;
        this.b = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                qim0 qim0Var = (qim0) obj5;
                ven0 ven0Var = (ven0) obj4;
                gea geaVar = (gea) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objT = x340Var2.T();
                    Object obj6 = fkj0.X;
                    if (objT == obj6) {
                        objT = new g45(ven0Var, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT);
                    gfh0 gfh0VarC = t1c.c(een.d, true);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    this.b.invoke(x340Var2, 0);
                    Object objT2 = x340Var2.T();
                    if (objT2 == obj6) {
                        objT2 = new e45(ven0Var, (byte) 1);
                        x340Var2.s0(objT2);
                    }
                    geaVar.b((Function0) objT2, x340Var2, 6);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Integer) obj2).getClass();
                wu40.a((xah) obj5, (l2h1) obj4, (l1i) obj3, this.b, (b0k) obj, czo1.p(3073));
                return rih1Var;
        }
    }

    public /* synthetic */ hea(qim0 qim0Var, ven0 ven0Var, j2i j2iVar, gea geaVar) {
        this.c = qim0Var;
        this.d = ven0Var;
        this.b = j2iVar;
        this.e = geaVar;
    }
}
