package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cx50 {
    public final bkj0 a;
    public final bkj0 b;

    public cx50(bkj0 bkj0Var, bkj0 bkj0Var2) {
        this.a = bkj0Var;
        this.b = bkj0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx50)) {
            return false;
        }
        cx50 cx50Var = (cx50) obj;
        return this.a == cx50Var.a && this.b == cx50Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
