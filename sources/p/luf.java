package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class luf implements puf {
    public final a5i1 a;

    public luf(a5i1 a5i1Var) {
        this.a = a5i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luf) && u890.j(this.a, ((luf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
