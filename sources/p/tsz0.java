package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tsz0 {
    public final String a;
    public final boolean b;

    public tsz0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsz0)) {
            return false;
        }
        tsz0 tsz0Var = (tsz0) obj;
        return u890.j(this.a, tsz0Var.a) && this.b == tsz0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
