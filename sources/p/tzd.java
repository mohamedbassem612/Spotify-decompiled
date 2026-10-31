package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tzd {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final float e;
    public final float f;

    public tzd(float f, float f2, float f3, boolean z, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzd)) {
            return false;
        }
        tzd tzdVar = (tzd) obj;
        return Float.compare(this.a, tzdVar.a) == 0 && Float.compare(this.b, tzdVar.b) == 0 && Float.compare(this.c, tzdVar.c) == 0 && this.d == tzdVar.d && Float.compare(this.e, tzdVar.e) == 0 && Float.compare(this.f, tzdVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + x0d.f(xcg1.g(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
