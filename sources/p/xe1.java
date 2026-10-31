package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xe1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public xe1(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof xe1)) {
            return false;
        }
        xe1 xe1Var = (xe1) obj;
        return this.a.equals(xe1Var.a) && this.b.equals(xe1Var.b) && this.c.equals(xe1Var.c) && this.d.equals(xe1Var.d) && this.e.equals(xe1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
