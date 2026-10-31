package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mj61 {
    public final ConcurrentHashMap a = new ConcurrentHashMap(1);
    public final BehaviorSubject b = BehaviorSubject.f();

    public final void a(aos aosVar) {
        zq5 zq5Var;
        Integer numValueOf = Integer.valueOf(aosVar.e);
        ConcurrentHashMap concurrentHashMap = this.a;
        qnt qntVar = (qnt) concurrentHashMap.get(numValueOf);
        if (qntVar != null) {
            aos aosVar2 = (aos) qntVar.a.get();
            if (aosVar2 == null || (zq5Var = aosVar2.a) == null) {
                zq5Var = null;
            }
            if (zq5Var != null) {
                this.b.onNext(new ArrayList(concurrentHashMap.values()));
            }
        }
    }
}
