package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jry0 extends a6o1 {
    public final boolean e;

    public jry0(boolean z) {
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jry0) && this.e == ((jry0) obj).e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e);
    }
}
