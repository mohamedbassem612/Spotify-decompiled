package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j6w0 {
    public final z7a a;
    public final k6w0 b;

    public j6w0(z7a z7aVar, k6w0 k6w0Var) {
        this.a = z7aVar;
        this.b = k6w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6w0)) {
            return false;
        }
        j6w0 j6w0Var = (j6w0) obj;
        return u890.j(this.a, j6w0Var.a) && u890.j(this.b, j6w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
