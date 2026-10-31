package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class uzk1 extends c0l1 {
    public static final tzk1 Companion = new tzk1();
    public static final znb0[] k = {null, null, null, null, null, null, null, null, dm5.S(2, kvj1.U0)};
    public final cld b;
    public final boolean c;
    public final rzk1 d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;

    public /* synthetic */ uzk1(int i, cld cldVar, boolean z, rzk1 rzk1Var, boolean z2, String str, String str2, String str3, String str4, List list) {
        if (443 != (i & 443)) {
            o6p1.t(i, 443, szk1.a.getDescriptor());
            throw null;
        }
        this.b = cldVar;
        this.c = z;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = rzk1Var;
        }
        this.e = z2;
        this.f = str;
        this.g = str2;
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        this.i = str4;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzk1)) {
            return false;
        }
        uzk1 uzk1Var = (uzk1) obj;
        return u890.j(this.b, uzk1Var.b) && this.c == uzk1Var.c && u890.j(this.d, uzk1Var.d) && this.e == uzk1Var.e && u890.j(this.f, uzk1Var.f) && u890.j(this.g, uzk1Var.g) && u890.j(this.h, uzk1Var.h) && u890.j(this.i, uzk1Var.i) && u890.j(this.j, uzk1Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.b.hashCode() * 31, 31, this.c);
        rzk1 rzk1Var = this.d;
        int iD = cy30.d(cy30.d(xcg1.g((iG + (rzk1Var == null ? 0 : rzk1Var.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return this.j.hashCode() + cy30.d((iD + (str != null ? str.hashCode() : 0)) * 31, 31, this.i);
    }

    public uzk1(cld cldVar, rzk1 rzk1Var, boolean z, String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.b = cldVar;
        this.c = true;
        this.d = rzk1Var;
        this.e = z;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = arrayList;
    }
}
