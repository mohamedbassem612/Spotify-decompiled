package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dvd1 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final String f;
    public final List g;

    public dvd1(String str, String str2, String str3, List list, List list2, String str4, List list3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = str4;
        this.g = list3;
    }

    public static dvd1 a(dvd1 dvd1Var, List list, ArrayList arrayList, int i) {
        String str = dvd1Var.a;
        String str2 = dvd1Var.b;
        String str3 = dvd1Var.c;
        if ((i & 8) != 0) {
            list = dvd1Var.d;
        }
        return new dvd1(str, str2, str3, list, arrayList, dvd1Var.f, dvd1Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvd1)) {
            return false;
        }
        dvd1 dvd1Var = (dvd1) obj;
        return this.a.equals(dvd1Var.a) && u890.j(this.b, dvd1Var.b) && u890.j(this.c, dvd1Var.c) && this.d.equals(dvd1Var.d) && this.e.equals(dvd1Var.e) && this.f.equals(dvd1Var.f) && this.g.equals(dvd1Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.g.hashCode() + cy30.d(f4i1.b(f4i1.b((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
