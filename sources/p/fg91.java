package p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fg91 extends c9 {
    public static final fg91 b = new fg91(new Object[0]);
    public final Object[] a;

    public fg91(Object[] objArr) {
        this.a = objArr;
    }

    @Override // p.k6
    public final int b() {
        return this.a.length;
    }

    public final c9 c(Collection collection) {
        Object[] objArr = this.a;
        if (collection.size() + objArr.length > 32) {
            drs0 drs0VarD = d();
            drs0VarD.addAll(collection);
            return drs0VarD.d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new fg91(objArrCopyOf);
    }

    public final drs0 d() {
        return new drs0(this, (Object[]) null, this.a, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.a;
        wxo1.m(i, objArr.length);
        return objArr[i];
    }

    @Override // p.g7, java.util.List
    public final int indexOf(Object obj) {
        return f46.p0(this.a, obj);
    }

    @Override // p.g7, java.util.List
    public final int lastIndexOf(Object obj) {
        return f46.u0(this.a, obj);
    }

    @Override // p.g7, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.a;
        wxo1.n(i, objArr.length);
        return new rac(i, objArr.length, objArr);
    }
}
