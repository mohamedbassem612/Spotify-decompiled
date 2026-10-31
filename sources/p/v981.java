package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v981 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ ObservableEmitter c;
    public final /* synthetic */ l101 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v981(l811 l811Var, ObservableEmitter observableEmitter, l101 l101Var, byte b) {
        super(0);
        this.a = b;
        this.b = l811Var;
        this.c = observableEmitter;
        this.d = l101Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l101 l101Var = this.d;
        ObservableEmitter observableEmitter = this.c;
        l811 l811Var = this.b;
        switch (b) {
            case 0:
                l811Var.a = true;
                observableEmitter.onNext(new w101(l101Var.a));
                break;
            default:
                if (!l811Var.a) {
                    observableEmitter.onNext(new x101(l101Var.a, l101Var.c));
                }
                break;
        }
        return rih1Var;
    }
}
