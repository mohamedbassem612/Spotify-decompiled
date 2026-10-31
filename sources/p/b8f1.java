package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b8f1 {
    public static final df41 d = kyo1.t(new p5e1((byte) 15), new f6f0((byte) 27));
    public float a;
    public final drr0 b;
    public final drr0 c;

    public b8f1(float f, float f2, float f3) {
        this.a = f;
        this.b = exd0.u(f3);
        this.c = exd0.u(f2);
    }

    public final float a() {
        if (this.a == 0.0f) {
            return 0.0f;
        }
        return this.c.s() / this.a;
    }

    public final void b(float f) {
        this.c.t(yoi1.o(f, this.a, 0.0f));
    }
}
