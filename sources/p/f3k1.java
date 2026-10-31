package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f3k1 {
    public final String a;
    public final boolean b;

    public f3k1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3k1)) {
            return false;
        }
        f3k1 f3k1Var = (f3k1) obj;
        return u890.j(this.a, f3k1Var.a) && this.b == f3k1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
