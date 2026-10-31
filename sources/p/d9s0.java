package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d9s0 extends t9s0 {
    public final float c;

    public d9s0(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9s0) && Float.compare(this.c, ((d9s0) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return c13.h("HorizontalTo(x=", this.c, ")");
    }
}
