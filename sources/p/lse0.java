package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lse0 extends zmo1 {
    public final m87 b;

    public lse0(m87 m87Var) {
        this.b = m87Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lse0) && this.b.equals(((lse0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
