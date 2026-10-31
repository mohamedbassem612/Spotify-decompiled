package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fk3 implements kk3, lk3 {
    public final String a;
    public final String b;
    public final String c;

    public fk3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // p.lk3
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk3)) {
            return false;
        }
        fk3 fk3Var = (fk3) obj;
        return u890.j(this.a, fk3Var.a) && u890.j(this.b, fk3Var.b) && u890.j(this.c, fk3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
