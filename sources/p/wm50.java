package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wm50 implements an50 {
    public final boolean a;

    public wm50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm50) && this.a == ((wm50) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
