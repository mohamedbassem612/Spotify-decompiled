package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zoy0 implements ez00 {
    public final h290 a;
    public final jxp0 b;
    public final long c;

    public zoy0(h290 h290Var, jxp0 jxp0Var, long j) {
        this.a = h290Var;
        this.b = jxp0Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zoy0) {
            zoy0 zoy0Var = (zoy0) obj;
            if (this.a.equals(zoy0Var.a) && this.b == zoy0Var.b && this.c == zoy0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
