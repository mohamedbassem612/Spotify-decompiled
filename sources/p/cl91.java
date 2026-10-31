package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cl91 extends d7e {
    public final String c;
    public final tv80 d;

    public cl91(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final tv80 D() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl91)) {
            return false;
        }
        cl91 cl91Var = (cl91) obj;
        return u890.j(this.c, cl91Var.c) && u890.j(this.d, cl91Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        tv80 tv80Var = this.d;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
