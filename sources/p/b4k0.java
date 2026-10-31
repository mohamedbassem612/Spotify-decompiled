package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b4k0 implements k4k0 {
    public final int a;

    public b4k0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4k0) && this.a == ((b4k0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
