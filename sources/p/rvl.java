package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rvl implements cwl {
    public final jdx0 a;

    public rvl(jdx0 jdx0Var) {
        this.a = jdx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvl) && this.a.equals(((rvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
