package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r9s0 extends t9s0 {
    public final float c;

    public r9s0(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9s0) && Float.compare(this.c, ((r9s0) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return c13.h("RelativeVerticalTo(dy=", this.c, ")");
    }
}
