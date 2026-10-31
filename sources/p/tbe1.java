package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tbe1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final sbe1 d;

    public tbe1(String str, String str2, boolean z, sbe1 sbe1Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = sbe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbe1)) {
            return false;
        }
        tbe1 tbe1Var = (tbe1) obj;
        return u890.j(this.a, tbe1Var.a) && u890.j(this.b, tbe1Var.b) && this.c == tbe1Var.c && this.d.equals(tbe1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
