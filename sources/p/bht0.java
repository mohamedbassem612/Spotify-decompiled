package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bht0 extends lht0 {
    public final String a;
    public final d1z b;
    public final long c;
    public final long d;

    public bht0(String str, d1z d1zVar, long j, long j2) {
        this.a = str;
        this.b = d1zVar;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bht0)) {
            return false;
        }
        bht0 bht0Var = (bht0) obj;
        return this.a.equals(bht0Var.a) && this.b == bht0Var.b && this.c == bht0Var.c && this.d == bht0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }
}
