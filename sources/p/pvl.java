package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pvl implements cwl {
    public final u2v0 a;

    public pvl(u2v0 u2v0Var) {
        this.a = u2v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvl) && this.a.equals(((pvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
