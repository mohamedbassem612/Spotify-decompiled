package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j990 {
    public final vzq0 a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;

    public j990(vzq0 vzq0Var, String str, String str2, ArrayList arrayList, String str3) {
        this.a = vzq0Var;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j990)) {
            return false;
        }
        j990 j990Var = (j990) obj;
        return this.a.equals(j990Var.a) && u890.j(this.b, j990Var.b) && u890.j(this.c, j990Var.c) && this.d.equals(j990Var.d) && u890.j(this.e, j990Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = p3d1.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }
}
