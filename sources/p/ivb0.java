package p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ivb0 extends i9 implements nvb0, RandomAccess {
    public final List b;

    static {
        new ivb0();
    }

    public ivb0() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    public final List a() {
        return Collections.unmodifiableList(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void add(int i, Object obj) {
        b();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof nvb0) {
            collection = ((nvb0) collection).a();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clear() {
        b();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    public final nvb0 g() {
        return ((i9) this).a ? new pjh1(this) : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0(phc phcVar) {
        b();
        this.b.add(phcVar);
        ((AbstractList) this).modCount++;
    }

    public final Object get(int i) {
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof phc) {
            phc phcVar = (phc) obj;
            String strV = phcVar.v();
            if (phcVar.o()) {
                list.set(i, strV);
            }
            return strV;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, l290.a);
        if (toi1.a.A(0, bArr, bArr.length)) {
            list.set(i, str);
        }
        return str;
    }

    public final h290 h(int i) {
        List list = this.b;
        if (i < list.size()) {
            bhn0.q();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new ivb0(arrayList);
    }

    public final Object j(int i) {
        return this.b.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object remove(int i) {
        b();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof phc ? ((phc) objRemove).v() : new String((byte[]) objRemove, l290.a);
    }

    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof phc ? ((phc) obj2).v() : new String((byte[]) obj2, l290.a);
    }

    public final int size() {
        return this.b.size();
    }

    public ivb0(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public ivb0(int i) {
        this(new ArrayList(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean add(Object obj) {
        b();
        this.b.add((String) obj);
        ((AbstractList) this).modCount++;
        return true;
    }

    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
