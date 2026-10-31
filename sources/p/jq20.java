package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jq20 {
    public final float a;
    public final float b;
    public final long c;

    public jq20(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq20)) {
            return false;
        }
        jq20 jq20Var = (jq20) obj;
        return Float.compare(this.a, jq20Var.a) == 0 && Float.compare(this.b, jq20Var.b) == 0 && this.c == jq20Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return pze0.h(this.c, ")", gvg.m("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="));
    }
}
