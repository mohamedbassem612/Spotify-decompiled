package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ha11 {
    public final k1r a;
    public final k1r b;

    public ha11(k1r k1rVar, k1r k1rVar2) {
        this.a = k1rVar;
        this.b = k1rVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha11)) {
            return false;
        }
        ha11 ha11Var = (ha11) obj;
        return this.a.equals(ha11Var.a) && this.b.equals(ha11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
