package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class es90 implements fs90 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public es90(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es90)) {
            return false;
        }
        es90 es90Var = (es90) obj;
        return u890.j(this.a, es90Var.a) && u890.j(this.b, es90Var.b) && this.c == es90Var.c && this.d == es90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
