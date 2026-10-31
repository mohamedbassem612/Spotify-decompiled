package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vm {
    public final hs20 a;

    public vm(hs20 hs20Var) {
        this.a = hs20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm) && this.a == ((vm) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
