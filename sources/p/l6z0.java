package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l6z0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6z0 b;

    public /* synthetic */ l6z0(t6z0 t6z0Var, byte b) {
        this.a = b;
        this.b = t6z0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        t6z0 t6z0Var = this.b;
        switch (b) {
            case 0:
                ((kt91) t6z0Var.h.b).b();
                return Observable.empty();
            default:
                return dcu0.b(t6z0Var.c).flatMap(new r6z0((m5z0) obj, t6z0Var)).map(a4x0.d).onErrorReturn(b4x0.c).toObservable();
        }
    }
}
