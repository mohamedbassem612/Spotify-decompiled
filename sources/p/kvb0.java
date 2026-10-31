package p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kvb0 extends j9 implements pvb0, RandomAccess {
    public final ArrayList b;

    static {
        new kvb0(10).a = false;
    }

    public kvb0(int i) {
        this(new ArrayList(i));
    }

    @Override // p.pvb0
    public final void H0(ihc ihcVar) {
        b();
        this.b.add(ihcVar);
        ((AbstractList) this).modCount++;
    }

    @Override // p.pvb0
    public final List a() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p.j9, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof pvb0) {
            collection = ((pvb0) collection).a();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p.j9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p.pvb0
    public final pvb0 g() {
        return this.a ? new rjh1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ihc)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, n290.a);
            if (uoi1.a.z(0, bArr, bArr.length)) {
                arrayList.set(i, str);
            }
            return str;
        }
        ihc ihcVar = (ihc) obj;
        String str2 = ihcVar.size() == 0 ? "" : new String(ihcVar.b, ihcVar.c(), ihcVar.size(), n290.a);
        int iC = ihcVar.c();
        if (uoi1.a.z(iC, ihcVar.b, ihcVar.size() + iC)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // p.i290
    public final i290 h(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            bhn0.q();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new kvb0(arrayList2);
    }

    @Override // p.pvb0
    public final Object j(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ihc)) {
            return new String((byte[]) objRemove, n290.a);
        }
        ihc ihcVar = (ihc) objRemove;
        return ihcVar.size() == 0 ? "" : new String(ihcVar.b, ihcVar.c(), ihcVar.size(), n290.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ihc)) {
            return new String((byte[]) obj2, n290.a);
        }
        ihc ihcVar = (ihc) obj2;
        return ihcVar.size() == 0 ? "" : new String(ihcVar.b, ihcVar.c(), ihcVar.size(), n290.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public kvb0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // p.j9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
