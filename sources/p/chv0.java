package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class chv0 implements ehv0 {
    public final xzg0 a;

    public chv0(xzg0 xzg0Var) {
        this.a = xzg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chv0) && this.a.equals(((chv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
