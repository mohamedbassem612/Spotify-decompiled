package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x5p1 extends i4p1 {
    public final transient c6p1 c;
    public final transient a6p1 d;

    public x5p1(c6p1 c6p1Var, a6p1 a6p1Var) {
        this.c = c6p1Var;
        this.d = a6p1Var;
    }

    @Override // p.j3p1
    public final k5n1 b() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // p.j3p1
    public final boolean f() {
        return true;
    }

    @Override // p.j3p1
    public final int i(Object[] objArr) {
        return this.d.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.c;
    }
}
