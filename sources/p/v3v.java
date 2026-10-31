package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v3v {
    public final float a;
    public final float b;

    public v3v(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3v)) {
            return false;
        }
        v3v v3vVar = (v3v) obj;
        return Float.compare(this.a, v3vVar.a) == 0 && Float.compare(this.b, v3vVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
