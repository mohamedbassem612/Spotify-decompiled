package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class se51 extends te51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public se51(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof se51)) {
            return false;
        }
        se51 se51Var = (se51) obj;
        return u890.j(this.a, se51Var.a) && this.b.equals(se51Var.b) && this.c.equals(se51Var.c) && this.d.equals(se51Var.d) && this.e.equals(se51Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
