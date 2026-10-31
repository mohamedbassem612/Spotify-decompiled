package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yov0 implements xov0 {
    public final Set a;
    public final Single b;

    public yov0(Scheduler scheduler, t380 t380Var) {
        this.a = t380Var;
        this.b = Single.defer(new yj1(this, (byte) 22)).subscribeOn(scheduler).cache();
    }

    @Override // p.xov0
    public final Single a() {
        return this.b;
    }
}
