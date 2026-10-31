package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jok0 {
    public final k1r a;
    public final k1r b;

    public jok0(k1r k1rVar, k1r k1rVar2) {
        this.a = k1rVar;
        this.b = k1rVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jok0)) {
            return false;
        }
        jok0 jok0Var = (jok0) obj;
        return this.a.equals(jok0Var.a) && this.b.equals(jok0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
