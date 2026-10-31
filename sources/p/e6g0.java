package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e6g0 extends n6g0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public e6g0(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6g0)) {
            return false;
        }
        e6g0 e6g0Var = (e6g0) obj;
        return u890.j(this.a, e6g0Var.a) && this.b == e6g0Var.b && u890.j(this.c, e6g0Var.c) && this.d == e6g0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
