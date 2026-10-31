package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ilo0 extends sio1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Map j;

    public ilo0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilo0)) {
            return false;
        }
        ilo0 ilo0Var = (ilo0) obj;
        return u890.j(this.c, ilo0Var.c) && u890.j(this.d, ilo0Var.d) && u890.j(this.e, ilo0Var.e) && u890.j(this.f, ilo0Var.f) && this.g.equals(ilo0Var.g) && u890.j(this.h, ilo0Var.h) && u890.j(this.i, ilo0Var.i) && u890.j(this.j, ilo0Var.j);
    }

    public final int hashCode() {
        String str = this.c;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iD2 = cy30.d((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        String str4 = this.h;
        int iHashCode2 = (iD2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.j;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }
}
