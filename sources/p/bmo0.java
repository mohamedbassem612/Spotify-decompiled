package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bmo0 {
    public final String a;
    public final amo0 b;
    public final xlo0 c;

    public bmo0(String str, amo0 amo0Var, xlo0 xlo0Var) {
        this.a = str;
        this.b = amo0Var;
        this.c = xlo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmo0)) {
            return false;
        }
        bmo0 bmo0Var = (bmo0) obj;
        return this.a.equals(bmo0Var.a) && this.b.equals(bmo0Var.b) && this.c.equals(bmo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
