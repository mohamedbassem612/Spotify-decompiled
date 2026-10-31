package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b9u extends d9u {
    public final boolean a;

    public b9u(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9u) && this.a == ((b9u) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
