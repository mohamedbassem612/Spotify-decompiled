package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lp30 implements hw61 {
    public final float a;

    public lp30(float f) {
        this.a = f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        float fO;
        float f = rck.b;
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) > 0.0f) {
            float f2 = this.a;
            if (f2 <= 0.0f) {
                fO = 0.6567f;
            } else {
                fO = yoi1.o((Float.intBitsToFloat((int) (j >> 32)) / f2) / Float.intBitsToFloat(i), 0.0f, 1.0f);
            }
        } else {
            fO = 0.6567f;
        }
        return new xie1(16.0f, 16.0f, 16.0f, fO).a(j, flb0Var, watVar);
    }
}
