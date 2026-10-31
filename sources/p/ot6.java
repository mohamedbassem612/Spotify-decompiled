package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ot6 {
    public final String a;
    public final String b;
    public final String c;

    public ot6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot6)) {
            return false;
        }
        ot6 ot6Var = (ot6) obj;
        return u890.j(this.a, ot6Var.a) && u890.j(this.b, ot6Var.b) && u890.j(this.c, ot6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
