package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sqo implements tqo {
    public final iu30 b;

    public sqo(iu30 iu30Var) {
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqo) && this.b.equals(((sqo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
