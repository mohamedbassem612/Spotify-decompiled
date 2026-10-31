package p;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface d0r {
    static /* synthetic */ Object d(d0r d0rVar, zjd1 zjd1Var, Object obj, Object obj2, lnm lnmVar) {
        Object objE = d0rVar.e(zjd1Var, k4p1.x(oqn1.n(obj, obj2)), lnmVar);
        return objE == d9n.a ? objE : rih1.a;
    }

    void a(q0r q0rVar);

    k1r b(f1r f1rVar);

    c0r c(f1r f1rVar);

    Object e(zjd1 zjd1Var, List list, lnm lnmVar);

    default void f(Function0 function0) {
        function0.invoke();
    }

    default String g(f1r f1rVar) {
        return null;
    }

    void h(q0r q0rVar);

    default q8n i() {
        return p0r.a();
    }

    Map j();
}
