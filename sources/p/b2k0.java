package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b2k0 implements k4k0 {
    public final boolean a;

    public b2k0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2k0) && this.a == ((b2k0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
