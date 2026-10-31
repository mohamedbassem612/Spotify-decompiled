package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class etx0 extends ktx0 {
    public final String a;
    public final String b;
    public final long c;

    public etx0(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etx0)) {
            return false;
        }
        etx0 etx0Var = (etx0) obj;
        return this.a.equals(etx0Var.a) && this.b.equals(etx0Var.b) && this.c == etx0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
