package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l250 extends m250 {
    public final String a;
    public final int b;
    public final String c;
    public final long d;

    public l250(int i, String str, String str2, long j) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l250)) {
            return false;
        }
        l250 l250Var = (l250) obj;
        return u890.j(this.a, l250Var.a) && this.b == l250Var.b && u890.j(this.c, l250Var.c) && this.d == l250Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
