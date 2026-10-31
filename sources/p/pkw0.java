package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pkw0 {
    public final float a;
    public final int b;

    public pkw0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkw0)) {
            return false;
        }
        pkw0 pkw0Var = (pkw0) obj;
        return Float.compare(this.a, pkw0Var.a) == 0 && this.b == pkw0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
