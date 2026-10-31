package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e730 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public e730(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e730)) {
            return false;
        }
        e730 e730Var = (e730) obj;
        return u890.j(this.a, e730Var.a) && u890.j(this.b, e730Var.b) && this.c == e730Var.c && this.d == e730Var.d && this.e == e730Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
