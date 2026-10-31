package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class h8m0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final MobiusLoop.Controller a(xqd0 xqd0Var, Observable observable, Scheduler scheduler) {
        return Mobius.b(gvg.d("LiveSharingMobiusLoop", Mobius.d(d8m0.a, RxConnectables.a(RxConnectables.b(xqd0Var))).h(RxEventSources.a(new ObservableSource[]{observable}))).d(new e8m0(scheduler)).b(new f8m0(scheduler)), fud0.a, g8m0.a, MainThreadWorkRunner.a());
    }
}
