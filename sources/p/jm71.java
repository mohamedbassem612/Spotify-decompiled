package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jm71 {
    public final c380 a;

    public jm71(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jm71) && u890.j(this.a, ((jm71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
