package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nwb1 {
    public final List a;
    public final List b;
    public final Throwable c;

    public nwb1(List list, List list2, Throwable th) {
        this.a = list;
        this.b = list2;
        this.c = th;
    }

    public static nwb1 a(nwb1 nwb1Var, List list, Throwable th, int i) {
        if ((i & 1) != 0) {
            list = nwb1Var.a;
        }
        List list2 = nwb1Var.b;
        if ((i & 4) != 0) {
            th = nwb1Var.c;
        }
        nwb1Var.getClass();
        return new nwb1(list, list2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwb1)) {
            return false;
        }
        nwb1 nwb1Var = (nwb1) obj;
        return u890.j(this.a, nwb1Var.a) && u890.j(this.b, nwb1Var.b) && u890.j(this.c, nwb1Var.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        Throwable th = this.c;
        return iB + (th == null ? 0 : th.hashCode());
    }

    public /* synthetic */ nwb1(ArrayList arrayList, ArrayList arrayList2) {
        this(arrayList, arrayList2, null);
    }
}
