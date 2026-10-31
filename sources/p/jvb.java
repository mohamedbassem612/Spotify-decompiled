package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jvb extends e130 {
    public final float e;

    public jvb(float f) {
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvb) && Float.compare(this.e, ((jvb) obj).e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e);
    }
}
