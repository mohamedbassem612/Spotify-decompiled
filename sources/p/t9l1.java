package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t9l1 {
    public final float a;

    public t9l1(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9l1) && Float.compare(this.a, ((t9l1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
