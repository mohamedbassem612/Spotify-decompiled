package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eea1 {
    public final String a;
    public final c380 b;
    public final int c;
    public final String d;
    public final boolean e;

    public eea1(int i, String str, String str2, c380 c380Var, boolean z) {
        this.a = str;
        this.b = c380Var;
        this.c = i;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eea1)) {
            return false;
        }
        eea1 eea1Var = (eea1) obj;
        return u890.j(this.a, eea1Var.a) && u890.j(this.b, eea1Var.b) && this.c == eea1Var.c && u890.j(this.d, eea1Var.d) && this.e == eea1Var.e;
    }

    public final int hashCode() {
        int iF = kk0.f(this.b, this.a.hashCode() * 31, 31);
        int i = this.c;
        int iC = (iF + (i == 0 ? 0 : l1d.C(i))) * 31;
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }
}
