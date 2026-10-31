package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yud0 implements wpw {
    public final Flowable a;
    public final c1f1 b;
    public final Scheduler c;
    public final epb1 d;
    public final w9u0 e;
    public final poy0 f = c2p1.o(new vud0(this, 0), new c4z(2, this, yud0.class, "stateMapper", "stateMapper(Lcom/spotify/liveroom/liveupsellscrollcard/LiveUpsellCard$Props;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Lcom/spotify/liveroom/liveupsellscrollcardimpl/LiveUpsellScrollCardElement$State;", 0, (byte) 21), new vud0(this, 1), 4);
    public final ia00 g = n3o1.q(this).a(wud0.b, wud0.c);
    public final nsw h = jch0.j(new kmd0(this, 2));

    public yud0(Flowable flowable, c1f1 c1f1Var, Scheduler scheduler, epb1 epb1Var, w9u0 w9u0Var) {
        this.a = flowable;
        this.b = c1f1Var;
        this.c = scheduler;
        this.d = epb1Var;
        this.e = w9u0Var;
    }

    public final rqw a() {
        return this.g;
    }

    public final rsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
