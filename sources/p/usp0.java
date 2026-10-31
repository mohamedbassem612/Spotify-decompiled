package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class usp0 {
    public final float a;
    public final int b;

    public usp0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usp0)) {
            return false;
        }
        usp0 usp0Var = (usp0) obj;
        return Float.compare(this.a, usp0Var.a) == 0 && this.b == usp0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
