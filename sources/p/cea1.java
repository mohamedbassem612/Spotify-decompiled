package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cea1 {
    public final String a;
    public final c380 b;
    public final int c;
    public final String d;

    public cea1(int i, String str, String str2, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cea1)) {
            return false;
        }
        cea1 cea1Var = (cea1) obj;
        return u890.j(this.a, cea1Var.a) && u890.j(this.b, cea1Var.b) && this.c == cea1Var.c && u890.j(this.d, cea1Var.d);
    }

    public final int hashCode() {
        int iF = kk0.f(this.b, this.a.hashCode() * 31, 31);
        int i = this.c;
        int iC = (iF + (i == 0 ? 0 : l1d.C(i))) * 31;
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
