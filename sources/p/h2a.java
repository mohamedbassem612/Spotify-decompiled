package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h2a implements z0i {
    public final c380 a;

    public h2a(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2a) && u890.j(this.a, ((h2a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
