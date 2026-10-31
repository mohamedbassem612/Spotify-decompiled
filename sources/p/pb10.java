package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pb10 extends gto1 {
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    public pb10(String str, List list, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb10)) {
            return false;
        }
        pb10 pb10Var = (pb10) obj;
        return u890.j(this.b, pb10Var.b) && u890.j(this.c, pb10Var.c) && u890.j(this.d, pb10Var.d) && u890.j(this.e, pb10Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
