package p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cg11 extends b380 {
    public final /* synthetic */ dg11 c;

    public cg11(dg11 dg11Var) {
        this.c = dg11Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dg11 dg11Var = this.c;
        dm5.q(i, dg11Var.g);
        Object[] objArr = dg11Var.e;
        int i2 = i * 2;
        boolean z = dg11Var.f;
        Object obj = objArr[i2 + (z ? 1 : 0)];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (!z ? 1 : 0)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // p.q280
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.g;
    }

    @Override // p.b380, p.q280
    public Object writeReplace() {
        return super.writeReplace();
    }
}
