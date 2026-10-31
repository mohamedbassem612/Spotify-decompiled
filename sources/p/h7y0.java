package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h7y0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public h7y0(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7y0)) {
            return false;
        }
        h7y0 h7y0Var = (h7y0) obj;
        return u890.j(this.a, h7y0Var.a) && u890.j(this.b, h7y0Var.b) && u890.j(this.c, h7y0Var.c) && u890.j(this.d, h7y0Var.d) && u890.j(this.e, h7y0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
