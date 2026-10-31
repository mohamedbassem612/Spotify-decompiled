package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ouv0 implements tuv0 {
    public final mvv0 a;

    public ouv0(mvv0 mvv0Var) {
        this.a = mvv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouv0) && this.a.equals(((ouv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
