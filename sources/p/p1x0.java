package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p1x0 extends fn31 {
    public final String g;
    public final q730 h;
    public final boolean i;

    public p1x0(String str, q730 q730Var, boolean z) {
        this.g = str;
        this.h = q730Var;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1x0)) {
            return false;
        }
        p1x0 p1x0Var = (p1x0) obj;
        return u890.j(this.g, p1x0Var.g) && u890.j(this.h, p1x0Var.h) && this.i == p1x0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + (this.g.hashCode() * 31)) * 31);
    }
}
