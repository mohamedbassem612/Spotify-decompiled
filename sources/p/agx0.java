package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class agx0 implements egx0 {
    public final zob1 a;

    public agx0(zob1 zob1Var) {
        this.a = zob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agx0) && this.a.equals(((agx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
