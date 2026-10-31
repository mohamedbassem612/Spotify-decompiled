package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m6z0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6z0 b;

    public /* synthetic */ m6z0(t6z0 t6z0Var, byte b) {
        this.a = b;
        this.b = t6z0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        t6z0 t6z0Var = this.b;
        switch (b) {
            case 0:
                y4z0 y4z0Var = (y4z0) obj;
                return fbp1.n(t6z0Var.i, "queue", y4z0Var.d, ykk1.b).filter(djx0.c).map(njx0.c).onErrorReturn(new vyq0(y4z0Var, (byte) 22));
            default:
                return t6z0Var.f.o(zcz0.a, null).s(t6z0Var.a).d(Observable.just(w8z0.a));
        }
    }
}
