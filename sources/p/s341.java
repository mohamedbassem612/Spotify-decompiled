package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s341 extends w341 {
    public final uf8 a;

    public s341(uf8 uf8Var) {
        this.a = uf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s341) && this.a.equals(((s341) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
