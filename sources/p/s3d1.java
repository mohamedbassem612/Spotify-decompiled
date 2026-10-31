package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class s3d1 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ hw61 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ idn0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ j2i h;

    public /* synthetic */ s3d1(qim0 qim0Var, hw61 hw61Var, long j, float f, float f2, idn0 idn0Var, Function0 function0, j2i j2iVar) {
        this.a = qim0Var;
        this.b = hw61Var;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = idn0Var;
        this.g = function0;
        this.h = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Integer) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            kiv kivVar = kw80.a;
            qim0 qim0VarW = puo1.w(this.e, puo1.x(this.c, (lwr) x340Var2.k(fuw.a), this.d, x340Var2), this.a.then(usj0.a), this.b);
            kiv kivVar2 = bi31.a;
            long j = u7h.k;
            qim0 qim0VarV = bin.v(qim0VarW, this.f, (p3v.c(Float.NaN, Float.NaN) && z4h1.b(j, j)) ? bi31.b : new di31(true, j), true, (String) null, (pm31) null, this.g, 24);
            gfh0 gfh0VarC = t1c.c(een.d, true);
            int iK = tgp1.k(x340Var2);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarV);
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
            dv20.l(0, this.h, x340Var2, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
