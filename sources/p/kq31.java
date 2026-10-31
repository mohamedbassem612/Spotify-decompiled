package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kq31 implements qq31 {
    public final om21 a;
    public final long b;

    public kq31(om21 om21Var, long j) {
        this.a = om21Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq31)) {
            return false;
        }
        kq31 kq31Var = (kq31) obj;
        return this.a.equals(kq31Var.a) && this.b == kq31Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
