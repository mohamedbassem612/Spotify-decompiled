package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mzj1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public mzj1(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzj1)) {
            return false;
        }
        mzj1 mzj1Var = (mzj1) obj;
        return u890.j(this.a, mzj1Var.a) && this.b.equals(mzj1Var.b) && this.c.equals(mzj1Var.c) && this.d == mzj1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
