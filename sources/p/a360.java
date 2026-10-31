package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a360 {
    public final p410 a;

    public a360(p410 p410Var) {
        this.a = p410Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a360) && this.a == ((a360) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
