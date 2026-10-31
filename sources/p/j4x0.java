package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j4x0 extends i541 {
    public final String d;
    public final String e;
    public final String f;
    public final tv80 g;

    public j4x0(String str, String str2, String str3, tv80 tv80Var) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4x0)) {
            return false;
        }
        j4x0 j4x0Var = (j4x0) obj;
        return u890.j(this.d, j4x0Var.d) && u890.j(this.e, j4x0Var.e) && u890.j(this.f, j4x0Var.f) && u890.j(this.g, j4x0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(this.d.hashCode() * 31, 31, this.e), 31, this.f);
    }
}
