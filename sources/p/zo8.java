package p;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zo8 implements Function {
    public final uu00 a;

    public Object apply(Object obj) {
        u740 u740Var = (u740) obj;
        String str = u740Var.a;
        return new MaybeFlatten(this.a.b(new oi("gated-content-npv-widget", false, new kq00(str, (byte) 27))).filter(mi10.d).onErrorComplete().firstElement().f(new acn1(str, (byte) 5)), new fey(u740Var, (byte) 15));
    }
}
