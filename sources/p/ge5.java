package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ge5 {
    public final boolean a;
    public final float b;
    public final float c;
    public final float d;

    public ge5(boolean z, float f, float f2, float f3) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge5)) {
            return false;
        }
        ge5 ge5Var = (ge5) obj;
        return this.a == ge5Var.a && Float.compare(this.b, ge5Var.b) == 0 && Float.compare(this.c, ge5Var.c) == 0 && Float.compare(this.d, ge5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
