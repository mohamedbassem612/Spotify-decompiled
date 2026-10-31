package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ao9 {
    public final String a;
    public final String b;
    public final String c;

    public ao9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao9)) {
            return false;
        }
        ao9 ao9Var = (ao9) obj;
        return this.a.equals(ao9Var.a) && u890.j(this.b, ao9Var.b) && this.c.equals(ao9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
