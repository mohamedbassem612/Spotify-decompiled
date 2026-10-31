package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vpe1 extends ebp1 {
    public final float c;

    public vpe1(float f) {
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpe1) && Float.compare(this.c, ((vpe1) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }
}
