package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qjo1 extends iio1 {
    public final transient mmn1 h;
    public final transient tjo1 i;

    public qjo1(mmn1 mmn1Var, tjo1 tjo1Var) {
        super((byte) 4);
        this.h = mmn1Var;
        this.i = tjo1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.h.get(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.i.r(0);
    }

    public final int o(Object[] objArr) {
        return this.i.o(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.h.d;
    }
}
