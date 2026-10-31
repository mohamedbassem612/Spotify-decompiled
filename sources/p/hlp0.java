package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hlp0 {
    public final String a;
    public final String b;
    public final String c;

    public hlp0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlp0)) {
            return false;
        }
        hlp0 hlp0Var = (hlp0) obj;
        return this.a.equals(hlp0Var.a) && u890.j(this.b, hlp0Var.b) && this.c.equals(hlp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
