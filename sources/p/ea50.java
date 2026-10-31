package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ea50 {
    public final gc50 a;
    public final String b;

    public ea50(gc50 gc50Var, String str) {
        this.a = gc50Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea50)) {
            return false;
        }
        ea50 ea50Var = (ea50) obj;
        return this.a.equals(ea50Var.a) && this.b.equals(ea50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
