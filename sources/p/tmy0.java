package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class tmy0 {
    public static final smy0 Companion = new smy0();
    public static final znb0[] i = {null, null, null, dm5.S(2, h0x0.T0), dm5.S(2, h0x0.U0), null, null, null};
    public final fny0 a;
    public final jny0 b;
    public final String c;
    public final List d;
    public final List e;
    public final gm8 f;
    public final String g;
    public final long h;

    public /* synthetic */ tmy0(int i2, fny0 fny0Var, jny0 jny0Var, String str, List list, List list2, gm8 gm8Var, String str2, long j) {
        if (143 != (i2 & 143)) {
            o6p1.t(i2, 143, rmy0.a.getDescriptor());
            throw null;
        }
        this.a = fny0Var;
        this.b = jny0Var;
        this.c = str;
        this.d = list;
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = gm8Var;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmy0)) {
            return false;
        }
        tmy0 tmy0Var = (tmy0) obj;
        return u890.j(this.a, tmy0Var.a) && u890.j(this.b, tmy0Var.b) && u890.j(this.c, tmy0Var.c) && u890.j(this.d, tmy0Var.d) && u890.j(this.e, tmy0Var.e) && u890.j(this.f, tmy0Var.f) && u890.j(this.g, tmy0Var.g) && this.h == tmy0Var.h;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        List list = this.e;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        gm8 gm8Var = this.f;
        int iHashCode2 = (iHashCode + (gm8Var == null ? 0 : gm8Var.hashCode())) * 31;
        String str = this.g;
        return Long.hashCode(this.h) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public tmy0(fny0 fny0Var, jny0 jny0Var, String str, ArrayList arrayList, ArrayList arrayList2, gm8 gm8Var, String str2, long j) {
        this.a = fny0Var;
        this.b = jny0Var;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = gm8Var;
        this.g = str2;
        this.h = j;
    }
}
