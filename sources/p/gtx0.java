package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gtx0 extends ktx0 {
    public final String a;
    public final long b;
    public final String c;

    public gtx0(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtx0)) {
            return false;
        }
        gtx0 gtx0Var = (gtx0) obj;
        return this.a.equals(gtx0Var.a) && this.b == gtx0Var.b && u890.j(this.c, gtx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
