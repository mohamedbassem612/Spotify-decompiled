package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fyb implements vu30 {
    public final /* synthetic */ vy71 a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ vu30 g;

    public fyb(vy71 vy71Var, c9n c9nVar, boolean z, String str, String str2, String str3, vu30 vu30Var) {
        this.a = vy71Var;
        this.b = c9nVar;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        Object obj3 = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            vy71 vy71Var = this.a;
            boolean zG = x340Var2.g(vy71Var);
            c9n c9nVar = this.b;
            boolean zI = zG | x340Var2.i(c9nVar);
            Object objT = x340Var2.T();
            if (zI || objT == obj3) {
                objT = new cyb(vy71Var, c9nVar, (byte) 0);
                x340Var2.s0(objT);
            }
            qim0 qim0VarW = bin.w((Function0) objT);
            boolean zG2 = x340Var2.g(vy71Var) | x340Var2.h(this.c) | x340Var2.g(this.d) | x340Var2.i(c9nVar) | x340Var2.g(this.e) | x340Var2.g(this.f);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == obj3) {
                eyb eybVar = new eyb((byte) 0, this.a, this.d, this.e, this.f, this.b, this.c);
                x340Var2.s0(eybVar);
                objT2 = eybVar;
            }
            qim0 qim0VarB = s161.b(qim0VarW, true, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var2);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            us71.j(0, this.g, x340Var2, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
