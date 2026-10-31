package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zs50 {
    public final float a;
    public final short b;
    public final float c;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public zs50(float f, long j) {
        this.a = f;
        this.b = (int) j;
        this.c = yoi1.o(f, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs50)) {
            return false;
        }
        zs50 zs50Var = (zs50) obj;
        return Float.compare(this.a, zs50Var.a) == 0 && ((long) this.b) == ((long) zs50Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
