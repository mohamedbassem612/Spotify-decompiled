package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lic0 implements z930 {
    public final float a;

    public lic0(float f) {
        this.a = f;
    }

    @Override // p.z930
    public final float a(float f) {
        return f / this.a;
    }

    @Override // p.z930
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lic0) && Float.compare(this.a, ((lic0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("LinearFontScaleConverter(fontScale=", this.a, ")");
    }
}
