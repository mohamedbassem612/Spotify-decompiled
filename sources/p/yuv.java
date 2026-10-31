package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yuv implements evv {
    public final boolean a;

    public yuv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yuv) && this.a == ((yuv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
