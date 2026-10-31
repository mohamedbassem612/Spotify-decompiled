package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iqs0 extends aa implements u380 {
    public final dqs0 a;

    public iqs0(dqs0 dqs0Var) {
        this.a = dqs0Var;
    }

    @Override // p.k6
    public final int b() {
        return this.a.d.c();
    }

    @Override // p.k6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.d.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jqs0(this.a);
    }
}
