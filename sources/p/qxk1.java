package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qxk1 {
    public final String a;
    public final String b;
    public final String c;
    public final tv80 d;

    public qxk1(String str, String str2, String str3, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxk1)) {
            return false;
        }
        qxk1 qxk1Var = (qxk1) obj;
        return u890.j(this.a, qxk1Var.a) && u890.j(this.b, qxk1Var.b) && u890.j(this.c, qxk1Var.c) && u890.j(this.d, qxk1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
