package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bwl implements cwl {
    public final y6k1 a;

    public bwl(y6k1 y6k1Var) {
        this.a = y6k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwl) && this.a.equals(((bwl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
