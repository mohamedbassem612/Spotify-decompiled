package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class awl implements cwl {
    public final pfj1 a;

    public awl(pfj1 pfj1Var) {
        this.a = pfj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awl) && this.a.equals(((awl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
