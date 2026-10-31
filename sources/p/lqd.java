package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class lqd {
    public static final ObservableTransformer a(drd drdVar, xid xidVar) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(kqd.class, new a21(drdVar, xidVar, (byte) 22));
        return subtypeEffectHandlerBuilderC.h();
    }
}
