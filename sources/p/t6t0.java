package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t6t0 {
    public final float a;
    public final float b;
    public final int c;
    public final float d;

    public t6t0(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6t0)) {
            return false;
        }
        t6t0 t6t0Var = (t6t0) obj;
        return Float.compare(this.a, t6t0Var.a) == 0 && Float.compare(this.b, t6t0Var.b) == 0 && this.c == t6t0Var.c && Float.compare(this.d, t6t0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + kaa0.f(this.c, x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public /* synthetic */ t6t0(int i, float f, float f2) {
        this(f, f2, 0.33846155f, i);
    }
}
