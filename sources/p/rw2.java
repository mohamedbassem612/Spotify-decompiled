package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rw2 implements sw2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public rw2(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw2)) {
            return false;
        }
        rw2 rw2Var = (rw2) obj;
        return u890.j(this.a, rw2Var.a) && u890.j(this.b, rw2Var.b) && u890.j(this.c, rw2Var.c) && u890.j(this.d, rw2Var.d) && u890.j(this.e, rw2Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
