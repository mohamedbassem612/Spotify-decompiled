package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xx50 implements yx50 {
    public final byte a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public xx50(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx50)) {
            return false;
        }
        xx50 xx50Var = (xx50) obj;
        return this.a == xx50Var.a && this.b == xx50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
