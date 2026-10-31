package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nqe0 extends qqe0 {
    public final xoe0 a;

    public nqe0(xoe0 xoe0Var) {
        this.a = xoe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqe0) && this.a.equals(((nqe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
