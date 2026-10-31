package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yux {
    public final float a;
    public final float b;
    public final float c;

    public yux(float f) {
        this.a = f;
        this.b = 0.7853982f;
        this.c = (float) Math.tan(0.7853981852531433d);
    }

    public float a() {
        return this.b;
    }

    public float b(float f) {
        return (f / this.c) * this.a;
    }

    public float c(float f) {
        return (f / 336.0f) * this.b;
    }

    public /* synthetic */ yux(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ yux() {
        float f = 16.0f;
        this(f, f, 24.0f);
    }
}
