package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jz41 extends q151 {
    public final String a;
    public final String b;
    public final List c;
    public final tv80 d;
    public final String e;

    public jz41(String str, String str2, List list, tv80 tv80Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = tv80Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz41)) {
            return false;
        }
        jz41 jz41Var = (jz41) obj;
        return u890.j(this.a, jz41Var.a) && u890.j(this.b, jz41Var.b) && u890.j(this.c, jz41Var.c) && u890.j(this.d, jz41Var.d) && u890.j(this.e, jz41Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        tv80 tv80Var = this.d;
        int iHashCode4 = (iHashCode3 + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
