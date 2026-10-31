package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ky4 implements fav0 {
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public ky4(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ky4.class.equals(obj != null ? obj.getClass() : null) && this.b == ((ky4) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return gvg.e(this.b, "AndroidPointerIcon(type=", ")");
    }
}
