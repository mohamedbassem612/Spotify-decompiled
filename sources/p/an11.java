package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class an11 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public an11(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an11)) {
            return false;
        }
        an11 an11Var = (an11) obj;
        return this.a.equals(an11Var.a) && this.b.equals(an11Var.b) && this.c.equals(an11Var.c) && this.d.equals(an11Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
