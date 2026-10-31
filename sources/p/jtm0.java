package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jtm0 {
    public final long a;
    public final naw0 b;
    public final lsm0 c;

    public jtm0(long j, naw0 naw0Var) {
        this.a = j;
        this.b = naw0Var;
        this.c = new lsm0(naw0Var.b, naw0Var.c, false, false, (jsm0) null, 0L, (ism0) null, (String) null, true, 0, 1784);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtm0)) {
            return false;
        }
        jtm0 jtm0Var = (jtm0) obj;
        return this.a == jtm0Var.a && this.b.equals(jtm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
