package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jcg {
    public final float a;
    public final float b;
    public final float c;

    public jcg(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcg)) {
            return false;
        }
        jcg jcgVar = (jcg) obj;
        return Float.compare(this.a, jcgVar.a) == 0 && Float.compare(this.b, jcgVar.b) == 0 && Float.compare(this.c, jcgVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
