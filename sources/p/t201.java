package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t201 {
    public final List a;
    public final String b;
    public final vu30 c;
    public final iu30 d;

    public /* synthetic */ t201(ArrayList arrayList, String str, vu30 vu30Var, iu30 iu30Var, int i) {
        this((i & 1) != 0 ? v201.a : arrayList, str, vu30Var, (i & 8) != 0 ? null : iu30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t201)) {
            return false;
        }
        t201 t201Var = (t201) obj;
        return u890.j(this.a, t201Var.a) && u890.j(this.b, t201Var.b) && u890.j(this.c, t201Var.c) && u890.j(this.d, t201Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = hrt.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        iu30 iu30Var = this.d;
        return iG + (iu30Var != null ? iu30Var.hashCode() : 0);
    }

    public t201(List list, String str, vu30 vu30Var, iu30 iu30Var) {
        this.a = list;
        this.b = str;
        this.c = vu30Var;
        this.d = iu30Var;
    }
}
