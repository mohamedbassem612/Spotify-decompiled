package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class del1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public del1(int i, float[] fArr, float f, ven0 ven0Var) {
        super(1);
        this.a = i;
        this.b = fArr;
        this.c = f;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj) {
        ((Number) obj).longValue();
        ven0 ven0Var = this.d;
        float[] fArr = (float[]) ven0Var.getValue();
        int i = this.a;
        float[] fArr2 = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            fArr2[i2] = ((this.b[i2] - f) * this.c) + f;
        }
        ven0Var.setValue(fArr2);
        return rih1.a;
    }
}
