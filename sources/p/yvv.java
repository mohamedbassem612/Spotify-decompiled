package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yvv implements awv {
    public final boolean a;

    public yvv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvv) && this.a == ((yvv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
