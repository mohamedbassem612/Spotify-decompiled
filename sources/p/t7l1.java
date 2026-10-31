package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t7l1 {
    public final h8l1 a;
    public final s7l1 b;

    public t7l1(h8l1 h8l1Var, s7l1 s7l1Var) {
        this.a = h8l1Var;
        this.b = s7l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7l1)) {
            return false;
        }
        t7l1 t7l1Var = (t7l1) obj;
        return this.a.equals(t7l1Var.a) && this.b.equals(t7l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
