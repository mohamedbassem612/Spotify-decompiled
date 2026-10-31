package p;

import com.google.type.DateTime;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class la00 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final DateTime f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final ma00 l;

    public la00(String str, List list, String str2, String str3, String str4, DateTime dateTime, String str5, String str6, String str7, String str8, List list2, ma00 ma00Var) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = dateTime;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = list2;
        this.l = ma00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la00)) {
            return false;
        }
        la00 la00Var = (la00) obj;
        return u890.j(this.a, la00Var.a) && this.b.equals(la00Var.b) && this.c.equals(la00Var.c) && this.d.equals(la00Var.d) && this.e.equals(la00Var.e) && u890.j(this.f, la00Var.f) && this.g.equals(la00Var.g) && this.h.equals(la00Var.h) && this.i.equals(la00Var.i) && u890.j(this.j, la00Var.j) && this.k.equals(la00Var.k) && u890.j(this.l, la00Var.l);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d(cy30.d(cy30.d(f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        DateTime dateTime = this.f;
        int iD2 = cy30.d(cy30.d(cy30.d((iD + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        String str2 = this.j;
        int iB = f4i1.b((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k);
        ma00 ma00Var = this.l;
        return iB + (ma00Var != null ? ma00Var.hashCode() : 0);
    }
}
