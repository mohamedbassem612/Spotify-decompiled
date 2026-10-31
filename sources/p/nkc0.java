package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nkc0 {
    public final String a;
    public final long b;
    public final int c;

    public nkc0(long j, int i, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkc0)) {
            return false;
        }
        nkc0 nkc0Var = (nkc0) obj;
        return this.a.equals(nkc0Var.a) && this.b == nkc0Var.b && this.c == nkc0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
