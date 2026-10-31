package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class usn0 {
    public final ntn0 a;
    public final boolean b;

    public usn0(ntn0 ntn0Var, boolean z) {
        this.a = ntn0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usn0)) {
            return false;
        }
        usn0 usn0Var = (usn0) obj;
        return this.a.equals(usn0Var.a) && this.b == usn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
