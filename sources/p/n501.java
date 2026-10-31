package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n501 {
    public final Scheduler a;
    public final o501 b;
    public final n401 c;

    public n501(Scheduler scheduler, o501 o501Var, n401 n401Var) {
        this.a = scheduler;
        this.b = o501Var;
        this.c = n401Var;
    }

    public final MobiusLoop.Controller a() {
        return Mobius.b(Mobius.d(k501.a, RxConnectables.a(((o401) this.c).a())).d(new l501(this)).b(new m501(this)), this.b, j501.a, MainThreadWorkRunner.a());
    }
}
