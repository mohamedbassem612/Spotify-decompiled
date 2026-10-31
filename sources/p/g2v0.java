package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g2v0 {
    public final boolean a;

    public g2v0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2v0) && this.a == ((g2v0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
