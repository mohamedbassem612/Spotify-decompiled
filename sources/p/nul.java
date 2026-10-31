package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nul implements cwl {
    public final dp8 a;

    public nul(dp8 dp8Var) {
        this.a = dp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nul) && this.a.equals(((nul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
