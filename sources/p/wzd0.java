package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wzd0 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public wzd0(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzd0)) {
            return false;
        }
        wzd0 wzd0Var = (wzd0) obj;
        return this.a.equals(wzd0Var.a) && this.b.equals(wzd0Var.b) && this.c.equals(wzd0Var.c) && this.d == wzd0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
