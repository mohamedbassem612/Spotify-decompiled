package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y8u extends d9u {
    public final boolean a;

    public y8u(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8u) && this.a == ((y8u) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
