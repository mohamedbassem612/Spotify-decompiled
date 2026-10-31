package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pac {
    public final int a;
    public final long b;
    public final long c;
    public final long d;

    public pac(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        boolean z = j2 != -1;
        long j3 = j2 - j;
        this.d = (z && (j3 >= 0)) ? j3 : 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pac)) {
            return false;
        }
        pac pacVar = (pac) obj;
        return this.a == pacVar.a && this.b == pacVar.b && this.c == pacVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(l1d.C(this.a) * 31, this.b, 31);
    }

    public /* synthetic */ pac(int i, long j) {
        this(i, j, -1L);
    }
}
