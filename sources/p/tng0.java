package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tng0 implements sng0 {
    @Override // p.sng0
    public final Object d(Object obj, Object obj2) {
        nng0 nng0Var = (nng0) obj;
        nng0 nng0Var2 = (nng0) obj2;
        if (!nng0Var.f()) {
            nng0Var.b();
        }
        nng0Var.h(nng0Var2);
        return nng0Var;
    }

    @Override // p.sng0
    public final w6e0 e(Object obj) {
        pze0.m(obj);
        throw null;
    }

    @Override // p.sng0
    public final Map f(Object obj) {
        return ((nng0) obj).e();
    }

    @Override // p.sng0
    public final Object g(Object obj) {
        pze0.m(obj);
        return nng0.i();
    }

    @Override // p.sng0
    public final Map h(Object obj) {
        return ((nng0) obj).d();
    }

    @Override // p.sng0
    public final Object i(Object obj) {
        ((nng0) obj).g();
        return obj;
    }

    @Override // p.sng0
    public final int j(int i, Object obj, Object obj2) {
        if (obj == null) {
            return 0;
        }
        Map mapD = ((nng0) obj).d();
        pze0.m(obj2);
        if (mapD.isEmpty()) {
            return 0;
        }
        Iterator it = mapD.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        rwg.e(i);
        throw null;
    }

    @Override // p.sng0
    public final boolean k(Object obj) {
        return !((nng0) obj).f();
    }
}
