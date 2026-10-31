package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bd00 {
    public final iu30 a;

    public bd00(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd00) && this.a.equals(((bd00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
