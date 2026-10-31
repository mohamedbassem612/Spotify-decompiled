package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k5w0 implements m5w0 {
    public final ng7 a;
    public final String b;

    public k5w0(ng7 ng7Var, String str) {
        this.a = ng7Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5w0)) {
            return false;
        }
        k5w0 k5w0Var = (k5w0) obj;
        return this.a.equals(k5w0Var.a) && this.b.equals(k5w0Var.b);
    }

    @Override // p.m5w0
    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
