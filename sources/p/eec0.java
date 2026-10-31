package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eec0 implements fec0 {
    public final hec0 a;

    public eec0(hec0 hec0Var) {
        this.a = hec0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eec0) && this.a.equals(((eec0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
