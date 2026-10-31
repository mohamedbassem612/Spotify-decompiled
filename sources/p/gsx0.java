package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gsx0 extends ktx0 {
    public final String a;
    public final tv80 b;

    public gsx0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsx0)) {
            return false;
        }
        gsx0 gsx0Var = (gsx0) obj;
        return this.a.equals(gsx0Var.a) && u890.j(this.b, gsx0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
