package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wto0 extends omo1 {
    public final ujo0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final cvy0 j;

    public wto0(ujo0 ujo0Var, String str, String str2, String str3, String str4, String str5, List list, cvy0 cvy0Var) {
        this.c = ujo0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = list;
        this.j = cvy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wto0)) {
            return false;
        }
        wto0 wto0Var = (wto0) obj;
        return this.c.equals(wto0Var.c) && u890.j(this.d, wto0Var.d) && u890.j(this.e, wto0Var.e) && u890.j(this.f, wto0Var.f) && u890.j(this.g, wto0Var.g) && u890.j(this.h, wto0Var.h) && this.i.equals(wto0Var.i) && this.j.equals(wto0Var.j);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return this.j.hashCode() + f4i1.b((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.i);
    }

    public final cvy0 o() {
        return this.j;
    }
}
