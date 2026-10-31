package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p2e1 extends u2e1 {
    public final e7i0 a;

    public p2e1(e7i0 e7i0Var) {
        this.a = e7i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2e1) && this.a.equals(((p2e1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
