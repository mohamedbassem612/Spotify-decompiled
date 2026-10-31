package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v4x0 extends i541 {
    public final String d;
    public final int e;
    public final tv80 f;

    public v4x0(int i, String str, tv80 tv80Var) {
        this.d = str;
        this.e = i;
        this.f = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4x0)) {
            return false;
        }
        v4x0 v4x0Var = (v4x0) obj;
        return u890.j(this.d, v4x0Var.d) && this.e == v4x0Var.e && u890.j(this.f, v4x0Var.f);
    }

    public final int hashCode() {
        String str = this.d;
        int iK = ab80.k(this.e, (str == null ? 0 : str.hashCode()) * 31, 31);
        tv80 tv80Var = this.f;
        return iK + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
