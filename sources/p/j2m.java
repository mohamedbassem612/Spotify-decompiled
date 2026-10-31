package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j2m implements r2m {
    public final c380 a;

    public j2m(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2m) && u890.j(this.a, ((j2m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
