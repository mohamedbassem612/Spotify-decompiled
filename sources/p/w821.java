package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w821 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final m821 f;
    public final int g;

    public w821(String str, String str2, String str3, String str4, boolean z, m821 m821Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = m821Var;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w821)) {
            return false;
        }
        w821 w821Var = (w821) obj;
        return this.a.equals(w821Var.a) && u890.j(this.b, w821Var.b) && u890.j(this.c, w821Var.c) && u890.j(this.d, w821Var.d) && this.e == w821Var.e && this.f.equals(w821Var.f) && this.g == w821Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((this.f.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }
}
