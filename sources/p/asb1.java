package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class asb1 extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asb1(float f, boolean z) {
        super(3);
        this.a = z;
        this.b = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(1013963902);
        boolean z = this.a;
        nim0 nim0Var = nim0.a;
        if (!z) {
            x340Var.r(false);
            return nim0Var;
        }
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = c97.b(0.0f);
            x340Var.s0(objT);
        }
        o95 o95Var = (o95) objT;
        boolean zI = x340Var.i(o95Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new b(o95Var, (lnm) null, (byte) 21);
            x340Var.s0(objT2);
        }
        qxd0.t(rih1.a, x340Var, (vu30) objT2);
        float f = this.b;
        boolean zD = x340Var.d(f) | x340Var.i(o95Var);
        Object objT3 = x340Var.T();
        if (zD || objT3 == m4cVar) {
            objT3 = new fu90(f, o95Var);
            x340Var.s0(objT3);
        }
        qim0 qim0VarR = exd0.r(nim0Var, (iu30) objT3);
        x340Var.r(false);
        return qim0VarR;
    }
}
