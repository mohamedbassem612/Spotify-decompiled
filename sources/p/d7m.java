package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7m implements g7m {
    public final c380 a;

    public d7m(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7m) && u890.j(this.a, ((d7m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
