package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p5h {
    public final float a;
    public final float b;

    public p5h(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5h)) {
            return false;
        }
        p5h p5hVar = (p5h) obj;
        return Float.compare(this.a, p5hVar.a) == 0 && Float.compare(this.b, p5hVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
