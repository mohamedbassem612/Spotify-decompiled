package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r650 {
    public final long a;
    public final float b;

    public r650(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r650)) {
            return false;
        }
        r650 r650Var = (r650) obj;
        long j = r650Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && Float.compare(this.b, r650Var.b) == 0;
    }

    public final int hashCode() {
        int i = u7h.l;
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
