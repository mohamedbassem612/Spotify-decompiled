package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v7u0 {
    public final String a;
    public final long b;
    public final long c;

    public v7u0(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7u0)) {
            return false;
        }
        v7u0 v7u0Var = (v7u0) obj;
        return this.a.equals(v7u0Var.a) && this.b == v7u0Var.b && this.c == v7u0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
