package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hl6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public hl6(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof hl6)) {
            return false;
        }
        hl6 hl6Var = (hl6) obj;
        return u890.j(this.a, hl6Var.a) && u890.j(this.b, hl6Var.b) && u890.j(this.c, hl6Var.c) && this.d.equals(hl6Var.d) && u890.j(this.e, hl6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
