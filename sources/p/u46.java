package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u46 {
    public final String a;
    public final String b;
    public final chr0 c;
    public final psk d;
    public final ArrayList e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;

    public u46(String str, String str2, chr0 chr0Var, psk pskVar, ArrayList arrayList, String str3, String str4, String str5, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = chr0Var;
        this.d = pskVar;
        this.e = arrayList;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u46)) {
            return false;
        }
        u46 u46Var = (u46) obj;
        return u890.j(this.a, u46Var.a) && u890.j(this.b, u46Var.b) && this.c == u46Var.c && this.d == u46Var.d && this.e.equals(u46Var.e) && u890.j(this.f, u46Var.f) && u890.j(this.g, u46Var.g) && u890.j(this.h, u46Var.h) && u890.j(this.i, u46Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = p3d1.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31)) * 31, 31);
        String str2 = this.f;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.i;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
