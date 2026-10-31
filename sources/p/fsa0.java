package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fsa0 implements lsa0 {
    public final List a;
    public final te30 b;
    public final boolean c;
    public final String d;

    public fsa0(ArrayList arrayList, te30 te30Var, boolean z, String str) {
        this.a = arrayList;
        this.b = te30Var;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsa0)) {
            return false;
        }
        fsa0 fsa0Var = (fsa0) obj;
        return u890.j(this.a, fsa0Var.a) && u890.j(this.b, fsa0Var.b) && this.c == fsa0Var.c && u890.j(this.d, fsa0Var.d);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        te30 te30Var = this.b;
        int iG = xcg1.g((iHashCode + (te30Var == null ? 0 : te30Var.a.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return iG + (str != null ? str.hashCode() : 0);
    }
}
