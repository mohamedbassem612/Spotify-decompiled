package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nr0 extends z1p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public nr0(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = "Navigation to forbidden URI blocked: ".concat(str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr0)) {
            return false;
        }
        nr0 nr0Var = (nr0) obj;
        return u890.j(this.c, nr0Var.c) && u890.j(this.d, nr0Var.d) && u890.j(this.e, nr0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }

    public final String k() {
        return this.d;
    }

    public final String l() {
        return this.f;
    }

    public final String o() {
        return this.c;
    }
}
