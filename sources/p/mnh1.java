package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mnh1 {
    public final String a;
    public final String b;
    public final int c;
    public final Long d;
    public final boolean e;

    public mnh1(String str, String str2, int i, Long l, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = l;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnh1)) {
            return false;
        }
        mnh1 mnh1Var = (mnh1) obj;
        return u890.j(this.a, mnh1Var.a) && this.b.equals(mnh1Var.b) && this.c == mnh1Var.c && this.d.equals(mnh1Var.d) && this.e == mnh1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }
}
