package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qxe0 implements w11 {
    public final zxo1 a;

    public qxe0(zxo1 zxo1Var) {
        this.a = zxo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxe0) && this.a.equals(((qxe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
