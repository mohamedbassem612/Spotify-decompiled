package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ezv0 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final ArrayList e;
    public final Long f;
    public final Integer g;
    public final List h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;

    public ezv0(String str, String str2, long j, String str3, ArrayList arrayList, Long l, Integer num, List list, int i, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = arrayList;
        this.f = l;
        this.g = num;
        this.h = list;
        this.i = i;
        this.j = str4;
        this.k = str5;
        this.l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezv0)) {
            return false;
        }
        ezv0 ezv0Var = (ezv0) obj;
        return u890.j(this.a, ezv0Var.a) && u890.j(this.b, ezv0Var.b) && this.c == ezv0Var.c && u890.j(this.d, ezv0Var.d) && this.e.equals(ezv0Var.e) && u890.j(this.f, ezv0Var.f) && u890.j(this.g, ezv0Var.g) && u890.j(this.h, ezv0Var.h) && this.i == ezv0Var.i && u890.j(this.j, ezv0Var.j) && u890.j(this.k, ezv0Var.k) && u890.j(this.l, ezv0Var.l);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.e, cy30.d(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d), 31);
        Long l = this.f;
        int iHashCode = (iF + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.g;
        int iD = cy30.d(cy30.d(kaa0.f(this.i, f4i1.b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.h), 31), 31, this.j), 31, this.k);
        String str = this.l;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
