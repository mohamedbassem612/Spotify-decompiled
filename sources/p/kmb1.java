package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kmb1 extends aob1 {
    public final ArrayList a;
    public final String b;
    public final x360 c;
    public final List d;
    public final Set e;

    public kmb1(ArrayList arrayList, String str, x360 x360Var, List list, Set set) {
        this.a = arrayList;
        this.b = str;
        this.c = x360Var;
        this.d = list;
        this.e = set;
    }

    @Override // p.aob1
    public final x360 a() {
        return this.c;
    }

    @Override // p.aob1
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmb1)) {
            return false;
        }
        kmb1 kmb1Var = (kmb1) obj;
        return u890.j(this.a, kmb1Var.a) && u890.j(this.b, kmb1Var.b) && u890.j(this.c, kmb1Var.c) && u890.j(this.d, kmb1Var.d) && u890.j(this.e, kmb1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.e.hashCode() + f4i1.b((iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d);
    }

    public /* synthetic */ kmb1(String str, ArrayList arrayList, x360 x360Var) {
        this(arrayList, str, x360Var, z6x.a, w7x.a);
    }
}
