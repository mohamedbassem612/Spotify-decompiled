package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oqu {
    public final float a;

    public oqu(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqu) && Float.compare(this.a, ((oqu) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
