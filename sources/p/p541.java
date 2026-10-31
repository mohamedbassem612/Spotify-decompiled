package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p541 {
    public final String a;
    public final String b;
    public final q541 c;
    public final int d;
    public final String e;
    public final b9u0 f;

    public p541(String str, String str2, q541 q541Var, int i, String str3, b9u0 b9u0Var) {
        this.a = str;
        this.b = str2;
        this.c = q541Var;
        this.d = i;
        this.e = str3;
        this.f = b9u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p541)) {
            return false;
        }
        p541 p541Var = (p541) obj;
        return u890.j(this.a, p541Var.a) && u890.j(this.b, p541Var.b) && this.c == p541Var.c && this.d == p541Var.d && u890.j(this.e, p541Var.e) && this.f.equals(p541Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        q541 q541Var = this.c;
        int iHashCode = (iD + (q541Var == null ? 0 : q541Var.hashCode())) * 31;
        int i = this.d;
        int iC = (iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31;
        String str = this.e;
        return this.f.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }
}
