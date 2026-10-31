package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l2d0 {
    public final float a;
    public final boolean b;

    public l2d0(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2d0)) {
            return false;
        }
        l2d0 l2d0Var = (l2d0) obj;
        return Float.compare(this.a, l2d0Var.a) == 0 && this.b == l2d0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
