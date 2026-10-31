package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n4v0 implements ez00 {
    public final int a;
    public final String b;

    public n4v0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4v0)) {
            return false;
        }
        n4v0 n4v0Var = (n4v0) obj;
        return this.a == n4v0Var.a && this.b.equals(n4v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
