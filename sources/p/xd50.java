package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xd50 {
    public final float a;

    public xd50(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd50) && p3v.c(this.a, ((xd50) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
