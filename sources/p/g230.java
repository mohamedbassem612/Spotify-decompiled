package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g230 implements c8m0 {
    public final q030 a;
    public final EventSource b;
    public final Scheduler c;

    public g230(q030 q030Var, EventSource eventSource, Scheduler scheduler) {
        this.a = q030Var;
        this.b = eventSource;
        this.c = scheduler;
    }

    @Override // p.c8m0
    public final MobiusLoop.Controller a(Object obj, bk1 bk1Var) {
        return Mobius.b(Mobius.d(new f230(x130.h, (byte) 0), RxConnectables.a((ObservableTransformer) this.a.invoke(bk1Var))).h(this.b).d(new y130(this)).b(new z130(this)).f(wue0.a()), (tr3) obj, new qh80(a230.a, b230.a, c230.b, d230.a, e230.a), MainThreadWorkRunner.a());
    }
}
