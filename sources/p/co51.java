package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class co51 {
    public long a;
    public iui1 b;
    public boolean c;
    public float d;
    public final ke5 e = new ke5(0.0f);
    public ke5 f;
    public long g;
    public long h;

    public final fui1 a() {
        return this.b;
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final ke5 d() {
        return this.f;
    }

    public final long e() {
        return this.a;
    }

    public final ke5 f() {
        return this.e;
    }

    public final float g() {
        return this.d;
    }

    public final void h(long j) {
        this.h = j;
    }

    public final void i(boolean z) {
        this.c = z;
    }

    public final void j(long j) {
        this.g = j;
    }

    public final void k(long j) {
        this.a = j;
    }

    public final void l(float f) {
        this.d = f;
    }

    public final String toString() {
        return "progress nanos: " + this.a + ", animationSpec: " + this.b + ", isComplete: " + this.c + ", value: " + this.d + ", start: " + this.e + ", initialVelocity: " + this.f + ", durationNanos: " + this.g + ", animationSpecDuration: " + this.h;
    }
}
