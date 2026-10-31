package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zck0 implements bdk0 {
    public final long a;
    public final long b;
    public final String c;
    public final boolean d;

    public zck0(long j, long j2, String str, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zck0)) {
            return false;
        }
        zck0 zck0Var = (zck0) obj;
        return this.a == zck0Var.a && this.b == zck0Var.b && this.c.equals(zck0Var.c) && this.d == zck0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c);
    }
}
