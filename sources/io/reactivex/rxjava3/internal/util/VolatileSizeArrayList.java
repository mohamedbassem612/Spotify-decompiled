package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class VolatileSizeArrayList<T> extends AtomicInteger implements List<T>, RandomAccess {
    public final ArrayList a = new ArrayList();

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        ArrayList arrayList = this.a;
        boolean zAdd = arrayList.add(obj);
        lazySet(arrayList.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        ArrayList arrayList = this.a;
        boolean zAddAll = arrayList.addAll(collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        boolean z = obj instanceof VolatileSizeArrayList;
        ArrayList arrayList = this.a;
        return z ? arrayList.equals(((VolatileSizeArrayList) obj).a) : arrayList.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        ArrayList arrayList = this.a;
        boolean zRemove = arrayList.remove(obj);
        lazySet(arrayList.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ArrayList arrayList = this.a;
        boolean zRemoveAll = arrayList.removeAll(collection);
        lazySet(arrayList.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ArrayList arrayList = this.a;
        boolean zRetainAll = arrayList.retainAll(collection);
        lazySet(arrayList.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.a.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return get();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        ArrayList arrayList = this.a;
        arrayList.add(i, obj);
        lazySet(arrayList.size());
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        ArrayList arrayList = this.a;
        boolean zAddAll = arrayList.addAll(i, collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(i);
        lazySet(arrayList.size());
        return objRemove;
    }
}
