package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tnj0 {
    public final k1r a;
    public final k1r b;

    public tnj0(k1r k1rVar, k1r k1rVar2) {
        this.a = k1rVar;
        this.b = k1rVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnj0)) {
            return false;
        }
        tnj0 tnj0Var = (tnj0) obj;
        return u890.j(this.a, tnj0Var.a) && u890.j(this.b, tnj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
