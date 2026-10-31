package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p8u extends d9u {
    public final boolean a;

    public p8u(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8u) && this.a == ((p8u) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
