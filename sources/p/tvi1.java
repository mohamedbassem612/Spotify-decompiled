package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tvi1 {
    public static final tvi1 f = new tvi1("", "", "", "", false);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public tvi1(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvi1)) {
            return false;
        }
        tvi1 tvi1Var = (tvi1) obj;
        return u890.j(this.a, tvi1Var.a) && u890.j(this.b, tvi1Var.b) && u890.j(this.c, tvi1Var.c) && u890.j(this.d, tvi1Var.d) && this.e == tvi1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
