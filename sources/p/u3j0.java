package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u3j0 {
    public final s3j0 a;
    public final boolean b;

    public u3j0(s3j0 s3j0Var, boolean z) {
        this.a = s3j0Var;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final s3j0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3j0)) {
            return false;
        }
        u3j0 u3j0Var = (u3j0) obj;
        return u890.j(this.a, u3j0Var.a) && this.b == u3j0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
