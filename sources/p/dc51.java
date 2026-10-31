package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dc51 {
    public final String a;
    public final long b;
    public final long c;

    public dc51(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc51)) {
            return false;
        }
        dc51 dc51Var = (dc51) obj;
        return u890.j(this.a, dc51Var.a) && this.b == dc51Var.b && this.c == dc51Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
