package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wba {
    public final wls0 a;

    public wba(wls0 wls0Var) {
        this.a = wls0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wba) && this.a == ((wba) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
