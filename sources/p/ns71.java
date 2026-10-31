package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ns71 {
    public final w4i1 a;
    public final String b;

    public ns71(String str, w4i1 w4i1Var) {
        this.a = w4i1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns71)) {
            return false;
        }
        ns71 ns71Var = (ns71) obj;
        return this.a.equals(ns71Var.a) && this.b.equals(ns71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
