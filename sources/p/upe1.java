package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class upe1 extends ebp1 {
    public final float c;

    public upe1(float f) {
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upe1) && Float.compare(this.c, ((upe1) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }
}
