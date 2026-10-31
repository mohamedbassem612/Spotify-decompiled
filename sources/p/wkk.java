package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wkk extends vlk {
    public final boolean a;

    public wkk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkk) && this.a == ((wkk) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
