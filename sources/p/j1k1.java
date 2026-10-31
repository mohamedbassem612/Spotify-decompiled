package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j1k1 {
    public final String a;
    public final ibg0 b;

    public j1k1(String str, ibg0 ibg0Var) {
        this.a = str;
        this.b = ibg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1k1)) {
            return false;
        }
        j1k1 j1k1Var = (j1k1) obj;
        return this.a.equals(j1k1Var.a) && this.b == j1k1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
