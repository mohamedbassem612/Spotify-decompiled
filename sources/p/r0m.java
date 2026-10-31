package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r0m implements v0m {
    public final c380 a;

    public r0m(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0m) && u890.j(this.a, ((r0m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
