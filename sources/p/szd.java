package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class szd {
    public final float a;
    public final float b;
    public final float c;

    public szd(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szd)) {
            return false;
        }
        szd szdVar = (szd) obj;
        return p3v.c(this.a, szdVar.a) && p3v.c(this.b, szdVar.b) && p3v.c(this.c, szdVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
