package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c19 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public c19(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c19) {
            c19 c19Var = (c19) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(c19Var.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(c19Var.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(c19Var.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(c19Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
