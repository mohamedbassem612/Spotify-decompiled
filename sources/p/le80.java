package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class le80 extends me80 {
    public final o6p1 a;

    public le80(o6p1 o6p1Var) {
        this.a = o6p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le80) && this.a.equals(((le80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
