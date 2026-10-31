package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i701 {
    public final String a;
    public final long b;
    public final long c;

    public i701(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i701)) {
            return false;
        }
        i701 i701Var = (i701) obj;
        return this.a.equals(i701Var.a) && this.b == i701Var.b && this.c == i701Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
