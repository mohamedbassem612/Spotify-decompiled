package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f2w0 extends h2w0 {
    public final String a;
    public final tv80 b;

    public f2w0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2w0)) {
            return false;
        }
        f2w0 f2w0Var = (f2w0) obj;
        return u890.j(this.a, f2w0Var.a) && u890.j(this.b, f2w0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
