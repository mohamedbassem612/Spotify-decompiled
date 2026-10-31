package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t591 {
    public final r591 a;
    public final String b;
    public final String c;
    public final q591 d;
    public final boolean e;

    public t591(r591 r591Var, String str, String str2, q591 q591Var, boolean z) {
        this.a = r591Var;
        this.b = str;
        this.c = str2;
        this.d = q591Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t591)) {
            return false;
        }
        t591 t591Var = (t591) obj;
        return this.a == t591Var.a && u890.j(this.b, t591Var.b) && u890.j(this.c, t591Var.c) && this.d.equals(t591Var.d) && this.e == t591Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
