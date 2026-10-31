package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jjd {
    public final float a;
    public final float b;

    public jjd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjd)) {
            return false;
        }
        jjd jjdVar = (jjd) obj;
        return Float.compare(this.a, jjdVar.a) == 0 && Float.compare(this.b, jjdVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
