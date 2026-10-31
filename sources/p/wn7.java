package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wn7 implements ao7 {
    public final boolean a;

    public wn7(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn7) && this.a == ((wn7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
