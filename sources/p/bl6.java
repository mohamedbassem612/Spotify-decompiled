package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bl6 implements cl6 {
    public final float a;

    public bl6(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl6) && p3v.c(this.a, ((bl6) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
