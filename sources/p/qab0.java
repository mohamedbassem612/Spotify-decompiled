package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qab0 {
    public final String a;
    public final String b;
    public final Boolean c;
    public final Long d;
    public final String e;
    public final boolean f;
    public final String g;
    public final sg90 h;
    public final List i;

    public qab0(String str, String str2, Boolean bool, Long l, String str3, boolean z, String str4, sg90 sg90Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = l;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = sg90Var;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qab0)) {
            return false;
        }
        qab0 qab0Var = (qab0) obj;
        return u890.j(this.a, qab0Var.a) && u890.j(this.b, qab0Var.b) && u890.j(this.c, qab0Var.c) && u890.j(this.d, qab0Var.d) && u890.j(this.e, qab0Var.e) && this.f == qab0Var.f && u890.j(this.g, qab0Var.g) && u890.j(this.h, qab0Var.h) && u890.j(this.i, qab0Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.d;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.e;
        int iG = xcg1.g((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode3 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        sg90 sg90Var = this.h;
        return this.i.hashCode() + ((iHashCode3 + (sg90Var != null ? sg90Var.hashCode() : 0)) * 31);
    }
}
