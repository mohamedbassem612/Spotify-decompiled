package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hef extends cso1 {
    public final boolean b;

    public hef(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hef) && this.b == ((hef) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
