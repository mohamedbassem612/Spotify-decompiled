package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j9d1 {
    public final int a;
    public final w8d1 b;

    public j9d1(int i, w8d1 w8d1Var) {
        this.a = i;
        this.b = w8d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9d1)) {
            return false;
        }
        j9d1 j9d1Var = (j9d1) obj;
        return this.a == j9d1Var.a && this.b.equals(j9d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
