package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ak31 {
    public final String a;
    public final long b;
    public final long c;

    public ak31(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak31)) {
            return false;
        }
        ak31 ak31Var = (ak31) obj;
        return this.a.equals(ak31Var.a) && this.b == ak31Var.b && this.c == ak31Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
