package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kyz implements t600 {
    public final boolean a;

    public kyz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyz) && this.a == ((kyz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
