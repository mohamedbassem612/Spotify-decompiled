package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ap3 extends hr3 {
    public final String a;
    public final String b;
    public final aey c;
    public final tv80 d;
    public final boolean e;

    public ap3(String str, String str2, aey aeyVar, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = aeyVar;
        this.d = tv80Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap3)) {
            return false;
        }
        ap3 ap3Var = (ap3) obj;
        return u890.j(this.a, ap3Var.a) && u890.j(this.b, ap3Var.b) && this.c == ap3Var.c && this.d.equals(ap3Var.d) && this.e == ap3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }
}
