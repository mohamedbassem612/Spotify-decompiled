package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class av50 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;
    public final ArrayList h;
    public final h1a i;

    public av50(String str, String str2, String str3, String str4, String str5, Long l, String str6, ArrayList arrayList, h1a h1aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l;
        this.g = str6;
        this.h = arrayList;
        this.i = h1aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av50)) {
            return false;
        }
        av50 av50Var = (av50) obj;
        return this.a.equals(av50Var.a) && this.b.equals(av50Var.b) && this.c.equals(av50Var.c) && u890.j(this.d, av50Var.d) && this.e.equals(av50Var.e) && u890.j(this.f, av50Var.f) && u890.j(this.g, av50Var.g) && this.h.equals(av50Var.h) && u890.j(this.i, av50Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Long l = this.f;
        int iHashCode = (((iD2 + (l == null ? 0 : l.hashCode())) * 31) + 1703420766) * 31;
        String str2 = this.g;
        int iF = p3d1.f(this.h, xcg1.g((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) - 2047944555) * 31, 31, false), 31);
        h1a h1aVar = this.i;
        return iF + (h1aVar != null ? h1aVar.hashCode() : 0);
    }
}
