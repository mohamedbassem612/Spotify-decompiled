package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q4n0 {
    public final String a;
    public final String b;
    public final int c;

    public q4n0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4n0)) {
            return false;
        }
        q4n0 q4n0Var = (q4n0) obj;
        return u890.j(this.a, q4n0Var.a) && this.b.equals(q4n0Var.b) && this.c == q4n0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
