package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nvl implements cwl {
    public final fhu0 a;

    public nvl(fhu0 fhu0Var) {
        this.a = fhu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvl) && this.a.equals(((nvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
