package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w2p0 {
    public final ou80 a;

    public w2p0(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2p0) && u890.j(this.a, ((w2p0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
