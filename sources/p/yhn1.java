package p;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class yhn1 extends AbstractCollection implements List {
    public final Object a;
    public Collection b;
    public final yhn1 c;
    public final Collection d;
    public final /* synthetic */ mkn1 e;
    public final /* synthetic */ mkn1 f;

    public yhn1(mkn1 mkn1Var, Object obj, List list, yhn1 yhn1Var) {
        this.f = mkn1Var;
        this.e = mkn1Var;
        this.a = obj;
        this.b = list;
        this.c = yhn1Var;
        this.d = yhn1Var == null ? null : yhn1Var.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.b.isEmpty();
        boolean zAdd = this.b.add(obj);
        if (!zAdd || !zIsEmpty) {
            return zAdd;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.b).addAll(i, collection);
        if (zAddAll) {
            this.b.size();
            if (size == 0) {
                zza();
                return true;
            }
        }
        return zAddAll;
    }

    public final void b() {
        yhn1 yhn1Var = this.c;
        if (yhn1Var != null) {
            yhn1Var.b();
        } else if (this.b.isEmpty()) {
            this.e.c.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (size() == 0) {
            return;
        }
        this.b.clear();
        b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        zzb();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        zzb();
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        zzb();
        return new p7(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new fhn1(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.b).remove(i);
        b();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        size();
        boolean zRemoveAll = this.b.removeAll(collection);
        if (zRemoveAll) {
            this.b.size();
            b();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        size();
        boolean zRetainAll = this.b.retainAll(collection);
        if (zRetainAll) {
            this.b.size();
            b();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzb();
        return this.b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List listSubList = ((List) this.b).subList(i, i2);
        yhn1 yhn1Var = this.c;
        if (yhn1Var == null) {
            yhn1Var = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.a;
        mkn1 mkn1Var = this.f;
        return z ? new ufn1(mkn1Var, obj, listSubList, yhn1Var) : new yhn1(mkn1Var, obj, listSubList, yhn1Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.b.toString();
    }

    public final void zza() {
        yhn1 yhn1Var = this.c;
        if (yhn1Var != null) {
            yhn1Var.zza();
            return;
        }
        this.e.c.put(this.a, this.b);
    }

    public final void zzb() {
        yhn1 yhn1Var = this.c;
        if (yhn1Var != null) {
            yhn1Var.zzb();
            if (yhn1Var.b == this.d) {
                return;
            }
            eg.d();
            return;
        }
        if (this.b.isEmpty()) {
            Collection collection = (Collection) this.e.c.get(this.a);
            if (collection != null) {
                this.b = collection;
            }
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new fhn1(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.b.remove(obj);
        if (zRemove) {
            b();
        }
        return zRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean zIsEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.b.addAll(collection);
        if (zAddAll) {
            this.b.size();
            if (size == 0) {
                zza();
                return true;
            }
        }
        return zAddAll;
    }
}
