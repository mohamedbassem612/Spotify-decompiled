package p;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@kzn0("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp/e3u;", "Lp/mzn0;", "Lp/d3u;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e3u extends mzn0 {
    @Override // p.mzn0
    public final vnn0 a() {
        j2i j2iVar = iji.a;
        return new d3u(this);
    }

    @Override // p.mzn0
    public final void d(List list, qon0 qon0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().i((hnn0) it.next());
        }
    }

    @Override // p.mzn0
    public final void i(hnn0 hnn0Var, boolean z) {
        b().g(hnn0Var, z);
        int iU0 = o7h.u0((Iterable) b().f.a.getValue(), hnn0Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.a.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            hnn0 hnn0Var2 = (hnn0) obj;
            if (i > iU0) {
                b().c(hnn0Var2);
            }
            i = i2;
        }
    }

    public final xe01 k() {
        return b().e;
    }

    public final xe01 l() {
        return b().f;
    }
}
