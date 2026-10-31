package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b3n1 {
    public final iu30 a;

    public b3n1(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3n1) && this.a.equals(((b3n1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
