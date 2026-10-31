package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lpw0 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public lpw0(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpw0)) {
            return false;
        }
        lpw0 lpw0Var = (lpw0) obj;
        return this.a.equals(lpw0Var.a) && this.b.equals(lpw0Var.b) && this.c == lpw0Var.c && this.d == lpw0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
