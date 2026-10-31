package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ajc0 implements djc0 {
    public final iu30 a;

    public ajc0(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajc0) && u890.j(this.a, ((ajc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
