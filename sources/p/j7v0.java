package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j7v0 extends h7p1 {
    public final String c;
    public final boolean d;

    public j7v0(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7v0)) {
            return false;
        }
        j7v0 j7v0Var = (j7v0) obj;
        return u890.j(this.c, j7v0Var.c) && this.d == j7v0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
