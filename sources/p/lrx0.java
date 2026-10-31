package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lrx0 extends ktx0 {
    public final wvi0 a;

    public lrx0(wvi0 wvi0Var) {
        this.a = wvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrx0) && this.a.equals(((lrx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
