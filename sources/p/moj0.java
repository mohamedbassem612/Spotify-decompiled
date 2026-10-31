package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class moj0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public moj0(float f) {
        float fZ = g0p1.z(25.5f, 34.0f, f);
        this.a = fZ;
        float fZ2 = g0p1.z(3.5f, 5.0f, f);
        this.b = fZ2;
        float f2 = fZ + fZ2;
        this.c = f2;
        float f3 = f / 2.0f;
        float f4 = (c1q0.d + f3) / f2;
        this.d = f4;
        this.e = f < 48.0f ? f3 / f2 : f4;
        this.f = g0p1.z(60.0f, 80.0f, f);
        this.g = g0p1.z(2.0f, 2.5f, f);
        this.h = g0p1.z(0.75f, 1.0f, f);
    }
}
