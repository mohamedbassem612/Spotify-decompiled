package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class git0 implements tey0 {
    public final String a;
    public final String b;
    public final ai90 c;
    public final int d;

    public /* synthetic */ git0(String str, String str2, fh90 fh90Var, int i) {
        this(str, str2, (ai90) ((i & 4) != 0 ? new zh90() : fh90Var), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof git0)) {
            return false;
        }
        git0 git0Var = (git0) obj;
        return u890.j(this.a, git0Var.a) && u890.j(this.b, git0Var.b) && u890.j(this.c, git0Var.c) && this.d == git0Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        int i = this.d;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }

    public git0(String str, String str2, ai90 ai90Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = ai90Var;
        this.d = i;
    }
}
