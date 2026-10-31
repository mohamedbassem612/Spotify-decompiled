package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w771 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    public w771(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w771)) {
            return false;
        }
        w771 w771Var = (w771) obj;
        return u890.j(this.a, w771Var.a) && u890.j(this.b, w771Var.b) && this.c == w771Var.c && this.d.equals(w771Var.d) && u890.j(this.e, w771Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
