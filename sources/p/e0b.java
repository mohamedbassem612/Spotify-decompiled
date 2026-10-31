package p;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e0b implements ejo {
    public final xrc0 a;
    public final me30 b;
    public final t0p c;

    public e0b(xrc0 xrc0Var, me30 me30Var, t0p t0pVar) {
        this.a = xrc0Var;
        this.b = me30Var;
        this.c = t0pVar;
    }

    @Override // p.ejo
    public final Maybe a(String str) {
        Set set = s4b1.f;
        if (!uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
            MaybeEmpty maybeEmpty = MaybeEmpty.a;
            maybeEmpty.getClass();
            return maybeEmpty;
        }
        Maybe maybeFlatMapMaybe = rqt0.F(o6x.a, new w7a(this, str, (lnm) null, (byte) 9)).flatMapMaybe(uh21.Z);
        ic9 ic9Var = new ic9(this, str, (byte) 11);
        maybeFlatMapMaybe.getClass();
        return new MaybeFlatten(maybeFlatMapMaybe, ic9Var);
    }
}
