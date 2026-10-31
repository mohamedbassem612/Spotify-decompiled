package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sjb1 {
    public final lx91 a;
    public final c9c0 b;
    public final cpr c;
    public final Scheduler d;

    public sjb1(lx91 lx91Var, c9c0 c9c0Var, cpr cprVar, Scheduler scheduler) {
        this.a = lx91Var;
        this.b = c9c0Var;
        this.c = cprVar;
        this.d = scheduler;
    }

    public final Single a(String str) {
        return yoi1.i(f5p1.n(new ld2(this.b.b.current(), str, (byte) 28)), o6x.a).timeout(11L, TimeUnit.SECONDS, this.d).firstOrError();
    }

    public final Single b(pjb1 pjb1Var, fjb1 fjb1Var) {
        Single singleFlatMap;
        boolean z = fjb1Var instanceof ejb1;
        lx91 lx91Var = this.a;
        if (z) {
            xx91 xx91Var = (xx91) lx91Var;
            singleFlatMap = xx91Var.a(fe91.c1, fe91.d1).doOnSubscribe(new qg7(xx91Var, (Object) null, ((ejb1) fjb1Var).a(), (byte) 27)).flatMap(new c681(this, (byte) 13));
        } else {
            if (!(fjb1Var instanceof djb1)) {
                eg.o();
                return null;
            }
            xx91 xx91Var2 = (xx91) lx91Var;
            singleFlatMap = xx91Var2.a(fe91.a1, fe91.b1).doOnSubscribe(new ags(xx91Var2, true, (byte) 2)).flatMap(new up41(this, (byte) 22));
        }
        return singleFlatMap.compose(new hp91(this, pjb1Var, (byte) 16));
    }
}
