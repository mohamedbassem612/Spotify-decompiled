package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v3d1 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ hw61 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qqb e;
    public final /* synthetic */ idn0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ j2i t;

    public v3d1(qim0 qim0Var, hw61 hw61Var, long j, float f, qqb qqbVar, idn0 idn0Var, boolean z, Function0 function0, float f2, j2i j2iVar) {
        this.a = qim0Var;
        this.b = hw61Var;
        this.c = j;
        this.d = f;
        this.e = qqbVar;
        this.f = idn0Var;
        this.g = z;
        this.h = function0;
        this.i = f2;
        this.t = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            vq60 vq60Var = jw80.a;
            qim0 qim0VarThen = bin.v(w3d1.c(this.a.then(tsj0.a), this.b, w3d1.d(this.c, this.d, x340Var2), this.e, ((wat) x340Var2.k(t4k.h)).X0(this.i)), this.f, ai31.a(0.0f, 7, false), this.g, (String) null, (pm31) null, this.h, 24).then(new j2g(new u1c((byte) 4)));
            gfh0 gfh0VarC = t1c.c(een.d, true);
            int iK = tgp1.k(x340Var2);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
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
            dv20.l(0, this.t, x340Var2, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
