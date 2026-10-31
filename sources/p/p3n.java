package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p3n extends rjo1 {
    public final yxa0 b;
    public final tv80 c;

    public p3n(yxa0 yxa0Var, tv80 tv80Var) {
        this.b = yxa0Var;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3n)) {
            return false;
        }
        p3n p3nVar = (p3n) obj;
        return u890.j(this.b, p3nVar.b) && u890.j(this.c, p3nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
