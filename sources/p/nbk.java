package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nbk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final gbk f;
    public final iu30 g;
    public final Function0 h;
    public final iu30 i;
    public final boolean j;
    public final boolean k;

    public /* synthetic */ nbk(int i, String str, String str2, String str3, String str4, List list) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "Concert Campaign Page" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "https://i.scdn.co/image/ab6761610000e5eb1a9824a587cc162d8b98fa6f" : str4, (i & 16) != 0 ? z6x.a : list, null, null, null, null, true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbk)) {
            return false;
        }
        nbk nbkVar = (nbk) obj;
        return u890.j(this.a, nbkVar.a) && u890.j(this.b, nbkVar.b) && u890.j(this.c, nbkVar.c) && u890.j(this.d, nbkVar.d) && u890.j(this.e, nbkVar.e) && u890.j(this.f, nbkVar.f) && u890.j(this.g, nbkVar.g) && u890.j(this.h, nbkVar.h) && u890.j(this.i, nbkVar.i) && this.j == nbkVar.j && this.k == nbkVar.k;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iB = f4i1.b(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        gbk gbkVar = this.f;
        int iHashCode = (iB + (gbkVar == null ? 0 : gbkVar.hashCode())) * 31;
        iu30 iu30Var = this.g;
        int iHashCode2 = (iHashCode + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31;
        Function0 function0 = this.h;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        iu30 iu30Var2 = this.i;
        return Boolean.hashCode(this.k) + xcg1.g((iHashCode3 + (iu30Var2 != null ? iu30Var2.hashCode() : 0)) * 31, 31, this.j);
    }

    public nbk(String str, String str2, String str3, String str4, List list, gbk gbkVar, iu30 iu30Var, Function0 function0, iu30 iu30Var2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = gbkVar;
        this.g = iu30Var;
        this.h = function0;
        this.i = iu30Var2;
        this.j = z;
        this.k = z2;
    }
}
