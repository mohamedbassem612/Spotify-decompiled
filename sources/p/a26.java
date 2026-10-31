package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a26 {
    public final y16 a;

    public a26(y16 y16Var) {
        this.a = y16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a26) && this.a == ((a26) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
