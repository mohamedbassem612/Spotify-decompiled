package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i5d0 {
    public final String a;
    public final iu30 b;

    public i5d0(String str, iu30 iu30Var) {
        this.a = str;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5d0)) {
            return false;
        }
        i5d0 i5d0Var = (i5d0) obj;
        return u890.j(this.a, i5d0Var.a) && this.b.equals(i5d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
