package p;

import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pqc1 implements d0u0 {
    public final BehaviorProcessor a;
    public final BehaviorProcessor b;
    public List c;
    public hpc1 d;
    public boolean e;
    public List f;
    public hpc1 g;
    public final BehaviorProcessor h;
    public final BehaviorProcessor i;

    public pqc1() {
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.a = behaviorProcessor;
        BehaviorProcessor behaviorProcessor2 = new BehaviorProcessor();
        this.b = behaviorProcessor2;
        z6x z6xVar = z6x.a;
        this.c = z6xVar;
        this.f = z6xVar;
        this.h = behaviorProcessor;
        this.i = behaviorProcessor2;
    }

    @Override // p.d0u0
    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        return new oqc1(this);
    }

    public final void b(List list, hpc1 hpc1Var) {
        this.f = list;
        this.g = hpc1Var;
        this.a.onNext(Boolean.valueOf(!list.isEmpty()));
        this.b.onNext(Optional.ofNullable(hpc1Var));
    }
}
