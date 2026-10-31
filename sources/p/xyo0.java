package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xyo0 {
    public final float a;

    public xyo0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xyo0) && p3v.c(this.a, ((xyo0) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
