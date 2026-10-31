package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jec0 implements kec0 {
    public final hec0 a;

    public jec0(hec0 hec0Var) {
        this.a = hec0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jec0) && this.a.equals(((jec0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
