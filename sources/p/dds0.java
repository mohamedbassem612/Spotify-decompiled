package p;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeObserveOn;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dds0 {
    public final x3v0 a;
    public final uu00 b;
    public final Scheduler c;

    public dds0(x3v0 x3v0Var, uu00 uu00Var, Scheduler scheduler) {
        this.a = x3v0Var;
        this.b = uu00Var;
        this.c = scheduler;
    }

    public final MaybeObserveOn a(String str) {
        MaybeFlatten maybeFlattenE;
        List listM = p7h.M(new blc0[]{blc0.ed, blc0.M3});
        Set set = s4b1.f;
        if (listM.contains(uic.x(str).c)) {
            Maybe maybeFirstElement = this.b.b(new oi("PaywallsPlaybackPreventionRepository", false, new atp0(str, (byte) 10))).filter(new yjp1(str, (byte) 13)).firstElement();
            zjp1 zjp1Var = new zjp1(str, (byte) 7);
            maybeFirstElement.getClass();
            maybeFlattenE = new MaybeFlatten(new MaybeFlatten(maybeFirstElement, zjp1Var), cj20.W0);
        } else {
            maybeFlattenE = Maybe.e(str);
        }
        return new MaybeFlatten(new MaybeFlatten(maybeFlattenE, new l1p0(this, (byte) 12)), new ewn0(this, (byte) 18)).g(this.c);
    }
}
