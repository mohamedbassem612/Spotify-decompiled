package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cwk implements fxk {
    public final gmc1 a;

    public cwk(gmc1 gmc1Var) {
        this.a = gmc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwk) && this.a.equals(((cwk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
