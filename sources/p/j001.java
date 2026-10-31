package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j001 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public j001(String str, String str2, boolean z, String str3, List list) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j001)) {
            return false;
        }
        j001 j001Var = (j001) obj;
        return this.a == j001Var.a && u890.j(this.b, j001Var.b) && u890.j(this.c, j001Var.c) && u890.j(this.d, j001Var.d) && this.e.equals(j001Var.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
