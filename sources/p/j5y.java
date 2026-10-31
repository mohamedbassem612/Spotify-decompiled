package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j5y implements k5y {
    public final c380 a;

    public j5y(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5y) && u890.j(this.a, ((j5y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
