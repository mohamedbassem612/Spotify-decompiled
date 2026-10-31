package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uei1 {
    public final long a;
    public final boolean b;
    public final Long c;

    public uei1(long j, boolean z, Long l) {
        this.a = j;
        this.b = z;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uei1)) {
            return false;
        }
        uei1 uei1Var = (uei1) obj;
        return this.a == uei1Var.a && this.b == uei1Var.b && u890.j(this.c, uei1Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Long.hashCode(this.a) * 31, 31, this.b);
        Long l = this.c;
        return iG + (l == null ? 0 : l.hashCode());
    }
}
