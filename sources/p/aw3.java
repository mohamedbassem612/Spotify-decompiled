package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aw3 extends cw3 {
    public final qu3 a;

    public aw3(qu3 qu3Var) {
        this.a = qu3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw3) && this.a.equals(((aw3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
