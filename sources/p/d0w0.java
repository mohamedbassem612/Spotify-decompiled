package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d0w0 extends cxm {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final tv80 h;

    public d0w0(String str, String str2, String str3, String str4, tv80 tv80Var) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0w0)) {
            return false;
        }
        d0w0 d0w0Var = (d0w0) obj;
        return this.d.equals(d0w0Var.d) && this.e.equals(d0w0Var.e) && this.f.equals(d0w0Var.f) && this.g.equals(d0w0Var.g) && u890.j(this.h, d0w0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g);
        tv80 tv80Var = this.h;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
