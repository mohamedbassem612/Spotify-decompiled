package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jtf0 implements mtf0 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof jtf0) {
            return Float.compare(this.a, ((jtf0) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("GestureTextScaleChanged(value=", this.a, ")");
    }
}
