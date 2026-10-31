package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cgx0 implements egx0 {
    public final zob1 a;

    public cgx0(zob1 zob1Var) {
        this.a = zob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cgx0) && this.a.equals(((cgx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
