package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class viw {
    public static final void a(RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilder, Class cls, iu30 iu30Var) {
        subtypeEffectHandlerBuilder.g(cls, new tiw(iu30Var));
    }

    public static void b(RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilder, Class cls, Consumer consumer, Scheduler scheduler) {
        subtypeEffectHandlerBuilder.g(cls, new so(scheduler, consumer, (byte) 12));
    }
}
