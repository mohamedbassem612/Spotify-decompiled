package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ucl1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ucl1(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucl1)) {
            return false;
        }
        ucl1 ucl1Var = (ucl1) obj;
        return this.a.equals(ucl1Var.a) && this.b.equals(ucl1Var.b) && this.c.equals(ucl1Var.c) && this.d.equals(ucl1Var.d) && u890.j(this.e, ucl1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
