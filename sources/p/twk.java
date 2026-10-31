package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class twk implements fxk {
    public final gmc1 a;

    public twk(gmc1 gmc1Var) {
        this.a = gmc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twk) && this.a.equals(((twk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
