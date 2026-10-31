package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l81 extends u4p1 {
    public final String c;
    public final String d;
    public final flr0 e;

    public l81(String str, String str2, flr0 flr0Var) {
        this.c = str;
        this.d = str2;
        this.e = flr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l81)) {
            return false;
        }
        l81 l81Var = (l81) obj;
        return u890.j(this.c, l81Var.c) && u890.j(this.d, l81Var.d) && u890.j(this.e, l81Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }
}
