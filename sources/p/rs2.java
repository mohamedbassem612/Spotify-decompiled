package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rs2 {
    public final ArrayList a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    public rs2(ArrayList arrayList, String str, ArrayList arrayList2, String str2, String str3) {
        this.a = arrayList;
        this.b = str;
        this.c = arrayList2;
        this.d = str2;
        this.e = str3;
    }

    public final List a() {
        return this.a;
    }

    public final List b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs2)) {
            return false;
        }
        rs2 rs2Var = (rs2) obj;
        return this.a.equals(rs2Var.a) && u890.j(this.b, rs2Var.b) && u890.j(this.c, rs2Var.c) && u890.j(this.d, rs2Var.d) && u890.j(this.e, rs2Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
