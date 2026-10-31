package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l0v implements o0v {
    public final int a;
    public final int b;
    public final float c;

    public l0v(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0v)) {
            return false;
        }
        l0v l0vVar = (l0v) obj;
        return this.a == l0vVar.a && this.b == l0vVar.b && Float.compare(this.c, l0vVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
