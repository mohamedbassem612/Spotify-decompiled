package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class of70 {
    public static final nf70 Companion = new nf70();
    public static final znb0[] h = {null, null, dm5.S(2, h050.T0), null, null, null};
    public final String a;
    public final String b;
    public final List c;
    public final lf70 d;
    public final ff70 e;
    public final String f;
    public final String g;

    public of70(int i, String str, String str2, List list, lf70 lf70Var, ff70 ff70Var, String str3) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, mf70.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = lf70Var;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = ff70Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            xf70 xf70Var = (xf70) obj;
            if (xf70Var.b == qf70.a && xf70Var.a.length() > 0) {
                arrayList.add(obj);
            }
        }
        this.g = o7h.y0(arrayList, " • ", (String) null, (String) null, hh60.Y0, 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of70)) {
            return false;
        }
        of70 of70Var = (of70) obj;
        return u890.j(this.a, of70Var.a) && u890.j(this.b, of70Var.b) && u890.j(this.c, of70Var.c) && u890.j(this.d, of70Var.d) && u890.j(this.e, of70Var.e) && u890.j(this.f, of70Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        ff70 ff70Var = this.e;
        int iHashCode2 = (iHashCode + (ff70Var == null ? 0 : ff70Var.a.hashCode())) * 31;
        String str = this.f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
