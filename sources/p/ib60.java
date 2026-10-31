package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ib60 {
    public final p280 a;
    public final u380 b;

    public ib60(p280 p280Var, u380 u380Var) {
        this.a = p280Var;
        this.b = u380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib60)) {
            return false;
        }
        ib60 ib60Var = (ib60) obj;
        return this.a.equals(ib60Var.a) && this.b.equals(ib60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
