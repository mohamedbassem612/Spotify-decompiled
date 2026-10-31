package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zit0 extends ljt0 {
    public final r4z a;
    public final boolean b;
    public final long c;

    public zit0(r4z r4zVar, boolean z, long j) {
        this.a = r4zVar;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zit0)) {
            return false;
        }
        zit0 zit0Var = (zit0) obj;
        return this.a.equals(zit0Var.a) && this.b == zit0Var.b && this.c == zit0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
