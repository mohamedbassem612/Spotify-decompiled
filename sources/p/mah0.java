package p;

import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mah0 {
    public final Map a;
    public final List b;
    public final f8a c;
    public final bbh0 d;
    public final Map e;
    public final int f;
    public final int g;

    public mah0(Map map, List list, f8a f8aVar, bbh0 bbh0Var, Map map2, int i, int i2) {
        this.a = map;
        this.b = list;
        this.c = f8aVar;
        this.d = bbh0Var;
        this.e = map2;
        this.f = i;
        this.g = i2;
    }

    public static mah0 a(mah0 mah0Var, bbh0 bbh0Var, Map map, int i, int i2, int i3) {
        Map map2 = mah0Var.a;
        List list = mah0Var.b;
        f8a f8aVar = mah0Var.c;
        if ((i3 & 8) != 0) {
            bbh0Var = mah0Var.d;
        }
        bbh0 bbh0Var2 = bbh0Var;
        if ((i3 & 16) != 0) {
            map = mah0Var.e;
        }
        Map map3 = map;
        if ((i3 & 32) != 0) {
            i = mah0Var.f;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = mah0Var.g;
        }
        return new mah0(map2, list, f8aVar, bbh0Var2, map3, i4, i2);
    }

    public static boolean g(mah0 mah0Var, String str) {
        return !mah0Var.h(str).isEmpty();
    }

    public final List b() {
        List list;
        bbh0 bbh0Var = this.d;
        int i = bbh0Var == null ? -1 : lah0.b[bbh0Var.ordinal()];
        if (i != -1) {
            return (i == 1 || (list = (List) this.a.get(bbh0Var)) == null) ? z6x.a : list;
        }
        return c();
    }

    public final ArrayList c() {
        bbh0 bbh0Var = bbh0.a;
        Map map = this.a;
        List list = (List) map.get(bbh0Var);
        List list2 = z6x.a;
        if (list == null) {
            list = list2;
        }
        List list3 = list;
        List list4 = (List) map.get(bbh0.b);
        if (list4 != null) {
            list2 = list4;
        }
        return o7h.N0(list2, list3);
    }

    public final boolean d() {
        ArrayList<UnmatchedItem> arrayListC = c();
        if (arrayListC.isEmpty()) {
            return false;
        }
        for (UnmatchedItem unmatchedItem : arrayListC) {
            if (g(this, unmatchedItem.getId()) || f(unmatchedItem.getId())) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (f(((UnmatchedItem) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mah0)) {
            return false;
        }
        mah0 mah0Var = (mah0) obj;
        return this.a.equals(mah0Var.a) && u890.j(this.b, mah0Var.b) && this.c == mah0Var.c && this.d == mah0Var.d && u890.j(this.e, mah0Var.e) && this.f == mah0Var.f && this.g == mah0Var.g;
    }

    public final boolean f(String str) {
        return u890.j(this.e.get(str), mm90.a);
    }

    public final Set h(String str) {
        Object obj = this.e.get(str);
        nm90 nm90Var = obj instanceof nm90 ? (nm90) obj : null;
        LinkedHashSet linkedHashSet = nm90Var != null ? nm90Var.a : null;
        return linkedHashSet == null ? w7x.a : linkedHashSet;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        f8a f8aVar = this.c;
        int iHashCode = (iB + (f8aVar == null ? 0 : f8aVar.hashCode())) * 31;
        bbh0 bbh0Var = this.d;
        int iK = ab80.k(this.f, cy30.e((iHashCode + (bbh0Var == null ? 0 : bbh0Var.hashCode())) * 31, 31, this.e), 31);
        int i = this.g;
        return iK + (i != 0 ? l1d.C(i) : 0);
    }

    public final ArrayList i(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            UnmatchedItem unmatchedItem = (UnmatchedItem) obj;
            if (!g(this, unmatchedItem.getId()) && !f(unmatchedItem.getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
