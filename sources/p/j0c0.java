package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j0c0 implements dbr0 {
    public final gn10 a;

    public j0c0(gn10 gn10Var) {
        this.a = gn10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0c0) && u890.j(this.a, ((j0c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
