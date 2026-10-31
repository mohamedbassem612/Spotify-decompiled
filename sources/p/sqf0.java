package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sqf0 implements xqf0 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof sqf0) {
            return Float.compare(this.a, ((sqf0) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("OnGestureTextScaleChanged(textScale=", this.a, ")");
    }
}
