package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dcc1 extends ijo1 {
    public final String c;
    public final String d;
    public final String e;

    public dcc1(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcc1)) {
            return false;
        }
        dcc1 dcc1Var = (dcc1) obj;
        return this.c.equals(dcc1Var.c) && u890.j(this.d, dcc1Var.d) && u890.j(this.e, dcc1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
