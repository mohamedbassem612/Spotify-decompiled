package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class go71 {
    public final String a;
    public final String b;
    public final cqi1 c;
    public final Map d;
    public final String e;
    public final ujc0 f;

    public /* synthetic */ go71(String str, String str2, cqi1 cqi1Var, Map map, String str3, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : cqi1Var, (i & 8) != 0 ? b7x.a : map, (i & 16) != 0 ? null : str3, (ujc0) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go71)) {
            return false;
        }
        go71 go71Var = (go71) obj;
        return u890.j(this.a, go71Var.a) && u890.j(this.b, go71Var.b) && u890.j(this.c, go71Var.c) && u890.j(this.d, go71Var.d) && u890.j(this.e, go71Var.e) && u890.j(this.f, go71Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        cqi1 cqi1Var = this.c;
        int iE = cy30.e((iHashCode2 + (cqi1Var == null ? 0 : cqi1Var.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode3 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        ujc0 ujc0Var = this.f;
        return iHashCode3 + (ujc0Var != null ? ujc0Var.hashCode() : 0);
    }

    public go71(String str, String str2, cqi1 cqi1Var, Map map, String str3, ujc0 ujc0Var) {
        this.a = str;
        this.b = str2;
        this.c = cqi1Var;
        this.d = map;
        this.e = str3;
        this.f = ujc0Var;
    }
}
