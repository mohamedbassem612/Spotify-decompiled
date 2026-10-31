package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mfr0 implements qfr0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final tfr0 e;

    public mfr0(String str, String str2, int i, String str3, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfr0)) {
            return false;
        }
        mfr0 mfr0Var = (mfr0) obj;
        return u890.j(this.a, mfr0Var.a) && u890.j(this.b, mfr0Var.b) && this.c == mfr0Var.c && u890.j(this.d, mfr0Var.d) && this.e.equals(mfr0Var.e);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.e.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }
}
