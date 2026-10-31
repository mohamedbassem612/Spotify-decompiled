package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aot0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ io91 b;

    public /* synthetic */ aot0(io91 io91Var, byte b) {
        this.a = b;
        this.b = io91Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        io91 io91Var = this.b;
        switch (b) {
            case 0:
                xn91 xn91Var = io91Var.b;
                return Single.just(Integer.valueOf(xn91Var.b.b(xn91Var.a, (String) obj).l(xn91.c, 0))).flatMapObservable(dj10.X0);
            default:
                wl91 wl91Var = io91Var.d;
                return Single.just(Integer.valueOf(wl91Var.b.b(wl91Var.a, (String) obj).l(wl91.c, 0))).flatMapObservable(wdx0.e);
        }
    }
}
