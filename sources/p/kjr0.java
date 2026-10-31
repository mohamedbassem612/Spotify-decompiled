package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class kjr0 implements xu30 {
    public final /* synthetic */ jkr0 a;
    public final /* synthetic */ flb0 b;
    public final /* synthetic */ float c;

    public /* synthetic */ kjr0(jkr0 jkr0Var, flb0 flb0Var, float f) {
        this.a = jkr0Var;
        this.b = flb0Var;
        this.c = f;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        float fFloatValue3 = ((Float) obj3).floatValue();
        jkr0 jkr0Var = this.a;
        boolean zW = p2o1.w(jkr0Var, fFloatValue);
        char c = 0;
        if (jkr0Var.k().e != qqq0.a) {
            if (this.b != flb0.a) {
                zW = !zW;
            }
        }
        int i = jkr0Var.k().b;
        float fP = i == 0 ? 0.0f : p2o1.p(jkr0Var) / i;
        float f = fP - ((int) fP);
        if (Math.abs(fFloatValue) >= jkr0Var.n.X0(400.0f)) {
            c = fFloatValue > 0.0f ? (char) 1 : (char) 2;
        }
        if (c == 0) {
            if (Math.abs(f) <= this.c) {
                float fAbs = Math.abs(fP);
                wat watVar = jkr0Var.n;
                kkr0 kkr0Var = lkr0.a;
                if (fAbs < Math.abs(Math.min(watVar.X0(56.0f), jkr0Var.m() / 2.0f) / jkr0Var.m()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zW) {
                    fFloatValue2 = fFloatValue3;
                }
            } else if (zW) {
                fFloatValue2 = fFloatValue3;
            }
        } else if (c == 1) {
            fFloatValue2 = fFloatValue3;
        } else if (c != 2) {
            fFloatValue2 = 0.0f;
        }
        return Float.valueOf(fFloatValue2);
    }
}
