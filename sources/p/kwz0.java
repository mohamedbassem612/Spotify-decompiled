package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kwz0 {
    public final String a;
    public final n5f0 b;

    public kwz0(String str, n5f0 n5f0Var) {
        this.a = str;
        this.b = n5f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwz0)) {
            return false;
        }
        kwz0 kwz0Var = (kwz0) obj;
        return this.a.equals(kwz0Var.a) && this.b.equals(kwz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
