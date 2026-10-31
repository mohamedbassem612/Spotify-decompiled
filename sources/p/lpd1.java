package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lpd1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lpd1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpd1)) {
            return false;
        }
        lpd1 lpd1Var = (lpd1) obj;
        return this.a.equals(lpd1Var.a) && this.b.equals(lpd1Var.b) && this.c.equals(lpd1Var.c) && this.d.equals(lpd1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
