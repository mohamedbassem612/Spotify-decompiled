package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tgw0 extends wgw0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public tgw0(long j, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgw0)) {
            return false;
        }
        tgw0 tgw0Var = (tgw0) obj;
        return u890.j(this.a, tgw0Var.a) && this.b == tgw0Var.b && this.c == tgw0Var.c && this.d == tgw0Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.d) + xcg1.g(xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }
}
