package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gza1 extends z1p1 {
    public final String c = "sponsoredContextMismatch";
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public gza1(String str, String str2, String str3, String str4, String str5) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gza1)) {
            return false;
        }
        gza1 gza1Var = (gza1) obj;
        return this.c.equals(gza1Var.c) && this.d.equals(gza1Var.d) && u890.j(this.e, gza1Var.e) && u890.j(this.f, gza1Var.f) && u890.j(this.g, gza1Var.g) && u890.j(this.h, gza1Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.c;
    }

    public final String n() {
        return this.f;
    }

    public final String o() {
        return this.g;
    }

    public final String q() {
        return this.h;
    }
}
