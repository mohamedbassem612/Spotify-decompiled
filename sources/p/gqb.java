package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gqb {
    public final long a;
    public final float b;

    public gqb(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqb)) {
            return false;
        }
        gqb gqbVar = (gqb) obj;
        long j = gqbVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && p3v.c(this.b, gqbVar.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
