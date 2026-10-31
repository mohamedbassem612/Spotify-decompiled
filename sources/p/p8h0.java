package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p8h0 {
    public final String a;
    public final tr80 b;

    public p8h0(String str, tr80 tr80Var) {
        this.a = str;
        this.b = tr80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8h0)) {
            return false;
        }
        p8h0 p8h0Var = (p8h0) obj;
        return this.a.equals(p8h0Var.a) && this.b.equals(p8h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
