package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lto0 {
    public final boolean a;
    public final jb00 b;

    public lto0(boolean z, jb00 jb00Var) {
        this.a = z;
        this.b = jb00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lto0)) {
            return false;
        }
        lto0 lto0Var = (lto0) obj;
        return this.a == lto0Var.a && this.b.equals(lto0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
