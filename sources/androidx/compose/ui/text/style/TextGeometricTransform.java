package androidx.compose.ui.text.style;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TextGeometricTransform {
    public static final TextGeometricTransform c = new TextGeometricTransform(1.0f, 0.0f);
    public final float a;
    public final float b;

    public /* synthetic */ TextGeometricTransform(int i) {
        this((i & 1) != 0 ? 1.0f : 1.3f, (i & 2) != 0 ? 0.0f : -0.25f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.a == textGeometricTransform.a && this.b == textGeometricTransform.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ")";
    }

    public TextGeometricTransform(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
