package p;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a8 extends x7 implements Set {
    public final /* synthetic */ zt50 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(zt50 zt50Var, Object obj, Set set) {
        super(zt50Var, obj, set, null);
        this.f = zt50Var;
    }

    @Override // p.x7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zU = zqo1.u((Set) this.b, collection);
        if (zU) {
            this.f.f += this.b.size() - size;
            d();
        }
        return zU;
    }
}
