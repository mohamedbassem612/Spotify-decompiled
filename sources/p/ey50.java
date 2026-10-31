package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ey50 {
    public final boolean a;
    public final vu30 b;

    public ey50(boolean z, vu30 vu30Var) {
        this.a = z;
        this.b = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey50)) {
            return false;
        }
        ey50 ey50Var = (ey50) obj;
        return this.a == ey50Var.a && this.b.equals(ey50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
