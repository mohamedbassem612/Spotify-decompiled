package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fvd {
    public final float a;
    public final float b;

    public fvd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvd)) {
            return false;
        }
        fvd fvdVar = (fvd) obj;
        return p3v.c(this.a, fvdVar.a) && p3v.c(this.b, fvdVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
