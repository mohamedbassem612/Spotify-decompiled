package p;

import android.content.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u7b1 implements f961 {
    public final Context a;
    public final gw70 b;
    public final mxa1 c;
    public final vku d;
    public PlayerState e;

    public u7b1(Flowable flowable, Scheduler scheduler, Context context, gw70 gw70Var, mxa1 mxa1Var) {
        this.a = context;
        this.b = gw70Var;
        this.c = mxa1Var;
        vku vkuVar = new vku();
        this.d = vkuVar;
        this.e = PlayerState.EMPTY;
        vkuVar.a(flowable.L(scheduler).subscribe((Consumer) new z2a1(this, (byte) 3)));
    }

    public final void a(PlayerState playerState) {
        this.e = playerState;
        if (!playerState.track().c()) {
            mxa1.q(this.c, playerState);
            return;
        }
        ixg ixgVarF = this.b.f(l4o1.q((ContextTrack) playerState.track().b()));
        ixgVarF.g = false;
        ixgVarF.l(2131234032);
        ixgVarF.q(this.a, 2131167211, 2131167211, 1);
        ixgVarF.d();
        ixgVarF.j(new esa1(this, playerState, (byte) 6));
    }

    @Override // p.dwo
    public final void shutdown() {
        this.d.c();
        PlayerState playerState = PlayerState.EMPTY;
        this.e = playerState;
        mxa1.q(this.c, playerState);
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
