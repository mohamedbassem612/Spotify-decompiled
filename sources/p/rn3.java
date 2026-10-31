package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rn3 extends qxd0 {
    public final String d;
    public final String e;
    public final tv80 f;

    public rn3(String str, String str2, tv80 tv80Var) {
        this.d = str;
        this.e = str2;
        this.f = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn3)) {
            return false;
        }
        rn3 rn3Var = (rn3) obj;
        return u890.j(this.d, rn3Var.d) && u890.j(this.e, rn3Var.e) && this.f.equals(rn3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(this.d.hashCode() * 31, 31, this.e);
    }
}
