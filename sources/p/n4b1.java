package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class n4b1 {
    public static final m4b1 Companion = new m4b1();
    public static final znb0[] m = {dm5.S(2, gr81.e1), null, null, null, null, dm5.S(2, l4b1.b), dm5.S(2, l4b1.c), dm5.S(2, l4b1.d), null, null, null};
    public final List a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final String i;
    public final mn51 j;
    public final qrc1 k;
    public final qrc1 l;

    public /* synthetic */ n4b1(int i, List list, long j, long j2, String str, String str2, List list2, List list3, List list4, String str3, mn51 mn51Var, qrc1 qrc1Var) {
        List list5;
        List list6;
        String str4;
        qrc1 qrc1Var2;
        qrc1 qrc1Var3 = null;
        if (63 != (i & 63)) {
            o6p1.t(i, 63, k4b1.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = list2;
        if ((i & 64) == 0) {
            this.g = null;
            list5 = null;
        } else {
            list5 = list3;
            this.g = list5;
        }
        if ((i & 128) == 0) {
            this.h = null;
            list6 = null;
        } else {
            list6 = list4;
            this.h = list6;
        }
        if ((i & 256) == 0) {
            this.i = null;
            str4 = null;
        } else {
            str4 = str3;
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = mn51Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
            qrc1Var2 = null;
        } else {
            qrc1Var2 = qrc1Var;
            this.k = qrc1Var2;
        }
        if (qrc1Var2 == null) {
            if (list5 != null && list6 != null && str4 != null) {
                List<String> list7 = list6;
                ArrayList arrayList = new ArrayList(q7h.U(list7, 10));
                for (String str5 : list7) {
                    arrayList.add(new lrc1(nhc1.W(str4, "{{language_code}}", str5), ihc1.J0(str5, "-x-cc"), nhc1.R(str5, "-x-cc", false)));
                }
                qrc1Var3 = new qrc1(arrayList, list5);
            }
            qrc1Var2 = qrc1Var3;
        }
        this.l = qrc1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4b1)) {
            return false;
        }
        n4b1 n4b1Var = (n4b1) obj;
        return u890.j(this.a, n4b1Var.a) && this.b == n4b1Var.b && this.c == n4b1Var.c && u890.j(this.d, n4b1Var.d) && u890.j(this.e, n4b1Var.e) && u890.j(this.f, n4b1Var.f) && u890.j(this.g, n4b1Var.g) && u890.j(this.h, n4b1Var.h) && u890.j(this.i, n4b1Var.i) && u890.j(this.j, n4b1Var.j) && u890.j(this.k, n4b1Var.k);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), 31, this.f);
        List list = this.g;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.i;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        mn51 mn51Var = this.j;
        int iHashCode4 = (iHashCode3 + (mn51Var == null ? 0 : mn51Var.hashCode())) * 31;
        qrc1 qrc1Var = this.k;
        return iHashCode4 + (qrc1Var != null ? qrc1Var.hashCode() : 0);
    }
}
