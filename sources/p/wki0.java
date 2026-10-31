package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wki0 extends eli0 {
    public final boolean a;

    public wki0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wki0) && this.a == ((wki0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
