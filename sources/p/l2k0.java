package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l2k0 implements k4k0 {
    public final duk1 a;

    public l2k0(duk1 duk1Var) {
        this.a = duk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2k0) && this.a == ((l2k0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
