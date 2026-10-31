package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t371 {
    public final s371 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public t371(s371 s371Var, String str, boolean z, boolean z2, boolean z3) {
        this.a = s371Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t371)) {
            return false;
        }
        t371 t371Var = (t371) obj;
        return this.a.equals(t371Var.a) && u890.j(this.b, t371Var.b) && this.c == t371Var.c && this.d == t371Var.d && this.e == t371Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }
}
