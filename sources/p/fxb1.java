package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fxb1 implements hxb1 {
    public final String a;
    public final String b;
    public final String c;

    public fxb1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static fxb1 a(fxb1 fxb1Var, String str) {
        String str2 = fxb1Var.a;
        String str3 = fxb1Var.b;
        fxb1Var.getClass();
        return new fxb1(str2, str3, str);
    }

    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxb1)) {
            return false;
        }
        fxb1 fxb1Var = (fxb1) obj;
        return this.a.equals(fxb1Var.a) && this.b.equals(fxb1Var.b) && u890.j(this.c, fxb1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
