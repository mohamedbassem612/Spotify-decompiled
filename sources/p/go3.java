package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class go3 extends qxd0 {
    public final oo3 d;

    public go3(oo3 oo3Var) {
        this.d = oo3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go3) && this.d.equals(((go3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
