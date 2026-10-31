package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mxe0 implements w11 {
    public final th8 a;

    public mxe0(th8 th8Var) {
        this.a = th8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxe0) && this.a.equals(((mxe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
