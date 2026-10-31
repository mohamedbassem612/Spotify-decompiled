package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class go1 {
    public final pia1 a;
    public final long b;
    public final List c;
    public final List d;
    public final boolean e;
    public final Set f;

    public /* synthetic */ go1(pia1 pia1Var, List list, List list2, boolean z, Set set, int i) {
        this(pia1Var, 0L, list, list2, z, (i & 32) != 0 ? w7x.a : set);
    }

    public static go1 a(go1 go1Var, long j, ArrayList arrayList, List list, int i) {
        pia1 pia1Var = go1Var.a;
        if ((i & 2) != 0) {
            j = go1Var.b;
        }
        long j2 = j;
        List list2 = arrayList;
        if ((i & 4) != 0) {
            list2 = go1Var.c;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            list = go1Var.d;
        }
        boolean z = go1Var.e;
        Set set = go1Var.f;
        go1Var.getClass();
        return new go1(pia1Var, j2, list3, list, z, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go1)) {
            return false;
        }
        go1 go1Var = (go1) obj;
        return this.a == go1Var.a && this.b == go1Var.b && u890.j(this.c, go1Var.c) && u890.j(this.d, go1Var.d) && this.e == go1Var.e && u890.j(this.f, go1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(f4i1.b(f4i1.b(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public go1(pia1 pia1Var, long j, List list, List list2, boolean z, Set set) {
        this.a = pia1Var;
        this.b = j;
        this.c = list;
        this.d = list2;
        this.e = z;
        this.f = set;
    }
}
