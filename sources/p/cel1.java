package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cel1 implements vr20 {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public cel1(float[] fArr, int i, boolean z, ven0 ven0Var) {
        this.a = fArr;
        this.b = i;
        this.c = z;
        this.d = ven0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        float fFloatValue = ((Number) obj).floatValue();
        float[] fArr = this.a;
        f46.X(fArr, fArr, 8);
        fArr[this.b - 1] = fFloatValue;
        if (!this.c) {
            this.d.setValue(Arrays.copyOf(fArr, fArr.length));
        }
        return rih1.a;
    }
}
