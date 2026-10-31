package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nj9 implements uj9 {
    public final ve9 a;

    public nj9(ve9 ve9Var) {
        this.a = ve9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj9) && this.a.equals(((nj9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
