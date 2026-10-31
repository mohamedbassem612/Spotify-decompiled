package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n6y0 {
    public final boolean a;
    public final String b;
    public final tv80 c;

    public n6y0(String str, tv80 tv80Var, boolean z) {
        this.a = z;
        this.b = str;
        this.c = tv80Var;
    }

    public final hhc a() {
        y6r0 y6r0Var;
        String str;
        ou80 ou80Var;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = this.b;
        if (str3 != null) {
        }
        tv80 tv80Var = this.c;
        if (tv80Var != null && (ou80Var = tv80Var.a) != null && (str2 = ou80Var.a) != null) {
        }
        if (tv80Var != null && (y6r0Var = tv80Var.b) != null && (str = y6r0Var.a) != null) {
        }
        return phc.i(new uga0(linkedHashMap).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6y0)) {
            return false;
        }
        n6y0 n6y0Var = (n6y0) obj;
        return this.a == n6y0Var.a && u890.j(this.b, n6y0Var.b) && u890.j(this.c, n6y0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tv80 tv80Var = this.c;
        return iHashCode2 + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
