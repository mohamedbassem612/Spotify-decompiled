package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lh80 extends nh80 {
    public final String a;
    public final String b;
    public final azh1 c;
    public final String d;

    public lh80(String str, String str2, azh1 azh1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = azh1Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh80)) {
            return false;
        }
        lh80 lh80Var = (lh80) obj;
        return this.a.equals(lh80Var.a) && this.b.equals(lh80Var.b) && u890.j(this.c, lh80Var.c) && this.d.equals(lh80Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        azh1 azh1Var = this.c;
        return this.d.hashCode() + ((iD + (azh1Var == null ? 0 : azh1Var.hashCode())) * 31);
    }
}
