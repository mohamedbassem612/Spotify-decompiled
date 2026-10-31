package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yl9 implements am9 {
    public final float a;

    public yl9(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl9) && Float.compare(this.a, ((yl9) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
