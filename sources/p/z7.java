package p;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class z7 extends x7 implements List {
    public final /* synthetic */ b8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(b8 b8Var, Object obj, List list, x7 x7Var) {
        super(b8Var, obj, list, x7Var);
        this.f = b8Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean zIsEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.f.f++;
        if (zIsEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.b).addAll(i, collection);
        if (zAddAll) {
            this.f.f += this.b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new y7(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object objRemove = ((List) this.b).remove(i);
        this.f.f--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        c();
        List listSubList = ((List) this.b).subList(i, i2);
        x7 x7Var = this.c;
        if (x7Var == null) {
            x7Var = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        b8 b8Var = this.f;
        Object obj = this.a;
        return z ? new u7(b8Var, obj, listSubList, x7Var) : new z7(b8Var, obj, listSubList, x7Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new y7(this, i);
    }
}
