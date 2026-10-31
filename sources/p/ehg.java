package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ehg implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ehg(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        idn0 idn0Var;
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-756081143);
                ga80 ga80Var = (ga80) x340Var.k(da80.a);
                if (ga80Var != null) {
                    x340Var.i0(-1604682242);
                    x340Var.r(false);
                    idn0Var = null;
                } else {
                    x340Var.i0(-1604549624);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    idn0Var = (idn0) objT;
                    x340Var.r(false);
                }
                qim0 qim0VarU = bin.u(nim0.a, idn0Var, ga80Var, true, (String) null, (pm31) null, this.b);
                x340Var.r(false);
                return qim0VarU;
            default:
                ifh0 ifh0Var = (ifh0) obj;
                afh0 afh0Var = (afh0) obj2;
                hjl hjlVar = (hjl) obj3;
                float f = ((p3v) this.b.invoke()).a;
                q5t0 q5t0VarH = afh0Var.H(hjl.b(hjlVar.a, 0, 0, jjl.f(p3v.c(f, Float.NaN) ? 0 : ifh0Var.i0(f), hjlVar.a), 0, 11));
                return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 17));
        }
    }
}
