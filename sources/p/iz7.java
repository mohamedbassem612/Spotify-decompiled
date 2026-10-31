package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iz7 extends lz7 {
    public final rgt0 a;
    public final long b;

    public iz7(rgt0 rgt0Var, long j) {
        this.a = rgt0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz7)) {
            return false;
        }
        iz7 iz7Var = (iz7) obj;
        return u890.j(this.a, iz7Var.a) && this.b == iz7Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
