package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z880 {
    public final d980 a;

    public z880(d980 d980Var) {
        this.a = d980Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z880) && this.a == ((z880) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
