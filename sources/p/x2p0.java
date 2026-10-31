package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x2p0 {
    public final ou80 a;

    public x2p0(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2p0) && u890.j(this.a, ((x2p0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
