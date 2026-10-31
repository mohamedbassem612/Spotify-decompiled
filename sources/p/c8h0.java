package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c8h0 implements hw61 {
    public final float a;

    public c8h0(float f) {
        this.a = f;
    }

    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        float fO = yoi1.o(this.a / 0.8f, 0.0f, 1.0f);
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        ceo ceoVar = ka5.a;
        float fE = l1d.e(fIntBitsToFloat2, fIntBitsToFloat, fO, fIntBitsToFloat);
        float fIntBitsToFloat3 = (Float.intBitsToFloat(i) - fE) / 2.0f;
        float f = fIntBitsToFloat3 + fE;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i2) / 2.0f;
        return new jtq0(ila0.g(fIntBitsToFloat3, 0.0f, f, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8h0) && Float.compare(this.a, ((c8h0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
