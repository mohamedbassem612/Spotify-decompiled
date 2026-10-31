package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wj60 {
    public final long a;
    public final d0k0 b;
    public final ntf1 c;

    public wj60(long j, d0k0 d0k0Var, ntf1 ntf1Var) {
        this.a = j;
        this.b = d0k0Var;
        this.c = ntf1Var;
    }

    public static wj60 a(wj60 wj60Var, d0k0 d0k0Var, ntf1 ntf1Var, int i) {
        long j = wj60Var.a;
        if ((i & 4) != 0) {
            ntf1Var = wj60Var.c;
        }
        wj60Var.getClass();
        return new wj60(j, d0k0Var, ntf1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj60)) {
            return false;
        }
        wj60 wj60Var = (wj60) obj;
        return this.a == wj60Var.a && this.b.equals(wj60Var.b) && this.c.equals(wj60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }
}
