package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uuq0 implements o960 {
    public final n960 a;
    public final n960 b;

    public uuq0(n960 n960Var, n960 n960Var2) {
        this.a = n960Var;
        this.b = n960Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuq0)) {
            return false;
        }
        uuq0 uuq0Var = (uuq0) obj;
        return this.a.equals(uuq0Var.a) && this.b.equals(uuq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
