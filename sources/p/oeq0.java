package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oeq0 extends hab0 implements xu30 {
    public final /* synthetic */ r1q0 a;
    public final /* synthetic */ ods b;
    public final /* synthetic */ float c;
    public final /* synthetic */ rzo0 d;
    public final /* synthetic */ gfq0 e;
    public final /* synthetic */ th61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeq0(r1q0 r1q0Var, ods odsVar, float f, rzo0 rzo0Var, gfq0 gfq0Var, th61 th61Var) {
        super(3);
        this.a = r1q0Var;
        this.b = odsVar;
        this.c = f;
        this.d = rzo0Var;
        this.e = gfq0Var;
        this.f = th61Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        ods odsVar = this.b;
        boolean zI = x340Var.i(odsVar);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new nds(odsVar, (byte) 2);
            x340Var.s0(objT);
        }
        j2i j2iVarR = apo.r(-455389699, new e0a(this.c, this.d, this.e, this.f, this.b), x340Var);
        d1o1.f(this.a, (Function0) objT, j2iVarR, x340Var, 384);
        return rih1.a;
    }
}
