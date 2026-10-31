package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fra implements pl3 {
    public final float a;

    public fra(float f) {
        this.a = f;
    }

    public final int c(int i, int i2) {
        return c13.e(1.0f, this.a, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fra) && Float.compare(this.a, ((fra) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("Vertical(bias=", this.a, ")");
    }
}
