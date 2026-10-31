package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i8u extends d9u {
    public final int a;

    public i8u(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8u) && this.a == ((i8u) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
