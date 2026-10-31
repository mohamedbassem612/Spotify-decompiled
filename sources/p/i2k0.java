package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i2k0 implements k4k0 {
    public final rx30 a;

    public i2k0(rx30 rx30Var) {
        this.a = rx30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2k0) && this.a == ((i2k0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
