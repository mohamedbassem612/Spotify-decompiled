package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mdj0 extends jyo1 {
    public final bq21 c;
    public final String d;
    public final String e;

    public mdj0(bq21 bq21Var, String str, String str2) {
        this.c = bq21Var;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdj0)) {
            return false;
        }
        mdj0 mdj0Var = (mdj0) obj;
        return this.c.equals(mdj0Var.c) && u890.j(this.d, mdj0Var.d) && u890.j(this.e, mdj0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }
}
