package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tt61 {
    public final c9 a;
    public final u380 b;

    public tt61(c9 c9Var, lqs0 lqs0Var) {
        this.a = c9Var;
        this.b = lqs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt61)) {
            return false;
        }
        tt61 tt61Var = (tt61) obj;
        return this.a.equals(tt61Var.a) && this.b.equals(tt61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
