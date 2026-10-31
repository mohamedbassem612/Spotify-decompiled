package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hph1 {
    public final String a;
    public final String b;
    public final String c;
    public final rph1 d;

    public hph1(String str, String str2, String str3, rph1 rph1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rph1Var;
    }

    public static hph1 a(hph1 hph1Var, rph1 rph1Var) {
        return new hph1(hph1Var.a, hph1Var.b, hph1Var.c, rph1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hph1)) {
            return false;
        }
        hph1 hph1Var = (hph1) obj;
        return u890.j(this.a, hph1Var.a) && this.b.equals(hph1Var.b) && this.c.equals(hph1Var.c) && u890.j(this.d, hph1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
