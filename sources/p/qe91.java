package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qe91 {
    public final List a;
    public final Map b;
    public final x4e0 c;
    public final boolean d;
    public final String e;

    public qe91(List list, Map map, x4e0 x4e0Var, boolean z, String str) {
        this.a = list;
        this.b = map;
        this.c = x4e0Var;
        this.d = z;
        this.e = str;
    }

    public static qe91 b(qe91 qe91Var, Map map, x4e0 x4e0Var, String str, int i) {
        List list = qe91Var.a;
        if ((i & 2) != 0) {
            map = qe91Var.b;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            x4e0Var = qe91Var.c;
        }
        x4e0 x4e0Var2 = x4e0Var;
        boolean z = (i & 8) != 0 ? qe91Var.d : true;
        if ((i & 16) != 0) {
            str = qe91Var.e;
        }
        return new qe91(list, map2, x4e0Var2, z, str);
    }

    public final String a() {
        return "slots=" + this.a + ", contents={" + o7h.y0(this.b.entrySet(), (CharSequence) null, (String) null, (String) null, fe91.c, 31) + "}";
    }

    public final boolean c() {
        Collection<rd91> collectionValues = this.b.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        for (rd91 rd91Var : collectionValues) {
            if ((rd91Var instanceof rd91) && !rd91Var.a.isEmpty()) {
                return true;
            }
            if ((rd91Var instanceof od91) && !((od91) rd91Var).a.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        List<ef91> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (ef91 ef91Var : list) {
            rd91 rd91Var = (td91) this.b.get(ef91Var);
            mmr0 mmr0Var = null;
            List list2 = rd91Var instanceof rd91 ? rd91Var.a : rd91Var instanceof od91 ? ((od91) rd91Var).a : null;
            if (list2 != null) {
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    mmr0Var = new mmr0(ef91Var.name().toLowerCase(Locale.ROOT), Integer.valueOf(list2.hashCode()));
                }
            }
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe91)) {
            return false;
        }
        qe91 qe91Var = (qe91) obj;
        return u890.j(this.a, qe91Var.a) && u890.j(this.b, qe91Var.b) && this.c == qe91Var.c && this.d == qe91Var.d && u890.j(this.e, qe91Var.e);
    }

    public final int hashCode() {
        int iE = cy30.e(this.a.hashCode() * 31, 31, this.b);
        x4e0 x4e0Var = this.c;
        int iG = xcg1.g((iE + (x4e0Var == null ? 0 : x4e0Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return iG + (str != null ? str.hashCode() : 0);
    }
}
