package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class stp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7c0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ stp0(y7c0 y7c0Var, byte b) {
        super(0);
        this.a = b;
        this.b = y7c0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        y7c0 y7c0Var = this.b;
        switch (b) {
            case 0:
                return ((Observable) y7c0Var.d).startWithItem(sal.a).map(eh10.U0).distinctUntilChanged().switchMap(new jkp0(y7c0Var, (byte) 2));
            case 1:
                dxz0 dxz0Var = (dxz0) y7c0Var.a;
                return Observable.combineLatest(dxz0Var.c(), yoi1.i((mr20) ((jj4) y7c0Var.c).d.getValue(), o6xVar), yoi1.i(new f5y0(dxz0Var.a, dxz0Var, (byte) 9), o6xVar), mi10.U0).distinctUntilChanged();
            default:
                return yoi1.i(((b7n) ((m4e0) y7c0Var.b).b).a(o6n.a), o6xVar).startWithItem(Boolean.FALSE).distinctUntilChanged();
        }
    }
}
