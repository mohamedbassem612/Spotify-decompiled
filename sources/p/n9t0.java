package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n9t0 {
    public final int a;
    public final String b;

    public n9t0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9t0)) {
            return false;
        }
        n9t0 n9t0Var = (n9t0) obj;
        return this.a == n9t0Var.a && this.b.equals(n9t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
