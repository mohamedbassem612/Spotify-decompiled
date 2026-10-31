package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class quf1 {
    public final String a;
    public final cvf1 b;
    public final puf1 c;
    public final int d;
    public final int e;
    public final String f;

    public quf1(String str, cvf1 cvf1Var, puf1 puf1Var, int i, int i2, String str2) {
        this.a = str;
        this.b = cvf1Var;
        this.c = puf1Var;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quf1)) {
            return false;
        }
        quf1 quf1Var = (quf1) obj;
        return this.a.equals(quf1Var.a) && u890.j(this.b, quf1Var.b) && u890.j(this.c, quf1Var.c) && this.d == quf1Var.d && this.e == quf1Var.e && u890.j(this.f, quf1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        this.b.getClass();
        int iF = kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + ((iHashCode + 1396393329) * 31)) * 31, 31), 31);
        String str = this.f;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
