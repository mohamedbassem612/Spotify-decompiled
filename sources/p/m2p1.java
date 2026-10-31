package p;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m2p1 extends AbstractCollection {
    public final /* synthetic */ p2p1 a;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        p2p1 p2p1Var = this.a;
        Map mapD = p2p1Var.d();
        return mapD != null ? mapD.values().iterator() : new d2p1(p2p1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
