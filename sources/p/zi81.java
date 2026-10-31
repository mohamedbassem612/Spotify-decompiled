package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zi81 {
    public final ki81 a;
    public final ho41 b;

    public zi81(ki81 ki81Var, ho41 ho41Var) {
        this.a = ki81Var;
        this.b = ho41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zi81) {
            zi81 zi81Var = (zi81) obj;
            return u890.j(this.a, zi81Var.a) && this.b == zi81Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
