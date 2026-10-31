package p;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@kzn0("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp/uvj;", "Lp/mzn0;", "Lp/tvj;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class uvj extends mzn0 {
    public final hrr0 c = v8r.q(Boolean.FALSE);

    @Override // p.mzn0
    public final vnn0 a() {
        return new tvj(this, aei.a);
    }

    @Override // p.mzn0
    public final void d(List list, qon0 qon0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().j((hnn0) it.next());
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // p.mzn0
    public final void i(hnn0 hnn0Var, boolean z) {
        b().g(hnn0Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final xe01 k() {
        return b().e;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final hrr0 getC() {
        return this.c;
    }

    public final void m(hnn0 hnn0Var) {
        b().c(hnn0Var);
    }
}
