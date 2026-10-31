package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i49 extends c0p1 {
    public final le20 c;
    public final hpq0 d;

    public i49(le20 le20Var, hpq0 hpq0Var) {
        this.c = le20Var;
        this.d = hpq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i49)) {
            return false;
        }
        i49 i49Var = (i49) obj;
        return this.c.equals(i49Var.c) && this.d.equals(i49Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
