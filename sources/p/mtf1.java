package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mtf1 implements Connectable {
    public final Flowable a;
    public final Flowable b;
    public final w9u0 c;
    public final h691 d;
    public final Flowable e;
    public final o241 f;
    public final kly0 g;
    public final fkf1 h;
    public final idd1 i = new idd1(new j4f1(this, (byte) 10));
    public final vku t = new vku();
    public iu30 X = bpf1.Z0;

    public mtf1(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, h691 h691Var, Flowable flowable3, o241 o241Var, kly0 kly0Var, fkf1 fkf1Var) {
        this.a = flowable;
        this.b = flowable2;
        this.c = w9u0Var;
        this.d = h691Var;
        this.e = flowable3;
        this.f = o241Var;
        this.g = kly0Var;
        this.h = fkf1Var;
    }

    public static gkf1 b(PlayerState playerState, boolean z, boolean z2) {
        return new gkf1(new ikf1((ContextTrack) o7h.C0(playerState.prevTracks()), (ContextTrack) playerState.track().b(), (ContextTrack) o7h.s0(playerState.nextTracks())), new hkf1(false, !playerState.restrictions().disallowSkippingPrevReasons().isEmpty(), !playerState.restrictions().disallowSkippingNextReasons().isEmpty(), !playerState.restrictions().disallowPeekingPrevReasons().isEmpty(), !playerState.restrictions().disallowPeekingNextReasons().isEmpty(), !playerState.restrictions().disallowSwipePrevReasons().isEmpty(), !playerState.restrictions().disallowSwipeNextReasons().isEmpty()), z, o4p1.v(playerState), z2);
    }

    public final Connection L(Consumer consumer) {
        this.X = new hcf1(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 5);
        this.t.a(Flowable.K(Flowable.h(this.a, a(), u9x0.S0).J(new pvc(this, (byte) 27)).t(Functions.a), this.e.X(new nl51(this, (byte) 29))).subscribe(new a74(this.X, (byte) 6)));
        return new xj81(this, (byte) 2);
    }

    public final Flowable a() {
        return this.f.a.map(o9x0.S0).distinctUntilChanged().onErrorReturnItem(Boolean.TRUE).toFlowable(BackpressureStrategy.d);
    }
}
