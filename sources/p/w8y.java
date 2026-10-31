package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w8y {
    public final int a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public w8y(int i, String str, String str2, float f, float f2, float f3, float f4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8y)) {
            return false;
        }
        w8y w8yVar = (w8y) obj;
        return this.a == w8yVar.a && u890.j(this.b, w8yVar.b) && u890.j(this.c, w8yVar.c) && Float.compare(this.d, w8yVar.d) == 0 && Float.compare(this.e, w8yVar.e) == 0 && Float.compare(this.f, w8yVar.f) == 0 && Float.compare(this.g, w8yVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + x0d.f(x0d.f(x0d.f(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
