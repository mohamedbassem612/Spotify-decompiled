package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n4o0 {
    public final z0o0 a;
    public final z0o0 b;
    public final z0o0 c;

    public n4o0(z0o0 z0o0Var, z0o0 z0o0Var2, z0o0 z0o0Var3) {
        this.a = z0o0Var;
        this.b = z0o0Var2;
        this.c = z0o0Var3;
    }

    public final z0o0 a() {
        return this.a;
    }

    public final z0o0 b() {
        return this.c;
    }

    public final z0o0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4o0)) {
            return false;
        }
        n4o0 n4o0Var = (n4o0) obj;
        return this.a.equals(n4o0Var.a) && this.b.equals(n4o0Var.b) && this.c.equals(n4o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
