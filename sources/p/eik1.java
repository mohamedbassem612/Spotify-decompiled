package p;

import io.reactivex.rxjava3.processors.BehaviorProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eik1 implements o5s {
    public final /* synthetic */ BehaviorProcessor a;
    public final /* synthetic */ vik1 b;

    public eik1(BehaviorProcessor behaviorProcessor, vik1 vik1Var) {
        this.a = behaviorProcessor;
        this.b = vik1Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.b.b();
    }

    public final void onStart(iac0 iac0Var) {
        this.a.onNext(Boolean.TRUE);
    }

    public final void onStop(iac0 iac0Var) {
        this.a.onNext(Boolean.FALSE);
    }
}
