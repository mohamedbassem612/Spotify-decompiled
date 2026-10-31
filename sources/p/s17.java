package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s17 extends vno1 {
    public final float c;

    public s17(float f) {
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s17) && Float.compare(this.c, ((s17) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }
}
