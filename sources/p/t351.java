package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t351 implements ez00 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final r351 e;

    public t351(String str, String str2, int i, boolean z, r351 r351Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = r351Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t351)) {
            return false;
        }
        t351 t351Var = (t351) obj;
        return this.a.equals(t351Var.a) && u890.j(this.b, t351Var.b) && this.c == t351Var.c && this.d == t351Var.d && u890.j(this.e, t351Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(ab80.k(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d);
        r351 r351Var = this.e;
        return iG + (r351Var != null ? r351Var.hashCode() : 0);
    }
}
