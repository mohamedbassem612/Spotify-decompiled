package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cv21 {
    public final String a;
    public final String b;
    public final String c;

    public cv21(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv21)) {
            return false;
        }
        cv21 cv21Var = (cv21) obj;
        return u890.j(this.a, cv21Var.a) && this.b.equals(cv21Var.b) && this.c.equals(cv21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
