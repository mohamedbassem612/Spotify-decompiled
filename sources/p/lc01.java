package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lc01 extends hab0 implements xu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ wux b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ hdn0 g;
    public final /* synthetic */ hdn0 h;
    public final /* synthetic */ tob1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc01(Function0 function0, wux wuxVar, float f, float f2, ven0 ven0Var, ven0 ven0Var2, hdn0 hdn0Var, hdn0 hdn0Var2, tob1 tob1Var) {
        super(3);
        this.a = function0;
        this.b = wuxVar;
        this.c = f;
        this.d = f2;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.g = hdn0Var;
        this.h = hdn0Var2;
        this.i = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
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
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        sb01 sb01Var = (sb01) this.e.getValue();
        hc01 hc01Var = (hc01) this.f.getValue();
        int iS = this.g.s();
        int iS2 = this.h.s();
        tob1 tob1Var = this.i;
        zc01.f(sb01Var, this.a, hc01Var, this.b, iS, iS2, uyn1.B(dug.f(nim0Var, ((u7h) tob1Var.getValue()).a, d4o1.a), 0.0f, this.c, 0.0f, 0.0f, 13), x340Var, 0);
        qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), this.d);
        u7h u7hVar = (u7h) tob1Var.getValue();
        long j = u7hVar.a;
        t1c.a(dug.e(qim0VarH, v9c.s(p7h.M(new u7h[]{u7hVar, new u7h(u7h.b(((u7h) tob1Var.getValue()).a, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
        x340Var3.r(true);
        return rih1.a;
    }
}
