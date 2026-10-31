package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qqt {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public qqt(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqt)) {
            return false;
        }
        qqt qqtVar = (qqt) obj;
        return p3v.c(this.a, qqtVar.a) && p3v.c(this.b, qqtVar.b) && p3v.c(this.c, qqtVar.c) && p3v.c(this.d, qqtVar.d) && p3v.c(this.e, qqtVar.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
