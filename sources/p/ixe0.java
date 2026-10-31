package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ixe0 {
    public final uf8 a;

    public ixe0(uf8 uf8Var) {
        this.a = uf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixe0) && this.a.equals(((ixe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
