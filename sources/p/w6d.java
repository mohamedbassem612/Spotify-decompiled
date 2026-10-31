package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w6d implements d7d {
    public final int a;
    public final long b;
    public final long c;
    public final boolean d;

    public w6d(int i, long j, long j2, boolean z) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6d)) {
            return false;
        }
        w6d w6dVar = (w6d) obj;
        return this.a == w6dVar.a && this.b == w6dVar.b && this.c == w6dVar.c && this.d == w6dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.f(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
