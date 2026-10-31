package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b081 implements d081 {
    public final boolean a;

    public b081(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b081) && this.a == ((b081) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
