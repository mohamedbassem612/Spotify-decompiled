package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j2k0 implements k4k0 {
    public final vaa0 a;

    public j2k0(vaa0 vaa0Var) {
        this.a = vaa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2k0) && this.a == ((j2k0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
