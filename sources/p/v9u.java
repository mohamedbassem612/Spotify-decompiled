package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v9u extends gau {
    public final boolean a;
    public final long b;
    public final long c;

    public v9u(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9u)) {
            return false;
        }
        v9u v9uVar = (v9u) obj;
        return this.a == v9uVar.a && this.b == v9uVar.b && this.c == v9uVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(Boolean.hashCode(this.a) * 31, this.b, 31);
    }
}
