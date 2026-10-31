package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class er30 implements fr30 {
    public final String a;
    public final long b;
    public final long c;

    public er30(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er30)) {
            return false;
        }
        er30 er30Var = (er30) obj;
        return this.a.equals(er30Var.a) && this.b == er30Var.b && this.c == er30Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
