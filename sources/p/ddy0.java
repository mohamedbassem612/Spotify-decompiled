package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ddy0 implements gdy0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ddy0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddy0)) {
            return false;
        }
        ddy0 ddy0Var = (ddy0) obj;
        return u890.j(this.a, ddy0Var.a) && this.b.equals(ddy0Var.b) && this.c.equals(ddy0Var.c) && this.d.equals(ddy0Var.d) && u890.j(this.e, ddy0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
