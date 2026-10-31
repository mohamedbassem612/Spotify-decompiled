package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b1n0 implements Set, ola0 {
    public final /* synthetic */ LinkedHashSet a;
    public final u0n0 b;
    public final u0n0 c;
    public final u0n0 d;
    public final u0n0 e;
    public final u0n0 f;
    public final u0n0 g;
    public final idd1 h;
    public final LinkedHashMap i;
    public final Map t;

    public b1n0(u0n0 u0n0Var, u0n0 u0n0Var2, u0n0 u0n0Var3, u0n0 u0n0Var4, u0n0 u0n0Var5, int i) {
        u0n0 u0n0Var6;
        u0n0Var4 = (i & 8) != 0 ? null : u0n0Var4;
        u0n0Var5 = (i & 16) != 0 ? null : u0n0Var5;
        if (u0n0Var != null) {
            u0n0Var6 = u0n0Var;
        } else if (u0n0Var2 != null) {
            u0n0Var6 = u0n0Var2;
        } else if (u0n0Var3 == null) {
            u0n0Var6 = u0n0Var4 == null ? u0n0Var5 : u0n0Var4;
        } else {
            u0n0Var6 = u0n0Var3;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(5);
        if (u0n0Var != null) {
            linkedHashSet.add(u0n0Var);
        }
        if (u0n0Var2 != null) {
            linkedHashSet.add(u0n0Var2);
        }
        if (u0n0Var3 != null) {
            linkedHashSet.add(u0n0Var3);
        }
        if (u0n0Var4 != null) {
            linkedHashSet.add(u0n0Var4);
        }
        if (u0n0Var5 != null) {
            linkedHashSet.add(u0n0Var5);
        }
        this.a = linkedHashSet;
        this.b = u0n0Var;
        this.c = u0n0Var2;
        this.d = u0n0Var3;
        this.e = u0n0Var4;
        this.f = u0n0Var5;
        this.g = u0n0Var6;
        this.h = new idd1(new zem0(this, (byte) 7));
        int iS = zno1.s(q7h.U(this, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
        for (Object obj : linkedHashSet) {
            linkedHashMap.put(((u0n0) obj).e, obj);
        }
        this.i = linkedHashMap;
        ArrayList arrayList = new ArrayList();
        for (u0n0 u0n0Var7 : this.a) {
            Set set = u0n0Var7.f;
            ArrayList arrayList2 = new ArrayList(q7h.U(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList2.add(oqn1.n((gn10) it.next(), u0n0Var7));
            }
            r7h.W(arrayList2, arrayList);
        }
        this.t = sqg0.T(arrayList);
    }

    public static ntn0 b(u0n0 u0n0Var) {
        return new ntn0(u0n0Var.a, u0n0Var.b, u0n0Var.c, u0n0Var.d, u0n0Var.h);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof u0n0)) {
            return false;
        }
        return this.a.contains((u0n0) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1n0)) {
            return false;
        }
        b1n0 b1n0Var = (b1n0) obj;
        return u890.j(this.b, b1n0Var.b) && u890.j(this.c, b1n0Var.c) && u890.j(this.d, b1n0Var.d) && u890.j(this.e, b1n0Var.e) && u890.j(this.f, b1n0Var.f) && u890.j(this.g, b1n0Var.g);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        u0n0 u0n0Var = this.b;
        int iHashCode = (u0n0Var == null ? 0 : u0n0Var.hashCode()) * 31;
        u0n0 u0n0Var2 = this.c;
        int iHashCode2 = (iHashCode + (u0n0Var2 == null ? 0 : u0n0Var2.hashCode())) * 31;
        u0n0 u0n0Var3 = this.d;
        int iHashCode3 = (iHashCode2 + (u0n0Var3 == null ? 0 : u0n0Var3.hashCode())) * 31;
        u0n0 u0n0Var4 = this.e;
        int iHashCode4 = (iHashCode3 + (u0n0Var4 == null ? 0 : u0n0Var4.hashCode())) * 31;
        u0n0 u0n0Var5 = this.f;
        int iHashCode5 = (iHashCode4 + (u0n0Var5 == null ? 0 : u0n0Var5.hashCode())) * 31;
        u0n0 u0n0Var6 = this.g;
        return iHashCode5 + (u0n0Var6 != null ? u0n0Var6.hashCode() : 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }
}
