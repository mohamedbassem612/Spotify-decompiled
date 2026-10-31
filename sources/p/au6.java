package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class au6 {
    public final String a;
    public final String b;
    public final String c;

    public au6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au6)) {
            return false;
        }
        au6 au6Var = (au6) obj;
        return u890.j(this.a, au6Var.a) && u890.j(this.b, au6Var.b) && u890.j(this.c, au6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
