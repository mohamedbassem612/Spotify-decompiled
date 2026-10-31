package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dgw0 extends up30 {
    public final String c;
    public final tv80 d;

    public dgw0(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgw0)) {
            return false;
        }
        dgw0 dgw0Var = (dgw0) obj;
        return this.c.equals(dgw0Var.c) && u890.j(this.d, dgw0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        tv80 tv80Var = this.d;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
