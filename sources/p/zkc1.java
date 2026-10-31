package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zkc1 implements List, qla0 {
    public final bw91 a;
    public final int b;
    public int c;
    public int d;

    public zkc1(bw91 bw91Var, int i, int i2) {
        this.a = bw91Var;
        this.b = i;
        this.c = pv91.f(bw91Var.a).e;
        this.d = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i = this.b + this.d;
        bw91 bw91Var = this.a;
        bw91Var.add(i, obj);
        this.d++;
        this.c = pv91.f(bw91Var.a).e;
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        int i2 = i + this.b;
        bw91 bw91Var = this.a;
        boolean zAddAll = bw91Var.addAll(i2, collection);
        if (zAddAll) {
            this.d = collection.size() + this.d;
            this.c = pv91.f(bw91Var.a).e;
        }
        return zAddAll;
    }

    public final void b() {
        if (pv91.f(this.a.a).e == this.c) {
            return;
        }
        eg.d();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            b();
            int i = this.d;
            int i2 = this.b;
            bw91 bw91Var = this.a;
            bw91Var.b(i2, i + i2);
            this.d = 0;
            this.c = pv91.f(bw91Var.a).e;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        nho1.J(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.d;
        int i2 = this.b;
        lr80 it = yoi1.Q(i2, i + i2).iterator();
        while (((sr80) it).c) {
            int iNextInt = it.nextInt();
            if (u890.j(obj, this.a.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (u890.j(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        n811 n811Var = new n811();
        n811Var.a = i - 1;
        return new ud31(n811Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        int i2 = this.b + i;
        bw91 bw91Var = this.a;
        Object objRemove = bw91Var.remove(i2);
        this.d--;
        this.c = pv91.f(bw91Var.a).e;
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractList, p.ers0] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        d9 d9Var;
        jv91 jv91VarH;
        boolean zK;
        b();
        bw91 bw91Var = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = bw91Var.size();
        do {
            synchronized (nho1.a) {
                opb1 opb1VarF = pv91.f(bw91Var.a);
                i = opb1VarF.d;
                d9Var = opb1VarF.c;
            }
            d9Var.getClass();
            ?? F = d9Var.f();
            F.subList(i2, i3).retainAll(collection);
            d9 d9VarD = F.d();
            if (u890.j(d9VarD, d9Var)) {
                break;
            }
            opb1 opb1Var = bw91Var.a;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                zK = nho1.k(pv91.u(opb1Var, bw91Var, jv91VarH), i, d9VarD, true);
            }
            pv91.l(jv91VarH, bw91Var);
        } while (!zK);
        int size2 = size - bw91Var.size();
        if (size2 > 0) {
            this.c = pv91.f(this.a.a).e;
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        nho1.J(i, this.d);
        b();
        int i2 = i + this.b;
        bw91 bw91Var = this.a;
        Object obj2 = bw91Var.set(i2, obj);
        this.c = pv91.f(bw91Var.a).e;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            bmv0.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i3 = this.b;
        return new zkc1(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        int i2 = this.b + i;
        bw91 bw91Var = this.a;
        bw91Var.add(i2, obj);
        this.d++;
        this.c = pv91.f(bw91Var.a).e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }
}
