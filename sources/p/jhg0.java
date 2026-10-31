package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jhg0 extends z1p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public jhg0(String str, String str2, String str3, String str4, String str5) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhg0)) {
            return false;
        }
        jhg0 jhg0Var = (jhg0) obj;
        return u890.j(this.c, jhg0Var.c) && this.d.equals(jhg0Var.d) && this.e.equals(jhg0Var.e) && u890.j(this.f, jhg0Var.f) && this.g.equals(jhg0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.e;
    }

    public final String m() {
        return this.d;
    }

    public final String n() {
        return this.f;
    }

    public final String p() {
        return this.g;
    }
}
