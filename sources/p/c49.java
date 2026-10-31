package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c49 extends c0p1 {
    public final le20 c;
    public final bnv0 d;

    public c49(le20 le20Var, bnv0 bnv0Var) {
        this.c = le20Var;
        this.d = bnv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c49)) {
            return false;
        }
        c49 c49Var = (c49) obj;
        return this.c.equals(c49Var.c) && this.d.equals(c49Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
