package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lzj1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;

    public lzj1(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzj1)) {
            return false;
        }
        lzj1 lzj1Var = (lzj1) obj;
        return u890.j(this.a, lzj1Var.a) && u890.j(this.b, lzj1Var.b) && this.c == lzj1Var.c && this.d == lzj1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
