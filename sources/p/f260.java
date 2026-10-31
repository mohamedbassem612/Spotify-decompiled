package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f260 {
    public final float a;
    public final int b;

    public f260(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f260)) {
            return false;
        }
        f260 f260Var = (f260) obj;
        return Float.compare(this.a, f260Var.a) == 0 && this.b == f260Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
