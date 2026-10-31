package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kjj1 extends ljj1 {
    public final String a;
    public final long b;
    public final long c;

    public kjj1(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // p.ljj1
    public final long a() {
        return this.c;
    }

    @Override // p.ljj1
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjj1)) {
            return false;
        }
        kjj1 kjj1Var = (kjj1) obj;
        return u890.j(this.a, kjj1Var.a) && this.b == kjj1Var.b && this.c == kjj1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }

    public /* synthetic */ kjj1(String str) {
        this(0L, 0L, str);
    }
}
