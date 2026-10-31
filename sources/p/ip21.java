package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ip21 {
    public final String a;
    public final String b;
    public final String c;

    public ip21(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip21)) {
            return false;
        }
        ip21 ip21Var = (ip21) obj;
        return u890.j(this.a, ip21Var.a) && u890.j(this.b, ip21Var.b) && u890.j(this.c, ip21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
