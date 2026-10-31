package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b44 {
    public final boolean a;

    public b44(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b44) && this.a == ((b44) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
