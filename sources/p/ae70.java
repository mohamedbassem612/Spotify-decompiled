package p;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ae70 extends AbstractList {
    public final /* synthetic */ de70 a;
    public final /* synthetic */ List b;

    public ae70(de70 de70Var, List list) {
        this.a = de70Var;
        this.b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.b((y570) this.b.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
