package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class za31 implements ab31 {
    public final ega1 a;
    public final String b;
    public final int c;

    public za31(ega1 ega1Var, String str, int i) {
        this.a = ega1Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za31)) {
            return false;
        }
        za31 za31Var = (za31) obj;
        return this.a.equals(za31Var.a) && u890.j(this.b, za31Var.b) && this.c == za31Var.c;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = this.c;
        return iD + (i == 0 ? 0 : l1d.C(i));
    }
}
