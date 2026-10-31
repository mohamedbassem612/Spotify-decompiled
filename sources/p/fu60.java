package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fu60 extends ru60 {
    public final gto1 a;

    public fu60(gto1 gto1Var) {
        this.a = gto1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu60) && this.a.equals(((fu60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
