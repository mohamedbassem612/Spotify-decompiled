package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class omf1 {
    public final c380 a;
    public final c380 b;

    public omf1(c380 c380Var, c380 c380Var2) {
        this.a = c380Var;
        this.b = c380Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omf1)) {
            return false;
        }
        omf1 omf1Var = (omf1) obj;
        return u890.j(this.a, omf1Var.a) && u890.j(this.b, omf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
