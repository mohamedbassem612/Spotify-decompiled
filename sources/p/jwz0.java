package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jwz0 {
    public final String a;
    public final n5f0 b;

    public jwz0(String str, n5f0 n5f0Var) {
        this.a = str;
        this.b = n5f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwz0)) {
            return false;
        }
        jwz0 jwz0Var = (jwz0) obj;
        return u890.j(this.a, jwz0Var.a) && this.b.equals(jwz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
