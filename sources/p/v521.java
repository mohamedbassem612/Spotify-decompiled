package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v521 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public v521(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v521)) {
            return false;
        }
        v521 v521Var = (v521) obj;
        return u890.j(this.a, v521Var.a) && u890.j(this.b, v521Var.b) && u890.j(this.c, v521Var.c) && this.d == v521Var.d && this.e == v521Var.e;
    }

    public final int hashCode() {
        return wxn0.c.hashCode() + xcg1.g(ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }
}
