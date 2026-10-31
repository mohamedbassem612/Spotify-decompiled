package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lkn1 extends dhn1 {
    public final transient mmn1 h;
    public final transient jln1 i;

    public lkn1(mmn1 mmn1Var, jln1 jln1Var) {
        super((byte) 1);
        this.h = mmn1Var;
        this.i = jln1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.h.get(obj) != null;
    }

    public final int f(Object[] objArr) {
        return this.i.f(objArr);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.i.q(0);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.h.d;
    }
}
