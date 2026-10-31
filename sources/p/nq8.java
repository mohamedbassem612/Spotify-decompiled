package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nq8 implements oq8 {
    public final th61 a;

    public nq8(th61 th61Var) {
        this.a = th61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq8) && u890.j(this.a, ((nq8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
