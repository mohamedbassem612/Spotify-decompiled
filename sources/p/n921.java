package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n921 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final wxn0 d;

    public n921(String str, boolean z, boolean z2, wxn0 wxn0Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = wxn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n921)) {
            return false;
        }
        n921 n921Var = (n921) obj;
        return this.a.equals(n921Var.a) && this.b == n921Var.b && this.c == n921Var.c && this.d == n921Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
