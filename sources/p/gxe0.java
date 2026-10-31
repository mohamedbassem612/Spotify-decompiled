package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gxe0 {
    public final uf8 a;

    public gxe0(uf8 uf8Var) {
        this.a = uf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxe0) && this.a.equals(((gxe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
