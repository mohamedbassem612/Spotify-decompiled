package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ucc0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final hux f;

    public ucc0(int i, String str, String str2, int i2, String str3, hux huxVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = huxVar;
    }

    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucc0)) {
            return false;
        }
        ucc0 ucc0Var = (ucc0) obj;
        return this.a == ucc0Var.a && this.b.equals(ucc0Var.b) && this.c.equals(ucc0Var.c) && this.d == ucc0Var.d && u890.j(this.e, ucc0Var.e) && u890.j(this.f, ucc0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = this.d;
        return this.f.hashCode() + cy30.d((iD + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.e);
    }
}
