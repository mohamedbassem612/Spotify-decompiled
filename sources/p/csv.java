package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class csv implements esv {
    public final boolean a;

    public csv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csv) && this.a == ((csv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
