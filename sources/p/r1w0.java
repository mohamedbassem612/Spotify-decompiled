package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r1w0 extends h2w0 {
    public final String a;
    public final tv80 b;

    public r1w0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1w0)) {
            return false;
        }
        r1w0 r1w0Var = (r1w0) obj;
        return u890.j(this.a, r1w0Var.a) && u890.j(this.b, r1w0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
