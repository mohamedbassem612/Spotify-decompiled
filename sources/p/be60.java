package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class be60 implements ez00 {
    public final boolean a;
    public final long b;
    public final long c;

    public be60(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be60)) {
            return false;
        }
        be60 be60Var = (be60) obj;
        return this.a == be60Var.a && jfv.f(this.b, be60Var.b) && jfv.f(this.c, be60Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.c) + cy30.f(iHashCode, this.b, 31);
    }
}
