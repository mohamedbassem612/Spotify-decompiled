package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o0m implements v0m {
    public final c380 a;

    public o0m(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0m) && u890.j(this.a, ((o0m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
