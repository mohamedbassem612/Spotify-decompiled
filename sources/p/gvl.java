package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gvl implements cwl {
    public final wo80 a;

    public gvl(wo80 wo80Var) {
        this.a = wo80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gvl) && this.a.equals(((gvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
