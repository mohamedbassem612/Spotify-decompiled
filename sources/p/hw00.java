package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hw00 implements ww00 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;

    public hw00(String str, String str2, String str3, String str4, String str5, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw00)) {
            return false;
        }
        hw00 hw00Var = (hw00) obj;
        return u890.j(this.a, hw00Var.a) && u890.j(this.b, hw00Var.b) && this.c.equals(hw00Var.c) && u890.j(this.d, hw00Var.d) && u890.j(this.e, hw00Var.e) && u890.j(this.f, hw00Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iB = f4i1.b(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
