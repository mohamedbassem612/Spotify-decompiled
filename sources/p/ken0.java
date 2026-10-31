package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ken0 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final boolean b() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final void c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.a += fIntBitsToFloat;
        this.b += fIntBitsToFloat2;
        this.c += fIntBitsToFloat;
        this.d += fIntBitsToFloat2;
    }

    public final String toString() {
        String strZ = yah0.z(this.a);
        String strZ2 = yah0.z(this.b);
        return rjx.o(gvg.n("MutableRect(", strZ, ", ", strZ2, ", "), yah0.z(this.c), ", ", yah0.z(this.d), ")");
    }
}
