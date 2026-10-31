package p;

import java.util.AbstractList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d290 extends AbstractList {
    public final b290 a;
    public final c290 b;

    public d290(b290 b290Var, c290 c290Var) {
        this.a = b290Var;
        this.b = c290Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.convert(((er80) this.a).e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
