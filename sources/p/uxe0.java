package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uxe0 {
    public final l3f0 a;
    public final boolean b;

    public uxe0(l3f0 l3f0Var, boolean z) {
        this.a = l3f0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxe0)) {
            return false;
        }
        uxe0 uxe0Var = (uxe0) obj;
        return u890.j(this.a, uxe0Var.a) && this.b == uxe0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
