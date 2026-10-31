package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c71 extends k4p1 {
    public final String c;
    public final String d;
    public final String e;

    public c71(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c71)) {
            return false;
        }
        c71 c71Var = (c71) obj;
        return u890.j(this.c, c71Var.c) && this.d.equals(c71Var.d) && u890.j(this.e, c71Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }
}
