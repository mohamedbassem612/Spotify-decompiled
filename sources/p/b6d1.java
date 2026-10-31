package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b6d1 {
    public final iu30 a;

    public b6d1(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6d1) && this.a.equals(((b6d1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
