package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rbn {
    public final float a;
    public final float b;
    public final float c;

    public rbn(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbn)) {
            return false;
        }
        rbn rbnVar = (rbn) obj;
        return p3v.c(this.a, rbnVar.a) && p3v.c(this.b, rbnVar.b) && p3v.c(this.c, rbnVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
