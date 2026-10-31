package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o9y implements s9y {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public o9y(int i, float f, float f2, float f3, float f4) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9y)) {
            return false;
        }
        o9y o9yVar = (o9y) obj;
        return this.a == o9yVar.a && Float.compare(this.b, o9yVar.b) == 0 && Float.compare(this.c, o9yVar.c) == 0 && Float.compare(this.d, o9yVar.d) == 0 && Float.compare(this.e, o9yVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + x0d.f(x0d.f(x0d.f(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
