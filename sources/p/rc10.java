package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rc10 {
    public final k1r a;
    public final k1r b;

    public rc10(k1r k1rVar, k1r k1rVar2) {
        this.a = k1rVar;
        this.b = k1rVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc10)) {
            return false;
        }
        rc10 rc10Var = (rc10) obj;
        return this.a.equals(rc10Var.a) && this.b.equals(rc10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
