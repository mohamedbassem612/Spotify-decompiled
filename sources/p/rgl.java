package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rgl {
    public final float a;
    public final double b;
    public final int c;
    public final long d;
    public int e;

    public rgl(long j, float f, int i) {
        dm5.m(j > 0);
        dm5.m(f > 0.0f);
        dm5.m(0 < j);
        this.d = j;
        this.a = f;
        this.c = Math.max(Math.round((j / 1000000.0f) * f), 1);
        this.b = 1000000.0f / f;
    }

    public final rgl a() {
        return new rgl(this.d, this.a, 0);
    }

    public final boolean b() {
        return this.e < this.c;
    }
}
