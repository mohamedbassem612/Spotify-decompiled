package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dya0 {
    public final x1c0 a;

    public dya0(x1c0 x1c0Var) {
        this.a = x1c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dya0) && this.a.equals(((dya0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
