package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mbv implements pbv {
    public final String a;
    public final tv80 b;

    public mbv(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbv)) {
            return false;
        }
        mbv mbvVar = (mbv) obj;
        return u890.j(this.a, mbvVar.a) && u890.j(this.b, mbvVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
