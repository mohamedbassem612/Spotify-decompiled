package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lx61 {
    public final mq70 a;
    public final int b;

    public lx61(mq70 mq70Var, int i) {
        this.a = mq70Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx61)) {
            return false;
        }
        lx61 lx61Var = (lx61) obj;
        return u890.j(this.a, lx61Var.a) && this.b == lx61Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
