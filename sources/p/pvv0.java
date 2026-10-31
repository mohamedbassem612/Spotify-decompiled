package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pvv0 implements svv0 {
    public final mvv0 a;

    public pvv0(mvv0 mvv0Var) {
        this.a = mvv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvv0) && this.a.equals(((pvv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
