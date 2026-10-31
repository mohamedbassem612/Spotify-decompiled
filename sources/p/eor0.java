package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eor0 {
    public final float a;
    public final long b;

    public eor0(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eor0)) {
            return false;
        }
        eor0 eor0Var = (eor0) obj;
        if (!p3v.c(this.a, eor0Var.a)) {
            return false;
        }
        long j = eor0Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }

    public eor0() {
        this(0.0f, u7h.j);
    }
}
