package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ns2 {
    public final h290 a;
    public final h290 b;

    public ns2(h290 h290Var, h290 h290Var2) {
        this.a = h290Var;
        this.b = h290Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns2)) {
            return false;
        }
        ns2 ns2Var = (ns2) obj;
        return this.a.equals(ns2Var.a) && this.b.equals(ns2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
