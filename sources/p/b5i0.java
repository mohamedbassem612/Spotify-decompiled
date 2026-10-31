package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b5i0 implements m5i0 {
    public final float a;

    public b5i0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5i0) && Float.compare(this.a, ((b5i0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
