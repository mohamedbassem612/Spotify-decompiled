package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zwx {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public zwx(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwx)) {
            return false;
        }
        zwx zwxVar = (zwx) obj;
        return p3v.c(this.a, zwxVar.a) && p3v.c(this.b, zwxVar.b) && p3v.c(this.c, zwxVar.c) && p3v.c(this.d, zwxVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
