package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vqf0 implements xqf0 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof vqf0) {
            return Float.compare(this.a, ((vqf0) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("OnUserPrefTextScaleChanged(textScale=", this.a, ")");
    }
}
