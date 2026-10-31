package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tvl implements cwl {
    public final x331 a;

    public tvl(x331 x331Var) {
        this.a = x331Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvl) && this.a.equals(((tvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
