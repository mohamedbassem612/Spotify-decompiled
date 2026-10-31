package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class le20 {
    public final fb10 a;
    public final za10 b;
    public final woa1 c;
    public final noa1 d;

    public le20(fb10 fb10Var, za10 za10Var, woa1 woa1Var, noa1 noa1Var) {
        this.a = fb10Var;
        this.b = za10Var;
        this.c = woa1Var;
        this.d = noa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le20)) {
            return false;
        }
        le20 le20Var = (le20) obj;
        return this.a.equals(le20Var.a) && this.b.equals(le20Var.b) && u890.j(this.c, le20Var.c) && this.d.equals(le20Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        woa1 woa1Var = this.c;
        return this.d.hashCode() + ((iHashCode + (woa1Var == null ? 0 : woa1Var.hashCode())) * 31);
    }
}
