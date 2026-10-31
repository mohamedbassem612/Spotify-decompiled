package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s6a1 implements t6a1 {
    public final float a;

    public s6a1(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6a1) && p3v.c(this.a, ((s6a1) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
