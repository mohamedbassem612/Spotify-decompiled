package p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iau implements aac0 {
    public final /* synthetic */ ObservableEmitter a;
    public final /* synthetic */ long b;

    public iau(ObservableEmitter observableEmitter, long j) {
        this.a = observableEmitter;
        this.b = j;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        int i = hau.a[k8c0Var.ordinal()];
        ObservableEmitter observableEmitter = this.a;
        if (i == 1) {
            observableEmitter.onNext(new mmr0(Boolean.TRUE, Long.valueOf(this.b)));
        } else {
            if (i != 2) {
                return;
            }
            observableEmitter.onNext(new mmr0(Boolean.FALSE, 0L));
        }
    }
}
