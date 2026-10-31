package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zjs implements shh0 {
    public final kly0 a;
    public final Set b;

    public zjs(kly0 kly0Var, Set set) {
        this.a = kly0Var;
        this.b = set;
    }

    @Override // p.shh0
    public final boolean a(r9c r9cVar) {
        j6 j6Var = new j6(r9cVar, (byte) 19);
        Set set = this.b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((Boolean) j6Var.invoke(it.next())).booleanValue()) {
                    return false;
                }
            }
        }
        return r9cVar.l();
    }

    @Override // p.shh0
    public final rhh0 b() {
        return (rhh0) this.a.get();
    }
}
