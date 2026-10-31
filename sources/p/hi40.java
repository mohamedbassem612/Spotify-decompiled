package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hi40 {
    public final n5f0 a;

    public hi40(n5f0 n5f0Var) {
        this.a = n5f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi40) && u890.j(this.a, ((hi40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
