package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ut60 {
    public static final Observable a(Observable observable, z1s z1sVar) {
        return observable.flatMap(rh20.f).flatMap(new fey(z1sVar, (byte) 21));
    }

    public static final kv60 b(uz21 uz21Var, nfa0 nfa0Var) {
        kv60 m231Var;
        try {
            m231Var = (kv60) nfa0Var.a(uz21Var.f(), kv60.Companion.serializer());
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        return m231Var;
    }

    public static final ObservableTransformer c(n381 n381Var, v5n v5nVar, g0l g0lVar, Flowable flowable, sjq0 sjq0Var, z1s z1sVar, k9r k9rVar, nfa0 nfa0Var, Scheduler scheduler, xgc xgcVar) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(at60.class, new ot60(xgcVar, n381Var, k9rVar, nfa0Var));
        subtypeEffectHandlerBuilderC.g(bt60.class, new ot60(xgcVar, k9rVar, n381Var, nfa0Var));
        subtypeEffectHandlerBuilderC.g(ct60.class, new so(n381Var, nfa0Var, (byte) 14));
        subtypeEffectHandlerBuilderC.g(zs60.class, new mt60(g0lVar, scheduler, n381Var, k9rVar, nfa0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(et60.class, new qt60(n381Var, k9rVar, nfa0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(dt60.class, new zd1(n381Var, k9rVar, nfa0Var, (byte) 3));
        subtypeEffectHandlerBuilderC.g(ft60.class, new ax8(v5nVar, (byte) 3));
        subtypeEffectHandlerBuilderC.g(lt60.class, new zd1(flowable, v5nVar, sjq0Var, (byte) 4));
        subtypeEffectHandlerBuilderC.g(kt60.class, new so(flowable, v5nVar, (byte) 15));
        subtypeEffectHandlerBuilderC.g(gt60.class, new ax8(z1sVar, (byte) 4));
        subtypeEffectHandlerBuilderC.c(ht60.class, new rt60(z1sVar, (byte) 0));
        subtypeEffectHandlerBuilderC.c(it60.class, new rt60(z1sVar, (byte) 1));
        subtypeEffectHandlerBuilderC.g(jt60.class, new bk1(z1sVar, (byte) 21));
        return subtypeEffectHandlerBuilderC.h();
    }

    public static final ArrayList d(List list, Map map) {
        eww0 eww0Var;
        List<kgs0> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (kgs0 kgs0Var : list2) {
            arrayList.add(new js60((map == null || (eww0Var = (eww0) map.get(kgs0Var.a)) == null) ? null : new ps60(eww0Var.a, eww0Var.b, eww0Var.f), kgs0Var.a, kda0.valueOf(kgs0Var.b), kgs0Var.c, kgs0Var.e));
        }
        return arrayList;
    }
}
