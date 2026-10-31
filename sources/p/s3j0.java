package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s3j0 {
    public final n3j0 a;
    public final q3j0 b;
    public final m3t c;

    public s3j0(n3j0 n3j0Var, q3j0 q3j0Var, m3t m3tVar) {
        this.a = n3j0Var;
        this.b = q3j0Var;
        this.c = m3tVar;
    }

    public final n3j0 a() {
        return this.a;
    }

    public final iu30 b() {
        return this.c;
    }

    public final q3j0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s3j0) {
            s3j0 s3j0Var = (s3j0) obj;
            return u890.j(this.a, s3j0Var.a) && u890.j(this.b, s3j0Var.b) && this.c == s3j0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
