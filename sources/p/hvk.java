package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hvk {
    public final String a;
    public final String b;
    public final s781 c;
    public final sxk d;
    public final String e;
    public final String f;
    public final List g;
    public final r591 h;
    public final String i;

    public hvk(String str, String str2, s781 s781Var, sxk sxkVar, String str3, String str4, ArrayList arrayList, r591 r591Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = s781Var;
        this.d = sxkVar;
        this.e = str3;
        this.f = str4;
        this.g = arrayList;
        this.h = r591Var;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvk)) {
            return false;
        }
        hvk hvkVar = (hvk) obj;
        return u890.j(this.a, hvkVar.a) && u890.j(this.b, hvkVar.b) && u890.j(this.c, hvkVar.c) && u890.j(this.d, hvkVar.d) && u890.j(this.e, hvkVar.e) && u890.j(this.f, hvkVar.f) && u890.j(this.g, hvkVar.g) && this.h == hvkVar.h && u890.j(this.i, hvkVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.g;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        r591 r591Var = this.h;
        int iHashCode5 = (iHashCode4 + (r591Var == null ? 0 : r591Var.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
