package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rdi1 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public rdi1(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdi1)) {
            return false;
        }
        rdi1 rdi1Var = (rdi1) obj;
        return this.a.equals(rdi1Var.a) && this.b.equals(rdi1Var.b) && this.c.equals(rdi1Var.c) && this.d == rdi1Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
