package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kg40 implements xpx0 {
    public final nmu0 a;

    public kg40(nmu0 nmu0Var) {
        this.a = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg40) && this.a == ((kg40) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
