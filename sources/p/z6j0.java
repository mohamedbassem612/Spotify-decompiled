package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z6j0 extends a7j0 {
    public final cyo1 a;

    public z6j0(cyo1 cyo1Var) {
        this.a = cyo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6j0) && this.a.equals(((z6j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
