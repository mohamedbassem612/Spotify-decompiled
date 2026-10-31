package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ihw0 implements khw0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;

    public ihw0(int i, long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihw0)) {
            return false;
        }
        ihw0 ihw0Var = (ihw0) obj;
        return this.a.equals(ihw0Var.a) && this.b.equals(ihw0Var.b) && u890.j(this.c, ihw0Var.c) && this.d == ihw0Var.d && this.e == ihw0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Long.hashCode(this.e) + ab80.k(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
