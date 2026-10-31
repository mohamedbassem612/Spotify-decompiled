package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c9l1 {
    public final ujo1 a;
    public final String b;
    public final String c;

    public c9l1(ujo1 ujo1Var, String str, String str2) {
        this.a = ujo1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9l1)) {
            return false;
        }
        c9l1 c9l1Var = (c9l1) obj;
        return this.a.equals(c9l1Var.a) && u890.j(this.b, c9l1Var.b) && u890.j(this.c, c9l1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
