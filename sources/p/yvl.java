package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yvl implements cwl {
    public final d2g1 a;

    public yvl(d2g1 d2g1Var) {
        this.a = d2g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvl) && this.a.equals(((yvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
