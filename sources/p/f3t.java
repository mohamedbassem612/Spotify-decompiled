package p;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f3t implements d0r {
    public final r2r a;
    public yfu b;
    public q0r c;

    public f3t(r2r r2rVar) {
        this.a = r2rVar;
    }

    @Override // p.d0r
    public final void a(q0r q0rVar) {
        ((rzq) k().c).a(q0rVar);
    }

    @Override // p.d0r
    public final k1r b(f1r f1rVar) {
        return ((rzq) k().c).b(f1rVar);
    }

    @Override // p.d0r
    public final c0r c(f1r f1rVar) {
        return ((rzq) k().c).c(f1rVar);
    }

    @Override // p.d0r
    public final Object e(zjd1 zjd1Var, List list, lnm lnmVar) {
        Object objE = ((rzq) k().c).e(zjd1Var, list, lnmVar);
        return objE == d9n.a ? objE : rih1.a;
    }

    @Override // p.d0r
    public final void f(Function0 function0) {
        ((rzq) k().c).f(function0);
    }

    @Override // p.d0r
    public final String g(f1r f1rVar) {
        yfu yfuVar = this.b;
        return yfuVar != null ? ((rzq) yfuVar.c).g(f1rVar) : "deferred pool not resolved";
    }

    @Override // p.d0r
    public final void h(q0r q0rVar) {
        ((rzq) k().c).h(q0rVar);
    }

    @Override // p.d0r
    public final q8n i() {
        k();
        return p0r.a();
    }

    @Override // p.d0r
    public final Map j() {
        return ((rzq) k().c).j();
    }

    public final yfu k() {
        yfu yfuVar = this.b;
        if (yfuVar != null) {
            return yfuVar;
        }
        eg.m("DeferredPageBoundDataPool has not been resolved yet — resolve() must be called before accessing the provider");
        return null;
    }
}
