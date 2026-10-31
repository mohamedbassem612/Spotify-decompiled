package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aln implements bln {
    public final Map a;
    public final boolean b;
    public final List c;
    public final w4i1 d;
    public final String e;
    public final String f;
    public final boolean g;

    public aln(Map map, boolean z, ArrayList arrayList, w4i1 w4i1Var, String str, String str2, boolean z2) {
        this.a = map;
        this.b = z;
        this.c = arrayList;
        this.d = w4i1Var;
        this.e = str;
        this.f = str2;
        this.g = z2;
    }

    public final Map a() {
        return this.a;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aln)) {
            return false;
        }
        aln alnVar = (aln) obj;
        return this.a.equals(alnVar.a) && this.b == alnVar.b && u890.j(this.c, alnVar.c) && u890.j(this.d, alnVar.d) && u890.j(this.e, alnVar.e) && u890.j(this.f, alnVar.f) && this.g == alnVar.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int iD = ydh.d(this.d, (iG + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
