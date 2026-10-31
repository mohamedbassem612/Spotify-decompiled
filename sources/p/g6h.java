package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g6h extends n6h {
    public final boolean a;

    public g6h(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6h) && this.a == ((g6h) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
