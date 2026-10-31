package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vq {
    public final boolean a;

    public vq(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq) && this.a == ((vq) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
