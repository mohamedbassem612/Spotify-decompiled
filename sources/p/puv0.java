package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class puv0 implements tuv0 {
    public final mvv0 a;

    public puv0(mvv0 mvv0Var) {
        this.a = mvv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof puv0) && this.a.equals(((puv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
