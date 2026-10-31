package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class clk1 {
    public final List a;
    public final String b;
    public final u7h c;
    public final String d;

    public /* synthetic */ clk1(List list, String str, int i) {
        this(null, (i & 8) != 0 ? null : str, (i & 1) != 0 ? z6x.a : list, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clk1)) {
            return false;
        }
        clk1 clk1Var = (clk1) obj;
        return u890.j(this.a, clk1Var.a) && u890.j(this.b, clk1Var.b) && u890.j(this.c, clk1Var.c) && u890.j(this.d, clk1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u7h u7hVar = this.c;
        int iHashCode3 = (iHashCode2 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public clk1(String str, String str2, List list, u7h u7hVar) {
        this.a = list;
        this.b = str;
        this.c = u7hVar;
        this.d = str2;
    }
}
