package p;

import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class po51 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qo51 b;
    public final /* synthetic */ e0g1 c;

    public /* synthetic */ po51(qo51 qo51Var, e0g1 e0g1Var, byte b) {
        this.a = b;
        this.b = qo51Var;
        this.c = e0g1Var;
    }

    public final void run() {
        byte b = this.a;
        c0g1 c0g1Var = this.c;
        qo51 qo51Var = this.b;
        switch (b) {
            case 0:
                qo51Var.d.accept(new hu41((int) c0g1Var.a));
                qo51Var.h.onNext(Boolean.TRUE);
                break;
            default:
                Consumer consumer = qo51Var.d;
                consumer.accept(new hu41((int) ((b0g1) c0g1Var).a));
                consumer.accept(gu41.a);
                qo51Var.h.onNext(Boolean.FALSE);
                break;
        }
    }
}
