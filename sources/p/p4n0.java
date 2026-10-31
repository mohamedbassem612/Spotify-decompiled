package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p4n0 {
    public final String a;
    public final String b;
    public final int c;

    public p4n0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4n0)) {
            return false;
        }
        p4n0 p4n0Var = (p4n0) obj;
        return u890.j(this.a, p4n0Var.a) && this.b.equals(p4n0Var.b) && this.c == p4n0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
