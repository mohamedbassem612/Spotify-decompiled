package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jw50 {
    public final nw50 a;

    public jw50(nw50 nw50Var) {
        this.a = nw50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw50) && this.a.equals(((jw50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
