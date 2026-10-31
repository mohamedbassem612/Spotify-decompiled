package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h0f1 {
    public final String a;
    public final long b;
    public final long c;

    public h0f1(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0f1)) {
            return false;
        }
        h0f1 h0f1Var = (h0f1) obj;
        return this.a.equals(h0f1Var.a) && this.b == h0f1Var.b && this.c == h0f1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
