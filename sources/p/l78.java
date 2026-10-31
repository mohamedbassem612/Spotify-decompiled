package p;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l78 {
    public final uu00 a;
    public final krh b;
    public final o241 c;

    public l78(uu00 uu00Var, krh krhVar, o241 o241Var) {
        this.a = uu00Var;
        this.b = krhVar;
        this.c = o241Var;
    }

    public final MaybeToSingle a(String str) {
        Observable observableY = y7y0.y(this.c);
        Boolean bool = Boolean.FALSE;
        Maybe maybeFilter = observableY.first(bool).onErrorReturnItem(bool).filter(olj0.t);
        km3 km3Var = new km3(this, str, (byte) 24);
        maybeFilter.getClass();
        return new MaybeToSingle(new MaybeFlatMapSingle(maybeFilter, km3Var), bool);
    }
}
