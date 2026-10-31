package p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ckv implements q0r {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ d0r c;

    public /* synthetic */ ckv(Object obj, d0r d0rVar, byte b) {
        this.a = b;
        this.b = obj;
        this.c = d0rVar;
    }

    public final void b() {
        byte b = this.a;
        rzq rzqVar = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                ObservableEmitter observableEmitter = (ObservableEmitter) obj;
                rzq rzqVar2 = rzqVar;
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onNext(don1.o(rzqVar2.j()));
                    break;
                }
                break;
            default:
                ssw0 ssw0Var = (ssw0) obj;
                if (!ssw0Var.K()) {
                    ssw0Var.l(don1.o(rzqVar.j()));
                    break;
                }
                break;
        }
    }
}
