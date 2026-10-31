package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bzg {
    public final float a;
    public final float b;

    public bzg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzg)) {
            return false;
        }
        bzg bzgVar = (bzg) obj;
        return p3v.c(this.a, bzgVar.a) && p3v.c(this.b, bzgVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
