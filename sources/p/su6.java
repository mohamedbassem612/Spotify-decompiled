package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class su6 {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final List i;
    public final u7h j;
    public final int k;
    public final List l;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public su6(List list, int i, int i2, List list2, ArrayList arrayList, ArrayList arrayList2, int i3, List list3, int i4) {
        int i5 = i4 & 1;
        ArrayList arrayList3 = z6x.a;
        List list4 = i5 != 0 ? arrayList3 : list;
        boolean z = false;
        if ((i4 & 2) == 0) {
            z = true;
        }
        this(list4, z, false, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? z : i2, (i4 & 32) != 0 ? arrayList3 : list2, (i4 & 64) != 0 ? arrayList3 : arrayList, "", (i4 & 256) != 0 ? arrayList3 : arrayList2, null, (i4 & 1024) != 0 ? 1 : i3, (i4 & 2048) != 0 ? Collections.singletonList(jx11.RELEASES) : list3);
    }

    public static su6 a(su6 su6Var, String str, u7h u7hVar, List list, int i) {
        int i2 = i & 1;
        List list2 = z6x.a;
        List list3 = i2 != 0 ? su6Var.a : list2;
        boolean z = su6Var.b;
        boolean z2 = (i & 4) != 0 ? su6Var.c : true;
        int i3 = su6Var.d;
        int i4 = su6Var.e;
        List list4 = su6Var.f;
        List list5 = su6Var.g;
        String str2 = (i & 128) != 0 ? su6Var.h : str;
        if ((i & 256) != 0) {
            list2 = su6Var.i;
        }
        List list6 = list2;
        u7h u7hVar2 = (i & 512) != 0 ? su6Var.j : u7hVar;
        int i5 = (i & 1024) != 0 ? su6Var.k : 1;
        List list7 = (i & 2048) != 0 ? su6Var.l : list;
        su6Var.getClass();
        return new su6(list3, z, z2, i3, i4, list4, list5, str2, list6, u7hVar2, i5, list7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su6)) {
            return false;
        }
        su6 su6Var = (su6) obj;
        return u890.j(this.a, su6Var.a) && this.b == su6Var.b && this.c == su6Var.c && this.d == su6Var.d && this.e == su6Var.e && u890.j(this.f, su6Var.f) && u890.j(this.g, su6Var.g) && u890.j(this.h, su6Var.h) && u890.j(this.i, su6Var.i) && u890.j(this.j, su6Var.j) && this.k == su6Var.k && u890.j(this.l, su6Var.l);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(f4i1.b(f4i1.b(kaa0.f(this.e, kaa0.f(this.d, xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        u7h u7hVar = this.j;
        return this.l.hashCode() + ab80.k(this.k, (iB + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31, 31);
    }

    public su6(List list, boolean z, boolean z2, int i, int i2, List list2, List list3, String str, List list4, u7h u7hVar, int i3, List list5) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
        this.f = list2;
        this.g = list3;
        this.h = str;
        this.i = list4;
        this.j = u7hVar;
        this.k = i3;
        this.l = list5;
    }
}
