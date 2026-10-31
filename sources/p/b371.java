package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b371 {
    public final boolean a;

    public b371(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b371) && this.a == ((b371) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
