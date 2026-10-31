package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p6p0 {
    public final float a;

    public p6p0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6p0) && p3v.c(this.a, ((p6p0) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
