package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c0w0 extends cxm {
    public final String d;
    public final tv80 e;

    public c0w0(String str, tv80 tv80Var) {
        this.d = str;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0w0)) {
            return false;
        }
        c0w0 c0w0Var = (c0w0) obj;
        return u890.j(this.d, c0w0Var.d) && u890.j(this.e, c0w0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        tv80 tv80Var = this.e;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
