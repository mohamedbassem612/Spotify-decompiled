package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y8u0 extends g3p1 {
    public final String c;
    public final tv80 d;

    public y8u0(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8u0)) {
            return false;
        }
        y8u0 y8u0Var = (y8u0) obj;
        return u890.j(this.c, y8u0Var.c) && u890.j(this.d, y8u0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
