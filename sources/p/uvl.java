package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uvl implements cwl {
    public final e381 a;

    public uvl(e381 e381Var) {
        this.a = e381Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvl) && this.a.equals(((uvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
