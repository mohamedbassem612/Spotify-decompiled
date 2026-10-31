package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a8z0 extends z8z0 {
    public final ktw0 a;

    public a8z0(ktw0 ktw0Var) {
        this.a = ktw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8z0) && u890.j(this.a, ((a8z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
