package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ym61 {
    public final s6o a;
    public final n601 b;

    public ym61(s6o s6oVar, n601 n601Var) {
        this.a = s6oVar;
        this.b = n601Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym61)) {
            return false;
        }
        ym61 ym61Var = (ym61) obj;
        return this.a == ym61Var.a && this.b == ym61Var.b;
    }

    public final int hashCode() {
        return ec61.X0.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
