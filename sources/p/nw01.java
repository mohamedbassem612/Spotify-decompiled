package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nw01 {
    public final String a;
    public final long b;
    public final long c;

    public nw01(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw01)) {
            return false;
        }
        nw01 nw01Var = (nw01) obj;
        return this.a.equals(nw01Var.a) && this.b == nw01Var.b && this.c == nw01Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
