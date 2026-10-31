package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class avl implements cwl {
    public final ri40 a;

    public avl(ri40 ri40Var) {
        this.a = ri40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avl) && this.a.equals(((avl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
