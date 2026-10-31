package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ary0 extends hab0 implements vu30 {
    public final /* synthetic */ bry0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary0(bry0 bry0Var) {
        super(2);
        this.a = bry0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        yqy0 yqy0Var = this.a.c;
        wqy0 wqy0Var = new wqy0();
        nqy0 nqy0Var = yqy0Var.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        wqd0 wqd0Var = new wqd0(nqy0Var.a, (byte) 26);
        Scheduler scheduler = nqy0Var.b;
        subtypeEffectHandlerBuilderC.b(iqy0.class, wqd0Var, scheduler);
        subtypeEffectHandlerBuilderC.d(jqy0.class, new mqy0(nqy0Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.c(kqy0.class, new mqy0(nqy0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(lqy0.class, new ax8(new hox0(nqy0Var, (byte) 21), (byte) 2));
        return gvg.d("puffin-mobius-intro", Mobius.d(wqy0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{((Observable) yqy0Var.b.invoke()).map(xqy0.a)})));
    }
}
