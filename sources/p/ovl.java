package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ovl implements cwl {
    public final bsu0 a;

    public ovl(bsu0 bsu0Var) {
        this.a = bsu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovl) && this.a.equals(((ovl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
