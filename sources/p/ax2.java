package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ax2 {
    public final String a;
    public final String b;
    public final yf51 c;
    public final yf51 d;
    public final String e;

    public ax2(String str, String str2, yf51 yf51Var, yf51 yf51Var2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = yf51Var;
        this.d = yf51Var2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax2)) {
            return false;
        }
        ax2 ax2Var = (ax2) obj;
        return u890.j(this.a, ax2Var.a) && u890.j(this.b, ax2Var.b) && this.c.equals(ax2Var.c) && u890.j(this.d, ax2Var.d) && u890.j(this.e, ax2Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        yf51 yf51Var = this.d;
        int iHashCode2 = (iHashCode + (yf51Var == null ? 0 : yf51Var.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
