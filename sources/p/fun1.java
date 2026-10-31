package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fun1 extends jtn1 {
    public final transient mmn1 c;
    public final transient jun1 d;

    public fun1(mmn1 mmn1Var, jun1 jun1Var) {
        this.c = mmn1Var;
        this.d = jun1Var;
    }

    @Override // p.srn1
    public final int b(Object[] objArr) {
        return this.d.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // p.jtn1, p.srn1
    public final dsn1 e() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.d;
    }
}
