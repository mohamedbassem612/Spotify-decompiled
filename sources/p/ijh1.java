package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ijh1 extends z1p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public ijh1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijh1)) {
            return false;
        }
        ijh1 ijh1Var = (ijh1) obj;
        return u890.j(this.c, ijh1Var.c) && u890.j(this.d, ijh1Var.d) && this.e.equals(ijh1Var.e) && this.f.equals(ijh1Var.f) && u890.j(this.g, ijh1Var.g) && this.h.equals(ijh1Var.h) && u890.j(this.i, ijh1Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return this.e;
    }

    public final String n() {
        return this.d;
    }

    public final String o() {
        return this.g;
    }

    public final String p() {
        return this.h;
    }

    public final String r() {
        return this.i;
    }
}
