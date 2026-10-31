package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hdg1 {
    public final long a;
    public final long b;
    public final String c;

    public hdg1(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdg1)) {
            return false;
        }
        hdg1 hdg1Var = (hdg1) obj;
        return this.a == hdg1Var.a && this.b == hdg1Var.b && this.c.equals(hdg1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
