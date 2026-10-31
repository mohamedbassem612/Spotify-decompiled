package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class icg {
    public final float a;
    public final float b;

    public icg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icg)) {
            return false;
        }
        icg icgVar = (icg) obj;
        return p3v.c(this.a, icgVar.a) && p3v.c(this.b, icgVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
