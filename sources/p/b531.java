package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b531 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final tv80 e;

    public b531(String str, String str2, String str3, String str4, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b531)) {
            return false;
        }
        b531 b531Var = (b531) obj;
        return u890.j(this.a, b531Var.a) && this.b.equals(b531Var.b) && this.c.equals(b531Var.c) && this.d.equals(b531Var.d) && u890.j(this.e, b531Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
