package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hia {
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;

    public hia(float f, float f2, float f3, float f4, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = f3;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hia)) {
            return false;
        }
        hia hiaVar = (hia) obj;
        return Float.compare(this.a, hiaVar.a) == 0 && Float.compare(this.b, hiaVar.b) == 0 && this.c == hiaVar.c && Float.compare(this.d, hiaVar.d) == 0 && Float.compare(this.e, hiaVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + x0d.f(kaa0.f(this.c, x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }
}
