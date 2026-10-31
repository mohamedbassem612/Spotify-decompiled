package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lit {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public lit(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lit)) {
            return false;
        }
        lit litVar = (lit) obj;
        return Float.compare(this.a, litVar.a) == 0 && Float.compare(this.b, litVar.b) == 0 && Float.compare(this.c, litVar.c) == 0 && Float.compare(this.d, litVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
