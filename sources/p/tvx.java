package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tvx {
    public final float a;
    public final float b;
    public final float c;

    public tvx(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public static tvx a(tvx tvxVar, float f, int i) {
        if ((i & 1) != 0) {
            f = tvxVar.a;
        }
        return new tvx(f, (i & 2) != 0 ? tvxVar.b : 0.0f, (i & 4) != 0 ? tvxVar.c : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvx)) {
            return false;
        }
        tvx tvxVar = (tvx) obj;
        return p3v.c(this.a, tvxVar.a) && p3v.c(this.b, tvxVar.b) && p3v.c(this.c, tvxVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
