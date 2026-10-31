package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t981 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ ObservableEmitter c;
    public final /* synthetic */ f301 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t981(l811 l811Var, ObservableEmitter observableEmitter, f301 f301Var, byte b) {
        super(0);
        this.a = b;
        this.b = l811Var;
        this.c = observableEmitter;
        this.d = f301Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        f301 f301Var = this.d;
        ObservableEmitter observableEmitter = this.c;
        l811 l811Var = this.b;
        switch (b) {
            case 0:
                l811Var.a = true;
                observableEmitter.onNext(new w301(f301Var.a));
                break;
            default:
                if (!l811Var.a) {
                    observableEmitter.onNext(new x301(f301Var.a));
                }
                break;
        }
        return rih1Var;
    }
}
