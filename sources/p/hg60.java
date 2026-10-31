package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hg60 extends aqo1 {
    public final float b;

    public hg60(float f) {
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hg60) && Float.compare(this.b, ((hg60) obj).b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }
}
