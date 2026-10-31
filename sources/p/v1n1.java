package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v1n1 {
    public final iu30 a;

    public v1n1(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1n1) && this.a.equals(((v1n1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
